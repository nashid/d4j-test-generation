/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 05:03:58 GMT 2021
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.lang3.concurrent.BackgroundInitializer;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiBackgroundInitializer_ESTest extends MultiBackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.isException("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name 
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callable0 = (Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults>(callable0);
      multiBackgroundInitializer0.addInitializer("org.apache.commons.lang3.concurrent.BasicThreadFactory$1", callableBackgroundInitializer0);
      multiBackgroundInitializer0.addInitializer("QQc0<gWRcrbra?", callableBackgroundInitializer0);
      try { 
        multiBackgroundInitializer0.initialize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot set ExecutorService after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      boolean boolean0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callable0 = (Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults>(callable0);
      multiBackgroundInitializer0.addInitializer("org.apache.commons.lang3.concurrent.BasicThreadFactory$1", callableBackgroundInitializer0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(scheduledThreadPoolExecutor0);
      int int0 = multiBackgroundInitializer0.getTaskCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(scheduledThreadPoolExecutor0);
      multiBackgroundInitializer0.start();
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("", callableBackgroundInitializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("Q[.hAoke+", (BackgroundInitializer<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_CallerRunsPolicy0);
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0, scheduledThreadPoolExecutor0);
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer((String) null, callableBackgroundInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name of child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getResultObject("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name 
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getException("addInitializer() must not be called after start()!");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      Set<String> set0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.initializerNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getInitializer("cv>mS57{Qx0}2EK4t");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name cv>mS57{Qx0}2EK4t
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }
}