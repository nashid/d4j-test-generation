/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 04:38:51 GMT 2021
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SystemUtils_ESTest extends SystemUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("SolarisLinux", "Rs7HKj!g,", "SolarisLinux", "en");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch("http://java.oracle.com/", "http://java.oracle.com/");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaVersion javaVersion0 = JavaVersion.JAVA_1_8;
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(javaVersion0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/sepehr");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      File file0 = SystemUtils.getUserHome();
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/sepehr/d4j-test-generation/Lang1b");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File file0 = SystemUtils.getUserDir();
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/usr/lib/jvm/java-8-openjdk-amd64/jre");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "jdM3");
      File file0 = SystemUtils.getJavaHome();
      assertTrue(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/usr/lib/jvm/java-8-openjdk-amd64/jre");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = SystemUtils.getJavaHome();
      assertEquals("jre", file0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isOSNameMatch("Hv4<%q!iP(", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isOSMatch("HP-UX", "HP-UX", "HP-UX", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isJavaVersionMatch("JAVA_1_2", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("vm]Y|1 ", "vm]Y|1 ", "vm]Y|1 ", "vm]Y|1 ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("JAVA_1_4", "6}{60&&WYF7m %9", "JAVA_1_5", "6}{60&&WYF7m %9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("OS/2", (String) null, "Mac", "OS/2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch((String) null, "6}{60&&WYF7m %9", "6}{60&&WYF7m %9", "6}{60&&WYF7m %9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch("JAVA_1_2", "JAVA_1_2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaAwtHeadless();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SystemUtils systemUtils0 = new SystemUtils();
      assertFalse(SystemUtils.IS_OS_IRIX);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = SystemUtils.getUserHome();
      assertTrue(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = SystemUtils.getUserDir();
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File file0 = SystemUtils.getJavaHome();
      assertFalse(file0.exists());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isJavaVersionAtLeast((JavaVersion) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.JavaVersion", e);
      }
  }
}