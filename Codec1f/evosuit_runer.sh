mvn compile
wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar
wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-standalone-runtime-1.0.6.jar
export EVOSUITE="java -jar $(pwd)/evosuite-1.0.6.jar"
$EVOSUITE -class org.apache.commons.codec.StringEncoderComparator -projectCP target/classes
mvn dependency:copy-dependencies
export CLASSPATH=target/classes:evosuite-standalone-runtime-1.0.6.jar:evosuite-tests:target/dependency/junit-3.8.3.jar
