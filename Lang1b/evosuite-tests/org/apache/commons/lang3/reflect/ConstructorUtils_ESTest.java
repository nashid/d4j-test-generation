/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 04:36:41 GMT 2021
 */

package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstructorUtils_ESTest extends ConstructorUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      Constructor<Object> constructor0 = ConstructorUtils.getAccessibleConstructor(class0, (Class<?>[]) classArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor((Class<Integer>) null, (Object[]) null, (Class<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 8);
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor(classArray0[7], (Object[]) classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 25);
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor(classArray0[7], objectArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor(class0, objectArray0, (Class<?>[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 8);
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor(classArray0[7], (Object[]) classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.getMatchingAccessibleConstructor((Class<Object>) null, (Class<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.getAccessibleConstructor((Class<Object>) null, (Class<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Constructor<String> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      assertNotNull(constructor0);
      
      AccessibleObject[] accessibleObjectArray0 = new AccessibleObject[6];
      accessibleObjectArray0[0] = (AccessibleObject) constructor0;
      accessibleObjectArray0[1] = (AccessibleObject) constructor0;
      accessibleObjectArray0[2] = (AccessibleObject) constructor0;
      accessibleObjectArray0[3] = (AccessibleObject) constructor0;
      accessibleObjectArray0[4] = (AccessibleObject) constructor0;
      accessibleObjectArray0[5] = (AccessibleObject) constructor0;
      AccessibleObject.setAccessible(accessibleObjectArray0, true);
      Constructor<String> constructor1 = ConstructorUtils.getAccessibleConstructor(constructor0);
      assertEquals("public java.lang.String(byte[])", constructor1.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Constructor<Annotation> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[9];
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 9);
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      classArray0[0] = class1;
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Integer
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      Constructor<String> constructor0 = ConstructorUtils.getAccessibleConstructor(class0, (Class<?>[]) null);
      Constructor<String> constructor1 = ConstructorUtils.getAccessibleConstructor(constructor0);
      assertFalse(constructor1.isAccessible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: InvocationTargetException");
      
      } catch(InvocationTargetException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constructor<Integer> constructor0 = ConstructorUtils.getAccessibleConstructor((Constructor<Integer>) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ConstructorUtils.invokeExactConstructor(class0, (Object[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[9];
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 18);
      Class<Object> class0 = Object.class;
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ConstructorUtils.invokeConstructor(class0, (Object[]) null, (Class<?>[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ConstructorUtils.invokeConstructor(class0, (Object[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      try { 
        ConstructorUtils.invokeConstructor(class0, objectArray0);
        fail("Expecting exception: InvocationTargetException");
      
      } catch(InvocationTargetException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstructorUtils constructorUtils0 = new ConstructorUtils();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = ConstructorUtils.invokeExactConstructor(class0, (Object[]) null, (Class<?>[]) null);
      assertNotNull(object0);
  }
}