package generated_tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        boolean boolean1 = calculadora.Matematica.isPrime(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        boolean boolean1 = calculadora.Matematica.isPrime((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = calculadora0.raizQuadrada((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int1 = calculadora.Matematica.factorial((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        calculadora.Matematica matematica0 = new calculadora.Matematica();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        boolean boolean1 = calculadora.Matematica.isPrime(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        boolean boolean1 = calculadora.Matematica.isPrime((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int1 = calculadora.Matematica.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int1 = calculadora.Matematica.factorial((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int1 = calculadora.Matematica.sum(99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4950 + "'", int1 == 4950);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calculadora0.dividir((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int1 = calculadora.Matematica.factorial((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int1 = calculadora.Matematica.sum((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5051 + "'", int1 == 5051);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int1 = calculadora.Matematica.sum(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int1 = calculadora.Matematica.sum(5051);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12758826 + "'", int1 == 12758826);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int1 = calculadora.Matematica.sum(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        java.lang.Class<?> wildcardClass7 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int1 = calculadora.Matematica.sum((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int1 = calculadora.Matematica.sum((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int1 = calculadora.Matematica.sum(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 561 + "'", int1 == 561);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        java.lang.Class<?> wildcardClass8 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        boolean boolean1 = calculadora.Matematica.isPrime(99);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int1 = calculadora.Matematica.sum(561);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 157641 + "'", int1 == 157641);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int1 = calculadora.Matematica.sum((-90));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int int1 = calculadora.Matematica.sum((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        boolean boolean1 = calculadora.Matematica.isPrime(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int1 = calculadora.Matematica.sum((-34));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int1 = calculadora.Matematica.factorial((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(56, 32);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 24 + "'", int17 == 24);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calculadora0.dividir(52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar((int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        boolean boolean1 = calculadora.Matematica.isPrime(143);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calculadora0.dividir(50608, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        boolean boolean1 = calculadora.Matematica.isPrime(50608);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        java.lang.Class<?> wildcardClass9 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-90), 100);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9000) + "'", int9 == (-9000));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int1 = calculadora.Matematica.factorial(2526);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int1 = calculadora.Matematica.sum(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1379 + "'", int1 == 1379);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        boolean boolean1 = calculadora.Matematica.isPrime((-9000));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        double double21 = calculadora0.raizQuadrada(4950);
        java.lang.Class<?> wildcardClass22 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 70.35623639735144d + "'", double21 == 70.35623639735144d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        boolean boolean1 = calculadora.Matematica.isPrime(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int int1 = calculadora.Matematica.factorial(41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int1 = calculadora.Matematica.factorial(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 362880 + "'", int1 == 362880);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        java.lang.Class<?> wildcardClass9 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        boolean boolean1 = calculadora.Matematica.isPrime(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean1 = calculadora.Matematica.isPrime((-3301));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int1 = calculadora.Matematica.sum(108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5887 + "'", int1 == 5887);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculadora0.potencia((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        boolean boolean1 = calculadora.Matematica.isPrime(4951);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int1 = calculadora.Matematica.factorial(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int1 = calculadora.Matematica.sum((-1530));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar((-2147483648), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int1 = calculadora.Matematica.factorial(3400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        java.lang.Class<?> wildcardClass14 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int1 = calculadora.Matematica.sum(4950);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12253726 + "'", int1 == 12253726);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double8 = calculadora0.potencia((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass9 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int1 = calculadora.Matematica.sum((-9035));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        java.lang.Class<?> wildcardClass13 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int1 = calculadora.Matematica.sum(3300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5446651 + "'", int1 == 5446651);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int1 = calculadora.Matematica.sum((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5051 + "'", int1 == 5051);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int1 = calculadora.Matematica.sum(5051000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 250156381 + "'", int1 == 250156381);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.potencia((int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass11 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.raizQuadrada((-1));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.raizQuadrada((-2147483648));
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
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int1 = calculadora.Matematica.sum(3500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6126751 + "'", int1 == 6126751);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double9 = calculadora0.porcentagem(157641, 50608);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-6.12038864E8d) + "'", double9 == (-6.12038864E8d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int int1 = calculadora.Matematica.factorial(250156381);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        double double9 = calculadora0.potencia(0, 12758826);
        double double12 = calculadora0.porcentagem(0, 97);
        java.lang.Class<?> wildcardClass13 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int1 = calculadora.Matematica.factorial(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int int1 = calculadora.Matematica.sum(614);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 188806 + "'", int1 == 188806);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int1 = calculadora.Matematica.factorial(5051000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int1 = calculadora.Matematica.factorial((-3301));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calculadora0.dividir(3500, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        java.lang.Class<?> wildcardClass27 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int1 = calculadora.Matematica.factorial((-54));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir(1379, 1379);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        boolean boolean1 = calculadora.Matematica.isPrime((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int1 = calculadora.Matematica.factorial(649);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int int1 = calculadora.Matematica.sum((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int1 = calculadora.Matematica.sum(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 529 + "'", int1 == 529);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        boolean boolean1 = calculadora.Matematica.isPrime(24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        boolean boolean1 = calculadora.Matematica.isPrime((-1076));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int1 = calculadora.Matematica.sum(613);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 188191 + "'", int1 == 188191);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int1 = calculadora.Matematica.factorial(5887);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int1 = calculadora.Matematica.sum(5446651);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1810759158) + "'", int1 == (-1810759158));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass29 = calculadora0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int1 = calculadora.Matematica.sum(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem(0, 50511);
        int int20 = calculadora0.multiplicar((-8), (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 720 + "'", int20 == 720);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int1 = calculadora.Matematica.sum(157641);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-459480627) + "'", int1 == (-459480627));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int int1 = calculadora.Matematica.factorial((-459480627));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int1 = calculadora.Matematica.sum((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int1 = calculadora.Matematica.sum(4576);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10472177 + "'", int1 == 10472177);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int int1 = calculadora.Matematica.sum(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1431 + "'", int1 == 1431);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        boolean boolean1 = calculadora.Matematica.isPrime(5446651);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int1 = calculadora.Matematica.sum((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 529 + "'", int1 == 529);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int1 = calculadora.Matematica.sum(6579);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21644910 + "'", int1 == 21644910);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int1 = calculadora.Matematica.factorial((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        boolean boolean1 = calculadora.Matematica.isPrime((-32));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.subtrair(53, (int) (short) 0);
        int int9 = calculadora0.somar(0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        boolean boolean1 = calculadora.Matematica.isPrime(4576);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        int int12 = calculadora0.multiplicar(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        double double17 = calculadora0.porcentagem(1379, 3300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4550700.0d + "'", double17 == 4550700.0d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int1 = calculadora.Matematica.sum(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int1 = calculadora.Matematica.factorial(50608);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int1 = calculadora.Matematica.sum((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int1 = calculadora.Matematica.factorial(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = calculadora0.dividir(143, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int1 = calculadora.Matematica.sum(153);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11781 + "'", int1 == 11781);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int1 = calculadora.Matematica.sum(56);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1597 + "'", int1 == 1597);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double18 = calculadora0.raizQuadrada(4950);
        int int21 = calculadora0.somar((int) (byte) 1, (-32));
        java.lang.Class<?> wildcardClass22 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 70.35623639735144d + "'", double18 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        double double12 = calculadora0.porcentagem(5446651, 5051000);
        int int15 = calculadora0.subtrair(1, 15764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.76867012E9d + "'", double12 == 1.76867012E9d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15763) + "'", int15 == (-15763));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int1 = calculadora.Matematica.factorial(5150);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        java.lang.Class<?> wildcardClass7 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int1 = calculadora.Matematica.factorial(157641);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        double double16 = calculadora0.raizQuadrada(50510);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 224.74429914905517d + "'", double16 == 224.74429914905517d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double9 = calculadora0.potencia((-1), 561);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar((int) (byte) -1, (int) (short) 0);
        int int20 = calculadora0.somar(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.raizQuadrada((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        boolean boolean1 = calculadora.Matematica.isPrime(10896601);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int1 = calculadora.Matematica.sum(5051035);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 426942010 + "'", int1 == 426942010);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double18 = calculadora0.raizQuadrada(4950);
        int int21 = calculadora0.somar((int) (byte) 1, (-32));
        int int24 = calculadora0.dividir(5051000, 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 70.35623639735144d + "'", double18 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7015 + "'", int24 == 7015);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int1 = calculadora.Matematica.factorial(143);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int int1 = calculadora.Matematica.factorial((-1530));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.subtrair(50510, 2527);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47983 + "'", int23 == 47983);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        double double10 = calculadora0.raizQuadrada(97);
        int int13 = calculadora0.somar((int) (short) 100, 3300);
        int int16 = calculadora0.somar(21644910, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.848857801796104d + "'", double10 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3400 + "'", int13 == 3400);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21645002 + "'", int16 == 21645002);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int1 = calculadora.Matematica.factorial((-1067));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        int int14 = calculadora0.dividir(24, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.958260743101398d + "'", double16 == 11.958260743101398d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int1 = calculadora.Matematica.factorial(99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.subtrair(53, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = calculadora0.raizQuadrada((-9000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        double double18 = calculadora0.raizQuadrada(3300);
        java.lang.Class<?> wildcardClass19 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 57.445626465380286d + "'", double18 == 57.445626465380286d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int1 = calculadora.Matematica.factorial(2371);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double9 = calculadora0.porcentagem(613, 53);
        int int12 = calculadora0.dividir(6579, 3061240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32489.0d + "'", double9 == 32489.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int1 = calculadora.Matematica.sum(12758826);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-98397944) + "'", int1 == (-98397944));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int1 = calculadora.Matematica.factorial((-108366441));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(3300, 0);
        int int19 = calculadora0.dividir(157641, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-98397944));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15764 + "'", int19 == 15764);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        int int11 = calculadora0.somar(9, (-1076));
        int int14 = calculadora0.somar(64, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1067) + "'", int11 == (-1067));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-36) + "'", int14 == (-36));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        boolean boolean1 = calculadora.Matematica.isPrime(5051035);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int1 = calculadora.Matematica.factorial(21644910);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Class<?> wildcardClass29 = calculadora0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.Class<?> wildcardClass27 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0896601E8d) + "'", double26 == (-1.0896601E8d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        boolean boolean1 = calculadora.Matematica.isPrime(361218);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        java.lang.Class<?> wildcardClass9 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int int1 = calculadora.Matematica.factorial(12758826);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        boolean boolean1 = calculadora.Matematica.isPrime(43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int1 = calculadora.Matematica.factorial(56);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.somar(250156381, 529);
        int int23 = calculadora0.dividir(10, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        double double12 = calculadora0.porcentagem(5446651, 5051000);
        java.lang.Class<?> wildcardClass13 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.76867012E9d + "'", double12 == 1.76867012E9d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(53, 143);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.potencia((-31), (-1076));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.50920227E8d) + "'", double15 == (-9.50920227E8d));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int1 = calculadora.Matematica.sum((-1744965562));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = calculadora0.potencia((-1530), (-98397944));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        double double23 = calculadora0.porcentagem(50510, 0);
        int int26 = calculadora0.multiplicar(362880, 157694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1389423872 + "'", int26 == 1389423872);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int1 = calculadora.Matematica.factorial(613);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.dividir(43, 741);
        double double15 = calculadora0.potencia(12758826, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int1 = calculadora.Matematica.sum(4951);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12258676 + "'", int1 == 12258676);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        boolean boolean1 = calculadora.Matematica.isPrime((-2109870));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int int1 = calculadora.Matematica.sum(21644910);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-736014630) + "'", int1 == (-736014630));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        int int11 = calculadora0.multiplicar(158400, 6579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1042113600 + "'", int11 == 1042113600);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = calculadora0.potencia((int) (short) 100, (-2104819));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        // The following exception was thrown during execution in test generation
        try {
            double double30 = calculadora0.raizQuadrada((-108366441));
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int int1 = calculadora.Matematica.factorial(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        boolean boolean1 = calculadora.Matematica.isPrime(48);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        int int19 = calculadora0.subtrair(614, 108367055);
        int int22 = calculadora0.subtrair(250156910, 21645002);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-108366441) + "'", int19 == (-108366441));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 228511908 + "'", int22 == 228511908);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int int1 = calculadora.Matematica.factorial(47983);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int1 = calculadora.Matematica.factorial(1431);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        boolean boolean1 = calculadora.Matematica.isPrime((-1810759158));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        double double29 = calculadora0.porcentagem(613, 3400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-10469705) + "'", int26 == (-10469705));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2084200.0d + "'", double29 == 2084200.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3301.0d + "'", double25 == 3301.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int1 = calculadora.Matematica.factorial((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(3300, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.raizQuadrada((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        boolean boolean1 = calculadora.Matematica.isPrime((-108366441));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int1 = calculadora.Matematica.factorial((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        int int14 = calculadora0.dividir((int) (byte) 1, 5887);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        double double23 = calculadora0.potencia(5446651, 92);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.09744879E8d) + "'", double23 == (-9.09744879E8d));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.multiplicar((int) (byte) 100, 33);
        int int15 = calculadora0.somar((int) '#', 614);
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3300 + "'", int12 == 3300);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 649 + "'", int15 == 649);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int1 = calculadora.Matematica.factorial((-677952));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.dividir(362880, 153);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = calculadora0.potencia((-90), (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2371 + "'", int6 == 2371);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        int int29 = calculadora0.somar((int) '#', 5051000);
        java.lang.Class<?> wildcardClass30 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-32) + "'", int26 == (-32));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5051035 + "'", int29 == 5051035);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.raizQuadrada((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int1 = calculadora.Matematica.sum((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int1 = calculadora.Matematica.sum(3400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5781701 + "'", int1 == 5781701);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int int1 = calculadora.Matematica.factorial(561);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int1 = calculadora.Matematica.sum(228511908);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1963777243 + "'", int1 == 1963777243);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        boolean boolean1 = calculadora.Matematica.isPrime(3061240);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = calculadora0.raizQuadrada((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        boolean boolean1 = calculadora.Matematica.isPrime(426942010);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada(5781701);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2404.5167913741006d + "'", double2 == 2404.5167913741006d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int1 = calculadora.Matematica.sum((-16310582));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        boolean boolean1 = calculadora.Matematica.isPrime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        boolean boolean1 = calculadora.Matematica.isPrime(47983);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        int int28 = calculadora0.somar(10896601, 153);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = calculadora0.dividir(7015, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10896754 + "'", int28 == 10896754);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int1 = calculadora.Matematica.sum(741);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 274911 + "'", int1 == 274911);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int1 = calculadora.Matematica.sum((-3399));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        boolean boolean1 = calculadora.Matematica.isPrime(361187);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int1 = calculadora.Matematica.factorial(228511908);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double9 = calculadora0.porcentagem(613, 53);
        int int12 = calculadora0.somar((int) (byte) 100, 12758818);
        double double15 = calculadora0.potencia((-8), 50510);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32489.0d + "'", double9 == 32489.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12758918 + "'", int12 == 12758918);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double18 = calculadora0.raizQuadrada(4950);
        int int21 = calculadora0.somar((int) (byte) 1, (-32));
        int int24 = calculadora0.multiplicar(274911, 11781);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 70.35623639735144d + "'", double18 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1056240805) + "'", int24 == (-1056240805));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        int int32 = calculadora0.dividir(5060, 2371);
        java.lang.Class<?> wildcardClass33 = calculadora0.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        double double19 = calculadora0.porcentagem(5512, (-1744965562));
        int int22 = calculadora0.somar((-108366441), (-459480627));
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.818402E9d) + "'", double19 == (-1.818402E9d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-567847068) + "'", int22 == (-567847068));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        int int14 = calculadora0.dividir(6579, 92);
        int int17 = calculadora0.somar(7015, 71);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7086 + "'", int17 == 7086);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        java.lang.Class<?> wildcardClass7 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int1 = calculadora.Matematica.factorial(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        double double10 = calculadora0.raizQuadrada(97);
        int int13 = calculadora0.subtrair((int) (short) -1, (int) (short) 0);
        int int16 = calculadora0.dividir(5051000, 12758918);
        int int19 = calculadora0.subtrair((-100), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.848857801796104d + "'", double10 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-64) + "'", int19 == (-64));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        double double19 = calculadora0.raizQuadrada(10896601);
        double double22 = calculadora0.potencia((-1744965562), 2);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3301.0d + "'", double19 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.608471332E9d + "'", double22 == 1.608471332E9d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int1 = calculadora.Matematica.sum((-500309854));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        boolean boolean1 = calculadora.Matematica.isPrime(108);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem((-2147483648), 1235336173);
        int int20 = calculadora0.somar((-500309854), 7086);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.147483648E9d) + "'", double17 == (-2.147483648E9d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-500302768) + "'", int20 == (-500302768));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        int int31 = calculadora0.multiplicar(5512, 157694);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = calculadora0.raizQuadrada((-2640203));
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3301.0d + "'", double25 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 869209328 + "'", int31 == 869209328);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = calculadora0.potencia(71, (-7829438));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double9 = calculadora0.porcentagem(613, 53);
        int int12 = calculadora0.dividir((-98), 250156381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32489.0d + "'", double9 == 32489.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int1 = calculadora.Matematica.factorial((-90));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.potencia(9, 14);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.796636465E9d + "'", double19 == 1.796636465E9d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        int int14 = calculadora0.dividir((int) (byte) 1, 5887);
        double double17 = calculadora0.porcentagem(1379, (-2104819));
        double double20 = calculadora0.porcentagem(529, 4576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.392421895E9d + "'", double17 == 1.392421895E9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2420704.0d + "'", double20 == 2420704.0d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int1 = calculadora.Matematica.sum((-4232));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int int1 = calculadora.Matematica.sum((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 630 + "'", int1 == 630);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.porcentagem((-2109870), 15764);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.099747688E9d + "'", double19 == 1.099747688E9d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        double double20 = calculadora0.potencia(3400, (int) (short) 0);
        double double22 = calculadora0.raizQuadrada(52);
        int int25 = calculadora0.somar(40, 4950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.211102550927978d + "'", double22 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4990 + "'", int25 == 4990);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int int1 = calculadora.Matematica.sum((-3390));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        boolean boolean1 = calculadora.Matematica.isPrime(50511);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        int int19 = calculadora0.multiplicar(5051035, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70714490 + "'", int19 == 70714490);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        boolean boolean1 = calculadora.Matematica.isPrime(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        boolean boolean1 = calculadora.Matematica.isPrime(499035496);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        boolean boolean1 = calculadora.Matematica.isPrime(56);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.dividir(8197332, (-1744965562));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar(53, 157641);
        int int26 = calculadora0.multiplicar(7015, (-2109870));
        java.lang.Class<?> wildcardClass27 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 157694 + "'", int23 == 157694);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1915836162) + "'", int26 == (-1915836162));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int1 = calculadora.Matematica.sum(10896754);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 296384028 + "'", int1 == 296384028);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int int1 = calculadora.Matematica.sum(362880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1416619201 + "'", int1 == 1416619201);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        boolean boolean1 = calculadora.Matematica.isPrime((-21186));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        boolean boolean1 = calculadora.Matematica.isPrime(274875);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int1 = calculadora.Matematica.factorial((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int1 = calculadora.Matematica.factorial(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(3300, 0);
        int int19 = calculadora0.dividir(157641, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15764 + "'", int19 == 15764);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int1 = calculadora.Matematica.sum(7829502);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1668074498 + "'", int1 == 1668074498);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.raizQuadrada((-3399));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int1 = calculadora.Matematica.factorial(10472177);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        int int22 = calculadora0.multiplicar(4576, 12758826);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1745154368) + "'", int22 == (-1745154368));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        int int12 = calculadora0.somar(92, 649);
        double double15 = calculadora0.porcentagem(4576, 41);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calculadora0.dividir(869209328, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 741 + "'", int12 == 741);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 187616.0d + "'", double15 == 187616.0d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        int int34 = calculadora0.dividir((-1076), 2568);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.porcentagem(108, 50511);
        int int14 = calculadora0.multiplicar(4950, 106);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5455188.0d + "'", double11 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 524700 + "'", int14 == 524700);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        double double29 = calculadora0.potencia(561, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-32) + "'", int26 == (-32));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.949979439E9d) + "'", double29 == (-1.949979439E9d));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar(53, 157641);
        double double26 = calculadora0.potencia(153, 274911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 157694 + "'", int23 == 157694);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-8.37174103E8d) + "'", double26 == (-8.37174103E8d));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        int int20 = calculadora0.dividir(53, 5512);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = calculadora0.potencia(1379, (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.dividir((-16310582), (-47610));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 342 + "'", int5 == 342);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        // The following exception was thrown during execution in test generation
        try {
            double double33 = calculadora0.raizQuadrada((-86));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2104872 + "'", int28 == 2104872);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8197332 + "'", int31 == 8197332);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        int int29 = calculadora0.somar((int) '#', 5051000);
        int int32 = calculadora0.subtrair(158400, 362880);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-32) + "'", int26 == (-32));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5051035 + "'", int29 == 5051035);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-204480) + "'", int32 == (-204480));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        double double22 = calculadora0.potencia(40, 31);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = calculadora0.potencia(362880, (-1745154368));
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.dividir((int) (byte) 100, (int) (byte) -1);
        int int20 = calculadora0.subtrair(274911, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-100) + "'", int17 == (-100));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 275009 + "'", int20 == 275009);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double9 = calculadora0.porcentagem(613, 53);
        int int12 = calculadora0.subtrair((-1), (-1056240805));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32489.0d + "'", double9 == 32489.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1056240804 + "'", int12 == 1056240804);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        boolean boolean1 = calculadora.Matematica.isPrime(5051);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar(426942010, 3300);
        double double10 = calculadora0.raizQuadrada(41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 159359912 + "'", int8 == 159359912);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.4031242374328485d + "'", double10 == 6.4031242374328485d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int int1 = calculadora.Matematica.factorial((-15763));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.multiplicar(0, (-9000));
        int int9 = calculadora0.somar(0, (-90));
        int int12 = calculadora0.multiplicar(1056240804, 1056240804);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-90) + "'", int9 == (-90));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1301739248) + "'", int12 == (-1301739248));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int int1 = calculadora.Matematica.factorial((-2535));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        int int12 = calculadora0.somar(92, 649);
        double double15 = calculadora0.porcentagem(4576, 41);
        double double18 = calculadora0.porcentagem(5051, (-10469705));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 741 + "'", int12 == 741);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 187616.0d + "'", double15 == 187616.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.342872403E9d) + "'", double18 == (-1.342872403E9d));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        double double22 = calculadora0.potencia(40, 31);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = calculadora0.raizQuadrada((-677952));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        int int31 = calculadora0.somar(250156910, 232201856);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 482358766 + "'", int31 == 482358766);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double16 = calculadora0.raizQuadrada(143);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.958260743101398d + "'", double16 == 11.958260743101398d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        double double9 = calculadora0.potencia(0, 12758826);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        boolean boolean1 = calculadora.Matematica.isPrime(21339);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int int1 = calculadora.Matematica.factorial(12258676);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        double double19 = calculadora0.potencia(5051000, 11781);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-459480627));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = calculadora0.potencia(3400, (-10469705));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.3549752E8d + "'", double19 == 1.3549752E8d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        boolean boolean1 = calculadora.Matematica.isPrime(784);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int1 = calculadora.Matematica.sum(1416619201);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1810161887) + "'", int1 == (-1810161887));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.multiplicar((int) (byte) 100, 33);
        int int15 = calculadora0.somar((int) '#', 614);
        int int18 = calculadora0.multiplicar(108367055, 10896567);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3300 + "'", int12 == 3300);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 649 + "'", int15 == 649);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631809017 + "'", int18 == 631809017);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int1 = calculadora.Matematica.factorial(4990);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        int int23 = calculadora0.dividir(40, 482358766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        double double10 = calculadora0.raizQuadrada(158400);
        int int13 = calculadora0.multiplicar((int) (byte) 100, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 397.994974842648d + "'", double10 == 397.994974842648d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10000) + "'", int13 == (-10000));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.multiplicar(143, 2526);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = calculadora0.potencia(70714490, (-108366441));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 361218 + "'", int6 == 361218);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(3300, 0);
        int int19 = calculadora0.dividir(157641, (int) (short) 10);
        int int22 = calculadora0.dividir(99, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15764 + "'", int19 == 15764);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int int1 = calculadora.Matematica.factorial(1235336173);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        int int20 = calculadora0.dividir((int) (short) 0, (-34));
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int1 = calculadora.Matematica.sum((-2526));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.dividir(53, 12253726);
        int int19 = calculadora0.multiplicar((int) ' ', 100);
        int int22 = calculadora0.multiplicar(92, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3200 + "'", int19 == 3200);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        int int22 = calculadora0.dividir(529, (-823690138));
        // The following exception was thrown during execution in test generation
        try {
            double double25 = calculadora0.potencia(784, (-9035));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        boolean boolean1 = calculadora.Matematica.isPrime(250156910);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int1 = calculadora.Matematica.sum(108367055);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-561033704) + "'", int1 == (-561033704));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        double double14 = calculadora0.porcentagem(1431, 10896754);
        int int17 = calculadora0.subtrair(56, 44783);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.58661421E9d) + "'", double14 == (-1.58661421E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-44727) + "'", int17 == (-44727));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int1 = calculadora.Matematica.factorial((-16310582));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada(100);
        int int5 = calculadora0.somar(5051, 99);
        java.lang.Class<?> wildcardClass6 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5150 + "'", int5 == 5150);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int1 = calculadora.Matematica.sum((-15763));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        boolean boolean1 = calculadora.Matematica.isPrime(630);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int1 = calculadora.Matematica.sum(5191);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13475836 + "'", int1 == 13475836);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        boolean boolean1 = calculadora.Matematica.isPrime((-500302768));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double15 = calculadora0.porcentagem((-32), (-2640203));
        int int18 = calculadora0.subtrair((int) (byte) 1, (-21186));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.4486496E7d + "'", double15 == 8.4486496E7d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21187 + "'", int18 == 21187);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(56, 32);
        int int20 = calculadora0.multiplicar(1577012793, (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 24 + "'", int17 == 24);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1642756327) + "'", int20 == (-1642756327));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int int1 = calculadora.Matematica.sum(1235493814);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-303582066) + "'", int1 == (-303582066));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        double double14 = calculadora0.potencia(367830, 6579);
        int int17 = calculadora0.dividir(3400, (-677952));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(50608, (int) (short) 10);
        int int22 = calculadora0.dividir(10896601, 70714490);
        int int25 = calculadora0.subtrair((-15763), 784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5060 + "'", int19 == 5060);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16547) + "'", int25 == (-16547));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
            double double21 = calculadora0.raizQuadrada((-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double15 = calculadora0.raizQuadrada(53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.280109889280518d + "'", double15 == 7.280109889280518d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int1 = calculadora.Matematica.factorial((-2109870));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((-47610), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-47610) + "'", int17 == (-47610));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        boolean boolean1 = calculadora.Matematica.isPrime(1963777243);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        int int19 = calculadora0.subtrair(614, 108367055);
        int int22 = calculadora0.multiplicar(9, 2371);
        double double25 = calculadora0.potencia((-2640203), 2472);
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-108366441) + "'", int19 == (-108366441));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 21339 + "'", int22 == 21339);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.170426081E9d + "'", double25 == 1.170426081E9d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.multiplicar(0, (-9000));
        int int9 = calculadora0.somar(0, (-90));
        int int12 = calculadora0.multiplicar((-736014630), 70714490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-90) + "'", int9 == (-90));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-168756252) + "'", int12 == (-168756252));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.multiplicar((-1), 10);
        double double23 = calculadora0.porcentagem((-54), (-1653134308));
        int int26 = calculadora0.dividir((-1164018784), (-567847068));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.25060584E8d) + "'", double23 == (-9.25060584E8d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar(21339, 3200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 68284800 + "'", int17 == 68284800);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int int1 = calculadora.Matematica.factorial(71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.somar(53, 157641);
        int int26 = calculadora0.multiplicar(7015, (-2109870));
        int int29 = calculadora0.subtrair(0, (-9000));
        java.lang.Class<?> wildcardClass30 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 157694 + "'", int23 == 157694);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1915836162) + "'", int26 == (-1915836162));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9000 + "'", int29 == 9000);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        // The following exception was thrown during execution in test generation
        try {
            double double31 = calculadora0.potencia(9000, (-355062730));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
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
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia((-303582066), (-10472177));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        boolean boolean1 = calculadora.Matematica.isPrime(1431);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        int int15 = calculadora0.subtrair(3061262, (-16310582));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19371844 + "'", int15 == 19371844);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int int1 = calculadora.Matematica.sum(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        int int34 = calculadora0.somar((-90), (-677952));
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-678042) + "'", int34 == (-678042));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.multiplicar((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3500 + "'", int14 == 3500);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem((-2147483648), 1235336173);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.raizQuadrada((-2104819));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.147483648E9d) + "'", double17 == (-2.147483648E9d));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        int int9 = calculadora0.subtrair((-9000), (int) '#');
        double double12 = calculadora0.potencia((-10), 3500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9035) + "'", int9 == (-9035));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem((-1915836162), 159359912);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.765449904E9d + "'", double14 == 1.765449904E9d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        boolean boolean1 = calculadora.Matematica.isPrime((-1571249596));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        double double19 = calculadora0.porcentagem(99, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = calculadora0.raizQuadrada((-98397944));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        double double19 = calculadora0.raizQuadrada(10887601);
        int int22 = calculadora0.somar((-1810759158), 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3299.636495130941d + "'", double19 == 3299.636495130941d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1810759117) + "'", int22 == (-1810759117));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        boolean boolean1 = calculadora.Matematica.isPrime(1235493814);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.multiplicar((-2535), (-204480));
        double double14 = calculadora0.porcentagem(10896754, (-1745154368));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 518356800 + "'", int11 == 518356800);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.81267584E8d) + "'", double14 == (-3.81267584E8d));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((-1076), (-1056240805));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1056241881) + "'", int6 == (-1056241881));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada(97);
        double double10 = calculadora0.raizQuadrada(7829502);
        java.lang.Class<?> wildcardClass11 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.848857801796104d + "'", double8 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2798.124729171307d + "'", double10 == 2798.124729171307d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int1 = calculadora.Matematica.factorial(2756);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int1 = calculadora.Matematica.factorial(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int1 = calculadora.Matematica.sum((-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        boolean boolean1 = calculadora.Matematica.isPrime(304857);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.porcentagem(108, 50511);
        int int14 = calculadora0.somar((-1745154368), 188806);
        double double17 = calculadora0.porcentagem((-1301739248), (-7829438));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5455188.0d + "'", double11 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1744965562) + "'", int14 == (-1744965562));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.93954864E9d) + "'", double17 == (-1.93954864E9d));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        boolean boolean1 = calculadora.Matematica.isPrime((-677952));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.somar(0, (-1899));
        int int12 = calculadora0.somar(47624, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1899) + "'", int9 == (-1899));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47623 + "'", int12 == 47623);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double18 = calculadora0.raizQuadrada(4950);
        java.lang.Class<?> wildcardClass19 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 70.35623639735144d + "'", double18 == 70.35623639735144d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int1 = calculadora.Matematica.factorial(6579);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int int1 = calculadora.Matematica.sum(355015120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1104039575) + "'", int1 == (-1104039575));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double15 = calculadora0.porcentagem((int) 'a', 21645002);
        int int18 = calculadora0.multiplicar((-1056240805), (-36));
        int int21 = calculadora0.subtrair(290577660, (-1056240805));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.099565194E9d + "'", double15 == 2.099565194E9d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-630036684) + "'", int18 == (-630036684));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1346818465 + "'", int21 == 1346818465);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int int1 = calculadora.Matematica.factorial((-3399));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        int int22 = calculadora0.somar(274911, (-36));
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 274875 + "'", int22 == 274875);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int int1 = calculadora.Matematica.factorial(367830);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.multiplicar((int) (byte) 100, 33);
        int int15 = calculadora0.subtrair(12758918, 10896754);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3300 + "'", int12 == 3300);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1862164 + "'", int15 == 1862164);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double8 = calculadora0.potencia((int) (short) 1, 10);
        int int11 = calculadora0.multiplicar(5, (-1810759158));
        int int14 = calculadora0.multiplicar((-16310582), 188806);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-463861198) + "'", int11 == (-463861198));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-44193860) + "'", int14 == (-44193860));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        int int22 = calculadora0.dividir(529, (-823690138));
        double double24 = calculadora0.raizQuadrada(11781);
        double double27 = calculadora0.porcentagem((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 108.54031509075327d + "'", double24 == 108.54031509075327d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1000.0d + "'", double27 == 1000.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        double double19 = calculadora0.raizQuadrada(10887601);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3299.636495130941d + "'", double19 == 3299.636495130941d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int1 = calculadora.Matematica.factorial((-10472177));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.multiplicar((-1), 10);
        int int23 = calculadora0.multiplicar((-302683408), 614);
        double double26 = calculadora0.porcentagem(1235493814, 2526);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1164018784) + "'", int23 == (-1164018784));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.583850028E9d) + "'", double26 == (-1.583850028E9d));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.potencia(3400, (int) ' ');
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        boolean boolean1 = calculadora.Matematica.isPrime((-31));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.potencia((-1056240805), 153);
        double double17 = calculadora0.porcentagem((-3390), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.787388357E9d) + "'", double14 == (-1.787388357E9d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int1 = calculadora.Matematica.factorial((-9035));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        boolean boolean1 = calculadora.Matematica.isPrime(310);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double17 = calculadora0.potencia((-678042), 0);
        double double19 = calculadora0.raizQuadrada(274875);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 524.2852277148385d + "'", double19 == 524.2852277148385d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        boolean boolean1 = calculadora.Matematica.isPrime(15764);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        double double28 = calculadora0.porcentagem((int) (short) 100, (-630036684));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1745154368) + "'", int22 == (-1745154368));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9.92427384E8d) + "'", double25 == (-9.92427384E8d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.42084104E9d + "'", double28 == 1.42084104E9d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.somar(0, (-1899));
        int int12 = calculadora0.subtrair(50440, 2472);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1899) + "'", int9 == (-1899));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47968 + "'", int12 == 47968);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        boolean boolean1 = calculadora.Matematica.isPrime(2526);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        boolean boolean1 = calculadora.Matematica.isPrime(362880);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double16 = calculadora0.raizQuadrada(143);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.raizQuadrada((-47610));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.958260743101398d + "'", double16 == 11.958260743101398d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int1 = calculadora.Matematica.factorial(290577660);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.dividir((int) (short) 1, 157641);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        double double19 = calculadora0.raizQuadrada(10896601);
        double double22 = calculadora0.potencia((-1744965562), 2);
        int int25 = calculadora0.subtrair((-98), 1502);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3301.0d + "'", double19 == 3301.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.608471332E9d + "'", double22 == 1.608471332E9d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1600) + "'", int25 == (-1600));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        double double18 = calculadora0.raizQuadrada(3300);
        double double20 = calculadora0.raizQuadrada((int) ' ');
        int int23 = calculadora0.dividir(157641, 153);
        double double25 = calculadora0.raizQuadrada(232201856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 57.445626465380286d + "'", double18 == 57.445626465380286d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.656854249492381d + "'", double20 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1030 + "'", int23 == 1030);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 15238.171018859186d + "'", double25 == 15238.171018859186d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        int int20 = calculadora0.multiplicar((-2109870), 499035486);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1653134308) + "'", int20 == (-1653134308));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int1 = calculadora.Matematica.factorial((-34));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        int int14 = calculadora0.dividir((int) (byte) 1, 5887);
        int int17 = calculadora0.multiplicar((int) ' ', 4950);
        int int20 = calculadora0.somar(2527, 52);
        double double22 = calculadora0.raizQuadrada(5060);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 158400 + "'", int17 == 158400);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2579 + "'", int20 == 2579);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 71.13367697511495d + "'", double22 == 71.13367697511495d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int int1 = calculadora.Matematica.factorial(4576);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        int int17 = calculadora0.somar(296384028, 1502);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.raizQuadrada((-88716792));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 296385530 + "'", int17 == 296385530);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int int1 = calculadora.Matematica.factorial(1416619201);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int int1 = calculadora.Matematica.factorial(9431);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        int int34 = calculadora0.subtrair((-2526), 0);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2526) + "'", int34 == (-2526));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        boolean boolean1 = calculadora.Matematica.isPrime((-3390));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        boolean boolean1 = calculadora.Matematica.isPrime(7086);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        boolean boolean1 = calculadora.Matematica.isPrime((-1255225024));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.dividir((int) (short) -1, 2104871);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.dividir(47633, (-88716792));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int1 = calculadora.Matematica.sum(2579);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3326910 + "'", int1 == 3326910);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        int int28 = calculadora0.somar(10896601, 153);
        double double30 = calculadora0.raizQuadrada(0);
        int int33 = calculadora0.dividir(71, 21187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10896754 + "'", int28 == 10896754);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = calculadora0.raizQuadrada((-1333113776));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        int int11 = calculadora0.somar(5446651, 0);
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5446651 + "'", int11 == 5446651);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.multiplicar(11781, 9);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia(304857, (-1255225024));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 106029 + "'", int17 == 106029);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        double double27 = calculadora0.raizQuadrada(5512);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 242.63140769488191d + "'", double19 == 242.63140769488191d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1313662592 + "'", int25 == 1313662592);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 74.24284477308234d + "'", double27 == 74.24284477308234d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        int int14 = calculadora0.subtrair((-2640203), 529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2640732) + "'", int14 == (-2640732));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double15 = calculadora0.porcentagem((-32), (-2640203));
        double double17 = calculadora0.raizQuadrada(53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.4486496E7d + "'", double15 == 8.4486496E7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.280109889280518d + "'", double17 == 7.280109889280518d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.lang.Class<?> wildcardClass30 = calculadora0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        int int29 = calculadora0.somar((-1530), (-3390));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47983 + "'", int23 == 47983);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 310 + "'", int26 == 310);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-4920) + "'", int29 == (-4920));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        boolean boolean1 = calculadora.Matematica.isPrime(1056240804);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        int int14 = calculadora0.dividir(6579, 92);
        int int17 = calculadora0.multiplicar((-8), (-499035486));
        int int20 = calculadora0.subtrair((-32), (-54));
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-302683408) + "'", int17 == (-302683408));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        int int9 = calculadora0.multiplicar(1379, (-369360));
        int int12 = calculadora0.subtrair((-10472177), 1313662592);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-509347440) + "'", int9 == (-509347440));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1324134769) + "'", int12 == (-1324134769));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar(157641, 1235336173);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = calculadora0.potencia((-10000), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1235493814 + "'", int6 == 1235493814);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.multiplicar((-1), 10);
        int int23 = calculadora0.somar(361218, (-31));
        double double26 = calculadora0.porcentagem(1416619201, (-90796998));
        java.lang.Class<?> wildcardClass27 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 361187 + "'", int23 == 361187);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-7.1241735E8d) + "'", double26 == (-7.1241735E8d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int1 = calculadora.Matematica.factorial(9000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        int int17 = calculadora0.somar(296384028, 1502);
        int int20 = calculadora0.somar((-36), 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 296385530 + "'", int17 == 296385530);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        int int29 = calculadora0.subtrair(106, 6579);
        int int32 = calculadora0.dividir((-10000), (-10472177));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0896601E8d) + "'", double26 == (-1.0896601E8d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-6473) + "'", int29 == (-6473));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        double double19 = calculadora0.potencia((-1642756327), 5051035);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.795223369E9d + "'", double19 == 1.795223369E9d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-90), 100);
        double double12 = calculadora0.porcentagem(71, (int) (byte) -1);
        int int15 = calculadora0.multiplicar(12758818, (-1333113776));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9000) + "'", int9 == (-9000));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-71.0d) + "'", double12 == (-71.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-785853792) + "'", int15 == (-785853792));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.multiplicar((int) '4', 58870);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculadora0.raizQuadrada((-7829438));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3061240 + "'", int14 == 3061240);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        double double16 = calculadora0.porcentagem(5512, 159359912);
        int int19 = calculadora0.somar(97, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.076460736E9d) + "'", double16 == (-2.076460736E9d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 145 + "'", int19 == 145);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        boolean boolean1 = calculadora.Matematica.isPrime(518356800);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int int1 = calculadora.Matematica.factorial(736014722);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        boolean boolean1 = calculadora.Matematica.isPrime((-54));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        boolean boolean1 = calculadora.Matematica.isPrime(40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.porcentagem((-2109870), 15764);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia(4995, (-1056241881));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.099747688E9d + "'", double19 == 1.099747688E9d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.dividir((-10469705), 5512);
        double double26 = calculadora0.porcentagem(70714490, 631809017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1899) + "'", int23 == (-1899));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.28469999E9d) + "'", double26 == (-1.28469999E9d));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem((-2147483648), 1235336173);
        int int20 = calculadora0.dividir((-385386529), 310);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.147483648E9d) + "'", double17 == (-2.147483648E9d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1243182) + "'", int20 == (-1243182));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.lang.Class<?> wildcardClass28 = calculadora0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.multiplicar((-1), 10);
        int int23 = calculadora0.somar(361218, (-31));
        int int26 = calculadora0.multiplicar(39, 274911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 361187 + "'", int23 == 361187);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10721529 + "'", int26 == 10721529);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int1 = calculadora.Matematica.factorial(1056240804);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        double double34 = calculadora0.porcentagem(250156910, 1048044852);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2.92563032E8d + "'", double34 == 2.92563032E8d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int1 = calculadora.Matematica.sum(1379021495);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1277355836) + "'", int1 == (-1277355836));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.dividir(53, 12253726);
        int int19 = calculadora0.multiplicar((int) (byte) 100, 232201856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1745349120 + "'", int19 == 1745349120);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = calculadora0.raizQuadrada((-4719836));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47983 + "'", int23 == 47983);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 92 + "'", int26 == 92);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int int1 = calculadora.Matematica.factorial(3300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(1056240804, (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 630036720 + "'", int16 == 630036720);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int int1 = calculadora.Matematica.factorial(1346818465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int int1 = calculadora.Matematica.sum(5150);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13263826 + "'", int1 == 13263826);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        double double9 = calculadora0.porcentagem((-2443669), 2371);
        int int12 = calculadora0.subtrair((-500309854), 12758918);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = calculadora0.potencia((-1915836108), (-2640732));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.498971903E9d) + "'", double9 == (-1.498971903E9d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-513068772) + "'", int12 == (-513068772));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        boolean boolean1 = calculadora.Matematica.isPrime(869209328);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int1 = calculadora.Matematica.factorial(70714490);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double9 = calculadora0.porcentagem(613, 53);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32489.0d + "'", double9 == 32489.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int1 = calculadora.Matematica.sum((-302683408));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.dividir(53, 12253726);
        int int19 = calculadora0.multiplicar((int) ' ', 100);
        int int22 = calculadora0.dividir(0, 5051035);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3200 + "'", int19 == 3200);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int int1 = calculadora.Matematica.factorial((-2526));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        boolean boolean1 = calculadora.Matematica.isPrime(9000);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        int int11 = calculadora0.multiplicar(1416619201, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 649754420 + "'", int11 == 649754420);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        boolean boolean1 = calculadora.Matematica.isPrime(736014722);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        double double10 = calculadora0.raizQuadrada(158400);
        java.lang.Class<?> wildcardClass11 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 397.994974842648d + "'", double10 == 397.994974842648d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int int1 = calculadora.Matematica.sum((-513068772));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.Class<?> wildcardClass32 = calculadora0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        int int23 = calculadora0.subtrair((-1915836162), (-54));
        int int26 = calculadora0.multiplicar((-4719836), 4950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1915836108) + "'", int23 == (-1915836108));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1888351720) + "'", int26 == (-1888351720));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int1 = calculadora.Matematica.factorial((-430));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        double double36 = calculadora0.raizQuadrada(5);
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2.23606797749979d + "'", double36 == 2.23606797749979d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.multiplicar(10721529, 5115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-993954013) + "'", int6 == (-993954013));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        double double20 = calculadora0.porcentagem(3400, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int1 = calculadora.Matematica.factorial(1216785600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        boolean boolean1 = calculadora.Matematica.isPrime((-1899));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.porcentagem((int) 'a', 5051035);
        int int18 = calculadora0.dividir(0, 50510);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.89950395E8d + "'", double15 == 4.89950395E8d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        boolean boolean1 = calculadora.Matematica.isPrime((-499030496));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        boolean boolean1 = calculadora.Matematica.isPrime((-4920));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int int1 = calculadora.Matematica.sum((-1168394692));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int1 = calculadora.Matematica.sum(5051045);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 477452415 + "'", int1 == 477452415);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        int int19 = calculadora0.multiplicar(0, 1);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.dividir((int) (short) 1, 157641);
        int int22 = calculadora0.subtrair((int) (byte) -1, (int) 'a');
        double double25 = calculadora0.porcentagem((int) '#', 50511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1767885.0d + "'", double25 == 1767885.0d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.somar((-3399), 9);
        double double13 = calculadora0.raizQuadrada(48);
        int int16 = calculadora0.dividir(367830, 39);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.raizQuadrada((-1888351720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3390) + "'", int11 == (-3390));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 6.928203230275509d + "'", double13 == 6.928203230275509d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9431 + "'", int16 == 9431);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int int1 = calculadora.Matematica.factorial((-31));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int int1 = calculadora.Matematica.sum(2104871);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-961108980) + "'", int1 == (-961108980));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.somar((int) (short) -1, 33);
        double double22 = calculadora0.raizQuadrada(50511);
        double double25 = calculadora0.porcentagem((-9035), 71);
        double double27 = calculadora0.raizQuadrada((int) '4');
        java.lang.Class<?> wildcardClass28 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 224.74652388857987d + "'", double22 == 224.74652388857987d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-641485.0d) + "'", double25 == (-641485.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.211102550927978d + "'", double27 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        int int42 = calculadora0.somar(0, (-1056240805));
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1056240805) + "'", int42 == (-1056240805));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double17 = calculadora0.potencia((-678042), 0);
        int int20 = calculadora0.somar((-44727), 11188);
        int int23 = calculadora0.somar(5191, 232201856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-33539) + "'", int20 == (-33539));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 232207047 + "'", int23 == 232207047);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int1 = calculadora.Matematica.sum(560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 157081 + "'", int1 == 157081);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        double double30 = calculadora0.raizQuadrada(1668074498);
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 40842.06774882976d + "'", double30 == 40842.06774882976d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada(100);
        int int5 = calculadora0.somar(53, 561);
        double double8 = calculadora0.potencia(290577660, 296384028);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 614 + "'", int5 == 614);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.multiplicar(47983, 0);
        double double6 = calculadora0.potencia(97, (int) ' ');
        double double9 = calculadora0.potencia((-430), 3200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.47362047E8d) + "'", double6 == (-4.47362047E8d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double16 = calculadora0.raizQuadrada(2526);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.25932749251625d + "'", double16 == 50.25932749251625d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.somar(50510, (int) (byte) 1);
        int int23 = calculadora0.somar(5051, (-2109870));
        double double25 = calculadora0.raizQuadrada((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50511 + "'", int20 == 50511);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2104819) + "'", int23 == (-2104819));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double19 = calculadora0.raizQuadrada((int) ' ');
        int int22 = calculadora0.dividir(649, (-108366441));
        int int25 = calculadora0.multiplicar((-88716792), (-784238464));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.656854249492381d + "'", double19 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 568378368 + "'", int25 == 568378368);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.multiplicar((int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.potencia((-86), (-561033704));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3500 + "'", int14 == 3500);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.multiplicar((-2535), (-204480));
        int int14 = calculadora0.dividir(0, (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 518356800 + "'", int11 == 518356800);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int1 = calculadora.Matematica.sum(8197332);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1399098829) + "'", int1 == (-1399098829));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        boolean boolean1 = calculadora.Matematica.isPrime((-1056241881));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int1 = calculadora.Matematica.sum(66179929);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-620768219) + "'", int1 == (-620768219));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.3549752E8d + "'", double19 == 1.3549752E8d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        int int9 = calculadora0.somar((int) (byte) 1, 2526);
        int int12 = calculadora0.somar(92, 649);
        double double15 = calculadora0.porcentagem(4576, 41);
        double double17 = calculadora0.raizQuadrada(3061262);
        int int20 = calculadora0.somar(58870, 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 741 + "'", int12 == 741);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 187616.0d + "'", double15 == 187616.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1749.6462499602599d + "'", double17 == 1749.6462499602599d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 58967 + "'", int20 == 58967);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int1 = calculadora.Matematica.factorial(869209328);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(0, 10);
        int int17 = calculadora0.dividir(52, (int) (byte) -1);
        int int20 = calculadora0.somar(1963777343, 1963777243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-52) + "'", int17 == (-52));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-367412710) + "'", int20 == (-367412710));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(53, 143);
        int int18 = calculadora0.subtrair(50511, 157641);
        java.lang.Class<?> wildcardClass19 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.50920227E8d) + "'", double15 == (-9.50920227E8d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-107130) + "'", int18 == (-107130));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.dividir(43, 741);
        int int15 = calculadora0.subtrair(68559809, 1389423872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1320864063) + "'", int15 == (-1320864063));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.subtrair((int) (short) 10, (-54));
        int int14 = calculadora0.subtrair(68284800, 2104871);
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 66179929 + "'", int14 == 66179929);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        boolean boolean1 = calculadora.Matematica.isPrime((-19183653));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        double double11 = calculadora0.potencia(250156910, 6579);
        double double14 = calculadora0.porcentagem(5051035, 8197332);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.potencia((-2104819), (-4232));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.52610518E9d + "'", double14 == 1.52610518E9d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(50608, (int) (short) 10);
        int int22 = calculadora0.dividir(10896601, 70714490);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = calculadora0.raizQuadrada((-270610380));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        double double10 = calculadora0.raizQuadrada(97);
        int int13 = calculadora0.somar((int) (short) 100, 3300);
        int int16 = calculadora0.multiplicar((-1301739248), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.848857801796104d + "'", double10 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3400 + "'", int13 == 3400);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1309461472 + "'", int16 == 1309461472);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        int int35 = calculadora0.subtrair(3400, 50510);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-47110) + "'", int35 == (-47110));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int int1 = calculadora.Matematica.factorial(194433408);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair((-108366441), (-961108980));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 852742539 + "'", int17 == 852742539);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int int1 = calculadora.Matematica.factorial((-44727));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        int int19 = calculadora0.dividir(10, 5060);
        int int22 = calculadora0.multiplicar((-1243182), (-1104039575));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 902981410 + "'", int22 == 902981410);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        int int20 = calculadora0.multiplicar(529, 0);
        int int23 = calculadora0.dividir((-1168394692), 736014722);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.multiplicar(47983, 0);
        double double6 = calculadora0.potencia(97, (int) ' ');
        double double8 = calculadora0.raizQuadrada(232201856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.47362047E8d) + "'", double6 == (-4.47362047E8d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15238.171018859186d + "'", double8 == 15238.171018859186d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int int1 = calculadora.Matematica.sum((-2109725));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int1 = calculadora.Matematica.sum(9000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40504501 + "'", int1 == 40504501);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        double double9 = calculadora0.potencia(48, 649754420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.somar(12758826, (-8));
        int int17 = calculadora0.dividir(2371, 631809017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12758818 + "'", int14 == 12758818);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        boolean boolean1 = calculadora.Matematica.isPrime(11781);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int int1 = calculadora.Matematica.sum(1963777243);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 185532442 + "'", int1 == 185532442);
    }
}

