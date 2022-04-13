/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 04:34:31 GMT 2021
 */

package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        FieldUtils.writeField(object0, "F{\"i", (Object) "Cannot locate field ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.Object.F{\"i
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.writeField((Field) null, (Object) "fuGrrp&;8$CAeRj.", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Field> list0 = FieldUtils.getAllFieldsList(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Field> class0 = Field.class;
      Field[] fieldArray0 = FieldUtils.getAllFields(class0);
      assertEquals(16, fieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        FieldUtils.getField(class0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field name must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getDeclaredField((Class<?>) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The class must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        FieldUtils.writeDeclaredField((Object) class0, "uu?@j", (Object) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.Class.uu?@j
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.writeDeclaredField((Object) null, "short", (Object) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // target object must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.writeField((Field) null, (Object) null, (Object) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        FieldUtils.writeDeclaredStaticField((Class<?>) class0, "", (Object) "", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.reflect.Field.
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        FieldUtils.writeStaticField((Class<?>) class0, "BQ", (Object) class0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate field BQ on class java.lang.Integer
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.writeStaticField((Field) null, (Object) "/=oVPS]J7Bl9y,6", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readDeclaredField((Object) null, "; a matching field exists on two or more implemented interfaces.", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // target object must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        FieldUtils.readDeclaredField((Object) class0, "7d", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.Class.7d
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        FieldUtils.readField((Object) class0, "W", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate field W on class java.lang.Class
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readField((Object) null, "className must not be null.", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // target object must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readField((Field) null, (Object) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        FieldUtils.readStaticField(class0, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate field  on class java.lang.Integer
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readStaticField((Field) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getAllFieldsList((Class<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The class must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        FieldUtils.getDeclaredField(class0, (String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field name must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Field> class0 = Field.class;
      Field field0 = FieldUtils.getDeclaredField(class0, "", false);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getDeclaredField((Class<?>) null, ".", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The class must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      Field field0 = FieldUtils.getField(class0, "8XvWRM_]~po", false);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getField((Class<?>) null, "^xe4vQ)P!", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The class must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        FieldUtils.writeDeclaredField((Object) class0, "No1-[MW%k", (Object) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.Class.No1-[MW%k
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.writeField((Object) null, "m4=\"Rt_XPylMmQ#Cz", (Object) "m4=\"Rt_XPylMmQ#Cz", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // target object must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readDeclaredField((Object) "' is not static", "' is not static");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.String.' is not static
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readField((Object) null, "fuGrrp&;8$CAeRj.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // target object must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        FieldUtils.readDeclaredStaticField(class0, ";O$~'WASb1Yhs", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.annotation.Annotation.;O$~'WASb1Yhs
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getAllFields((Class<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The class must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readDeclaredStaticField((Class<?>) null, ":");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The class must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        FieldUtils.getField(class0, (String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field name must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        FieldUtils.readStaticField(class0, "The field name must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate field The field name must not be null on class java.lang.Integer
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readField((Field) null, (Object) "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<String> class0 = String.class;
      Field field0 = FieldUtils.getField(class0, "s ubr$U?#");
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.writeDeclaredField((Object) null, "mC#}58JE8#eiJsm$|O", (Object) "mC#}58JE8#eiJsm$|O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // target object must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        FieldUtils.writeDeclaredStaticField((Class<?>) class0, "char", (Object) "char");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field java.lang.reflect.Field.char
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.readStaticField((Field) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Field[] fieldArray0 = FieldUtils.getAllFields(class0);
      assertEquals(0, fieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Field> class0 = Field.class;
      List<Field> list0 = FieldUtils.getAllFieldsList(class0);
      // Undeclared exception!
      try { 
        FieldUtils.readField((Object) list0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate field  on class java.util.ArrayList
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FieldUtils fieldUtils0 = new FieldUtils();
      // Undeclared exception!
      try { 
        FieldUtils.writeField((Object) fieldUtils0, "className must not be null.", (Object) "className must not be null.", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.className must not be null.
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.writeStaticField((Field) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Field field0 = FieldUtils.getDeclaredField(class0, "sq$Exo['mcJa2<pc3S");
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        FieldUtils.writeStaticField((Class<?>) class0, "cQ", (Object) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot locate field cQ on interface java.lang.annotation.Annotation
         //
         verifyException("org.apache.commons.lang3.reflect.FieldUtils", e);
      }
  }
}