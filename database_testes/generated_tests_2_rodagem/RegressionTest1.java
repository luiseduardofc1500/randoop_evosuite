package generated_tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.dividir(362880, 153);
        int int9 = calculadora0.somar(7829502, (-10469705));
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2371 + "'", int6 == 2371);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2640203) + "'", int9 == (-2640203));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int1 = calculadora.Matematica.sum(10895881);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-626166995) + "'", int1 == (-626166995));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        int int15 = calculadora0.multiplicar(10472177, 157641);
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1577012793 + "'", int15 == 1577012793);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int1 = calculadora.Matematica.factorial(361218);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        double double22 = calculadora0.potencia((-100), 157641);
        int int25 = calculadora0.somar((-677952), (-509347440));
        int int28 = calculadora0.somar((int) (short) 1, (-4719837));
        // The following exception was thrown during execution in test generation
        try {
            int int31 = calculadora0.dividir(158400, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-510025392) + "'", int25 == (-510025392));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4719836) + "'", int28 == (-4719836));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int int1 = calculadora.Matematica.sum((-54));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar((-3301), (-3301));
        double double15 = calculadora0.porcentagem((int) '#', 296384028);
        int int18 = calculadora0.somar((int) (byte) -1, 6579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10896601 + "'", int12 == 10896601);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.783506388E9d + "'", double15 == 1.783506388E9d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6578 + "'", int18 == 6578);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double26 = calculadora0.porcentagem(108, 50511);
        int int29 = calculadora0.somar(10896601, (-34));
        int int32 = calculadora0.multiplicar(47983, 275009);
        java.lang.Class<?> wildcardClass33 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5455188.0d + "'", double26 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10896567 + "'", int29 == 10896567);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 310854959 + "'", int32 == 310854959);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        int int23 = calculadora0.subtrair((-1915836162), (-54));
        int int26 = calculadora0.subtrair((-47610), 355015120);
        double double29 = calculadora0.porcentagem(0, (-500302768));
        int int32 = calculadora0.somar((-15763), 66179929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1915836108) + "'", int23 == (-1915836108));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-355062730) + "'", int26 == (-355062730));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 66164166 + "'", int32 == 66164166);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double15 = calculadora0.porcentagem((int) 'a', 21645002);
        double double17 = calculadora0.raizQuadrada(10895881);
        int int20 = calculadora0.multiplicar(41, (-15763));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.099565194E9d + "'", double15 == 2.099565194E9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3300.890940337169d + "'", double17 == 3300.890940337169d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-646283) + "'", int20 == (-646283));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(3300, 0);
        int int19 = calculadora0.dividir(21703872, 5051);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4296 + "'", int19 == 4296);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.dividir((-10469705), 5512);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1899) + "'", int23 == (-1899));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int int1 = calculadora.Matematica.sum(477452415);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-208571456) + "'", int1 == (-208571456));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        int int20 = calculadora0.multiplicar((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 520 + "'", int20 == 520);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int int1 = calculadora.Matematica.factorial(5781687);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.dividir((int) (byte) 0, 70714490);
        int int23 = calculadora0.multiplicar(2371, 47968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 113732128 + "'", int23 == 113732128);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar((-3301), (-3301));
        double double15 = calculadora0.porcentagem((int) '#', 296384028);
        int int18 = calculadora0.multiplicar(12758818, (-1277355836));
        int int21 = calculadora0.somar(145, (-2109870));
        int int24 = calculadora0.subtrair((-1056240805), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10896601 + "'", int12 == 10896601);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.783506388E9d + "'", double15 == 1.783506388E9d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-875346424) + "'", int18 == (-875346424));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2109725) + "'", int21 == (-2109725));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1056240805) + "'", int24 == (-1056240805));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        int int1 = calculadora.Matematica.factorial(4296);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int int1 = calculadora.Matematica.sum((-10472177));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int int1 = calculadora.Matematica.factorial(1128677140);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        double double16 = calculadora0.raizQuadrada(613);
        int int19 = calculadora0.multiplicar((-1810759117), 561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 24.758836806279895d + "'", double16 == 24.758836806279895d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2071384515 + "'", int19 == 2071384515);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double17 = calculadora0.potencia((-678042), 0);
        int int20 = calculadora0.somar((-44727), 11188);
        int int23 = calculadora0.subtrair((-463861198), 561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-33539) + "'", int20 == (-33539));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-463861759) + "'", int23 == (-463861759));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        boolean boolean1 = calculadora.Matematica.isPrime(1597);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double16 = calculadora0.raizQuadrada(4951);
        double double19 = calculadora0.potencia(5446651, 12758818);
        int int22 = calculadora0.subtrair(2756, 0);
        double double24 = calculadora0.raizQuadrada(21644910);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 70.36334272900912d + "'", double16 == 70.36334272900912d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-3.79981927E8d) + "'", double19 == (-3.79981927E8d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2756 + "'", int22 == 2756);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4652.409053382989d + "'", double24 == 4652.409053382989d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem(0, 50511);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia(3500, (-3399));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        boolean boolean1 = calculadora.Matematica.isPrime((-367412710));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        int int9 = calculadora0.multiplicar(1379, (-369360));
        int int12 = calculadora0.dividir(21703872, 70714490);
        double double14 = calculadora0.raizQuadrada(56);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-509347440) + "'", int9 == (-509347440));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.483314773547883d + "'", double14 == 7.483314773547883d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.subtrair(53, (int) (short) 0);
        int int9 = calculadora0.dividir(0, (-98));
        int int12 = calculadora0.subtrair(290577660, (-1333113776));
        double double15 = calculadora0.porcentagem(630036720, 6579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1623691436 + "'", int12 == 1623691436);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.6814024E8d + "'", double15 == 3.6814024E8d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-90), 100);
        int int12 = calculadora0.dividir(5887, 5887);
        int int15 = calculadora0.dividir(5191, 1577012793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9000) + "'", int9 == (-9000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.potencia(9, 14);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-70714526));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.796636465E9d + "'", double19 == 1.796636465E9d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        double double17 = calculadora0.porcentagem(47983, (-1653134308));
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 613 + "'", int14 == 613);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.40748906E9d + "'", double17 == 1.40748906E9d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.somar((-1243182), 524700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-718482) + "'", int9 == (-718482));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int int1 = calculadora.Matematica.sum((-823690138));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int int1 = calculadora.Matematica.factorial(108367055);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int int1 = calculadora.Matematica.sum(244650191);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1571632104) + "'", int1 == (-1571632104));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar(6126751, 12253726);
        int int15 = calculadora0.subtrair(8197332, 367830);
        int int18 = calculadora0.subtrair(0, 2526);
        double double21 = calculadora0.porcentagem(12253726, 39);
        int int24 = calculadora0.somar(1963777243, 100);
        int int27 = calculadora0.subtrair(1389423872, 4576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-500309854) + "'", int12 == (-500309854));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7829502 + "'", int15 == 7829502);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2526) + "'", int18 == (-2526));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.77895314E8d + "'", double21 == 4.77895314E8d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1963777343 + "'", int24 == 1963777343);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1389419296 + "'", int27 == 1389419296);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        int int11 = calculadora0.subtrair((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada(1454327872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 38135.6509319036d + "'", double13 == 38135.6509319036d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(58870, 11781);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.9354747E8d + "'", double14 == 6.9354747E8d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        java.lang.Class<?> wildcardClass13 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int1 = calculadora.Matematica.factorial(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        boolean boolean1 = calculadora.Matematica.isPrime((-44727));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(0, 10);
        int int17 = calculadora0.dividir(52, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calculadora0.dividir((-1104039575), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-52) + "'", int17 == (-52));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        boolean boolean1 = calculadora.Matematica.isPrime((-509347440));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        double double20 = calculadora0.porcentagem(50608, 52);
        int int23 = calculadora0.somar((-32), 32);
        double double26 = calculadora0.potencia(43, 10896567);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2631616.0d + "'", double20 == 2631616.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-4.46006685E8d) + "'", double26 == (-4.46006685E8d));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int1 = calculadora.Matematica.sum((-9000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        int int22 = calculadora0.dividir(649, (-108366441));
        double double24 = calculadora0.raizQuadrada(2568);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = calculadora0.potencia((-2443669), (-270610380));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 50.67543783727971d + "'", double24 == 50.67543783727971d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        int int23 = calculadora0.dividir(561, 275009);
        int int26 = calculadora0.somar(499035496, 1048044852);
        java.lang.Class<?> wildcardClass27 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1547080348 + "'", int26 == 1547080348);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar(6126751, 12253726);
        int int15 = calculadora0.subtrair(8197332, 367830);
        int int18 = calculadora0.subtrair(0, 2526);
        int int21 = calculadora0.subtrair((-385386529), 250156381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-500309854) + "'", int12 == (-500309854));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7829502 + "'", int15 == 7829502);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2526) + "'", int18 == (-2526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-635542910) + "'", int21 == (-635542910));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int int1 = calculadora.Matematica.sum(720);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 259561 + "'", int1 == 259561);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.dividir((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-100) + "'", int17 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int1 = calculadora.Matematica.sum((-678042));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        boolean boolean1 = calculadora.Matematica.isPrime(649754420);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        boolean boolean1 = calculadora.Matematica.isPrime((-16310679));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        double double19 = calculadora0.raizQuadrada(58870);
        double double22 = calculadora0.potencia(14, 44783);
        int int25 = calculadora0.multiplicar((-630036684), 32);
        int int28 = calculadora0.subtrair(362880, (-1168394692));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 242.63140769488191d + "'", double19 == 242.63140769488191d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1313662592 + "'", int25 == 1313662592);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1168757572 + "'", int28 == 1168757572);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int int1 = calculadora.Matematica.factorial((-1301739248));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        double double20 = calculadora0.potencia(13475836, 97);
        int int23 = calculadora0.somar(70, 92);
        double double25 = calculadora0.raizQuadrada(259561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 162 + "'", int23 == 162);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 509.47129457899786d + "'", double25 == 509.47129457899786d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int int1 = calculadora.Matematica.sum(2526);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3191602 + "'", int1 == 3191602);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir(0, (int) (short) 10);
        int int23 = calculadora0.somar(10, 0);
        double double26 = calculadora0.potencia(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        boolean boolean1 = calculadora.Matematica.isPrime((-100));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int1 = calculadora.Matematica.factorial((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        int int14 = calculadora0.dividir(6579, 92);
        int int17 = calculadora0.somar(7015, 71);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia((-270610380), (-640052340));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7086 + "'", int17 == 7086);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int1 = calculadora.Matematica.sum(7015);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24608620 + "'", int1 == 24608620);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.dividir(362880, 153);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = calculadora0.raizQuadrada((-718482));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2371 + "'", int6 == 2371);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int int1 = calculadora.Matematica.sum(194433408);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1669035839) + "'", int1 == (-1669035839));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        int int12 = calculadora0.subtrair((-1530), 367830);
        double double15 = calculadora0.porcentagem((-9035), (int) ' ');
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-369360) + "'", int12 == (-369360));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-289120.0d) + "'", double15 == (-289120.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-90), 100);
        double double12 = calculadora0.porcentagem(71, (int) (byte) -1);
        double double15 = calculadora0.potencia((-10472177), 10);
        double double18 = calculadora0.porcentagem((-977545548), (-518356831));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9000) + "'", int9 == (-9000));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-71.0d) + "'", double12 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.108668513E9d + "'", double15 == 2.108668513E9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.220806452E9d + "'", double18 == 1.220806452E9d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        int int23 = calculadora0.subtrair((int) (byte) -1, 33);
        int int26 = calculadora0.subtrair(0, (int) (byte) 0);
        int int29 = calculadora0.somar(0, 552420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 552420 + "'", int29 == 552420);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        int int28 = calculadora0.dividir(56, 12758826);
        int int31 = calculadora0.somar(4950, 362880);
        int int34 = calculadora0.multiplicar((-8), 529);
        double double36 = calculadora0.raizQuadrada(361187);
        int int39 = calculadora0.multiplicar((-509347440), (-4719836));
        int int42 = calculadora0.subtrair((-31), 518356800);
        double double45 = calculadora0.potencia(0, 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 367830 + "'", int31 == 367830);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-4232) + "'", int34 == (-4232));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 600.9883526325614d + "'", double36 == 600.9883526325614d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1454327872 + "'", int39 == 1454327872);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-518356831) + "'", int42 == (-518356831));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.subtrair(3500, 4576);
        int int15 = calculadora0.dividir(5887, 1597);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.raizQuadrada((-1642756327));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1076) + "'", int12 == (-1076));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        int int23 = calculadora0.subtrair((int) (byte) -1, 33);
        double double25 = calculadora0.raizQuadrada(10896601);
        double double28 = calculadora0.potencia((int) (short) 100, 71);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = calculadora0.potencia(482358766, (-993954013));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3301.0d + "'", double25 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.multiplicar((-108366441), (-16310582));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1054246106) + "'", int23 == (-1054246106));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        boolean boolean1 = calculadora.Matematica.isPrime(310854959);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada(100);
        int int5 = calculadora0.somar(53, 561);
        double double8 = calculadora0.porcentagem(1042113600, 113732128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 614 + "'", int5 == 614);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.559169024E9d + "'", double8 == 1.559169024E9d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        double double22 = calculadora0.raizQuadrada(50511);
        double double24 = calculadora0.raizQuadrada(2104872);
        java.lang.Class<?> wildcardClass25 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 224.74652388857987d + "'", double22 == 224.74652388857987d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1450.8177004710137d + "'", double24 == 1450.8177004710137d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        double double20 = calculadora0.potencia((-10), 14);
        double double23 = calculadora0.porcentagem(6126751, 108);
        int int26 = calculadora0.somar(32, (-3301));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.76447232E8d + "'", double20 == 2.76447232E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.61689108E8d + "'", double23 == 6.61689108E8d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-3269) + "'", int26 == (-3269));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        int int1 = calculadora.Matematica.sum((-459480627));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.somar(58870, 21645002);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21703872 + "'", int9 == 21703872);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.somar(250156381, 529);
        double double23 = calculadora0.porcentagem(50440, 196396861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.063084264E9d + "'", double23 == 2.063084264E9d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        int int23 = calculadora0.dividir(561, 275009);
        int int26 = calculadora0.somar(499035496, 1048044852);
        int int29 = calculadora0.dividir(3400, 1597);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1547080348 + "'", int26 == 1547080348);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.potencia((-100), 15764);
        int int20 = calculadora0.multiplicar(477452415, (-168756252));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-396929508) + "'", int20 == (-396929508));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int int1 = calculadora.Matematica.sum((-1642756327));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int int1 = calculadora.Matematica.sum((-3301));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double26 = calculadora0.porcentagem(108, 50511);
        int int29 = calculadora0.somar(10896601, (-34));
        int int32 = calculadora0.dividir(426942010, 24608620);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5455188.0d + "'", double26 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10896567 + "'", int29 == 10896567);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 17 + "'", int32 == 17);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        double double16 = calculadora0.raizQuadrada(2568);
        int int19 = calculadora0.subtrair(14, (int) (short) 100);
        int int22 = calculadora0.multiplicar((-31), 1030);
        int int25 = calculadora0.subtrair(1235493814, 99);
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.67543783727971d + "'", double16 == 50.67543783727971d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-86) + "'", int19 == (-86));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-31930) + "'", int22 == (-31930));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1235493715 + "'", int25 == 1235493715);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        int int11 = calculadora0.somar(4950, (int) (short) 1);
        int int14 = calculadora0.somar(5150, 41);
        int int17 = calculadora0.subtrair(50511, 71);
        int int20 = calculadora0.multiplicar(21703872, 310);
        int int23 = calculadora0.subtrair((-4719837), (-1571249596));
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4951 + "'", int11 == 4951);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5191 + "'", int14 == 5191);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50440 + "'", int17 == 50440);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1861734272) + "'", int20 == (-1861734272));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1566529759 + "'", int23 == 1566529759);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.multiplicar((-677952), (-500309854));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-386128000) + "'", int20 == (-386128000));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int1 = calculadora.Matematica.sum((-1861734272));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int1 = calculadora.Matematica.factorial(106029);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.somar(12758826, (-8));
        int int17 = calculadora0.somar(0, (-8));
        int int20 = calculadora0.multiplicar((-1915836108), 108);
        int int23 = calculadora0.somar(10896754, 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12758818 + "'", int14 == 12758818);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-8) + "'", int17 == (-8));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-751869456) + "'", int20 == (-751869456));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10897474 + "'", int23 == 10897474);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.subtrair(3500, 4576);
        int int15 = calculadora0.dividir(5887, 1597);
        int int18 = calculadora0.multiplicar((-11), 68559809);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1076) + "'", int12 == (-1076));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-754157899) + "'", int18 == (-754157899));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        int int1 = calculadora.Matematica.factorial((-16310679));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        double double10 = calculadora0.raizQuadrada(97);
        int int13 = calculadora0.subtrair((int) (short) -1, (int) (short) 0);
        double double16 = calculadora0.porcentagem(39, 310854959);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.848857801796104d + "'", double10 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-7.61558487E8d) + "'", double16 == (-7.61558487E8d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = calculadora0.raizQuadrada((-1745154368));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int1 = calculadora.Matematica.sum(12758918);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1075418326 + "'", int1 == 1075418326);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int1 = calculadora.Matematica.factorial(68284800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        double double20 = calculadora0.potencia((-10), 14);
        double double23 = calculadora0.porcentagem(6126751, 108);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calculadora0.dividir(41, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.76447232E8d + "'", double20 == 2.76447232E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.61689108E8d + "'", double23 == 6.61689108E8d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        boolean boolean1 = calculadora.Matematica.isPrime((-282349306));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem(0, 50511);
        int int20 = calculadora0.subtrair((int) (byte) 1, 9);
        double double23 = calculadora0.potencia(171024777, 561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-8) + "'", int20 == (-8));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.043190025E9d + "'", double23 == 1.043190025E9d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int int1 = calculadora.Matematica.factorial((-626166995));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        boolean boolean1 = calculadora.Matematica.isPrime(961266061);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        boolean boolean1 = calculadora.Matematica.isPrime(2527);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        double double21 = calculadora0.raizQuadrada(4950);
        double double24 = calculadora0.potencia(250156381, 33);
        int int27 = calculadora0.multiplicar(7015, 50608);
        double double30 = calculadora0.potencia((-2526), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 70.35623639735144d + "'", double21 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.562233379E9d) + "'", double24 == (-1.562233379E9d));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 355015120 + "'", int27 == 355015120);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        int int22 = calculadora0.dividir(649, (-108366441));
        double double25 = calculadora0.potencia(157641, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double28 = calculadora0.potencia(71, (-459480627));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.335394615E9d) + "'", double25 == (-1.335394615E9d));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(188191, 19371844);
        double double23 = calculadora0.porcentagem(21645002, 92);
        int int26 = calculadora0.subtrair(1577012793, 113732128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-19183653) + "'", int20 == (-19183653));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.991340184E9d + "'", double23 == 1.991340184E9d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1463280665 + "'", int26 == 1463280665);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        int int28 = calculadora0.subtrair(53, (-2104819));
        int int31 = calculadora0.multiplicar((int) '4', 157641);
        int int34 = calculadora0.dividir(92, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2104872 + "'", int28 == 2104872);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8197332 + "'", int31 == 8197332);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-9) + "'", int34 == (-9));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        boolean boolean1 = calculadora.Matematica.isPrime(10896567);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir(0, (int) (short) 10);
        int int23 = calculadora0.somar(10, 0);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        double double19 = calculadora0.potencia((-784238464), 12758818);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        int int22 = calculadora0.subtrair(290577660, 5781687);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 284795973 + "'", int22 == 284795973);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int1 = calculadora.Matematica.sum(275009);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-839593119) + "'", int1 == (-839593119));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int int1 = calculadora.Matematica.factorial((-2104819));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        boolean boolean1 = calculadora.Matematica.isPrime(1126969732);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int1 = calculadora.Matematica.factorial(10895881);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        double double23 = calculadora0.potencia(5150, 50511);
        int int26 = calculadora0.somar((-10472177), 2472);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = calculadora0.raizQuadrada((-1367036894));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-10469705) + "'", int26 == (-10469705));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double14 = calculadora0.porcentagem(631809017, 961266061);
        int int17 = calculadora0.somar((-1915836108), (-44727));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.551108389E9d + "'", double14 == 1.551108389E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1915880835) + "'", int17 == (-1915880835));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int int1 = calculadora.Matematica.sum(21187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 224455078 + "'", int1 == 224455078);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        int int14 = calculadora0.dividir(24, (int) (byte) 1);
        int int17 = calculadora0.subtrair(15, (-1810759158));
        int int20 = calculadora0.somar((-86), 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1810759173 + "'", int17 == 1810759173);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        int int1 = calculadora.Matematica.factorial((-1056181935));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir((-10472177), (-98397944));
        int int23 = calculadora0.somar(162, 70714428);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70714590 + "'", int23 == 70714590);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        double double9 = calculadora0.porcentagem((-2443669), 2371);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = calculadora0.raizQuadrada((-518356831));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.498971903E9d) + "'", double9 == (-1.498971903E9d));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int1 = calculadora.Matematica.factorial(7140690);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(53, 143);
        int int18 = calculadora0.subtrair(50511, 157641);
        double double21 = calculadora0.porcentagem((-1301739248), (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.50920227E8d) + "'", double15 == (-9.50920227E8d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-107130) + "'", int18 == (-107130));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.32490592E9d) + "'", double21 == (-1.32490592E9d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int1 = calculadora.Matematica.factorial((-1054246106));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        double double22 = calculadora0.potencia((-100), 157641);
        int int25 = calculadora0.somar((-677952), (-509347440));
        int int28 = calculadora0.somar(14, 935867520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-510025392) + "'", int25 == (-510025392));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 935867534 + "'", int28 == 935867534);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(12258676, 0);
        int int20 = calculadora0.somar(11188, 4951);
        int int23 = calculadora0.somar(145, (-1888351720));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16139 + "'", int20 == 16139);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1888351575) + "'", int23 == (-1888351575));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        double double19 = calculadora0.raizQuadrada(52);
        int int22 = calculadora0.somar(1128677140, 1454327872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.211102550927978d + "'", double19 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1711962284) + "'", int22 == (-1711962284));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        double double28 = calculadora0.potencia((-54), 157694);
        int int31 = calculadora0.subtrair(10896601, 720);
        int int34 = calculadora0.subtrair((int) (byte) 10, 21339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10895881 + "'", int31 == 10895881);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-21329) + "'", int34 == (-21329));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem((-2147483648), 1235336173);
        double double20 = calculadora0.porcentagem((-785853792), (-16310679));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.147483648E9d) + "'", double17 == (-2.147483648E9d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.261624416E9d) + "'", double20 == (-1.261624416E9d));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(188191, 19371844);
        double double23 = calculadora0.porcentagem(21645002, 92);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-19183653) + "'", int20 == (-19183653));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.991340184E9d + "'", double23 == 1.991340184E9d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int1 = calculadora.Matematica.sum(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 946 + "'", int1 == 946);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        boolean boolean1 = calculadora.Matematica.isPrime(1379);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar(426942010, 3300);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = calculadora0.potencia((-687913492), (-839593119));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 159359912 + "'", int8 == 159359912);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int int1 = calculadora.Matematica.factorial(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 120 + "'", int1 == 120);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-15763));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.somar(0, (-1899));
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1899) + "'", int9 == (-1899));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        int int28 = calculadora0.subtrair(53, (-2104819));
        int int31 = calculadora0.multiplicar((int) '4', 157641);
        int int34 = calculadora0.dividir(232201856, 1416619201);
        int int37 = calculadora0.multiplicar((-7829438), 185532442);
        int int40 = calculadora0.subtrair(720, (-97864074));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2104872 + "'", int28 == 2104872);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8197332 + "'", int31 == 8197332);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-977545548) + "'", int37 == (-977545548));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97864794 + "'", int40 == 97864794);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int1 = calculadora.Matematica.sum(70714428);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1527281959 + "'", int1 == 1527281959);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        int int14 = calculadora0.multiplicar(5887, (int) (byte) 10);
        double double17 = calculadora0.potencia(50608, (int) (short) 10);
        int int20 = calculadora0.multiplicar((-1067), 361187);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58870 + "'", int14 == 58870);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-385386529) + "'", int20 == (-385386529));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int int1 = calculadora.Matematica.factorial(66179929);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int1 = calculadora.Matematica.sum(71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2556 + "'", int1 == 2556);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        int int19 = calculadora0.multiplicar((-64), 12253726);
        double double21 = calculadora0.raizQuadrada(4576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-784238464) + "'", int19 == (-784238464));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 67.64613810115105d + "'", double21 == 67.64613810115105d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double26 = calculadora0.porcentagem(108, 50511);
        int int29 = calculadora0.multiplicar(41, (-385386529));
        double double32 = calculadora0.porcentagem(902981410, (-1810759158));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5455188.0d + "'", double26 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1379021495 + "'", int29 == 1379021495);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.486206124E9d) + "'", double32 == (-1.486206124E9d));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        boolean boolean1 = calculadora.Matematica.isPrime(68284800);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double26 = calculadora0.porcentagem((-10), 10896601);
        int int29 = calculadora0.multiplicar(10472177, (int) (short) -1);
        int int32 = calculadora0.subtrair(153, 21339);
        int int35 = calculadora0.subtrair(0, (-204480));
        java.lang.Class<?> wildcardClass36 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0896601E8d) + "'", double26 == (-1.0896601E8d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-10472177) + "'", int29 == (-10472177));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-21186) + "'", int32 == (-21186));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 204480 + "'", int35 == 204480);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int1 = calculadora.Matematica.sum((-385386529));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        int int14 = calculadora0.multiplicar(2756, (int) (short) 0);
        int int17 = calculadora0.dividir(310854959, 362880);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 856 + "'", int17 == 856);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.potencia((-302683408), 0);
        int int18 = calculadora0.multiplicar(6, (-16310679));
        int int21 = calculadora0.multiplicar((-1861529792), 11188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-97864074) + "'", int18 == (-97864074));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-498894592) + "'", int21 == (-498894592));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        int int1 = calculadora.Matematica.factorial(518356800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int int1 = calculadora.Matematica.factorial(5051045);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.subtrair(1416619201, (-977545548));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1900802547) + "'", int23 == (-1900802547));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int int1 = calculadora.Matematica.sum((-1164018784));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int1 = calculadora.Matematica.factorial(2104871);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        int int17 = calculadora0.dividir(0, (int) (byte) -1);
        double double19 = calculadora0.raizQuadrada(560);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 613 + "'", int14 == 613);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 23.664319132398465d + "'", double19 == 23.664319132398465d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calculadora0.dividir((-1888351720), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        int int22 = calculadora0.multiplicar(4576, 12758826);
        double double25 = calculadora0.porcentagem((-823690138), 3500);
        int int28 = calculadora0.dividir(14, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1745154368) + "'", int22 == (-1745154368));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9.92427384E8d) + "'", double25 == (-9.92427384E8d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        double double23 = calculadora0.potencia(5150, 50511);
        int int26 = calculadora0.somar((-10472177), 2472);
        double double28 = calculadora0.raizQuadrada(10896754);
        int int31 = calculadora0.subtrair((-630036684), 10887601);
        int int34 = calculadora0.multiplicar(3191602, 613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-10469705) + "'", int26 == (-10469705));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3301.0231747141675d + "'", double28 == 3301.0231747141675d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-640924285) + "'", int31 == (-640924285));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1956452026 + "'", int34 == 1956452026);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.subtrair((int) (short) 10, (-54));
        int int14 = calculadora0.multiplicar((-16547), (-1277355836));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 872954676 + "'", int14 == 872954676);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(50608, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia(4951, (-556358958));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5060 + "'", int19 == 5060);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        boolean boolean1 = calculadora.Matematica.isPrime(21187);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        double double19 = calculadora0.porcentagem(99, 0);
        int int22 = calculadora0.dividir((-1277355836), (-459480627));
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        boolean boolean1 = calculadora.Matematica.isPrime(228511908);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        boolean boolean1 = calculadora.Matematica.isPrime(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int1 = calculadora.Matematica.factorial(10777034);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.multiplicar(2526, (-107130));
        int int17 = calculadora0.multiplicar(935867520, 8197332);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-270610380) + "'", int14 == (-270610380));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2019916288 + "'", int17 == 2019916288);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        int int22 = calculadora0.dividir(649, (-108366441));
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        boolean boolean1 = calculadora.Matematica.isPrime((-635542910));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-90), 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = calculadora0.raizQuadrada((-19183653));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9000) + "'", int9 == (-9000));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        boolean boolean1 = calculadora.Matematica.isPrime((-499035486));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.potencia((int) (byte) 1, (int) ' ');
        int int13 = calculadora0.dividir((-9000), 188806);
        int int16 = calculadora0.subtrair(21645002, (-29));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.raizQuadrada((-2109870));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21645031 + "'", int16 == 21645031);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double8 = calculadora0.porcentagem(1235336173, (-1915836162));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.09584858E8d) + "'", double8 == (-2.09584858E8d));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar((-3301), (-3301));
        double double15 = calculadora0.porcentagem((int) '#', 296384028);
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10896601 + "'", int12 == 10896601);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.783506388E9d + "'", double15 == 1.783506388E9d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int1 = calculadora.Matematica.sum(296385530);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350115344 + "'", int1 == 350115344);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        int int16 = calculadora0.dividir((-31), 10896601);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.potencia(157641, (-1812869028));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        int int20 = calculadora0.multiplicar((-2109870), 499035486);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = calculadora0.potencia(162, (-16310679));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1653134308) + "'", int20 == (-1653134308));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar(53, 157641);
        int int26 = calculadora0.dividir(261, (-1243182));
        int int29 = calculadora0.somar(852742539, 261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 157694 + "'", int23 == 157694);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 852742800 + "'", int29 == 852742800);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        double double19 = calculadora0.raizQuadrada(52);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-396929508));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.211102550927978d + "'", double19 == 7.211102550927978d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair(15764, 4576);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11188 + "'", int17 == 11188);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        int int22 = calculadora0.multiplicar(4576, 12758826);
        double double25 = calculadora0.porcentagem((-823690138), 3500);
        int int28 = calculadora0.subtrair((-168756252), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1745154368) + "'", int22 == (-1745154368));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9.92427384E8d) + "'", double25 == (-9.92427384E8d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-168756252) + "'", int28 == (-168756252));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        int int19 = calculadora0.multiplicar((-64), 12253726);
        int int22 = calculadora0.multiplicar(3453, (-1669035839));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-784238464) + "'", int19 == (-784238464));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 665359165 + "'", int22 == 665359165);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int int1 = calculadora.Matematica.sum((-33539));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int1 = calculadora.Matematica.factorial(2527);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int1 = calculadora.Matematica.factorial((-1861734272));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int int1 = calculadora.Matematica.sum(21339);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 227687130 + "'", int1 == 227687130);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        boolean boolean1 = calculadora.Matematica.isPrime((-1744965562));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        double double20 = calculadora0.porcentagem((-1915836108), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.452541028E9d) + "'", double20 == (-1.452541028E9d));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        double double19 = calculadora0.potencia(5150, 12758818);
        int int22 = calculadora0.subtrair((int) '4', 9);
        double double25 = calculadora0.porcentagem(53, 1431);
        int int28 = calculadora0.dividir(7015, (int) (byte) 100);
        int int31 = calculadora0.subtrair(756167552, (-2443669));
        int int34 = calculadora0.somar(2756, (-1861734272));
        int int37 = calculadora0.dividir(0, 1745349123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43 + "'", int22 == 43);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75843.0d + "'", double25 == 75843.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 70 + "'", int28 == 70);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 758611221 + "'", int31 == 758611221);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1861731516) + "'", int34 == (-1861731516));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        double double28 = calculadora0.potencia(362880, 3300);
        int int31 = calculadora0.subtrair((-1861734272), (-204480));
        int int34 = calculadora0.multiplicar(1463280665, (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1861529792) + "'", int31 == (-1861529792));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1288085606) + "'", int34 == (-1288085606));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(12258676, 0);
        double double20 = calculadora0.potencia(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        boolean boolean1 = calculadora.Matematica.isPrime(613);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = calculadora0.potencia((-369360), (-823690138));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        double double11 = calculadora0.potencia(4908, 100);
        double double13 = calculadora0.raizQuadrada(52);
        java.lang.Class<?> wildcardClass14 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        double double18 = calculadora0.raizQuadrada(3300);
        double double21 = calculadora0.potencia(1577012826, 204480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 57.445626465380286d + "'", double18 == 57.445626465380286d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        int int20 = calculadora0.multiplicar(529, 0);
        double double23 = calculadora0.porcentagem(32, 4951);
        int int26 = calculadora0.multiplicar(6126751, (-718482));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 158432.0d + "'", double23 == 158432.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 381166418 + "'", int26 == 381166418);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        int int20 = calculadora0.dividir(2756, (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-86) + "'", int20 == (-86));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int1 = calculadora.Matematica.factorial((-90796998));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        boolean boolean1 = calculadora.Matematica.isPrime(70714428);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.somar((-875346424), 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-875346393) + "'", int8 == (-875346393));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.multiplicar((-1399098829), (-1324134769));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2073471875) + "'", int20 == (-2073471875));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        double double23 = calculadora0.potencia(5150, 50511);
        int int26 = calculadora0.somar((-10472177), 2472);
        double double28 = calculadora0.raizQuadrada(10896754);
        int int31 = calculadora0.dividir((-1900802547), 361187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-10469705) + "'", int26 == (-10469705));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3301.0231747141675d + "'", double28 == 3301.0231747141675d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-5262) + "'", int31 == (-5262));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int1 = calculadora.Matematica.sum(1527281959);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-261673332) + "'", int1 == (-261673332));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        int int20 = calculadora0.multiplicar(12258676, 1379021495);
        int int23 = calculadora0.subtrair((-21186), 304857);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-687913492) + "'", int20 == (-687913492));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-326043) + "'", int23 == (-326043));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(0, 10);
        int int17 = calculadora0.dividir(52, (int) (byte) -1);
        int int20 = calculadora0.multiplicar((-10000), (-2443669));
        double double23 = calculadora0.potencia(12758818, 361218);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-52) + "'", int17 == (-52));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1333113776) + "'", int20 == (-1333113776));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        int int1 = calculadora.Matematica.sum((-208571456));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int int1 = calculadora.Matematica.sum(120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7261 + "'", int1 == 7261);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        int int20 = calculadora0.subtrair((-736014630), 2556);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-736017186) + "'", int20 == (-736017186));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int1 = calculadora.Matematica.factorial((-5262));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        boolean boolean1 = calculadora.Matematica.isPrime(872954676);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        double double20 = calculadora0.potencia(13475836, 97);
        double double23 = calculadora0.porcentagem(935867520, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.68973568E8d + "'", double23 == 8.68973568E8d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int int1 = calculadora.Matematica.factorial(381166418);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        double double20 = calculadora0.potencia(13475836, 97);
        int int23 = calculadora0.somar(70, 92);
        int int26 = calculadora0.multiplicar(0, 10897474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 162 + "'", int23 == 162);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        int int23 = calculadora0.subtrair((-1915836162), (-54));
        // The following exception was thrown during execution in test generation
        try {
            double double26 = calculadora0.potencia((-640924285), (-10472177));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1915836108) + "'", int23 == (-1915836108));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar(6126751, 12253726);
        int int15 = calculadora0.subtrair(8197332, 367830);
        int int18 = calculadora0.subtrair(0, 2526);
        int int21 = calculadora0.subtrair((-1571249596), (-204480));
        int int24 = calculadora0.subtrair((-1899), (-270610380));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-500309854) + "'", int12 == (-500309854));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7829502 + "'", int15 == 7829502);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2526) + "'", int18 == (-2526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1571045116) + "'", int21 == (-1571045116));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 270608481 + "'", int24 == 270608481);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int int1 = calculadora.Matematica.sum(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        int int14 = calculadora0.dividir((int) (byte) 1, 5887);
        int int17 = calculadora0.multiplicar((int) ' ', 4950);
        int int20 = calculadora0.subtrair((-620768219), 50510);
        int int23 = calculadora0.multiplicar((-736017186), (-630036684));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 158400 + "'", int17 == 158400);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-620818729) + "'", int20 == (-620818729));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 810766104 + "'", int23 == 810766104);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        double double19 = calculadora0.potencia(5150, 12758818);
        int int22 = calculadora0.subtrair((int) '4', 9);
        double double25 = calculadora0.porcentagem(53, 1431);
        int int28 = calculadora0.somar(342, (-630030211));
        java.lang.Class<?> wildcardClass29 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43 + "'", int22 == 43);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75843.0d + "'", double25 == 75843.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-630029869) + "'", int28 == (-630029869));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair(15764, 4576);
        double double19 = calculadora0.raizQuadrada(2104872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11188 + "'", int17 == 11188);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1450.8177004710137d + "'", double19 == 1450.8177004710137d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        boolean boolean1 = calculadora.Matematica.isPrime(1056242184);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int int1 = calculadora.Matematica.sum((-784238464));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        int int23 = calculadora0.subtrair((int) (byte) -1, 33);
        double double25 = calculadora0.raizQuadrada(10896601);
        double double28 = calculadora0.potencia((int) (short) 100, 71);
        int int31 = calculadora0.somar(52, (-2443669));
        double double34 = calculadora0.potencia(1597, 58967);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3301.0d + "'", double25 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2443617) + "'", int31 == (-2443617));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.155676789E9d + "'", double34 == 1.155676789E9d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.dividir(53, 12253726);
        int int19 = calculadora0.multiplicar((int) ' ', 100);
        int int22 = calculadora0.multiplicar(12253726, 47623);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3200 + "'", int19 == 3200);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-556358958) + "'", int22 == (-556358958));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        double double20 = calculadora0.potencia(3400, (int) (short) 0);
        double double23 = calculadora0.porcentagem((-88720292), 58870);
        int int26 = calculadora0.dividir((-640924285), (-1056240805));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-2.83358104E8d) + "'", double23 == (-2.83358104E8d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.somar(250156381, 529);
        double double23 = calculadora0.potencia(157694, 12758826);
        int int26 = calculadora0.subtrair((int) ' ', (int) (byte) -1);
        int int29 = calculadora0.subtrair((-98), (-70714526));
        int int32 = calculadora0.somar(720, (-961108980));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33 + "'", int26 == 33);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 70714428 + "'", int29 == 70714428);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-961108260) + "'", int32 == (-961108260));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        int int12 = calculadora0.somar(92, 649);
        double double15 = calculadora0.porcentagem(4576, 41);
        int int18 = calculadora0.subtrair(361218, 50511);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 741 + "'", int12 == 741);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 187616.0d + "'", double15 == 187616.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 310707 + "'", int18 == 310707);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int int1 = calculadora.Matematica.sum((-1056181935));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(0, (-1));
        int int23 = calculadora0.subtrair(157081, (-961108980));
        int int26 = calculadora0.multiplicar(3300, 21339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 961266061 + "'", int23 == 961266061);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 70418700 + "'", int26 == 70418700);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int int1 = calculadora.Matematica.factorial((-754157899));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        boolean boolean1 = calculadora.Matematica.isPrime(614);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        boolean boolean1 = calculadora.Matematica.isPrime(2568);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int int1 = calculadora.Matematica.sum((-64));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int1 = calculadora.Matematica.sum(284795973);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-733081745) + "'", int1 == (-733081745));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        int int23 = calculadora0.subtrair((int) (byte) -1, 33);
        double double25 = calculadora0.raizQuadrada(10896601);
        double double28 = calculadora0.potencia((int) (short) 100, 71);
        int int31 = calculadora0.somar(52, (-2443669));
        java.lang.Class<?> wildcardClass32 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3301.0d + "'", double25 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2443617) + "'", int31 == (-2443617));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        int int23 = calculadora0.dividir(561, 275009);
        int int26 = calculadora0.somar(1048044852, 0);
        double double29 = calculadora0.potencia(499035486, (int) (short) 1);
        int int32 = calculadora0.dividir(630, 5051000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1048044852 + "'", int26 == 1048044852);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.99035486E8d + "'", double29 == 4.99035486E8d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        int int22 = calculadora0.subtrair(1056242184, 8197332);
        int int25 = calculadora0.multiplicar(157641, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1048044852 + "'", int22 == 1048044852);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5202153 + "'", int25 == 5202153);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int1 = calculadora.Matematica.sum(5781687);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2057542204) + "'", int1 == (-2057542204));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.multiplicar(0, (-9000));
        double double9 = calculadora0.porcentagem((int) (byte) 1, 2371);
        double double11 = calculadora0.raizQuadrada(2756);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2371.0d + "'", double9 == 2371.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.49761899362675d + "'", double11 == 52.49761899362675d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = calculadora0.potencia((-385386529), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.multiplicar(188806, (-3390));
        // The following exception was thrown during execution in test generation
        try {
            double double23 = calculadora0.potencia(1235336173, (-682872));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-640052340) + "'", int20 == (-640052340));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        double double9 = calculadora0.porcentagem((-2443669), 2371);
        int int12 = calculadora0.multiplicar(362880, 47983);
        int int15 = calculadora0.multiplicar(0, 631809017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.498971903E9d) + "'", double9 == (-1.498971903E9d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 232201856 + "'", int12 == 232201856);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        boolean boolean1 = calculadora.Matematica.isPrime(44783);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(53, 143);
        int int18 = calculadora0.subtrair(48, 10887601);
        int int21 = calculadora0.somar(784, (-567847068));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.50920227E8d) + "'", double15 == (-9.50920227E8d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10887553) + "'", int18 == (-10887553));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-567846284) + "'", int21 == (-567846284));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double20 = calculadora0.porcentagem(518356800, (-463861198));
        double double23 = calculadora0.porcentagem(1810758613, 518356790);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.13591232E9d) + "'", double20 == (-1.13591232E9d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.62851054E8d + "'", double23 == 2.62851054E8d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        int int22 = calculadora0.subtrair(3453, 361218);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-357765) + "'", int22 == (-357765));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        boolean boolean1 = calculadora.Matematica.isPrime(41);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        double double21 = calculadora0.raizQuadrada(4950);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = calculadora0.raizQuadrada((-510025392));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 70.35623639735144d + "'", double21 == 70.35623639735144d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        double double20 = calculadora0.porcentagem(810766104, 649754420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.843382048E9d) + "'", double20 == (-1.843382048E9d));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        double double20 = calculadora0.potencia(13475836, 97);
        double double23 = calculadora0.potencia((-1642756327), 21339);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = calculadora0.potencia((-10), (-208571456));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.74642249E8d + "'", double23 == 6.74642249E8d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        boolean boolean1 = calculadora.Matematica.isPrime((-355062730));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        double double9 = calculadora0.potencia(0, 12758826);
        int int12 = calculadora0.subtrair(24, (-635542910));
        int int15 = calculadora0.dividir(1956452026, 326863206);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 635542934 + "'", int12 == 635542934);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = calculadora0.potencia((-9000), (-561033704));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int1 = calculadora.Matematica.sum((-67795200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar((-3301), (-3301));
        double double15 = calculadora0.porcentagem((int) '#', 296384028);
        double double18 = calculadora0.potencia(5202153, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10896601 + "'", int12 == 10896601);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.783506388E9d + "'", double15 == 1.783506388E9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.836748369E9d + "'", double18 == 1.836748369E9d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        double double11 = calculadora0.potencia(196396861, 10721529);
        double double14 = calculadora0.porcentagem((-1653134308), 499035496);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.potencia(326863206, (-1711962284));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.395201507E9d) + "'", double11 == (-1.395201507E9d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.778440032E9d + "'", double14 == 1.778440032E9d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        int int12 = calculadora0.dividir(8197332, (int) '4');
        int int15 = calculadora0.somar((-1810759158), (-2109870));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.raizQuadrada((-1168394692));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 157641 + "'", int12 == 157641);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1812869028) + "'", int15 == (-1812869028));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        double double17 = calculadora0.potencia((int) (short) 10, 2756);
        double double19 = calculadora0.raizQuadrada(290577660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 17046.338609801227d + "'", double19 == 17046.338609801227d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int1 = calculadora.Matematica.sum((-47110));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        boolean boolean1 = calculadora.Matematica.isPrime(6573);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        boolean boolean1 = calculadora.Matematica.isPrime((-2640203));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double20 = calculadora0.porcentagem(518356800, (-463861198));
        int int23 = calculadora0.dividir(108367055, 3061262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.13591232E9d) + "'", double20 == (-1.13591232E9d));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        double double23 = calculadora0.potencia(5150, 50511);
        int int26 = calculadora0.multiplicar(32, (int) (byte) -1);
        double double28 = calculadora0.raizQuadrada(518356800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-32) + "'", int26 == (-32));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 22767.450450149223d + "'", double28 == 22767.450450149223d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        int int22 = calculadora0.dividir(529, (-823690138));
        int int25 = calculadora0.multiplicar((-1), (-630029869));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 630029869 + "'", int25 == 630029869);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        boolean boolean1 = calculadora.Matematica.isPrime(1862164);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        int int1 = calculadora.Matematica.sum(16139);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 130241730 + "'", int1 == 130241730);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        int int14 = calculadora0.multiplicar(5887, (int) (byte) 10);
        double double17 = calculadora0.potencia(50608, (int) (short) 10);
        int int20 = calculadora0.subtrair(138970338, (-326043));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58870 + "'", int14 == 58870);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 139296381 + "'", int20 == 139296381);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int1 = calculadora.Matematica.factorial(1313662592);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.dividir((int) (short) 1, 157641);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia(108, (-630036684));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        int int14 = calculadora0.multiplicar(0, 157641);
        double double17 = calculadora0.potencia(47983, 1379);
        double double20 = calculadora0.potencia((-7829438), 2579);
        double double23 = calculadora0.potencia((int) (byte) 1, 99);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-6.98074801E8d) + "'", double17 == (-6.98074801E8d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int1 = calculadora.Matematica.factorial((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        double double23 = calculadora0.potencia(1042113600, 108367055);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = calculadora0.raizQuadrada((-367412678));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        int int19 = calculadora0.multiplicar(0, 1);
        int int22 = calculadora0.somar((int) (byte) 10, 5051035);
        int int25 = calculadora0.multiplicar((-1399098829), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5051045 + "'", int22 == 5051045);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1594440447 + "'", int25 == 1594440447);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double13 = calculadora0.raizQuadrada(120);
        java.lang.Class<?> wildcardClass14 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.954451150103322d + "'", double13 == 10.954451150103322d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        boolean boolean1 = calculadora.Matematica.isPrime((-261673332));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        double double17 = calculadora0.porcentagem(47983, (-1653134308));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia(1389419296, (-108366441));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 613 + "'", int14 == 613);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.40748906E9d + "'", double17 == 1.40748906E9d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        double double19 = calculadora0.raizQuadrada(10887601);
        int int22 = calculadora0.multiplicar(9, (-499035486));
        int int25 = calculadora0.multiplicar((-993954013), 499035496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3299.636495130941d + "'", double19 == 3299.636495130941d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-196352078) + "'", int22 == (-196352078));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 253037880 + "'", int25 == 253037880);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.dividir((int) (short) 1, 157641);
        int int22 = calculadora0.subtrair((int) (byte) -1, (int) 'a');
        double double25 = calculadora0.porcentagem(5191, 367830);
        int int28 = calculadora0.dividir((-875346393), (-875325085));
        int int31 = calculadora0.dividir(24, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.90940553E9d + "'", double25 == 1.90940553E9d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem((-2147483648), 1235336173);
        int int20 = calculadora0.somar(10, 529);
        int int23 = calculadora0.dividir(290577660, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.147483648E9d) + "'", double17 == (-2.147483648E9d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 539 + "'", int20 == 539);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 290577660 + "'", int23 == 290577660);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int int1 = calculadora.Matematica.sum((-630036684));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        double double21 = calculadora0.raizQuadrada(4950);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = calculadora0.potencia(10777034, (-2073471875));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 70.35623639735144d + "'", double21 == 70.35623639735144d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.subtrair(50510, 2527);
        int int26 = calculadora0.somar((int) (byte) 100, (-8));
        double double29 = calculadora0.porcentagem((-302683408), 1597);
        double double31 = calculadora0.raizQuadrada(47968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47983 + "'", int23 == 47983);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 92 + "'", int26 == 92);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.945901872E9d + "'", double29 == 1.945901872E9d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 219.01598115206113d + "'", double31 == 219.01598115206113d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double16 = calculadora0.raizQuadrada(5051000);
        double double19 = calculadora0.porcentagem((-4232), 5781701);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia((-751869456), (-107130));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2247.442991490552d + "'", double16 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.301645144E9d + "'", double19 == 1.301645144E9d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir(0, (int) (short) 10);
        double double23 = calculadora0.porcentagem(35, 290577660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.580283508E9d + "'", double23 == 1.580283508E9d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.dividir((int) (short) 1, 157641);
        int int22 = calculadora0.subtrair((int) (byte) -1, (int) 'a');
        int int25 = calculadora0.somar(0, (-736014630));
        int int28 = calculadora0.subtrair(40, (int) (byte) 1);
        int int31 = calculadora0.dividir((-500302768), 106);
        double double34 = calculadora0.potencia(1225678159, 1056242184);
        java.lang.Class<?> wildcardClass35 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-736014630) + "'", int25 == (-736014630));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 39 + "'", int28 == 39);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-4719837) + "'", int31 == (-4719837));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-8.21382783E8d) + "'", double34 == (-8.21382783E8d));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        double double20 = calculadora0.potencia(43, 97);
        int int23 = calculadora0.dividir(68274373, 649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.083380139E9d + "'", double20 == 1.083380139E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 105199 + "'", int23 == 105199);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem(6573, 3200);
        double double17 = calculadora0.porcentagem(0, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.10336E7d + "'", double14 == 2.10336E7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int1 = calculadora.Matematica.sum((-261673332));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        boolean boolean1 = calculadora.Matematica.isPrime(5060);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        int int20 = calculadora0.multiplicar(529, 0);
        int int23 = calculadora0.subtrair(3300, (-1270168789));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1270172089 + "'", int23 == 1270172089);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir((-10472177), (-98397944));
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.raizQuadrada((-1861529792));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.somar(12758826, (-8));
        int int17 = calculadora0.somar(0, (-8));
        int int20 = calculadora0.multiplicar((-1915836108), 108);
        int int23 = calculadora0.subtrair(1126969732, 48);
        double double25 = calculadora0.raizQuadrada(12758826);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12758818 + "'", int14 == 12758818);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-8) + "'", int17 == (-8));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-751869456) + "'", int20 == (-751869456));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1126969684 + "'", int23 == 1126969684);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3571.949887666399d + "'", double25 == 3571.949887666399d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int1 = calculadora.Matematica.sum(2756);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3799147 + "'", int1 == 3799147);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        int int11 = calculadora0.somar(9, (-1076));
        int int14 = calculadora0.subtrair((int) '4', (-2104819));
        int int17 = calculadora0.dividir(630, 1379021495);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1067) + "'", int11 == (-1067));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2104871 + "'", int14 == 2104871);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.somar(250156381, 529);
        double double23 = calculadora0.potencia(157694, 12758826);
        double double26 = calculadora0.potencia(5887, 194433408);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = calculadora0.raizQuadrada((-107130));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.636990975E9d) + "'", double26 == (-1.636990975E9d));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.potencia((-1056240805), 153);
        double double17 = calculadora0.potencia(0, 1048044852);
        double double20 = calculadora0.potencia(529, 232207006);
        double double23 = calculadora0.porcentagem(1056240804, 431956);
        int int26 = calculadora0.subtrair((-16547), 188806);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.787388357E9d) + "'", double14 == (-1.787388357E9d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.101303521E9d + "'", double20 == 2.101303521E9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-5.2815416E8d) + "'", double23 == (-5.2815416E8d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-205353) + "'", int26 == (-205353));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int1 = calculadora.Matematica.factorial((-513068772));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        int int11 = calculadora0.somar(4950, (int) (short) 1);
        double double13 = calculadora0.raizQuadrada((int) (short) 1);
        int int16 = calculadora0.subtrair(138970338, (-1571632104));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4951 + "'", int11 == 4951);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1710602442 + "'", int16 == 1710602442);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        int int11 = calculadora0.somar(4950, (int) (short) 1);
        double double13 = calculadora0.raizQuadrada((int) (short) 1);
        double double16 = calculadora0.potencia((-1571632104), 9);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4951 + "'", int11 == 4951);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.02653184E8d + "'", double16 == 4.02653184E8d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.somar((-3399), 9);
        double double13 = calculadora0.raizQuadrada(48);
        double double15 = calculadora0.raizQuadrada(665359165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3390) + "'", int11 == (-3390));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 6.928203230275509d + "'", double13 == 6.928203230275509d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25794.556887064373d + "'", double15 == 25794.556887064373d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        double double12 = calculadora0.porcentagem(3061240, 5446651);
        int int15 = calculadora0.somar(561, (-1));
        double double18 = calculadora0.porcentagem(58870, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.42864168E8d + "'", double12 == 4.42864168E8d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 560 + "'", int15 == 560);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 588700.0d + "'", double18 == 588700.0d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int int1 = calculadora.Matematica.factorial(872954676);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        double double19 = calculadora0.raizQuadrada(43);
        int int22 = calculadora0.somar(1547080348, (int) (short) 0);
        int int25 = calculadora0.dividir(5191, (-54));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.557438524302d + "'", double19 == 6.557438524302d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1547080348 + "'", int22 == 1547080348);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-96) + "'", int25 == (-96));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        boolean boolean1 = calculadora.Matematica.isPrime((-10887553));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        double double13 = calculadora0.porcentagem(0, 158400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        int int20 = calculadora0.dividir(2526, (-86));
        int int23 = calculadora0.somar((-88716792), 227687130);
        int int26 = calculadora0.multiplicar(613, (-682872));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-29) + "'", int20 == (-29));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 138970338 + "'", int23 == 138970338);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-418600536) + "'", int26 == (-418600536));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        int int23 = calculadora0.subtrair((int) (byte) -1, 33);
        double double25 = calculadora0.raizQuadrada(10896601);
        double double28 = calculadora0.potencia((int) (short) 100, 71);
        double double31 = calculadora0.porcentagem((-640052340), 0);
        double double34 = calculadora0.porcentagem(105199, 362880);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3301.0d + "'", double25 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-4.80092544E8d) + "'", double34 == (-4.80092544E8d));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        double double19 = calculadora0.raizQuadrada(10896601);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3301.0d + "'", double19 == 3301.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        boolean boolean1 = calculadora.Matematica.isPrime(40504501);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int int1 = calculadora.Matematica.factorial(50440);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(53, 143);
        int int18 = calculadora0.subtrair(48, 10887601);
        int int21 = calculadora0.multiplicar(3200, (-2057542204));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.50920227E8d) + "'", double15 == (-9.50920227E8d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10887553) + "'", int18 == (-10887553));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49811968 + "'", int21 == 49811968);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int int1 = calculadora.Matematica.sum(4798);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11512802 + "'", int1 == 11512802);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.multiplicar(2526, (-107130));
        double double17 = calculadora0.potencia(7140690, 4908);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-270610380) + "'", int14 == (-270610380));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        double double17 = calculadora0.porcentagem((-1399098829), 0);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        boolean boolean1 = calculadora.Matematica.isPrime((-630029869));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int int1 = calculadora.Matematica.sum((-736014630));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double15 = calculadora0.raizQuadrada(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double16 = calculadora0.potencia(1431, 232201856);
        double double19 = calculadora0.porcentagem(0, 159359912);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.17052417E8d + "'", double16 == 1.17052417E8d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        boolean boolean1 = calculadora.Matematica.isPrime(139296381);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.potencia(3400, (int) ' ');
        int int12 = calculadora0.dividir(21187, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1246 + "'", int12 == 1246);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(50608, (int) (short) 10);
        int int22 = calculadora0.dividir(10896601, 70714490);
        int int25 = calculadora0.dividir((-1), 1577012793);
        int int28 = calculadora0.multiplicar((-1861734272), 5060);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5060 + "'", int19 == 5060);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1512136192) + "'", int28 == (-1512136192));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int int1 = calculadora.Matematica.factorial(6573);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        double double12 = calculadora0.potencia(24, 1389423872);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.porcentagem(108, 50511);
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5455188.0d + "'", double11 == 5455188.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        double double19 = calculadora0.raizQuadrada(58870);
        int int22 = calculadora0.subtrair(5150, (int) '#');
        double double25 = calculadora0.porcentagem(130241730, 159359912);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 242.63140769488191d + "'", double19 == 242.63140769488191d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5115 + "'", int22 == 5115);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.432692048E9d + "'", double25 == 1.432692048E9d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        double double20 = calculadora0.porcentagem(50608, 52);
        int int23 = calculadora0.somar((-32), 32);
        double double25 = calculadora0.raizQuadrada(157081);
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2631616.0d + "'", double20 == 2631616.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 396.3344547222712d + "'", double25 == 396.3344547222712d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        boolean boolean1 = calculadora.Matematica.isPrime((-16310582));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        boolean boolean1 = calculadora.Matematica.isPrime(6126751);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(14, (-34));
        double double19 = calculadora0.raizQuadrada(1431);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia(869209328, (-302680881));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 37.82856063875548d + "'", double19 == 37.82856063875548d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        boolean boolean1 = calculadora.Matematica.isPrime((-2526));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-1243182), (-687913492));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 667733912 + "'", int9 == 667733912);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        int int1 = calculadora.Matematica.factorial(741);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.potencia((int) (byte) -1, 50608);
        double double18 = calculadora0.porcentagem(48, 1056240804);
        int int21 = calculadora0.dividir((int) '#', (-1277355836));
        int int24 = calculadora0.subtrair(5887, 21339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.4004896E8d) + "'", double18 == (-8.4004896E8d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-15452) + "'", int24 == (-15452));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double16 = calculadora0.raizQuadrada(4951);
        double double19 = calculadora0.potencia(5446651, 12758818);
        double double22 = calculadora0.porcentagem(50510, (int) (byte) 0);
        double double25 = calculadora0.potencia(5781687, 70714590);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 70.36334272900912d + "'", double16 == 70.36334272900912d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-3.79981927E8d) + "'", double19 == (-3.79981927E8d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.68106033E8d + "'", double25 == 2.68106033E8d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        boolean boolean1 = calculadora.Matematica.isPrime(872674560);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        int int14 = calculadora0.multiplicar(0, 157641);
        double double17 = calculadora0.potencia(47983, 1379);
        double double20 = calculadora0.potencia((-2526), 613);
        double double22 = calculadora0.raizQuadrada(290577660);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-6.98074801E8d) + "'", double17 == (-6.98074801E8d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 17046.338609801227d + "'", double22 == 17046.338609801227d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int int1 = calculadora.Matematica.sum((-4719837));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        int int14 = calculadora0.subtrair(361218, 6573);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 354645 + "'", int14 == 354645);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        int int9 = calculadora0.subtrair(106029, (-261673332));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 261779361 + "'", int9 == 261779361);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.multiplicar(0, (-9000));
        double double9 = calculadora0.porcentagem((int) (byte) 1, 2371);
        int int12 = calculadora0.dividir((-1056241881), (-1899));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2371.0d + "'", double9 == 2371.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 556209 + "'", int12 == 556209);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        int int20 = calculadora0.subtrair((-1056181935), 310854959);
        double double23 = calculadora0.porcentagem((-620768219), 284795973);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1367036894) + "'", int20 == (-1367036894));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.831280135E9d) + "'", double23 == (-1.831280135E9d));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        double double6 = calculadora0.porcentagem((-518356831), 935867520);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9796992E7d + "'", double6 == 6.9796992E7d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(0, 10);
        int int17 = calculadora0.dividir(52, (int) (byte) -1);
        int int20 = calculadora0.multiplicar(362880, 2579);
        int int23 = calculadora0.multiplicar(852742800, 2756);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-52) + "'", int17 == (-52));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 935867520 + "'", int20 == 935867520);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 812045888 + "'", int23 == 812045888);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        int int20 = calculadora0.dividir((int) (short) 0, (-34));
        double double23 = calculadora0.potencia(0, 2527);
        int int26 = calculadora0.subtrair((-620768219), (-1915880835));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1295112616 + "'", int26 == 1295112616);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        int int28 = calculadora0.dividir(56, 12758826);
        int int31 = calculadora0.somar(4950, 362880);
        int int34 = calculadora0.multiplicar((-8), 529);
        double double36 = calculadora0.raizQuadrada(361187);
        java.lang.Class<?> wildcardClass37 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 367830 + "'", int31 == 367830);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-4232) + "'", int34 == (-4232));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 600.9883526325614d + "'", double36 == 600.9883526325614d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        double double10 = calculadora0.raizQuadrada(97);
        int int13 = calculadora0.subtrair((int) (short) -1, (int) (short) 0);
        double double16 = calculadora0.porcentagem(39, 310854959);
        double double19 = calculadora0.porcentagem((int) (byte) 1, (-205973440));
        int int22 = calculadora0.dividir(1745349120, 2);
        int int25 = calculadora0.subtrair(350115344, (-204480));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.848857801796104d + "'", double10 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-7.61558487E8d) + "'", double16 == (-7.61558487E8d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-2.0597344E8d) + "'", double19 == (-2.0597344E8d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 872674560 + "'", int22 == 872674560);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 350319824 + "'", int25 == 350319824);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        java.lang.Class<?> wildcardClass3 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        boolean boolean1 = calculadora.Matematica.isPrime(158400);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.dividir(53, 12253726);
        int int19 = calculadora0.multiplicar((int) ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-302680881));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3200 + "'", int19 == 3200);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        int int11 = calculadora0.somar(188191, (-1067));
        int int14 = calculadora0.subtrair(0, (-2640732));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 187124 + "'", int11 == 187124);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2640732 + "'", int14 == 2640732);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int int1 = calculadora.Matematica.sum(1346818465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536710257 + "'", int1 == 536710257);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        boolean boolean1 = calculadora.Matematica.isPrime((-31930));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int1 = calculadora.Matematica.factorial(227687130);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem((-630036684), 2);
        double double19 = calculadora0.porcentagem((-961108260), 3453);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.260073368E9d) + "'", double16 == (-1.260073368E9d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.302898028E9d + "'", double19 == 1.302898028E9d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        double double20 = calculadora0.potencia((-10), 14);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.76447232E8d + "'", double20 == 2.76447232E8d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        int int17 = calculadora0.somar(296384028, 1502);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 296385530 + "'", int17 == 296385530);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.multiplicar((-626166995), (-6473));
        int int9 = calculadora0.somar((-31), 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1270168789) + "'", int6 == (-1270168789));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        int int1 = calculadora.Matematica.sum(1379);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 951510 + "'", int1 == 951510);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int int1 = calculadora.Matematica.sum(961266061);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14691173) + "'", int1 == (-14691173));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        double double19 = calculadora0.porcentagem(99, 0);
        int int22 = calculadora0.dividir((-1277355836), (-459480627));
        int int25 = calculadora0.somar((-3390), 631809017);
        int int28 = calculadora0.subtrair(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 631805627 + "'", int25 == 631805627);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double16 = calculadora0.potencia(1431, 232201856);
        int int19 = calculadora0.somar((-1745154368), (-1324134769));
        double double22 = calculadora0.porcentagem((-9000), (-100));
        double double25 = calculadora0.potencia(21644910, 4951);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.17052417E8d + "'", double16 == 1.17052417E8d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1225678159 + "'", int19 == 1225678159);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 900000.0d + "'", double22 == 900000.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.multiplicar(2526, (-107130));
        int int17 = calculadora0.somar((-4719836), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-270610380) + "'", int14 == (-270610380));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4719836) + "'", int17 == (-4719836));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int1 = calculadora.Matematica.sum((-1915836108));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int int1 = calculadora.Matematica.factorial((-500302768));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = calculadora0.potencia(898788975, (-1333113776));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int1 = calculadora.Matematica.factorial(536710257);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double19 = calculadora0.porcentagem(188191, 720);
        int int22 = calculadora0.dividir((int) (short) -1, (-34));
        double double25 = calculadora0.potencia(48, 48);
        int int28 = calculadora0.multiplicar(0, 342);
        int int31 = calculadora0.dividir((-561033704), (-509347440));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.3549752E8d + "'", double19 == 1.3549752E8d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        double double16 = calculadora0.raizQuadrada(2568);
        int int19 = calculadora0.subtrair(14, (int) (short) 100);
        int int22 = calculadora0.multiplicar((-31), 1030);
        double double24 = calculadora0.raizQuadrada(56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.67543783727971d + "'", double16 == 50.67543783727971d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-86) + "'", int19 == (-86));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-31930) + "'", int22 == (-31930));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.483314773547883d + "'", double24 == 7.483314773547883d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        double double10 = calculadora0.raizQuadrada(97);
        int int13 = calculadora0.subtrair((int) (short) -1, (int) (short) 0);
        double double16 = calculadora0.porcentagem(39, 310854959);
        double double19 = calculadora0.porcentagem((int) (byte) 1, (-205973440));
        int int22 = calculadora0.dividir(1745349120, 2);
        double double24 = calculadora0.raizQuadrada(6573);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.848857801796104d + "'", double10 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-7.61558487E8d) + "'", double16 == (-7.61558487E8d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-2.0597344E8d) + "'", double19 == (-2.0597344E8d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 872674560 + "'", int22 == 872674560);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 81.0740402348372d + "'", double24 == 81.0740402348372d);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int1 = calculadora.Matematica.sum(649754420);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2098860829) + "'", int1 == (-2098860829));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.multiplicar(47983, 0);
        double double6 = calculadora0.potencia(97, (int) ' ');
        int int9 = calculadora0.multiplicar(1, 228511908);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.47362047E8d) + "'", double6 == (-4.47362047E8d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 228511908 + "'", int9 == 228511908);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        int int22 = calculadora0.multiplicar(19371844, 15);
        int int25 = calculadora0.dividir(630, (-1320864063));
        int int28 = calculadora0.dividir(367844, 3453);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 290577660 + "'", int22 == 290577660);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 106 + "'", int28 == 106);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem((-1915836162), 159359912);
        double double17 = calculadora0.potencia(40, 1577012826);
        int int20 = calculadora0.somar(426942010, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.765449904E9d + "'", double14 == 1.765449904E9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 426942012 + "'", int20 == 426942012);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar(426942010, 3300);
        int int11 = calculadora0.dividir(5512, 7086);
        int int14 = calculadora0.dividir((-630029869), 1346818465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 159359912 + "'", int8 == 159359912);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        int int9 = calculadora0.somar((-108366441), (int) (byte) 0);
        int int12 = calculadora0.subtrair(44783, (-196352078));
        double double15 = calculadora0.potencia(3061262, 4798);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.potencia((-1243182), (-385386529));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-108366441) + "'", int9 == (-108366441));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 196396861 + "'", int12 == 196396861);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar(426942010, 3300);
        int int11 = calculadora0.dividir(5512, 7086);
        int int14 = calculadora0.multiplicar(1454327872, 1527281959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 159359912 + "'", int8 == 159359912);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 265961920 + "'", int14 == 265961920);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.dividir((-67795200), 1710602442);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double15 = calculadora0.porcentagem((int) 'a', 21645002);
        int int18 = calculadora0.multiplicar((-1056240805), (-36));
        int int21 = calculadora0.multiplicar(308750140, (-510025392));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.099565194E9d + "'", double15 == 2.099565194E9d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-630036684) + "'", int18 == (-630036684));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825950528) + "'", int21 == (-825950528));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int int1 = calculadora.Matematica.sum(22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 254 + "'", int1 == 254);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = calculadora0.potencia(10721529, (-993954013));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((-107130), 64);
        int int20 = calculadora0.multiplicar(11781, 1577012826);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-107194) + "'", int17 == (-107194));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1240419390) + "'", int20 == (-1240419390));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        boolean boolean1 = calculadora.Matematica.isPrime(224455078);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double16 = calculadora0.raizQuadrada(4951);
        double double19 = calculadora0.potencia(5446651, 12758818);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia((-64), (-1243182));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 70.36334272900912d + "'", double16 == 70.36334272900912d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-3.79981927E8d) + "'", double19 == (-3.79981927E8d));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem((-1915836162), 159359912);
        int int17 = calculadora0.dividir(539, (-513068772));
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.765449904E9d + "'", double14 == 1.765449904E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        boolean boolean1 = calculadora.Matematica.isPrime(539);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.multiplicar(5446651, 290577660);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1128677140 + "'", int19 == 1128677140);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        double double18 = calculadora0.raizQuadrada(3300);
        double double21 = calculadora0.porcentagem(630, (-29));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 57.445626465380286d + "'", double18 == 57.445626465380286d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-18270.0d) + "'", double21 == (-18270.0d));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        double double11 = calculadora0.potencia(4908, 100);
        double double14 = calculadora0.porcentagem(5191, (-500302768));
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.383545392E9d + "'", double14 == 1.383545392E9d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double17 = calculadora0.potencia((-678042), 0);
        int int20 = calculadora0.somar((-44727), 11188);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-33539) + "'", int20 == (-33539));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        int int15 = calculadora0.multiplicar(10472177, 157641);
        double double17 = calculadora0.raizQuadrada(4951);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.raizQuadrada((-4232));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1577012793 + "'", int15 == 1577012793);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 70.36334272900912d + "'", double17 == 70.36334272900912d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.subtrair(50510, 2527);
        int int26 = calculadora0.multiplicar((int) (byte) 10, 31);
        double double29 = calculadora0.porcentagem(1235493814, 4296);
        int int32 = calculadora0.multiplicar(0, (-47610));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47983 + "'", int23 == 47983);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 310 + "'", int26 == 310);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-8.98152912E8d) + "'", double29 == (-8.98152912E8d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        int int28 = calculadora0.dividir(56, 12758826);
        int int31 = calculadora0.somar(4950, 362880);
        int int34 = calculadora0.multiplicar((-8), 529);
        double double36 = calculadora0.raizQuadrada(361187);
        int int39 = calculadora0.dividir(9, 9);
        double double41 = calculadora0.raizQuadrada(1668074498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 367830 + "'", int31 == 367830);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-4232) + "'", int34 == (-4232));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 600.9883526325614d + "'", double36 == 600.9883526325614d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 40842.06774882976d + "'", double41 == 40842.06774882976d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int int1 = calculadora.Matematica.sum((-90796998));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        int int20 = calculadora0.multiplicar(529, 0);
        int int23 = calculadora0.somar((-1056181935), (-2443617));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1058625552) + "'", int23 == (-1058625552));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int int1 = calculadora.Matematica.sum(4296);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9229957 + "'", int1 == 9229957);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.multiplicar(43, (-10));
        int int23 = calculadora0.subtrair((-1571632104), 361187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-430) + "'", int20 == (-430));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1571993291) + "'", int23 == (-1571993291));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int int1 = calculadora.Matematica.factorial((-168756252));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int int1 = calculadora.Matematica.sum((-1861731516));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(0, 3400);
        double double22 = calculadora0.porcentagem(3400, 0);
        int int25 = calculadora0.multiplicar(0, (-4920));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        boolean boolean1 = calculadora.Matematica.isPrime((-875346393));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        int int19 = calculadora0.multiplicar(0, (-2147483648));
        int int22 = calculadora0.dividir((int) ' ', 3061240);
        double double24 = calculadora0.raizQuadrada(635542934);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 25209.97687424564d + "'", double24 == 25209.97687424564d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.dividir((int) (byte) 0, 70714490);
        int int23 = calculadora0.multiplicar((-1056241881), (-626166995));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-293484837) + "'", int23 == (-293484837));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir((-2640203), 296384028);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.raizQuadrada((-1810759158));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.dividir((int) (short) 1, 157641);
        int int22 = calculadora0.subtrair((int) (byte) -1, (int) 'a');
        int int25 = calculadora0.somar(0, (-736014630));
        int int28 = calculadora0.subtrair(40, (int) (byte) 1);
        int int31 = calculadora0.dividir((-31930), 304857);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-736014630) + "'", int25 == (-736014630));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 39 + "'", int28 == 39);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        double double20 = calculadora0.potencia(43, 97);
        int int23 = calculadora0.somar(482358766, 0);
        int int26 = calculadora0.somar(524700, 1527281959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.083380139E9d + "'", double20 == 1.083380139E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 482358766 + "'", int23 == 482358766);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1527806659 + "'", int26 == 1527806659);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double16 = calculadora0.raizQuadrada(5051000);
        double double19 = calculadora0.porcentagem((-4232), 5781701);
        double double21 = calculadora0.raizQuadrada(108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2247.442991490552d + "'", double16 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.301645144E9d + "'", double19 == 1.301645144E9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.392304845413264d + "'", double21 == 10.392304845413264d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.multiplicar((int) (byte) 100, 33);
        int int15 = calculadora0.somar((int) '#', 614);
        int int18 = calculadora0.subtrair(232207047, (-1301739248));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3300 + "'", int12 == 3300);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 649 + "'", int15 == 649);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1533946295 + "'", int18 == 1533946295);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.porcentagem(1042113600, (-36));
        int int14 = calculadora0.dividir(68559809, (-1861731516));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculadora0.raizQuadrada((-34));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.138616064E9d + "'", double11 == 1.138616064E9d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        int int28 = calculadora0.dividir(56, 12758826);
        int int31 = calculadora0.somar(4950, 362880);
        int int34 = calculadora0.multiplicar((-8), 529);
        double double36 = calculadora0.raizQuadrada(361187);
        int int39 = calculadora0.multiplicar((-509347440), (-4719836));
        int int42 = calculadora0.subtrair((-31), 518356800);
        double double45 = calculadora0.potencia((-1255225024), 649754420);
        int int48 = calculadora0.somar(1235336173, (-108366441));
        // The following exception was thrown during execution in test generation
        try {
            double double50 = calculadora0.raizQuadrada((-1711962284));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 367830 + "'", int31 == 367830);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-4232) + "'", int34 == (-4232));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 600.9883526325614d + "'", double36 == 600.9883526325614d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1454327872 + "'", int39 == 1454327872);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-518356831) + "'", int42 == (-518356831));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1126969732 + "'", int48 == 1126969732);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar((int) (byte) -1, (int) (short) 0);
        int int20 = calculadora0.somar(0, (int) (byte) 100);
        int int23 = calculadora0.somar(852742800, 50440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 852793240 + "'", int23 == 852793240);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar((int) (byte) -1, (int) (short) 0);
        int int20 = calculadora0.somar(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.subtrair(50510, 2527);
        int int26 = calculadora0.subtrair(1463280665, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47983 + "'", int23 == 47983);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1463280665 + "'", int26 == 1463280665);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.subtrair(53, (int) (short) 0);
        double double8 = calculadora0.raizQuadrada(1527281959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39080.45494873365d + "'", double8 == 39080.45494873365d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair(15764, 4576);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia((-2526), (-4920));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11188 + "'", int17 == 11188);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        int int20 = calculadora0.multiplicar(529, 0);
        int int23 = calculadora0.subtrair(9431, (-682872));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 692303 + "'", int23 == 692303);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(188191, 19371844);
        int int23 = calculadora0.dividir(228511908, 47624);
        double double26 = calculadora0.potencia(7261, 4995);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-19183653) + "'", int20 == (-19183653));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4798 + "'", int23 == 4798);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.213990907E9d) + "'", double26 == (-1.213990907E9d));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double16 = calculadora0.potencia(1431, 232201856);
        int int19 = calculadora0.dividir((-1067), (-499030496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.17052417E8d + "'", double16 == 1.17052417E8d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        double double19 = calculadora0.raizQuadrada(10896601);
        double double22 = calculadora0.potencia((-1744965562), 2);
        int int25 = calculadora0.dividir(5115, 58967);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3301.0d + "'", double19 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.608471332E9d + "'", double22 == 1.608471332E9d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar(426942010, 3300);
        int int11 = calculadora0.multiplicar(310854959, (-1530));
        int int14 = calculadora0.multiplicar(21187, (-678042));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 159359912 + "'", int8 == 159359912);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1133282586 + "'", int11 == 1133282586);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1480773966) + "'", int14 == (-1480773966));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        int int17 = calculadora0.dividir(0, (int) (byte) -1);
        double double19 = calculadora0.raizQuadrada(560);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-31));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 613 + "'", int14 == 613);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 23.664319132398465d + "'", double19 == 23.664319132398465d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        int int9 = calculadora0.subtrair((-9000), (int) '#');
        double double12 = calculadora0.porcentagem((-2443617), 7829502);
        double double14 = calculadora0.raizQuadrada(524700);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9035) + "'", int9 == (-9035));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.775114946E9d + "'", double12 == 1.775114946E9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 724.3617880589782d + "'", double14 == 724.3617880589782d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.multiplicar((int) (short) 100, (int) '#');
        int int17 = calculadora0.multiplicar((-630036684), (-2147483648));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3500 + "'", int14 == 3500);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int1 = calculadora.Matematica.sum(1048044852);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 688061411 + "'", int1 == 688061411);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int int1 = calculadora.Matematica.sum(130241730);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1873779684 + "'", int1 == 1873779684);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        int int14 = calculadora0.multiplicar(0, 157641);
        double double17 = calculadora0.potencia(47983, 1379);
        double double20 = calculadora0.potencia((-7829438), 2579);
        int int23 = calculadora0.dividir((-1255225024), 108367055);
        double double26 = calculadora0.potencia(250156910, 362880);
        int int29 = calculadora0.dividir(0, 5512);
        double double32 = calculadora0.porcentagem(56, (-1915836162));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-6.98074801E8d) + "'", double17 == (-6.98074801E8d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-11) + "'", int23 == (-11));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 8.7357328E7d + "'", double32 == 8.7357328E7d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.somar(0, (-1899));
        int int12 = calculadora0.multiplicar((-982218590), 2105015);
        java.lang.Class<?> wildcardClass13 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1899) + "'", int9 == (-1899));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-493836338) + "'", int12 == (-493836338));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        java.lang.Class<?> wildcardClass4 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int1 = calculadora.Matematica.factorial(362880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double18 = calculadora0.raizQuadrada(4950);
        int int21 = calculadora0.multiplicar((-1243182), 852742539);
        java.lang.Class<?> wildcardClass22 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 70.35623639735144d + "'", double18 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-282349306) + "'", int21 == (-282349306));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((-1320864063), 524700);
        double double19 = calculadora0.porcentagem(951510, 250156381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1321388763) + "'", int16 == (-1321388763));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-7.8945901E8d) + "'", double19 == (-7.8945901E8d));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double19 = calculadora0.porcentagem(188191, 720);
        int int22 = calculadora0.dividir((int) (short) -1, (-34));
        int int25 = calculadora0.somar((int) (byte) 10, 47623);
        double double27 = calculadora0.raizQuadrada(1053798212);
        double double30 = calculadora0.porcentagem(1366467329, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.3549752E8d + "'", double19 == 1.3549752E8d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 47633 + "'", int25 == 47633);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 32462.258270182007d + "'", double27 == 32462.258270182007d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7.77281568E8d + "'", double30 == 7.77281568E8d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int int1 = calculadora.Matematica.sum(227687130);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1344217536) + "'", int1 == (-1344217536));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.multiplicar(143, 2526);
        double double9 = calculadora0.potencia(15, 1745349123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 361218 + "'", int6 == 361218);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-8.88820433E8d) + "'", double9 == (-8.88820433E8d));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem((-1915836162), 159359912);
        double double17 = calculadora0.potencia(40, 1577012826);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia((-499035486), (-10472177));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.765449904E9d + "'", double14 == 1.765449904E9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double16 = calculadora0.raizQuadrada(138970338);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11788.568106432604d + "'", double16 == 11788.568106432604d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        double double12 = calculadora0.potencia(499035486, 290577660);
        double double14 = calculadora0.raizQuadrada(275009);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 524.4130051781706d + "'", double14 == 524.4130051781706d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int1 = calculadora.Matematica.factorial(529);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int int1 = calculadora.Matematica.sum((-76545040));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        double double19 = calculadora0.porcentagem((-1642756327), (-67795200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.7391872E8d + "'", double19 == 6.7391872E8d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        boolean boolean1 = calculadora.Matematica.isPrime((-10469705));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        int int22 = calculadora0.subtrair(71, (-67795200));
        int int25 = calculadora0.multiplicar(4995, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 67795271 + "'", int22 == 67795271);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-14985) + "'", int25 == (-14985));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        boolean boolean1 = calculadora.Matematica.isPrime(720);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        boolean boolean1 = calculadora.Matematica.isPrime(5781701);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int int1 = calculadora.Matematica.factorial((-1900802547));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int int1 = calculadora.Matematica.sum(48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1177 + "'", int1 == 1177);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        boolean boolean1 = calculadora.Matematica.isPrime((-168756252));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.multiplicar(0, (-9000));
        double double9 = calculadora0.porcentagem((int) (byte) 1, 2371);
        double double12 = calculadora0.porcentagem(275009, (-1915836108));
        double double14 = calculadora0.raizQuadrada(1235332973);
        int int17 = calculadora0.multiplicar((-875346424), (-1899));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2371.0d + "'", double9 == 2371.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.590994E7d + "'", double12 == 5.590994E7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35147.303922207175d + "'", double14 == 35147.303922207175d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 130515624 + "'", int17 == 130515624);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        int int9 = calculadora0.multiplicar((-1530), 1379);
        int int12 = calculadora0.somar((-10887448), 296385530);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2109870) + "'", int9 == (-2109870));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 285498082 + "'", int12 == 285498082);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int int1 = calculadora.Matematica.sum(431956);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1196071565) + "'", int1 == (-1196071565));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        double double20 = calculadora0.porcentagem(50608, 52);
        double double23 = calculadora0.porcentagem((int) (short) 0, 0);
        int int26 = calculadora0.dividir(0, 9431);
        int int29 = calculadora0.subtrair((-16310679), 852742539);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2631616.0d + "'", double20 == 2631616.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-869053218) + "'", int29 == (-869053218));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar((int) 'a', 50511);
        double double25 = calculadora0.raizQuadrada((int) ' ');
        int int28 = calculadora0.subtrair(53, (-2104819));
        int int31 = calculadora0.multiplicar((int) '4', 157641);
        int int34 = calculadora0.dividir(232201856, 1416619201);
        java.lang.Class<?> wildcardClass35 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2104872 + "'", int28 == 2104872);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8197332 + "'", int31 == 8197332);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        double double20 = calculadora0.potencia(43, 97);
        int int23 = calculadora0.somar((-518356831), (-463861759));
        double double26 = calculadora0.potencia((-326043), 1216785600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.083380139E9d + "'", double20 == 1.083380139E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-982218590) + "'", int23 == (-982218590));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.2695425E7d + "'", double26 == 8.2695425E7d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        int int23 = calculadora0.dividir(561, 275009);
        int int26 = calculadora0.somar(1732706892, 254);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1732707146 + "'", int26 == 1732707146);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        int int17 = calculadora0.dividir(0, (int) (byte) -1);
        double double20 = calculadora0.potencia((-1915836162), 9);
        int int23 = calculadora0.multiplicar(561, 304857);
        int int26 = calculadora0.somar(17, (-90796998));
        double double29 = calculadora0.potencia(3191602, 284795973);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 613 + "'", int14 == 613);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.01006336E8d + "'", double20 == 3.01006336E8d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 171024777 + "'", int23 == 171024777);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-90796981) + "'", int26 == (-90796981));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double16 = calculadora0.potencia(1431, 232201856);
        int int19 = calculadora0.subtrair((-14985), 1246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.17052417E8d + "'", double16 == 1.17052417E8d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-16231) + "'", int19 == (-16231));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.multiplicar((int) (byte) 100, 33);
        double double15 = calculadora0.potencia((-2526), 158400);
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3300 + "'", int12 == 3300);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        int int22 = calculadora0.multiplicar(4576, 12758826);
        int int25 = calculadora0.subtrair(33, 2568);
        int int28 = calculadora0.multiplicar(2472, 250156381);
        int int31 = calculadora0.somar(33, 1577012793);
        java.lang.Class<?> wildcardClass32 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1745154368) + "'", int22 == (-1745154368));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2535) + "'", int25 == (-2535));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-88716792) + "'", int28 == (-88716792));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1577012826 + "'", int31 == 1577012826);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double16 = calculadora0.potencia(1431, 232201856);
        int int19 = calculadora0.multiplicar(1235336173, (-733081745));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.17052417E8d + "'", double16 == 1.17052417E8d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-312910141) + "'", int19 == (-312910141));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int int1 = calculadora.Matematica.sum(47624);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1134046501 + "'", int1 == 1134046501);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        int int19 = calculadora0.multiplicar(0, 1);
        int int22 = calculadora0.somar((int) (byte) 10, 5051035);
        double double25 = calculadora0.potencia((-3390), 232201856);
        double double28 = calculadora0.potencia((-500309854), 649754420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5051045 + "'", int22 == 5051045);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int int1 = calculadora.Matematica.sum((-982218590));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.multiplicar((-282349306), (-1344217536));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1381010048) + "'", int13 == (-1381010048));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int1 = calculadora.Matematica.factorial((-52));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int int1 = calculadora.Matematica.factorial(92);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        double double19 = calculadora0.potencia(5150, 12758818);
        int int22 = calculadora0.subtrair((int) '4', 9);
        double double25 = calculadora0.porcentagem(53, 1431);
        int int28 = calculadora0.dividir(7015, (int) (byte) 100);
        int int31 = calculadora0.subtrair(756167552, (-2443669));
        // The following exception was thrown during execution in test generation
        try {
            double double34 = calculadora0.potencia(872674560, (-88720292));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43 + "'", int22 == 43);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75843.0d + "'", double25 == 75843.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 70 + "'", int28 == 70);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 758611221 + "'", int31 == 758611221);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        int int17 = calculadora0.dividir(0, (int) (byte) -1);
        double double20 = calculadora0.potencia((-1915836162), 9);
        int int23 = calculadora0.multiplicar(561, 304857);
        int int26 = calculadora0.subtrair((-1270168789), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 613 + "'", int14 == 613);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.01006336E8d + "'", double20 == 3.01006336E8d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 171024777 + "'", int23 == 171024777);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1270168789) + "'", int26 == (-1270168789));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        boolean boolean1 = calculadora.Matematica.isPrime(560);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        int int23 = calculadora0.subtrair((int) (byte) -1, 33);
        int int26 = calculadora0.subtrair(0, (int) (byte) 0);
        double double29 = calculadora0.porcentagem((-518356831), 308750140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-5.6061626E8d) + "'", double29 == (-5.6061626E8d));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        boolean boolean1 = calculadora.Matematica.isPrime(296384028);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double18 = calculadora0.raizQuadrada(4950);
        int int21 = calculadora0.multiplicar((-1243182), 852742539);
        int int24 = calculadora0.dividir(1295112616, 1810759173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 70.35623639735144d + "'", double18 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-282349306) + "'", int21 == (-282349306));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        double double5 = calculadora0.porcentagem(2, 720);
        int int8 = calculadora0.subtrair(22, 518356790);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1440.0d + "'", double5 == 1440.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-518356768) + "'", int8 == (-518356768));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        double double19 = calculadora0.potencia(5051000, 11781);
        int int22 = calculadora0.multiplicar(14, 56);
        double double25 = calculadora0.porcentagem((-32), 5051);
        int int28 = calculadora0.multiplicar(6578, (-21329));
        double double31 = calculadora0.potencia(2104871, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 784 + "'", int22 == 784);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-161632.0d) + "'", double25 == (-161632.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-140302162) + "'", int28 == (-140302162));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.272899737E9d) + "'", double31 == (-1.272899737E9d));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.potencia((-1056240805), 153);
        int int17 = calculadora0.somar((int) (short) 10, 1235336173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.787388357E9d) + "'", double14 == (-1.787388357E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336183 + "'", int17 == 1235336183);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        int int19 = calculadora0.multiplicar(355015120, 1056240804);
        double double22 = calculadora0.potencia(6579, 50510);
        int int25 = calculadora0.somar((-4719837), (-1301739248));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1255225024) + "'", int19 == (-1255225024));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-8.26997671E8d) + "'", double22 == (-8.26997671E8d));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1306459085) + "'", int25 == (-1306459085));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        double double19 = calculadora0.raizQuadrada(52);
        int int22 = calculadora0.somar(1745349120, 3);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.211102550927978d + "'", double19 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1745349123 + "'", int22 == 1745349123);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar(6126751, 12253726);
        int int15 = calculadora0.subtrair(8197332, 367830);
        int int18 = calculadora0.subtrair(0, 2526);
        int int21 = calculadora0.somar(12253726, 631809017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-500309854) + "'", int12 == (-500309854));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7829502 + "'", int15 == 7829502);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2526) + "'", int18 == (-2526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 644062743 + "'", int21 == 644062743);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar(67587, (-1600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-108139200) + "'", int16 == (-108139200));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        boolean boolean1 = calculadora.Matematica.isPrime((-326043));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double15 = calculadora0.porcentagem((int) 'a', 21645002);
        int int18 = calculadora0.subtrair(47983, 3200);
        java.lang.Class<?> wildcardClass19 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.099565194E9d + "'", double15 == 2.099565194E9d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44783 + "'", int18 == 44783);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.subtrair(2, (int) (byte) 10);
        double double8 = calculadora0.raizQuadrada(44783);
        int int11 = calculadora0.multiplicar((-4719836), 665359165);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 211.61994234948654d + "'", double8 == 211.61994234948654d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-542342252) + "'", int11 == (-542342252));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        double double12 = calculadora0.porcentagem((-9035), (-500302768));
        double double15 = calculadora0.porcentagem((-823690138), (-1642756327));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.929913488E9d + "'", double12 == 1.929913488E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.871900662E9d + "'", double15 == 1.871900662E9d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        double double10 = calculadora0.raizQuadrada(158400);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = calculadora0.raizQuadrada((-1243182));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 397.994974842648d + "'", double10 == 397.994974842648d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        int int20 = calculadora0.multiplicar(5191, 524700);
        int int23 = calculadora0.multiplicar(21703872, 5051000);
        int int26 = calculadora0.dividir(204480, 274911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1571249596) + "'", int20 == (-1571249596));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1512208896 + "'", int23 == 1512208896);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(53, 143);
        int int18 = calculadora0.subtrair(50511, 157641);
        double double21 = calculadora0.porcentagem((-1301739248), (int) (byte) 100);
        int int24 = calculadora0.somar(3500, 68270873);
        double double27 = calculadora0.potencia(92, 227687130);
        int int30 = calculadora0.somar((-1411303535), 1732706892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.50920227E8d) + "'", double15 == (-9.50920227E8d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-107130) + "'", int18 == (-107130));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.32490592E9d) + "'", double21 == (-1.32490592E9d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 68274373 + "'", int24 == 68274373);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 321403357 + "'", int30 == 321403357);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        double double7 = calculadora0.raizQuadrada(32);
        int int10 = calculadora0.multiplicar(92, (-500302768));
        int int13 = calculadora0.multiplicar(0, 649754420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1216785600 + "'", int10 == 1216785600);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        boolean boolean1 = calculadora.Matematica.isPrime((-825950528));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double19 = calculadora0.porcentagem((-10472177), (-54));
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.65497558E8d + "'", double19 == 5.65497558E8d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        double double21 = calculadora0.raizQuadrada(4950);
        double double24 = calculadora0.potencia(250156381, 33);
        double double27 = calculadora0.porcentagem(1346818465, 11781);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = calculadora0.raizQuadrada((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 70.35623639735144d + "'", double21 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.562233379E9d) + "'", double24 == (-1.562233379E9d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.259144741E9d + "'", double27 == 1.259144741E9d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int int1 = calculadora.Matematica.factorial(856);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        double double23 = calculadora0.porcentagem(50510, 0);
        int int26 = calculadora0.somar(3061240, 22);
        int int29 = calculadora0.subtrair(1810759173, 560);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = calculadora0.potencia(0, (-282349306));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3061262 + "'", int26 == 3061262);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1810758613 + "'", int29 == 1810758613);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        boolean boolean1 = calculadora.Matematica.isPrime((-16231));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        int int23 = calculadora0.subtrair((-1915836162), (-54));
        int int26 = calculadora0.somar(5150, (-357765));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1915836108) + "'", int23 == (-1915836108));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-352615) + "'", int26 == (-352615));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int int1 = calculadora.Matematica.factorial(3061262);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int1 = calculadora.Matematica.factorial(58870);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int int1 = calculadora.Matematica.factorial((-1888351720));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar((int) (byte) -1, (int) (short) 0);
        double double20 = calculadora0.porcentagem((-2535), (-2057542204));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.779189796E9d + "'", double20 == 1.779189796E9d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        boolean boolean1 = calculadora.Matematica.isPrime(631805627);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

