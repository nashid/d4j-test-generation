mvn compile
FILE="evosuite-1.0.6.jar"
if [ -f $FILE ]; then
    echo "$FILE exists."
else 
    wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar
fi

FILE="evosuite-standalone-runtime-1.0.6.jar"
if [ -f $FILE ]; then
    echo "$FILE exists."
else 
    wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-standalone-runtime-1.0.6.jar
fi
export EVOSUITE="java -jar $(pwd)/evosuite-1.0.6.jar"
$EVOSUITE -class org.apache.commons.codec.StringEncoderComparator -projectCP target/classes
mvn dependency:copy-dependencies
export CLASSPATH=target/classes:evosuite-standalone-runtime-1.0.6.jar:evosuite-tests:target/dependency/junit-4.12.jar:target/dependency/hamcrest-core-1.3.jar
javac evosuite-tests/org/apache/commons/codec/*.java 
java org.junit.runner.JUnitCore org.apache.commons.codec.StringEncoderComparator_ESTest
mvn test
$EVOSUITE -measureCoverage -class org.apache.commons.codec.StringEncoderComparator -Djunit=org.apache.commons.codec.StringEncoderComparator_ESTest -criterion branch -projectCP target/classes:target/test-classes:evosuite-tests
