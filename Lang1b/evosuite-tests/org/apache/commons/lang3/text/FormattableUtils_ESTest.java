/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 04:07:48 GMT 2021
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import org.apache.commons.lang3.text.FormattableUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormattableUtils_ESTest extends FormattableUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = FormattableUtils.toString((Formattable) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Formatter formatter0 = new Formatter();
      formatter0.close();
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) "", formatter0, 1, 1, (-1), (CharSequence) "");
        fail("Expecting exception: FormatterClosedException");
      
      } catch(FormatterClosedException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(64);
      Locale locale0 = Locale.KOREA;
      Formatter formatter0 = new Formatter(charBuffer0, locale0);
      Formatter formatter1 = FormattableUtils.append((CharSequence) charBuffer0, formatter0, 64, 64, 64, (CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, formatter1, 1906, 64, 2157, (CharSequence) charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) stringBuffer0, (Formatter) null, 0, 1314, 0, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Formatter formatter0 = new Formatter();
      formatter0.close();
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) "", formatter0, (-2212), 0, 0, 'H', (CharSequence) "");
        fail("Expecting exception: FormatterClosedException");
      
      } catch(FormatterClosedException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      Locale locale0 = Locale.ITALY;
      Formatter formatter0 = new Formatter(charBuffer1, locale0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer1, formatter0, 4334, 1, 801, 's', (CharSequence) charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(622);
      Formatter formatter0 = new Formatter(charBuffer0);
      charBuffer0.append('8');
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, formatter0, 622, 622, 622, 'L', (CharSequence) charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Formatter formatter0 = new Formatter((Appendable) null);
      // Undeclared exception!
      FormattableUtils.append((CharSequence) "", formatter0, 32, 32767, 1, '.');
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1089);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Formatter formatter0 = new Formatter(stringBuffer0);
      formatter0.close();
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) stringBuffer0, formatter0, 1089, (-223), (-223), '[');
        fail("Expecting exception: FormatterClosedException");
      
      } catch(FormatterClosedException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      Locale locale0 = Locale.JAPANESE;
      Formatter formatter0 = new Formatter(charBuffer0, locale0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, formatter0, 32, 32, 32, '}');
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Formatter formatter0 = new Formatter(charBuffer0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, formatter0, 1403, 1403, 1403, '/');
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Locale locale0 = Locale.FRENCH;
      Formatter formatter0 = new Formatter(charArrayWriter0, locale0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) null, formatter0, 1303, 1, (-1620), '*');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(101);
      Formatter formatter0 = new Formatter(charBuffer0);
      // Undeclared exception!
      FormattableUtils.append((CharSequence) charBuffer0, formatter0, 101, 32767, 32767);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Formatter formatter0 = new Formatter(charBuffer0);
      charBuffer0.append('%');
      charBuffer0.clear();
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, formatter0, 1403, 1403, 7);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '\u0000'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Formatter formatter0 = new Formatter(stringBuffer0);
      formatter0.close();
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) stringBuffer0, formatter0, 0, 0, 1);
        fail("Expecting exception: FormatterClosedException");
      
      } catch(FormatterClosedException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Formatter formatter0 = new Formatter(charBuffer0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, formatter0, 1403, 1403, 2);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) "", (Formatter) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Formatter formatter0 = new Formatter(charBuffer0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append((CharSequence) charBuffer1);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer1, formatter0, 2570, 958, 958);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, (Formatter) null, 1883, 1883, 1883, ' ', (CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      MockFile mockFile0 = new MockFile("");
      MockFile mockFile1 = new MockFile(mockFile0, "{>\"qEy");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile1);
      Formatter formatter0 = new Formatter(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) charBuffer0, formatter0, 0, 0, 0, 'W', (CharSequence) "{>\"qEy");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified ellipsis '{>\"qEy' exceeds precision of 0
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Formatter formatter0 = new Formatter(locale0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) null, formatter0, (-1), (-2568), (-1), '1', (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Formatter formatter0 = new Formatter();
      Formatter formatter1 = FormattableUtils.append((CharSequence) "", formatter0, (-1), (-1), (-1), 'd', (CharSequence) "");
      assertEquals("", formatter1.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Formatter formatter0 = new Formatter((Appendable) null);
      FormattableUtils.append((CharSequence) "null", formatter0, (-1830), 963, 0, ' ', (CharSequence) "");
      assertEquals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", formatter0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Formatter formatter0 = new Formatter((Appendable) null);
      FormattableUtils.append((CharSequence) "", formatter0, 32, 32, 1906);
      assertEquals("                                ", formatter0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FormattableUtils formattableUtils0 = new FormattableUtils();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "c");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Formatter formatter0 = new Formatter(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        FormattableUtils.append((CharSequence) "", formatter0, 0, 0, 0, (CharSequence) "c");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified ellipsis 'c' exceeds precision of 0
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Formattable formattable0 = mock(Formattable.class, new ViolatedAssumptionAnswer());
      String string0 = FormattableUtils.toString(formattable0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Formatter formatter0 = new Formatter();
      Formatter formatter1 = FormattableUtils.append((CharSequence) "", formatter0, (-2001), (-2001), (-2212), 'H');
      assertSame(formatter1, formatter0);
  }
}