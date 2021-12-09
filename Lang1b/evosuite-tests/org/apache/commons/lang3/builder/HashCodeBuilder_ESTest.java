/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 04:00:27 GMT 2021
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HashCodeBuilder_ESTest extends HashCodeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((short[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((byte[]) null);
      assertEquals(629, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Object[] objectArray0 = new Object[5];
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(objectArray0);
      hashCodeBuilder1.append(299.14006215581);
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(3296.5503F);
      int int0 = hashCodeBuilder2.toHashCode();
      assertEquals((-231382764), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[3];
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "org.apache.commons.lang3.builder.IDKey", stringArray0);
      //  // Unstable assertion: assertEquals((-1241355316), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "'1NRC", true);
      //  // Unstable assertion: assertEquals((-533308844), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      String[] stringArray0 = new String[9];
      int int0 = HashCodeBuilder.reflectionHashCode(17, 17, "7e(", false, (Class<? super String>) class0, stringArray0);
      assertEquals(1719945, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = HashCodeBuilder.reflectionHashCode(Integer.MAX_VALUE, Integer.MAX_VALUE, (Object) hashCodeBuilder0, true);
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals(17, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      IDKey iDKey0 = new IDKey(hashCodeBuilder0);
      int int0 = HashCodeBuilder.reflectionHashCode((-185), (-185), (Object) iDKey0, true);
      assertEquals((-6332549), int0);
      assertEquals(17, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = HashCodeBuilder.reflectionHashCode((int) (byte)43, (int) (byte)43, (Object) hashCodeBuilder0);
      assertEquals(17, hashCodeBuilder0.toHashCode());
      assertEquals(79684, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      int int0 = HashCodeBuilder.reflectionHashCode((-3061), Integer.MAX_VALUE, object0);
      assertEquals((-3061), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(73, (-1));
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.appendSuper(73);
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[1] = true;
      booleanArray0[4] = true;
      hashCodeBuilder1.append(booleanArray0);
      assertEquals(0, (int)hashCodeBuilder0.build());
      assertEquals(0, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-811), (-811));
      double[] doubleArray0 = new double[3];
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(doubleArray0);
      hashCodeBuilder1.append((boolean[]) null);
      assertEquals((-1693551291), (int)hashCodeBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(Integer.MAX_VALUE, Integer.MAX_VALUE);
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((short) (-1));
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) hashCodeBuilder1;
      objectArray0[1] = (Object) hashCodeBuilder0;
      objectArray0[2] = (Object) hashCodeBuilder0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) hashCodeBuilder0;
      objectArray0[5] = (Object) hashCodeBuilder0;
      objectArray0[6] = (Object) hashCodeBuilder1;
      hashCodeBuilder1.append(objectArray0);
      assertEquals(0, (int)hashCodeBuilder0.build());
      assertEquals(0, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-811), (-811));
      Object[] objectArray0 = new Object[0];
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(objectArray0);
      assertEquals((-811), (int)hashCodeBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      long[] longArray0 = new long[3];
      longArray0[0] = (long) 37;
      hashCodeBuilder0.append(longArray0);
      assertEquals(0, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-811), (-811));
      double[] doubleArray0 = new double[3];
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(doubleArray0);
      hashCodeBuilder1.append((long[]) null);
      assertEquals((-1693551291), hashCodeBuilder0.toHashCode());
      assertEquals((-1693551291), (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(Integer.MAX_VALUE, Integer.MAX_VALUE);
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((short) (-1));
      int[] intArray0 = new int[8];
      intArray0[0] = (int) (short) (-1);
      intArray0[1] = Integer.MAX_VALUE;
      intArray0[2] = Integer.MAX_VALUE;
      intArray0[3] = (int) (short) (-1);
      intArray0[4] = Integer.MAX_VALUE;
      intArray0[5] = (int) (short) (-1);
      intArray0[6] = (int) (short) (-1);
      intArray0[7] = Integer.MAX_VALUE;
      hashCodeBuilder1.append(intArray0);
      assertEquals(0, hashCodeBuilder0.toHashCode());
      assertEquals(0, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((double) (-185));
      float[] floatArray0 = new float[1];
      hashCodeBuilder1.append(floatArray0);
      assertEquals((-823657751), hashCodeBuilder1.toHashCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.appendSuper(37);
      double[] doubleArray0 = new double[3];
      hashCodeBuilder1.append((double) (-1));
      doubleArray0[0] = (double) (-2563);
      doubleArray0[1] = (double) (-2563);
      doubleArray0[2] = (double) (-1);
      hashCodeBuilder0.append(doubleArray0);
      assertEquals(0, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      hashCodeBuilder0.appendSuper(37);
      hashCodeBuilder0.append((byte[]) null);
      assertEquals(0, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.appendSuper((-1));
      hashCodeBuilder1.append(true);
      assertEquals(0, (int)hashCodeBuilder0.build());
      assertEquals(0, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int[] intArray0 = new int[4];
      intArray0[0] = (-4927);
      intArray0[1] = 36;
      intArray0[2] = 36;
      intArray0[3] = 1049;
      hashCodeBuilder0.append(intArray0);
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((double[]) null);
      hashCodeBuilder1.append('x');
      hashCodeBuilder1.append('Y');
      hashCodeBuilder0.append(false);
      assertEquals((-1565317099), (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      hashCodeBuilder0.appendSuper(37);
      hashCodeBuilder0.append((short)0);
      assertEquals(0, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((short) (-1149));
      assertEquals((-520), hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      hashCodeBuilder0.appendSuper(37);
      hashCodeBuilder0.append((long) (-2563));
      hashCodeBuilder0.append((long) (-2563));
      assertEquals(0, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(3428.7122);
      hashCodeBuilder0.append((byte)0);
      hashCodeBuilder1.append(3283L);
      assertEquals((-116409984), (int)hashCodeBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      hashCodeBuilder0.append(37);
      hashCodeBuilder0.append((short[]) null);
      assertEquals(0, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.appendSuper(Integer.MAX_VALUE);
      hashCodeBuilder1.append((-1));
      assertEquals((-2147460413), hashCodeBuilder1.toHashCode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.appendSuper(37);
      hashCodeBuilder1.append((byte)0);
      assertEquals(0, hashCodeBuilder0.toHashCode());
      assertEquals(0, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((float) 2018);
      hashCodeBuilder0.append((byte) (-1));
      assertEquals((-126510360), hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((Object) null, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The object to build a hash code for must not be null
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      hashCodeBuilder0.append((Object) hashCodeBuilder0);
      HashCodeBuilder.isRegistered(hashCodeBuilder0);
      HashCodeBuilder.reflectionHashCode((-2563), (-2563), (Object) hashCodeBuilder0, true);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, (Collection<String>) linkedList0);
      assertEquals((-36), hashCodeBuilder0.toHashCode());
      assertEquals(23692, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((Object) null, (Collection<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The object to build a hash code for must not be null
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      String[] stringArray0 = new String[4];
      int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, stringArray0);
      assertEquals(23426, int0);
      
      int int1 = HashCodeBuilder.reflectionHashCode((-2563), (-2563), (Object) hashCodeBuilder0, true);
      assertEquals(343573456, int1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((int) (byte)0, (int) (byte)0, (Object) hashCodeBuilder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero initial value
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((Object) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      char[] charArray0 = new char[8];
      hashCodeBuilder0.append(charArray0);
      assertEquals((-779599631), hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append(false);
      assertEquals(630, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder(1449, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder(0, (-498));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero initial value
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[8];
      int int0 = HashCodeBuilder.reflectionHashCode(37, 37, "y3#IQhpoO)vN>X~]\"", true, (Class<? super String>) class0, stringArray0);
      //  // Unstable assertion: assertEquals((-901537932), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(2, (int)  (-1), (IDKey) null, false, (Class<? super IDKey>) class0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The object to build a hash code for must not be null
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HashCodeBuilder.unregister(integer0);
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[2];
      int int0 = HashCodeBuilder.reflectionHashCode((Object) class0, stringArray0);
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder.reflectionHashCode(Integer.MAX_VALUE, Integer.MAX_VALUE, (Object) hashCodeBuilder0);
      int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, true);
      //  // Unstable assertion: assertEquals(23806, int0);
      //  // Unstable assertion: assertEquals(17, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = hashCodeBuilder0.toHashCode();
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      hashCodeBuilder0.append((short[]) null);
      assertEquals((-37), (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((Object[]) null);
      assertEquals(629, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((long[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(2863, 2863);
      int[] intArray0 = new int[3];
      hashCodeBuilder0.append(intArray0);
      assertEquals(848628033, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((float[]) null);
      assertEquals(629, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((char[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      hashCodeBuilder0.append((byte[]) null);
      assertEquals((-37), hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      byte[] byteArray0 = new byte[3];
      hashCodeBuilder0.append(byteArray0);
      assertEquals(861101, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-811), (-811));
      hashCodeBuilder0.append((boolean[]) null);
      assertEquals(657721, (int)hashCodeBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(true);
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (-1));
      hashCodeBuilder0.append(0.0F);
      long[] longArray0 = new long[8];
      longArray0[0] = (-152L);
      longArray0[1] = (long) (short) (-1);
      longArray0[2] = (long) (short) (-1);
      longArray0[3] = (long) (short) (-1);
      longArray0[4] = (-1L);
      longArray0[5] = (long) (short) (-1);
      longArray0[6] = (long) Integer.MAX_VALUE;
      longArray0[7] = (long) Integer.MAX_VALUE;
      HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder2.append(longArray0);
      HashCodeBuilder.reflectionHashCode(Integer.MAX_VALUE, Integer.MAX_VALUE, (Object) hashCodeBuilder3);
      int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder1, true);
      //  // Unstable assertion: assertEquals(952405261, (int)hashCodeBuilder0.build());
      //  // Unstable assertion: assertEquals(23806, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder(37, 98);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(1, 1);
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(1, 0, (Object) hashCodeBuilder0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IDKey iDKey0 = new IDKey("'1NRC");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("_):V[yEiMWUo%d3");
      linkedList0.addFirst("'1NRC");
      int int0 = HashCodeBuilder.reflectionHashCode((Object) iDKey0, (Collection<String>) linkedList0);
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd initial value
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append('[');
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)37;
      shortArray0[1] = (short) (-1872);
      shortArray0[2] = (short)2;
      HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder1, true);
      shortArray0[3] = (short)2;
      shortArray0[4] = (short) (-132);
      HashCodeBuilder.getRegistry();
      shortArray0[5] = (short) (-1654);
      shortArray0[6] = (short)778;
      hashCodeBuilder1.append(shortArray0);
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append((int[]) null);
      IDKey iDKey0 = new IDKey(hashCodeBuilder2);
      HashCodeBuilder.register(iDKey0);
      Integer integer0 = hashCodeBuilder2.build();
      assertEquals((-847924507), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((Object) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The object to build a hash code for must not be null
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[3] = (Object) '@';
      String[] stringArray0 = new String[8];
      int int0 = HashCodeBuilder.reflectionHashCode(objectArray0[3], stringArray0);
      //  // Unstable assertion: assertEquals(634, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[1];
      int int0 = HashCodeBuilder.reflectionHashCode((Object) class0, stringArray0);
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(37, (-1));
      int int0 = HashCodeBuilder.reflectionHashCode((-2563), (-2563), (Object) hashCodeBuilder0, true);
      //  // Unstable assertion: assertEquals(343588828, int0);
      
      String[] stringArray0 = new String[3];
      int int1 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, stringArray0);
      //  // Unstable assertion: assertEquals(23806, int1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((int) (byte)1);
      assertEquals(630, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "org.apache.commons.lang3.builder.IDKey", (Collection<String>) linkedList0);
      //  // Unstable assertion: assertEquals((-1241355303), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.hashCode();
      assertEquals(17, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.appendSuper(0);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Integer integer0 = hashCodeBuilder0.build();
      assertEquals(17, (int)integer0);
  }
}