/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 05:09:40 GMT 2024
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
      int int0 = calculadora0.dividir((-867), (-867));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrair(0, (-1453));
      assertEquals(1453, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrair((-5938), 55);
      assertEquals((-5993), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.somar(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.somar(0, (-1453));
      assertEquals((-1453), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.raizQuadrada(2166);
      assertEquals(46.54030511288038, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.porcentagem(3817, (-1));
      assertEquals((-3817.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.multiplicar(1944, 1944);
      assertEquals(3779136, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.multiplicar(55, (-1));
      assertEquals((-55), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.dividir((-469), 1430);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.dividir((-1158), 755);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.porcentagem(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.porcentagem(1831, 2428);
      assertEquals(4445668.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      calculadora0.potencia((-948), 3246);
      calculadora0.potencia(385, 3676);
      // Undeclared exception!
      calculadora0.potencia(0, 3676);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      // Undeclared exception!
      try { 
        calculadora0.potencia(0, (-2039));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // N\u00E3o \u00E9 poss\u00EDvel calcular para n\u00FAmeros negativos.
         //
         verifyException("com.example.Calculadora", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.potencia(1831, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      // Undeclared exception!
      try { 
        calculadora0.raizQuadrada((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // N\u00E3o \u00E9 poss\u00EDvel calcular a raiz quadrada de um n\u00FAmero negativo.
         //
         verifyException("com.example.Calculadora", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      double double0 = calculadora0.raizQuadrada(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      // Undeclared exception!
      try { 
        calculadora0.dividir(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Divis\u00E3o por zero n\u00E3o permitida.
         //
         verifyException("com.example.Calculadora", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.somar(543, 543);
      assertEquals(1086, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrair(867, 867);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.multiplicar(0, 0);
      assertEquals(0, int0);
  }
}
