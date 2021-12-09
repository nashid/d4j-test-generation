/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 03:57:24 GMT 2021
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ToStringBuilder_ESTest extends ToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("1.3", toStringStyle0, stringBuffer0);
      String string0 = toStringBuilder0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      Class<Object> class0 = Object.class;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0, true, (Class<? super Object>) class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      StringBuffer stringBuffer0 = toStringBuilder0.getStringBuffer();
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      Object object0 = toStringBuilder0.getObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      String string0 = toStringBuilder0.build();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendAsObjectToString(object0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, (ToStringStyle) null);
      // Undeclared exception!
      try { 
        toStringBuilder0.appendToString("at]R\"r[HhkXP).Z");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      // Undeclared exception!
      try { 
        toStringBuilder0.appendSuper("+MK;G!E=]2[V31 _ipB");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      String string0 = toStringBuilder0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      String string0 = toStringBuilder0.toString();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      assertNotNull(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      ToStringStyle toStringStyle1 = toStringBuilder0.getStyle();
      assertSame(toStringStyle1, toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("Jj^%^wj");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      StringBuffer stringBuffer1 = toStringBuilder0.getStringBuffer();
      assertEquals(29, stringBuffer1.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("Jj^%^wj");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Jj^%^wj", object0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">oO66g$WD-qoL:,rw~^", standardToStringStyle0);
      Object object0 = toStringBuilder0.getObject();
      assertEquals(">oO66g$WD-qoL:,rw~^", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("OgU68#7UbWI,wzq8", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("h+lKn\"r#L`T", (ToStringStyle) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("NKQRC;4m");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToStringBuilder.setDefaultStyle((ToStringStyle) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The style must not be null
         //
         verifyException("org.apache.commons.lang3.builder.ToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(object0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.vm.specification.name", (long[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("IPz$I2G^e");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte)17);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("h@Gb#OU9ny:c[nqu.", standardToStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((int) 'V');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("OgU68#7UbWI,wzq8", toStringStyle0, stringBuffer0);
      short[] shortArray0 = new short[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      Object[] objectArray0 = new Object[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.vm.specification.name", objectArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("h@Gb#OU9ny:c[nqu.", standardToStringStyle0);
      boolean[] booleanArray0 = new boolean[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("h@Gb#OU9ny:c[nqu.", booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("Unexpected IllegalAccessException: ");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Unexpected IllegalAccessException: ", (short)1);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, (ToStringStyle) null, stringBuffer0);
      Object[] objectArray0 = new Object[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, (StringBuffer) null);
      int[] intArray0 = new int[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      String string0 = ToStringBuilder.reflectionToString((Object) "IPz$I2G^e", toStringStyle0, false);
      //  // Unstable assertion: assertEquals("String[value={I,P,z,$,I,2,G,^,e},value={I,P,z,$,I,2,G,^,e},hash=891610356]hash=891610356,value={I,P,z,$,I,2,G,^,e},hash=891610356]]", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      toStringBuilder0.append("", (-29L));
      assertEquals(23, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      char[] charArray0 = new char[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.vm.specification.name", charArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer((-1083));
      String string0 = ToStringBuilder.reflectionToString((Object) integer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@2[]", booleanArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("Unexpected IllegalAccessException: ");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Unexpected IllegalAccessException: ", (float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Class<Object> class0 = Object.class;
      String string0 = ToStringBuilder.reflectionToString(object0, (ToStringStyle) standardToStringStyle0, true, (Class<? super Object>) class0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, (ToStringStyle) null, stringBuffer0);
      // Undeclared exception!
      try { 
        toStringBuilder0.appendAsObjectToString((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot get the toString of a null identity
         //
         verifyException("org.apache.commons.lang3.ObjectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("h@Gb#OU9ny:c[nqu.", standardToStringStyle0);
      long[] longArray0 = new long[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("h@Gb#OU9ny:c[nqu.", longArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("OgU68#7UbWI,wzq8", toStringStyle0, stringBuffer0);
      toStringBuilder0.append("OgU68#7UbWI,wzq8", (byte) (-108));
      //  // Unstable assertion: assertEquals("-108", stringBuffer0.toString());
      //  // Unstable assertion: assertEquals(4, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", 'P');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object object0 = new Object();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, (ToStringStyle) null, stringBuffer0);
      char[] charArray0 = new char[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("FcyO6kz3/L", charArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@2[]", (float) 'V');
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("h@Gb#OU9ny:c[nqu.", standardToStringStyle0);
      double[] doubleArray0 = new double[9];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("h@Gb#OU9ny:c[nqu.", doubleArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      toStringBuilder0.append("", true);
      assertEquals(24, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("OgU68#7UbWI,wzq8", toStringStyle0, stringBuffer0);
      toStringBuilder0.append("OgU68#7UbWI,wzq8", (-3003.9));
      //  // Unstable assertion: assertEquals(7, stringBuffer0.length());
      //  // Unstable assertion: assertEquals("-3003.9", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("}}:@", (ToStringStyle) null);
      byte[] byteArray0 = new byte[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@2[value={,},},:,@},value={,},},:,@},hash=88809794]hash=88809794,value={,},},:,@},hash=88809794]]", byteArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, (StringBuffer) null);
      int[] intArray0 = new int[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("jdi1A\":I[QwH_j", intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, (StringBuffer) null);
      double[] doubleArray0 = new double[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("jdi1A\":I[QwH_j", doubleArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append('V');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, (StringBuffer) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, (StringBuffer) null);
      short[] shortArray0 = new short[9];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("IPz$I2G^e");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("IPz$I2G^e", (short[]) null, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      float[] floatArray0 = new float[7];
      toStringBuilder0.append("", floatArray0, true);
      assertEquals(49, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, (StringBuffer) null);
      boolean[] booleanArray0 = new boolean[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Integer integer0 = new Integer((-1083));
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      long[] longArray0 = new long[8];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, (ToStringStyle) null);
      byte[] byteArray0 = new byte[8];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("at]R\"r[HhkXP).Z", byteArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("OgU68#7UbWI,wzq8", toStringStyle0, stringBuffer0);
      toStringBuilder0.append((short) (byte) (-108));
      //  // Unstable assertion: assertEquals(4, stringBuffer0.length());
      //  // Unstable assertion: assertEquals("-108", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", 0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("OgU68#7UbWI,wzq8", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((long) 0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      Object[] objectArray0 = new Object[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.vm.specification.name", (Object) toStringBuilder0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) "}}:@", (ToStringStyle) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Integer integer0 = new Integer((-1083));
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      byte[] byteArray0 = new byte[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("OgU68#7UbWI,wzq8", toStringStyle0, stringBuffer0);
      int[] intArray0 = new int[5];
      toStringBuilder0.append("OgU68#7UbWI,wzq8", intArray0, true);
      //  // Unstable assertion: assertEquals(11, stringBuffer0.length());
      //  // Unstable assertion: assertEquals("{0,0,0,0,0}", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((double) 'V');
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      toStringBuilder0.build();
      assertEquals(21, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((float) 'V');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      char[] charArray0 = new char[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(charArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }
}