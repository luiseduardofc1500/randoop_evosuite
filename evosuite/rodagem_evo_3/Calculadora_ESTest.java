/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 05:22:36 GMT 2024
 */

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.Calculadora;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Calculadora_ESTest extends Calculadora_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.dividir(1, 1740);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrair(1, (-2268));
      assertEquals(2269, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrair(2617, 2989);
      assertEquals((-372), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.somar(2038, 1172);
      assertEquals(3210, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.somar(1, (-2678));
      assertEquals((-2677), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.raizQuadrada(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.potencia(2532, 472);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.potencia((-165), 6236);
      assertEquals((-9.35919471E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.porcentagem(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.porcentagem(912, (-3386));
      assertEquals((-3088032.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.multiplicar(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.multiplicar((-156), (-156));
      assertEquals(24336, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.dividir((-1), (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.dividir(6079, (-934));
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.porcentagem((-529), (-529));
      assertEquals(279841.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.porcentagem(1, 4480);
      assertEquals(4480.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      calculadora0.potencia(1, 6079);
      // Undeclared exception!
      calculadora0.potencia(0, 4234);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      // Undeclared exception!
      try { 
        calculadora0.potencia((-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // N\u00E3o \u00E9 poss\u00EDvel calcular para n\u00FAmeros negativos.
         //
         verifyException("com.example.Calculadora", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.potencia(0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      // Undeclared exception!
      try { 
        calculadora0.raizQuadrada((-128));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // N\u00E3o \u00E9 poss\u00EDvel calcular a raiz quadrada de um n\u00FAmero negativo.
         //
         verifyException("com.example.Calculadora", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.raizQuadrada(850);
      assertEquals(29.154759474226502, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      // Undeclared exception!
      try { 
        calculadora0.dividir(1, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Divis\u00E3o por zero n\u00E3o permitida.
         //
         verifyException("com.example.Calculadora", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.somar(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrair(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.multiplicar(850, (-1534));
      assertEquals((-1303900), int0);
  }
}
