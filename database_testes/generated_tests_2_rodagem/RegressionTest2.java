package generated_tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        int int1 = calculadora.Matematica.factorial(1309461472);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int1 = calculadora.Matematica.factorial((-1571045116));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int1 = calculadora.Matematica.sum(12253726);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 878234322 + "'", int1 == 878234322);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        double double11 = calculadora0.potencia(4908, 100);
        double double14 = calculadora0.porcentagem(5191, (-500302768));
        int int17 = calculadora0.somar((-5262), 342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.383545392E9d + "'", double14 == 1.383545392E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4920) + "'", int17 == (-4920));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, (-499035486));
        double double19 = calculadora0.raizQuadrada(6579);
        int int22 = calculadora0.dividir((-1669035839), 58870);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 499035496 + "'", int17 == 499035496);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 81.11103500757464d + "'", double19 == 81.11103500757464d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-28351) + "'", int22 == (-28351));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.porcentagem((int) (byte) 100, 99);
        double double22 = calculadora0.porcentagem((int) (short) -1, (-500309854));
        double double25 = calculadora0.potencia(70418700, 3500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9900.0d + "'", double19 == 9900.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.00309854E8d + "'", double22 == 5.00309854E8d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.multiplicar((int) (short) 100, (int) '#');
        int int17 = calculadora0.dividir((-2104819), (-1301739248));
        int int20 = calculadora0.subtrair((-499030496), (-10000));
        int int23 = calculadora0.somar(9431, 261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3500 + "'", int14 == 3500);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-499020496) + "'", int20 == (-499020496));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9692 + "'", int23 == 9692);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        double double17 = calculadora0.potencia((-1810759117), 2526);
        int int20 = calculadora0.somar(556209, 1745349123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-7.00132967E8d) + "'", double17 == (-7.00132967E8d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1745905332 + "'", int20 == 1745905332);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int int1 = calculadora.Matematica.sum((-10887553));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int int1 = calculadora.Matematica.sum(10887601);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-615473399) + "'", int1 == (-615473399));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        double double12 = calculadora0.porcentagem(3061240, 5446651);
        int int15 = calculadora0.somar(561, (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = calculadora0.potencia((-1058625552), (-4920));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.42864168E8d + "'", double12 == 4.42864168E8d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 560 + "'", int15 == 560);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.multiplicar((int) (byte) 100, 33);
        double double15 = calculadora0.potencia((-2526), 158400);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.raizQuadrada((-29));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3300 + "'", int12 == 3300);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        boolean boolean1 = calculadora.Matematica.isPrime(741);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int int1 = calculadora.Matematica.factorial(1389423872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int1 = calculadora.Matematica.factorial((-2109725));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        boolean boolean1 = calculadora.Matematica.isPrime(50510);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.Class<?> wildcardClass46 = calculadora0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(50608, (int) (short) 10);
        int int22 = calculadora0.multiplicar((-1288085606), 47633);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5060 + "'", int19 == 5060);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1773847238) + "'", int22 == (-1773847238));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        double double5 = calculadora0.porcentagem(2, 720);
        double double8 = calculadora0.porcentagem(1168757572, 310);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1440.0d + "'", double5 == 1440.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.537594456E9d + "'", double8 == 1.537594456E9d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(12258676, 0);
        double double20 = calculadora0.porcentagem(946, (-1255225024));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.031899008E9d) + "'", double20 == (-2.031899008E9d));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int int1 = calculadora.Matematica.factorial(667733912);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int int1 = calculadora.Matematica.sum((-509499484));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(0, (-1));
        double double23 = calculadora0.porcentagem(25523850, (-90796998));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.913892028E9d) + "'", double23 == (-1.913892028E9d));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int1 = calculadora.Matematica.factorial(3200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        int int19 = calculadora0.somar((int) (byte) -1, 41);
        int int22 = calculadora0.somar((int) (short) 0, 11188);
        int int25 = calculadora0.dividir(720, (-869053218));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11188 + "'", int22 == 11188);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int int1 = calculadora.Matematica.factorial(187124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        double double10 = calculadora0.raizQuadrada(158400);
        int int13 = calculadora0.dividir((-556358958), 270608481);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 397.994974842648d + "'", double10 == 397.994974842648d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        double double12 = calculadora0.porcentagem(0, (-733081745));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        double double11 = calculadora0.potencia(250156910, 6579);
        double double14 = calculadora0.porcentagem(5051035, 8197332);
        double double17 = calculadora0.porcentagem(5781701, (-15763));
        int int20 = calculadora0.dividir(43, (-1744965562));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.52610518E9d + "'", double14 == 1.52610518E9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.42639647E8d) + "'", double17 == (-9.42639647E8d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(1577012793, (-303582066));
        int int22 = calculadora0.dividir((-21329), 630029869);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5) + "'", int19 == (-5));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int int1 = calculadora.Matematica.factorial((-1321388763));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        int int19 = calculadora0.somar((int) (byte) -1, 41);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.potencia(552420, (-1861731516));
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.potencia((-100), 15764);
        int int20 = calculadora0.dividir(39, 157694);
        int int23 = calculadora0.subtrair(185532442, (-1411303535));
        // The following exception was thrown during execution in test generation
        try {
            double double26 = calculadora0.potencia((-615473399), (-9000));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1596835977 + "'", int23 == 1596835977);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        double double13 = calculadora0.porcentagem(0, (-620768219));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double13 = calculadora0.raizQuadrada(157641);
        double double16 = calculadora0.potencia(1431, 232201856);
        int int19 = calculadora0.somar((-1745154368), (-1324134769));
        int int22 = calculadora0.multiplicar(0, 6579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 397.04030022152665d + "'", double13 == 397.04030022152665d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.17052417E8d + "'", double16 == 1.17052417E8d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1225678159 + "'", int19 == 1225678159);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        double double9 = calculadora0.potencia(0, 12758826);
        int int12 = calculadora0.subtrair(24, (-635542910));
        int int15 = calculadora0.subtrair(6126751, (-1571993291));
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 635542934 + "'", int12 == 635542934);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1578120042 + "'", int15 == 1578120042);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.multiplicar((-626166995), (-6473));
        double double9 = calculadora0.porcentagem(6573, (-3301));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = calculadora0.potencia((-1320864063), (-16547));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1270168789) + "'", int6 == (-1270168789));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.1697473E7d) + "'", double9 == (-2.1697473E7d));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        int int32 = calculadora0.subtrair(159359912, 250156910);
        // The following exception was thrown during execution in test generation
        try {
            double double34 = calculadora0.raizQuadrada((-961108260));
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0896601E8d) + "'", double26 == (-1.0896601E8d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-10472177) + "'", int29 == (-10472177));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-90796998) + "'", int32 == (-90796998));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int int1 = calculadora.Matematica.sum((-1056241881));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        double double31 = calculadora0.porcentagem(0, 477452415);
        int int34 = calculadora0.somar(32, (-367412710));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10896754 + "'", int28 == 10896754);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-367412678) + "'", int34 == (-367412678));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        double double17 = calculadora0.potencia((int) (short) 10, 2756);
        int int20 = calculadora0.dividir(261, 105199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double9 = calculadora0.porcentagem(613, 53);
        int int12 = calculadora0.somar(1048044852, 15764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32489.0d + "'", double9 == 32489.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1048060616 + "'", int12 == 1048060616);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int int1 = calculadora.Matematica.sum((-10469705));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        int int16 = calculadora0.dividir((-31), 10896601);
        int int19 = calculadora0.dividir(2472, 1623691425);
        int int22 = calculadora0.dividir((-90), (-6473));
        int int25 = calculadora0.multiplicar(326863206, 631805627);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2035342974) + "'", int25 == (-2035342974));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean1 = calculadora.Matematica.isPrime(946);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        double double23 = calculadora0.porcentagem(50510, 0);
        double double25 = calculadora0.raizQuadrada(367830);
        int int28 = calculadora0.subtrair(304857, (-10472177));
        int int31 = calculadora0.dividir(0, (-88716792));
        int int34 = calculadora0.subtrair((-1571993291), 97864794);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 606.4899009876422d + "'", double25 == 606.4899009876422d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10777034 + "'", int28 == 10777034);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1669858085) + "'", int34 == (-1669858085));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int1 = calculadora.Matematica.sum(10896601);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1370807707) + "'", int1 == (-1370807707));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int1 = calculadora.Matematica.factorial((-97864074));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(21644910, 71);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculadora0.potencia(108, (-2443617));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 304857 + "'", int13 == 304857);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int1 = calculadora.Matematica.sum((-2104819));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.dividir(321403357, 556209);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 577 + "'", int20 == 577);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        double double11 = calculadora0.potencia(196396861, 10721529);
        double double13 = calculadora0.raizQuadrada(250156910);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.395201507E9d) + "'", double11 == (-1.395201507E9d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15816.349452386286d + "'", double13 == 15816.349452386286d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.somar(71, (-1899));
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1828) + "'", int16 == (-1828));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        double double26 = calculadora0.raizQuadrada((int) (short) 1);
        int int29 = calculadora0.somar(350319824, (-140302162));
        java.lang.Class<?> wildcardClass30 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 70.35623639735144d + "'", double21 == 70.35623639735144d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.562233379E9d) + "'", double24 == (-1.562233379E9d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 210017662 + "'", int29 == 210017662);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.somar(12758826, (-8));
        int int17 = calculadora0.subtrair(70714590, 20);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia((-97864074), (-204480));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12758818 + "'", int14 == 12758818);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 70714570 + "'", int17 == 70714570);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        int int9 = calculadora0.multiplicar(1379, (-369360));
        int int12 = calculadora0.dividir(21703872, 70714490);
        double double14 = calculadora0.raizQuadrada(56);
        double double17 = calculadora0.porcentagem(66179929, 552420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-509347440) + "'", int9 == (-509347440));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.483314773547883d + "'", double14 == 7.483314773547883d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.54754628E8d + "'", double17 == 3.54754628E8d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
            double double24 = calculadora0.raizQuadrada((-1861734272));
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        boolean boolean1 = calculadora.Matematica.isPrime(4908);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int1 = calculadora.Matematica.sum(1053798212);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 191028395 + "'", int1 == 191028395);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        int int19 = calculadora0.multiplicar((-64), 12253726);
        int int22 = calculadora0.multiplicar((-620768219), 47624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-784238464) + "'", int19 == (-784238464));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1205763288) + "'", int22 == (-1205763288));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int int1 = calculadora.Matematica.factorial(499035496);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        double double19 = calculadora0.raizQuadrada(43);
        int int22 = calculadora0.somar(1547080348, (int) (short) 0);
        int int25 = calculadora0.multiplicar((-6473), 0);
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.557438524302d + "'", double19 == 6.557438524302d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1547080348 + "'", int22 == 1547080348);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double8 = calculadora0.potencia((int) (short) 1, 10);
        int int11 = calculadora0.multiplicar(5, (-1810759158));
        double double13 = calculadora0.raizQuadrada(50511);
        int int16 = calculadora0.somar(2579, 285498082);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-463861198) + "'", int11 == (-463861198));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 224.74652388857987d + "'", double13 == 224.74652388857987d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 285500661 + "'", int16 == 285500661);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.potencia((-302683408), 0);
        int int18 = calculadora0.multiplicar(6, (-16310679));
        int int21 = calculadora0.multiplicar(1048044852, (-108139200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-97864074) + "'", int18 == (-97864074));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1859023104 + "'", int21 == 1859023104);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.subtrair(5051, 143);
        int int20 = calculadora0.dividir(1379021495, (-2109870));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4908 + "'", int17 == 4908);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-653) + "'", int20 == (-653));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        int int20 = calculadora0.subtrair(1379, (-1056240805));
        double double23 = calculadora0.porcentagem(1030, 1216785600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1056242184 + "'", int20 == 1056242184);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-8.41282432E8d) + "'", double23 == (-8.41282432E8d));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int int1 = calculadora.Matematica.sum((-1888351720));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int1 = calculadora.Matematica.sum(1547080348);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1425961175 + "'", int1 == 1425961175);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        int int28 = calculadora0.somar((-140302162), 2371);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-108366441) + "'", int19 == (-108366441));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 21339 + "'", int22 == 21339);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.170426081E9d + "'", double25 == 1.170426081E9d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-140299791) + "'", int28 == (-140299791));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, (-499035486));
        double double19 = calculadora0.raizQuadrada(6579);
        int int22 = calculadora0.multiplicar((-1669858085), 644062743);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 499035496 + "'", int17 == 499035496);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 81.11103500757464d + "'", double19 == 81.11103500757464d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1736958381 + "'", int22 == 1736958381);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        double double12 = calculadora0.porcentagem(3061240, 5446651);
        double double14 = calculadora0.raizQuadrada(1056240804);
        int int17 = calculadora0.somar(14, 367830);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.42864168E8d + "'", double12 == 4.42864168E8d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32499.858522768987d + "'", double14 == 32499.858522768987d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 367844 + "'", int17 == 367844);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        int int19 = calculadora0.subtrair(614, 108367055);
        double double22 = calculadora0.potencia((-107194), 157641);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calculadora0.dividir(6578, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-108366441) + "'", int19 == (-108366441));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.multiplicar(43, (-10));
        int int23 = calculadora0.multiplicar(27083, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-430) + "'", int20 == (-430));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        int int20 = calculadora0.multiplicar(2, 2756);
        int int23 = calculadora0.somar(0, (-208571456));
        int int26 = calculadora0.dividir(539, 869209328);
        double double28 = calculadora0.raizQuadrada(261779361);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5512 + "'", int20 == 5512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-208571456) + "'", int23 == (-208571456));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 16179.597059259542d + "'", double28 == 16179.597059259542d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.dividir((-1828), (-36));
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        int int11 = calculadora0.somar(9, (-1076));
        int int14 = calculadora0.subtrair((-36), 70714490);
        int int17 = calculadora0.subtrair(304857, 204480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1067) + "'", int11 == (-1067));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-70714526) + "'", int14 == (-70714526));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100377 + "'", int17 == 100377);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        boolean boolean1 = calculadora.Matematica.isPrime((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(0, 10);
        int int17 = calculadora0.subtrair(5781701, 14);
        double double19 = calculadora0.raizQuadrada(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5781687 + "'", int17 == 5781687);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        int int32 = calculadora0.subtrair(159359912, 250156910);
        double double35 = calculadora0.potencia(426942012, 935867520);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-90796998) + "'", int32 == (-90796998));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        double double31 = calculadora0.potencia(4296, 1389419296);
        // The following exception was thrown during execution in test generation
        try {
            double double34 = calculadora0.potencia((-255064446), (-2443669));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-630029869) + "'", int28 == (-630029869));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        int int16 = calculadora0.dividir((-31), 10896601);
        int int19 = calculadora0.dividir(2472, 1623691425);
        int int22 = calculadora0.subtrair(5781701, 631809017);
        int int25 = calculadora0.multiplicar(11188, 1216785600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-626027316) + "'", int22 == (-626027316));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1649035520) + "'", int25 == (-1649035520));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        boolean boolean1 = calculadora.Matematica.isPrime(188191);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, (-15763));
        int int23 = calculadora0.subtrair(5150, (-499030496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 499035646 + "'", int23 == 499035646);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        boolean boolean1 = calculadora.Matematica.isPrime(188806);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        double double20 = calculadora0.potencia((-10), 14);
        double double23 = calculadora0.porcentagem(6126751, 108);
        int int26 = calculadora0.somar((-1056240805), (-1812869028));
        int int29 = calculadora0.dividir(3453, 1235493814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.76447232E8d + "'", double20 == 2.76447232E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.61689108E8d + "'", double23 == 6.61689108E8d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1425857463 + "'", int26 == 1425857463);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int int1 = calculadora.Matematica.factorial((-10887553));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        int int1 = calculadora.Matematica.factorial((-1828));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        int int19 = calculadora0.multiplicar(355015120, 1056240804);
        int int22 = calculadora0.dividir(308750140, 1578120042);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1255225024) + "'", int19 == (-1255225024));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.dividir(362880, 153);
        double double9 = calculadora0.potencia(10895881, 15);
        int int12 = calculadora0.subtrair(1577012793, 21703872);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2371 + "'", int6 == 2371);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.316489543E9d) + "'", double9 == (-1.316489543E9d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1555308921 + "'", int12 == 1555308921);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.multiplicar(47983, 0);
        int int6 = calculadora0.multiplicar(5115, 4990);
        double double9 = calculadora0.porcentagem(2019916288, 1389423872);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25523850 + "'", int6 == 25523850);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.01072384E8d + "'", double9 == 3.01072384E8d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double9 = calculadora0.porcentagem(613, 53);
        int int12 = calculadora0.multiplicar(0, (-2057542204));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32489.0d + "'", double9 == 32489.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(0, 10);
        int int17 = calculadora0.dividir(52, (int) (byte) -1);
        int int20 = calculadora0.multiplicar((-10000), (-2443669));
        // The following exception was thrown during execution in test generation
        try {
            int int23 = calculadora0.dividir((-869053218), 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1333113776) + "'", int20 == (-1333113776));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        int int22 = calculadora0.multiplicar(19371844, 15);
        int int25 = calculadora0.multiplicar(561, 1547080348);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 290577660 + "'", int22 == 290577660);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 328681436 + "'", int25 == 328681436);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.potencia((int) (byte) -1, 10721529);
        double double20 = calculadora0.porcentagem(354645, 79326074);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.5972493E8d + "'", double20 == 5.5972493E8d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.dividir((int) (byte) 100, (int) (byte) -1);
        double double20 = calculadora0.potencia(0, 50440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-100) + "'", int17 == (-100));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        double double23 = calculadora0.porcentagem((-459480627), 153);
        int int26 = calculadora0.multiplicar(43, 499035486);
        double double28 = calculadora0.raizQuadrada(1597);
        double double31 = calculadora0.porcentagem(47983, (-306362100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.581059195E9d) + "'", double23 == (-1.581059195E9d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-16310582) + "'", int26 == (-16310582));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 39.96248240537617d + "'", double28 == 39.96248240537617d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.500409908E9d + "'", double31 == 1.500409908E9d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        int int32 = calculadora0.multiplicar(431956, (-993954013));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2006105212 + "'", int32 == 2006105212);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        int int29 = calculadora0.subtrair((-303582066), 935867520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 157694 + "'", int23 == 157694);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1915836162) + "'", int26 == (-1915836162));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1239449586) + "'", int29 == (-1239449586));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        boolean boolean1 = calculadora.Matematica.isPrime((-1104039575));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.porcentagem(108, 50511);
        double double13 = calculadora0.raizQuadrada(3326910);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = calculadora0.potencia(1075418326, (-205973440));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5455188.0d + "'", double11 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1823.9819078050089d + "'", double13 == 1823.9819078050089d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.potencia((int) (byte) -1, 50608);
        double double18 = calculadora0.porcentagem(48, 1056240804);
        int int21 = calculadora0.dividir((int) '#', (-1277355836));
        // The following exception was thrown during execution in test generation
        try {
            double double24 = calculadora0.potencia((int) '4', (-839593119));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.4004896E8d) + "'", double18 == (-8.4004896E8d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.subtrair(3500, 4576);
        int int15 = calculadora0.dividir(5887, 1597);
        int int18 = calculadora0.somar(1366467329, 0);
        int int21 = calculadora0.somar(5202153, 50608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1076) + "'", int12 == (-1076));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1366467329 + "'", int18 == 1366467329);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5252761 + "'", int21 == 5252761);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.potencia((-100), 15764);
        double double20 = calculadora0.porcentagem(2527, (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-227430.0d) + "'", double20 == (-227430.0d));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int1 = calculadora.Matematica.sum((-357765));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        boolean boolean1 = calculadora.Matematica.isPrime((-1649035520));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        boolean boolean1 = calculadora.Matematica.isPrime(3061262);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        int int34 = calculadora0.somar(2527, 41);
        double double37 = calculadora0.porcentagem(5512, 259561);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2568 + "'", int34 == 2568);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.430700232E9d + "'", double37 == 1.430700232E9d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.dividir((-498894592), 354645);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1406) + "'", int17 == (-1406));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.potencia(9, 14);
        double double22 = calculadora0.porcentagem(1416619201, (-513068772));
        double double24 = calculadora0.raizQuadrada(1133282586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.796636465E9d + "'", double19 == 1.796636465E9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.58164708E8d) + "'", double22 == (-4.58164708E8d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 33664.26274255832d + "'", double24 == 33664.26274255832d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        boolean boolean1 = calculadora.Matematica.isPrime(67587);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        boolean boolean1 = calculadora.Matematica.isPrime(232207047);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int int1 = calculadora.Matematica.sum((-2098860829));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int1 = calculadora.Matematica.sum((-3269));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.potencia((int) (byte) 1, (int) ' ');
        int int13 = calculadora0.dividir((-9000), 188806);
        int int16 = calculadora0.subtrair(21645002, (-29));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.potencia(1578120042, (-499030496));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        double double28 = calculadora0.potencia(2104871, 1128677140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.656854249492381d + "'", double25 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.06723169E8d + "'", double28 == 2.06723169E8d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        int int35 = calculadora0.subtrair(518356800, (int) (short) 10);
        int int38 = calculadora0.multiplicar((-10472177), (-646283));
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 518356790 + "'", int35 == 518356790);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-878490405) + "'", int38 == (-878490405));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int1 = calculadora.Matematica.sum(499035486);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1688769038) + "'", int1 == (-1688769038));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.multiplicar((-1), 10);
        int int23 = calculadora0.somar(361218, (-31));
        double double25 = calculadora0.raizQuadrada(20);
        double double28 = calculadora0.porcentagem((-9035), (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 361187 + "'", int23 == 361187);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.47213595499958d + "'", double25 == 4.47213595499958d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 777010.0d + "'", double28 == 777010.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        int int1 = calculadora.Matematica.factorial(350115344);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair(15764, 4576);
        int int20 = calculadora0.multiplicar((-518356768), 275009);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11188 + "'", int17 == 11188);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1483110624 + "'", int20 == 1483110624);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        double double17 = calculadora0.porcentagem((-567847068), 99);
        int int20 = calculadora0.multiplicar((-2147483648), 852742800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-3.82284884E8d) + "'", double17 == (-3.82284884E8d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.multiplicar((-1), 10);
        int int23 = calculadora0.multiplicar((-302683408), 614);
        int int26 = calculadora0.somar(4990, (-1067));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1164018784) + "'", int23 == (-1164018784));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3923 + "'", int26 == 3923);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        int int1 = calculadora.Matematica.factorial((-270610380));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int int1 = calculadora.Matematica.sum((-677952));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        double double11 = calculadora0.potencia(4908, 100);
        double double14 = calculadora0.porcentagem(5191, (-500302768));
        int int17 = calculadora0.somar(1527806659, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.383545392E9d + "'", double14 == 1.383545392E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1527806662 + "'", int17 == 1527806662);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double8 = calculadora0.raizQuadrada(40);
        double double11 = calculadora0.porcentagem(3061240, 21703872);
        int int14 = calculadora0.somar(0, (-70714526));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.324555320336759d + "'", double8 == 6.324555320336759d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.912019456E9d + "'", double11 == 1.912019456E9d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-70714526) + "'", int14 == (-70714526));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        int int17 = calculadora0.somar(296384028, 1502);
        int int20 = calculadora0.somar(946, (-21329));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 296385530 + "'", int17 == 296385530);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-20383) + "'", int20 == (-20383));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        int int20 = calculadora0.multiplicar(12258676, 1379021495);
        double double22 = calculadora0.raizQuadrada(106029);
        int int25 = calculadora0.multiplicar(1246, 204480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-687913492) + "'", int20 == (-687913492));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 325.6209452722598d + "'", double22 == 325.6209452722598d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 254782080 + "'", int25 == 254782080);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        double double20 = calculadora0.potencia(43, 97);
        int int23 = calculadora0.somar((-518356831), (-463861759));
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.083380139E9d + "'", double20 == 1.083380139E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-982218590) + "'", int23 == (-982218590));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        boolean boolean1 = calculadora.Matematica.isPrime((-386128000));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.potencia((-1056240805), 153);
        int int17 = calculadora0.multiplicar(3500, (-875346393));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.787388357E9d) + "'", double14 == (-1.787388357E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1400693452) + "'", int17 == (-1400693452));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        int int1 = calculadora.Matematica.factorial((-1306459085));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        int int1 = calculadora.Matematica.factorial((-14691173));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        double double19 = calculadora0.raizQuadrada(5051000);
        double double22 = calculadora0.potencia(40, 31);
        double double25 = calculadora0.porcentagem((-1876377666), (-500302768));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.71331088E9d) + "'", double25 == (-1.71331088E9d));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.dividir(53, 12253726);
        int int19 = calculadora0.somar((-44193860), 185532442);
        double double22 = calculadora0.porcentagem((-1104039575), (-1320864063));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 141338582 + "'", int19 == 141338582);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.227875881E9d + "'", double22 == 1.227875881E9d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.potencia(9, 14);
        double double21 = calculadora0.raizQuadrada(3923);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.796636465E9d + "'", double19 == 1.796636465E9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 62.63385665915839d + "'", double21 == 62.63385665915839d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        double double20 = calculadora0.potencia((-10), 14);
        double double23 = calculadora0.porcentagem(6126751, 108);
        int int26 = calculadora0.dividir(477452415, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.76447232E8d + "'", double20 == 2.76447232E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.61689108E8d + "'", double23 == 6.61689108E8d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3978770 + "'", int26 == 3978770);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(188191, 19371844);
        int int23 = calculadora0.dividir(228511908, 47624);
        double double25 = calculadora0.raizQuadrada(5);
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-19183653) + "'", int20 == (-19183653));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4798 + "'", int23 == 4798);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.23606797749979d + "'", double25 == 2.23606797749979d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        double double14 = calculadora0.porcentagem(24, 2371);
        double double16 = calculadora0.raizQuadrada(158400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 56904.0d + "'", double14 == 56904.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 397.994974842648d + "'", double16 == 397.994974842648d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        double double19 = calculadora0.raizQuadrada(10887601);
        int int22 = calculadora0.multiplicar(9, (-499035486));
        int int25 = calculadora0.somar(0, (-2526));
        double double28 = calculadora0.porcentagem((-9), 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3299.636495130941d + "'", double19 == 3299.636495130941d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-196352078) + "'", int22 == (-196352078));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2526) + "'", int25 == (-2526));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1080.0d) + "'", double28 == (-1080.0d));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        int int32 = calculadora0.dividir(568378368, 15764);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 36055 + "'", int32 == 36055);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        double double34 = calculadora0.potencia(482358766, 4951);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        int int31 = calculadora0.dividir(4908, (-9035));
        int int34 = calculadora0.somar((-1056240805), 58870);
        int int37 = calculadora0.dividir(0, 11188);
        double double40 = calculadora0.potencia((-1411303535), 1577012826);
        double double42 = calculadora0.raizQuadrada(1056242184);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1056181935) + "'", int34 == (-1056181935));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-6.40516703E8d) + "'", double40 == (-6.40516703E8d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 32499.879753623703d + "'", double42 == 32499.879753623703d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        boolean boolean1 = calculadora.Matematica.isPrime(552420);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        int int10 = calculadora0.somar(0, (int) 'a');
        double double13 = calculadora0.potencia((-98), 0);
        int int16 = calculadora0.somar((-2104819), 310854959);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.potencia((-682872), (-1571249596));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 308750140 + "'", int16 == 308750140);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir(0, (int) (short) 10);
        double double23 = calculadora0.porcentagem(188191, 2579);
        double double25 = calculadora0.raizQuadrada(68284800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.85344589E8d + "'", double23 == 4.85344589E8d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8263.461744329672d + "'", double25 == 8263.461744329672d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        double double19 = calculadora0.porcentagem((-10472177), (-54));
        double double22 = calculadora0.porcentagem(1235336183, 1527281959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.65497558E8d + "'", double19 == 5.65497558E8d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.446207905E9d + "'", double22 == 1.446207905E9d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        int int17 = calculadora0.multiplicar((-67795200), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1810414592) + "'", int17 == (-1810414592));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        int int22 = calculadora0.somar(1431, 71);
        int int25 = calculadora0.dividir((-1861731516), 482358766);
        int int28 = calculadora0.multiplicar(2371, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1502 + "'", int22 == 1502);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3) + "'", int25 == (-3));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(14, (-34));
        double double19 = calculadora0.raizQuadrada(328681436);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 18129.573519528803d + "'", double19 == 18129.573519528803d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
            double double22 = calculadora0.potencia(105199, (-54));
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        int int1 = calculadora.Matematica.factorial(12758918);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double8 = calculadora0.raizQuadrada(40);
        int int11 = calculadora0.dividir((-1745154368), (-282349306));
        int int14 = calculadora0.subtrair(367844, (-2104819));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.324555320336759d + "'", double8 == 6.324555320336759d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2472663 + "'", int14 == 2472663);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.somar(0, (-1899));
        double double12 = calculadora0.porcentagem(362880, 296384028);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = calculadora0.raizQuadrada((-261673332));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1899) + "'", int9 == (-1899));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.560021504E9d + "'", double12 == 1.560021504E9d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir((-2640203), 296384028);
        int int23 = calculadora0.dividir((-107194), (int) (byte) 1);
        int int26 = calculadora0.multiplicar(162, (-54));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-107194) + "'", int23 == (-107194));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-8748) + "'", int26 == (-8748));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        double double20 = calculadora0.porcentagem(1, 758611221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.58611221E8d + "'", double20 == 7.58611221E8d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        int int1 = calculadora.Matematica.sum(97864794);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-684757504) + "'", int1 == (-684757504));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        double double14 = calculadora0.potencia(367830, 6579);
        int int17 = calculadora0.subtrair(284795973, 1235493814);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-950697841) + "'", int17 == (-950697841));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        int int20 = calculadora0.somar((-1900802547), 1594440447);
        int int23 = calculadora0.multiplicar((-1861731516), 1873779684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-306362100) + "'", int20 == (-306362100));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 649262224 + "'", int23 == 649262224);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(0, (-1));
        int int23 = calculadora0.dividir(381166418, 9692);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 39327 + "'", int23 == 39327);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int int1 = calculadora.Matematica.sum((-523446431));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double9 = calculadora0.potencia((-1), 561);
        double double11 = calculadora0.raizQuadrada(560);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 23.664319132398465d + "'", double11 == 23.664319132398465d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int int1 = calculadora.Matematica.sum(630036720);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1398424327) + "'", int1 == (-1398424327));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        int int22 = calculadora0.subtrair(1056242184, 8197332);
        int int25 = calculadora0.subtrair(381166418, (-653));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1048044852 + "'", int22 == 1048044852);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 381167071 + "'", int25 == 381167071);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(50608, (int) (short) 10);
        double double22 = calculadora0.porcentagem(21187, 1732706892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5060 + "'", int19 == 5060);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.775441892E9d + "'", double22 == 1.775441892E9d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        boolean boolean1 = calculadora.Matematica.isPrime(5512);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        int int9 = calculadora0.multiplicar((-1530), 1379);
        double double11 = calculadora0.raizQuadrada(2);
        int int14 = calculadora0.somar(21339, (-875346424));
        int int17 = calculadora0.multiplicar(1483110624, (-54));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2109870) + "'", int9 == (-2109870));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4142135623730951d + "'", double11 == 1.4142135623730951d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-875325085) + "'", int14 == (-875325085));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1516404928 + "'", int17 == 1516404928);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double8 = calculadora0.potencia((int) (short) 1, 10);
        int int11 = calculadora0.multiplicar((-47610), (-10472177));
        int int14 = calculadora0.multiplicar(1810758613, 66164166);
        int int17 = calculadora0.subtrair(477452415, (-386128000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 364140634 + "'", int11 == 364140634);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1876377666) + "'", int14 == (-1876377666));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 863580415 + "'", int17 == 863580415);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        int int29 = calculadora0.multiplicar((-204480), 106029);
        int int32 = calculadora0.multiplicar(1623691425, (-47610));
        int int35 = calculadora0.subtrair(47633, (-302680881));
        int int38 = calculadora0.multiplicar(11512802, 274911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1547080348 + "'", int26 == 1547080348);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-205973440) + "'", int29 == (-205973440));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1167616454 + "'", int32 == 1167616454);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 302728514 + "'", int35 == 302728514);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-394986530) + "'", int38 == (-394986530));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir(12758826, 5051);
        double double23 = calculadora0.potencia(5446651, 92);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = calculadora0.potencia((-9000), (-1915880835));
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.09744879E8d) + "'", double23 == (-9.09744879E8d));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        int int9 = calculadora0.subtrair((-9000), (int) '#');
        int int12 = calculadora0.multiplicar(71, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9035) + "'", int9 == (-9035));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        boolean boolean1 = calculadora.Matematica.isPrime((-736014630));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        int int19 = calculadora0.multiplicar(0, 1);
        int int22 = calculadora0.somar((-640052340), 0);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-640052340) + "'", int22 == (-640052340));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        int int9 = calculadora0.dividir(756167552, 11188);
        int int12 = calculadora0.dividir((-21186), 250156381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 67587 + "'", int9 == 67587);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(53, 143);
        int int18 = calculadora0.subtrair(50511, 157641);
        double double21 = calculadora0.porcentagem((-1301739248), (int) (byte) 100);
        int int24 = calculadora0.somar(3500, 68270873);
        int int27 = calculadora0.somar(1483110624, 1295112616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.50920227E8d) + "'", double15 == (-9.50920227E8d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-107130) + "'", int18 == (-107130));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.32490592E9d) + "'", double21 == (-1.32490592E9d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 68274373 + "'", int24 == 68274373);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1516744056) + "'", int27 == (-1516744056));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        boolean boolean1 = calculadora.Matematica.isPrime((-9035));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        int int1 = calculadora.Matematica.sum(1135591848);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1156530165 + "'", int1 == 1156530165);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double14 = calculadora0.raizQuadrada(1463280665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 38252.85172376041d + "'", double14 == 38252.85172376041d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        double double32 = calculadora0.raizQuadrada(1075418326);
        double double34 = calculadora0.raizQuadrada(97);
        int int37 = calculadora0.subtrair((-2443617), 1048044852);
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 32793.571412702215d + "'", double32 == 32793.571412702215d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 9.848857801796104d + "'", double34 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1050488469) + "'", int37 == (-1050488469));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        int int11 = calculadora0.somar(9, (-1076));
        int int14 = calculadora0.subtrair((int) '4', (-2104819));
        int int17 = calculadora0.somar(232201856, 5150);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia((-1861734272), (-615473399));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1067) + "'", int11 == (-1067));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2104871 + "'", int14 == 2104871);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 232207006 + "'", int17 == 232207006);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int int1 = calculadora.Matematica.sum((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        boolean boolean1 = calculadora.Matematica.isPrime((-867129856));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        int int29 = calculadora0.multiplicar((-204480), 106029);
        java.lang.Class<?> wildcardClass30 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1547080348 + "'", int26 == 1547080348);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-205973440) + "'", int29 == (-205973440));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double9 = calculadora0.potencia((int) (short) 10, 4950);
        double double12 = calculadora0.porcentagem(3061240, 5446651);
        int int15 = calculadora0.somar(561, (-1));
        int int18 = calculadora0.dividir(191028395, (-1270168789));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.42864168E8d + "'", double12 == 4.42864168E8d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 560 + "'", int15 == 560);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar((int) (short) 1, 561);
        double double11 = calculadora0.potencia((int) (short) 0, 108);
        int int14 = calculadora0.dividir((int) (byte) 1, 5887);
        int int17 = calculadora0.multiplicar((int) ' ', 4950);
        int int20 = calculadora0.subtrair((-620768219), 50510);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = calculadora0.potencia(261779361, (-875346424));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 561 + "'", int8 == 561);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 158400 + "'", int17 == 158400);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-620818729) + "'", int20 == (-620818729));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.somar(0, (-1899));
        double double12 = calculadora0.porcentagem(362880, 296384028);
        double double15 = calculadora0.porcentagem(1862164, 15764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1899) + "'", int9 == (-1899));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.560021504E9d + "'", double12 == 1.560021504E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-7.09617776E8d) + "'", double15 == (-7.09617776E8d));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int int1 = calculadora.Matematica.sum((-44193860));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        int int28 = calculadora0.dividir(1177, (-839593119));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-736014630) + "'", int25 == (-736014630));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-90), 529);
        double double20 = calculadora0.porcentagem(12253726, (-459480627));
        double double23 = calculadora0.potencia(520, 613);
        int int26 = calculadora0.somar(8197332, 304857);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-47610) + "'", int17 == (-47610));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.32171526E8d + "'", double20 == 2.32171526E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8502189 + "'", int26 == 8502189);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        boolean boolean1 = calculadora.Matematica.isPrime(1366467329);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem((-630036684), 2);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.260073368E9d) + "'", double16 == (-1.260073368E9d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int int1 = calculadora.Matematica.sum((-567846284));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-90), 529);
        int int20 = calculadora0.multiplicar(1502, 0);
        double double23 = calculadora0.porcentagem((-10472177), (-459480627));
        int int26 = calculadora0.multiplicar(13263826, 40504501);
        int int29 = calculadora0.multiplicar((-459480627), 536710257);
        int int32 = calculadora0.dividir(224455078, (-1398424327));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-47610) + "'", int17 == (-47610));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.076843517E9d) + "'", double23 == (-1.076843517E9d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 79326074 + "'", int26 == 79326074);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1353398403) + "'", int29 == (-1353398403));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        int int28 = calculadora0.multiplicar(12258676, (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-34) + "'", int23 == (-34));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3301.0d + "'", double25 == 3301.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-392277632) + "'", int28 == (-392277632));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int1 = calculadora.Matematica.factorial((-1861731516));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        int int23 = calculadora0.multiplicar(15764, 47968);
        double double26 = calculadora0.porcentagem(3, (-630030211));
        int int29 = calculadora0.somar(6578, (-5));
        int int32 = calculadora0.dividir(7829502, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 756167552 + "'", int23 == 756167552);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.890090633E9d) + "'", double26 == (-1.890090633E9d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6573 + "'", int29 == 6573);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 78295 + "'", int32 == 78295);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.subtrair((int) (short) 10, (-54));
        int int14 = calculadora0.subtrair(68284800, 2104871);
        int int17 = calculadora0.subtrair((-270610380), 7261);
        int int20 = calculadora0.multiplicar(9431, (-635542910));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 66179929 + "'", int14 == 66179929);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-270617641) + "'", int17 == (-270617641));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969161006 + "'", int20 == 1969161006);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int int1 = calculadora.Matematica.sum(649262224);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-196418871) + "'", int1 == (-196418871));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.multiplicar((int) '4', 58870);
        int int17 = calculadora0.multiplicar(10896601, 1547080348);
        int int20 = calculadora0.dividir((-36), 5051035);
        double double23 = calculadora0.porcentagem(477452415, (-2526));
        int int26 = calculadora0.dividir(2019916288, (-751869456));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3061240 + "'", int14 == 3061240);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1168394692) + "'", int17 == (-1168394692));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.41009886E8d + "'", double23 == 8.41009886E8d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        double double5 = calculadora0.porcentagem(0, 52);
        double double8 = calculadora0.potencia(157081, 539);
        double double11 = calculadora0.potencia(228511908, 3326910);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.866632503E9d) + "'", double8 == (-1.866632503E9d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.dividir((int) (byte) 0, 70714490);
        int int23 = calculadora0.somar((-677952), (-4920));
        int int26 = calculadora0.multiplicar(1295112616, 1512208896);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-682872) + "'", int23 == (-682872));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1173745664) + "'", int26 == (-1173745664));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        int int11 = calculadora0.somar(9, (-1076));
        int int14 = calculadora0.subtrair((int) '4', (-2104819));
        int int17 = calculadora0.multiplicar((-4719837), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1067) + "'", int11 == (-1067));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2104871 + "'", int14 == 2104871);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        int int1 = calculadora.Matematica.factorial((-312910141));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        boolean boolean1 = calculadora.Matematica.isPrime((-2443669));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        double double19 = calculadora0.raizQuadrada(43);
        int int22 = calculadora0.somar(1547080348, (int) (short) 0);
        int int25 = calculadora0.multiplicar((-6473), 0);
        int int28 = calculadora0.subtrair(0, (-1321388763));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.557438524302d + "'", double19 == 6.557438524302d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1547080348 + "'", int22 == 1547080348);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1321388763 + "'", int28 == 1321388763);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.multiplicar((-626166995), (-6473));
        int int9 = calculadora0.dividir((-1173745664), (-98397944));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1270168789) + "'", int6 == (-1270168789));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int int1 = calculadora.Matematica.sum((-518356831));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double16 = calculadora0.raizQuadrada(143);
        double double19 = calculadora0.potencia(326863206, 612441755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.958260743101398d + "'", double16 == 11.958260743101398d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double15 = calculadora0.porcentagem((int) 'a', 21645002);
        int int18 = calculadora0.multiplicar((-1056240805), (-36));
        int int21 = calculadora0.dividir(1871380077, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.099565194E9d + "'", double15 == 2.099565194E9d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-630036684) + "'", int18 == (-630036684));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53468002 + "'", int21 == 53468002);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double8 = calculadora0.potencia((int) (short) 1, 10);
        int int11 = calculadora0.multiplicar(5, (-1810759158));
        double double13 = calculadora0.raizQuadrada(50511);
        double double15 = calculadora0.raizQuadrada(7015);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-463861198) + "'", int11 == (-463861198));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 224.74652388857987d + "'", double13 == 224.74652388857987d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 83.75559682791354d + "'", double15 == 83.75559682791354d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        boolean boolean1 = calculadora.Matematica.isPrime(1873779684);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(32, 143);
        double double8 = calculadora0.raizQuadrada(40);
        double double11 = calculadora0.porcentagem(3061240, 21703872);
        int int14 = calculadora0.somar(5051035, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4576 + "'", int6 == 4576);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.324555320336759d + "'", double8 == 6.324555320336759d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.912019456E9d + "'", double11 == 1.912019456E9d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5051035 + "'", int14 == 5051035);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        boolean boolean1 = calculadora.Matematica.isPrime(302728514);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        int int19 = calculadora0.multiplicar(0, (-2147483648));
        int int22 = calculadora0.dividir((int) ' ', 3061240);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        int int20 = calculadora0.somar(1313662592, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1313662623 + "'", int20 == 1313662623);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        int int16 = calculadora0.dividir((-31), 10896601);
        int int19 = calculadora0.dividir(2472, 1623691425);
        int int22 = calculadora0.dividir((-90), (-6473));
        int int25 = calculadora0.dividir(1859023104, 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 13000161 + "'", int25 == 13000161);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.subtrair(5051, 143);
        int int20 = calculadora0.multiplicar(1745349123, (-510025392));
        int int23 = calculadora0.dividir(631809017, 144522995);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4908 + "'", int17 == 4908);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-76545040) + "'", int20 == (-76545040));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair(15764, 4576);
        int int20 = calculadora0.subtrair(43, 2);
        int int23 = calculadora0.somar((-682872), (-1411303535));
        // The following exception was thrown during execution in test generation
        try {
            double double26 = calculadora0.potencia((-1067), (-463861759));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 41 + "'", int20 == 41);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1411986407) + "'", int23 == (-1411986407));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        int int1 = calculadora.Matematica.sum((-1398424327));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int int1 = calculadora.Matematica.sum(2527);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3194128 + "'", int1 == 3194128);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir(426942010, 15764);
        int int14 = calculadora0.somar((-878490405), 816438014);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27083 + "'", int11 == 27083);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-62052391) + "'", int14 == (-62052391));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.somar((-100), (int) (short) 100);
        double double9 = calculadora0.porcentagem(361187, (-509347440));
        int int12 = calculadora0.subtrair((int) (byte) -1, 188806);
        double double14 = calculadora0.raizQuadrada(261);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.55345584E8d + "'", double9 == 9.55345584E8d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-188807) + "'", int12 == (-188807));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 16.15549442140351d + "'", double14 == 16.15549442140351d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        int int28 = calculadora0.subtrair((-630036684), (-6473));
        int int31 = calculadora0.somar(326863206, (-1861734272));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-108366441) + "'", int19 == (-108366441));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 21339 + "'", int22 == 21339);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.170426081E9d + "'", double25 == 1.170426081E9d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-630030211) + "'", int28 == (-630030211));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1534871066) + "'", int31 == (-1534871066));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        int int26 = calculadora0.subtrair(613, 70714490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 57.445626465380286d + "'", double18 == 57.445626465380286d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.656854249492381d + "'", double20 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1030 + "'", int23 == 1030);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-70713877) + "'", int26 == (-70713877));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double12 = calculadora0.porcentagem(10897474, 364140634);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.682696396E9d) + "'", double12 == (-1.682696396E9d));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        double double28 = calculadora0.potencia(0, 12758826);
        double double31 = calculadora0.porcentagem(1321388763, (-16231));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2247.442991490552d + "'", double19 == 2247.442991490552d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1745154368) + "'", int22 == (-1745154368));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9.92427384E8d) + "'", double25 == (-9.92427384E8d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.605663971E9d + "'", double31 == 1.605663971E9d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        boolean boolean1 = calculadora.Matematica.isPrime((-1288085606));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        boolean boolean1 = calculadora.Matematica.isPrime(993953977);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int1 = calculadora.Matematica.sum((-754157899));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int int1 = calculadora.Matematica.sum(1527806659);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1210545574 + "'", int1 == 1210545574);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int1 = calculadora.Matematica.factorial((-1571249596));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = calculadora0.raizQuadrada((-513068772));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        double double10 = calculadora0.raizQuadrada(158400);
        int int13 = calculadora0.multiplicar((-140299791), (-1399098829));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 397.994974842648d + "'", double10 == 397.994974842648d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 715867395 + "'", int13 == 715867395);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-108366441), (-3301));
        double double20 = calculadora0.potencia(13475836, 97);
        int int23 = calculadora0.subtrair(852742800, 1810758613);
        int int26 = calculadora0.multiplicar(3194128, (-33539));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1235336173 + "'", int17 == 1235336173);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-958015813) + "'", int23 == (-958015813));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 246323408 + "'", int26 == 246323408);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        int int23 = calculadora0.multiplicar(15764, 47968);
        double double26 = calculadora0.porcentagem(3, (-630030211));
        double double29 = calculadora0.porcentagem(0, (-2640732));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 756167552 + "'", int23 == 756167552);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.890090633E9d) + "'", double26 == (-1.890090633E9d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.subtrair(153, 10887601);
        double double23 = calculadora0.porcentagem((-100), 630029869);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10887448) + "'", int20 == (-10887448));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.42152254E9d + "'", double23 == 1.42152254E9d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, 99);
        int int23 = calculadora0.dividir(10, 2472);
        int int26 = calculadora0.multiplicar((-1642756327), 41);
        int int29 = calculadora0.dividir(210017662, (-1243182));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1366467329 + "'", int26 == 1366467329);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-168) + "'", int29 == (-168));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.subtrair(2, (int) (byte) 10);
        double double8 = calculadora0.raizQuadrada(44783);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = calculadora0.raizQuadrada((-1370807707));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 211.61994234948654d + "'", double8 == 211.61994234948654d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        boolean boolean1 = calculadora.Matematica.isPrime(4995);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(50608, (int) (short) 10);
        int int22 = calculadora0.dividir(10896601, 70714490);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5060 + "'", int19 == 5060);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        int int23 = calculadora0.dividir(561, 275009);
        double double26 = calculadora0.porcentagem(254, 5051045);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.28296543E9d + "'", double26 == 1.28296543E9d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.porcentagem(0, 10);
        int int17 = calculadora0.subtrair(5781701, 14);
        int int20 = calculadora0.subtrair(68559809, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5781687 + "'", int17 == 5781687);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 68559709 + "'", int20 == 68559709);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        boolean boolean1 = calculadora.Matematica.isPrime(10896754);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((int) (short) -1, 5051);
        int int6 = calculadora0.dividir(362880, 153);
        int int9 = calculadora0.somar(7829502, (-10469705));
        double double11 = calculadora0.raizQuadrada(381167071);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2371 + "'", int6 == 2371);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2640203) + "'", int9 == (-2640203));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 19523.500480190534d + "'", double11 == 19523.500480190534d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        int int1 = calculadora.Matematica.factorial(48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        int int32 = calculadora0.multiplicar((-5), 0);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        int int28 = calculadora0.subtrair((-500309854), (-1399098829));
        int int31 = calculadora0.somar((-1899), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43 + "'", int22 == 43);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75843.0d + "'", double25 == 75843.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 898788975 + "'", int28 == 898788975);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1899) + "'", int31 == (-1899));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        int int20 = calculadora0.somar(2527, (-302683408));
        int int23 = calculadora0.multiplicar(68284800, 1168757572);
        int int26 = calculadora0.dividir((-1398424327), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-302680881) + "'", int20 == (-302680881));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-867129856) + "'", int23 == (-867129856));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-99887451) + "'", int26 == (-99887451));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.porcentagem((-2147483648), 1235336173);
        int int20 = calculadora0.somar(10, 529);
        int int23 = calculadora0.somar((-385386529), 630036720);
        double double26 = calculadora0.porcentagem(0, 872954676);
        double double28 = calculadora0.raizQuadrada(856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.147483648E9d) + "'", double17 == (-2.147483648E9d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 539 + "'", int20 == 539);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 244650191 + "'", int23 == 244650191);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 29.257477676655586d + "'", double28 == 29.257477676655586d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        int int17 = calculadora0.multiplicar((int) ' ', (-21186));
        double double20 = calculadora0.potencia((-10), 14);
        int int23 = calculadora0.somar(68284800, 275009);
        double double26 = calculadora0.porcentagem(5202153, 2006105212);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-677952) + "'", int17 == (-677952));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.76447232E8d + "'", double20 == 2.76447232E8d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 68559809 + "'", int23 == 68559809);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 9.227798E7d + "'", double26 == 9.227798E7d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        int int12 = calculadora0.subtrair((int) 'a', 0);
        double double15 = calculadora0.potencia(758611221, (int) '#');
        int int18 = calculadora0.multiplicar(362880, 364140634);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.519706451E9d) + "'", double15 == (-1.519706451E9d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 389437184 + "'", int18 == 389437184);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        int int20 = calculadora0.multiplicar(5191, 524700);
        int int23 = calculadora0.dividir(3061240, 108367055);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1571249596) + "'", int20 == (-1571249596));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        int int9 = calculadora0.somar((-108366441), (int) (byte) 0);
        int int12 = calculadora0.subtrair(44783, (-196352078));
        double double15 = calculadora0.potencia(3061262, 4798);
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-108366441) + "'", int9 == (-108366441));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 196396861 + "'", int12 == 196396861);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double17 = calculadora0.porcentagem((-302683408), (-64));
        int int20 = calculadora0.subtrair((-2526), 362880);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.103098368E9d) + "'", double17 == (-2.103098368E9d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-365406) + "'", int20 == (-365406));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        int int31 = calculadora0.somar(274875, 157081);
        int int34 = calculadora0.dividir((-205353), 7829502);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = calculadora0.potencia(539, (-736017186));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1745154368) + "'", int22 == (-1745154368));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2535) + "'", int25 == (-2535));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-88716792) + "'", int28 == (-88716792));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 431956 + "'", int31 == 431956);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        int int1 = calculadora.Matematica.sum(12258676);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1416889603 + "'", int1 == 1416889603);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(14, (-34));
        double double19 = calculadora0.raizQuadrada(1431);
        double double22 = calculadora0.porcentagem(2071384515, (-2147483648));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 37.82856063875548d + "'", double19 == 37.82856063875548d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-2.147483648E9d) + "'", double22 == (-2.147483648E9d));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        int int17 = calculadora0.dividir(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.raizQuadrada((-615473399));
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
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(0, (-1));
        double double22 = calculadora0.raizQuadrada(1048060616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32373.764316186647d + "'", double22 == 32373.764316186647d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.subtrair(0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        int int19 = calculadora0.somar((int) (byte) -1, 41);
        int int22 = calculadora0.somar((int) (short) 0, 11188);
        double double25 = calculadora0.porcentagem((-36), 518356800);
        java.lang.Class<?> wildcardClass26 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11188 + "'", int22 == 11188);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.480975616E9d) + "'", double25 == (-1.480975616E9d));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        double double31 = calculadora0.potencia((-365406), (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        double double19 = calculadora0.raizQuadrada(43);
        double double22 = calculadora0.potencia(1235336173, 68559809);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.546328887E9d) + "'", double14 == (-1.546328887E9d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.557438524302d + "'", double19 == 6.557438524302d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.07673325E8d + "'", double22 == 1.07673325E8d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        boolean boolean1 = calculadora.Matematica.isPrime(3453);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int int1 = calculadora.Matematica.sum(856);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366797 + "'", int1 == 366797);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        double double14 = calculadora0.raizQuadrada(1235336173);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.potencia(3061240, (-261673332));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35147.349444872794d + "'", double14 == 35147.349444872794d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = calculadora0.potencia(426942010, (-64));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-736014630) + "'", int25 == (-736014630));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        double double29 = calculadora0.potencia((-8), 47983);
        int int32 = calculadora0.subtrair(856, (-2443617));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50608 + "'", int23 == 50608);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5455188.0d + "'", double26 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2444473 + "'", int32 == 2444473);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        int int19 = calculadora0.dividir(0, 3400);
        double double22 = calculadora0.porcentagem(3400, 0);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        int int9 = calculadora0.multiplicar((-204480), 756167552);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1976590336 + "'", int9 == 1976590336);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.potencia((int) (byte) -1, 3500);
        int int17 = calculadora0.multiplicar((-500309854), 2371);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-823690138) + "'", int17 == (-823690138));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        double double28 = calculadora0.porcentagem(188191, 0);
        int int31 = calculadora0.dividir(1134046501, 631805627);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2631616.0d + "'", double20 == 2631616.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 396.3344547222712d + "'", double25 == 396.3344547222712d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        double double25 = calculadora0.raizQuadrada(157641);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 57.445626465380286d + "'", double18 == 57.445626465380286d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.656854249492381d + "'", double20 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1030 + "'", int23 == 1030);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 397.04030022152665d + "'", double25 == 397.04030022152665d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.subtrair(113732128, (-736014630));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 849746758 + "'", int8 == 849746758);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        double double31 = calculadora0.porcentagem(0, 477452415);
        int int34 = calculadora0.subtrair(33, 1577012826);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = calculadora0.potencia((-1288085606), (-463861759));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10896754 + "'", int28 == 10896754);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1577012793) + "'", int34 == (-1577012793));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.somar(12758826, (-8));
        int int17 = calculadora0.somar((-1277355836), 450395073);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12758818 + "'", int14 == 12758818);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-826960763) + "'", int17 == (-826960763));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        int int14 = calculadora0.multiplicar(5887, (int) (byte) 10);
        int int17 = calculadora0.subtrair(1566529759, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58870 + "'", int14 == 58870);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1566529759 + "'", int17 == 1566529759);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double9 = calculadora0.porcentagem(157641, 50608);
        int int12 = calculadora0.multiplicar(108, 5115);
        double double15 = calculadora0.potencia((-459480627), 1133282586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-6.12038864E8d) + "'", double9 == (-6.12038864E8d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 552420 + "'", int12 == 552420);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.56940169E8d + "'", double15 == 9.56940169E8d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(14, (-47610));
        java.lang.Class<?> wildcardClass7 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 47624 + "'", int6 == 47624);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        int int14 = calculadora0.multiplicar((int) (short) 100, (int) '#');
        int int17 = calculadora0.dividir((-2104819), (-1301739248));
        int int20 = calculadora0.multiplicar((-567847068), 47968);
        int int23 = calculadora0.multiplicar(274875, 3400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3500 + "'", int14 == 3500);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 194433408 + "'", int20 == 194433408);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 934575000 + "'", int23 == 934575000);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        int int30 = calculadora0.somar(665359165, (-1669035839));
        int int33 = calculadora0.subtrair((-47610), 9);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1003676674) + "'", int30 == (-1003676674));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-47619) + "'", int33 == (-47619));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        double double17 = calculadora0.potencia((-1810759117), 2526);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-7.00132967E8d) + "'", double17 == (-7.00132967E8d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        double double16 = calculadora0.raizQuadrada(52);
        double double19 = calculadora0.porcentagem((int) (byte) 100, 99);
        double double22 = calculadora0.porcentagem((int) (short) -1, (-500309854));
        int int25 = calculadora0.multiplicar((-8), 5051);
        double double27 = calculadora0.raizQuadrada(1736958381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9900.0d + "'", double19 == 9900.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.00309854E8d + "'", double22 == 5.00309854E8d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-40408) + "'", int25 == (-40408));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 41676.83266516303d + "'", double27 == 41676.83266516303d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(5051035, 614);
        int int17 = calculadora0.multiplicar((-1), (-31));
        int int20 = calculadora0.subtrair((-1056181935), 310854959);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = calculadora0.raizQuadrada((-255064446));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1367036894) + "'", int20 == (-1367036894));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        double double19 = calculadora0.potencia(5150, 12758818);
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int1 = calculadora.Matematica.sum((-44727));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        double double19 = calculadora0.raizQuadrada((int) (short) 1);
        int int22 = calculadora0.somar(1431, 71);
        int int25 = calculadora0.dividir((-1861731516), 482358766);
        int int28 = calculadora0.subtrair((-208571456), 5252761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1502 + "'", int22 == 1502);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3) + "'", int25 == (-3));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-213824217) + "'", int28 == (-213824217));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        double double19 = calculadora0.raizQuadrada(58870);
        int int22 = calculadora0.multiplicar((-293484837), 157641);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = calculadora0.raizQuadrada((-1306459085));
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 242.63140769488191d + "'", double19 == 242.63140769488191d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 144522995 + "'", int22 == 144522995);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        double double17 = calculadora0.potencia(106, 10721529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        double double20 = calculadora0.potencia(43, 97);
        int int23 = calculadora0.somar(482358766, 0);
        int int26 = calculadora0.subtrair(1527806662, 304857);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.083380139E9d + "'", double20 == 1.083380139E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 482358766 + "'", int23 == 482358766);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1527501805 + "'", int26 == 1527501805);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int int1 = calculadora.Matematica.sum(259561);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-673652227) + "'", int1 == (-673652227));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int int1 = calculadora.Matematica.factorial(951510);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(21644910, 71);
        double double15 = calculadora0.raizQuadrada(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 304857 + "'", int13 == 304857);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.0d + "'", double15 == 2.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.potencia((int) (byte) -1, 50608);
        double double18 = calculadora0.porcentagem(48, 1056240804);
        int int21 = calculadora0.dividir((int) '#', (-1277355836));
        double double24 = calculadora0.porcentagem((-208571456), 45);
        int int27 = calculadora0.somar(253037880, 631805627);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.4004896E8d) + "'", double18 == (-8.4004896E8d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-7.95780928E8d) + "'", double24 == (-7.95780928E8d));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 884843507 + "'", int27 == 884843507);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.dividir(0, (int) (short) 10);
        double double23 = calculadora0.porcentagem(188191, 2579);
        double double26 = calculadora0.potencia(1533946295, 53468002);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.85344589E8d + "'", double23 == 4.85344589E8d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.047648209E9d + "'", double26 == 1.047648209E9d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        double double10 = calculadora0.raizQuadrada(97);
        int int13 = calculadora0.somar((int) (short) 100, 3300);
        double double15 = calculadora0.raizQuadrada(40);
        double double18 = calculadora0.potencia((-98), 97);
        double double20 = calculadora0.raizQuadrada(0);
        int int23 = calculadora0.subtrair(630029869, 15764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.848857801796104d + "'", double10 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3400 + "'", int13 == 3400);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.324555320336759d + "'", double15 == 6.324555320336759d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 630014105 + "'", int23 == 630014105);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        int int37 = calculadora0.multiplicar((-90796998), (-736017186));
        int int40 = calculadora0.subtrair(47623, (-16310679));
        // The following exception was thrown during execution in test generation
        try {
            double double42 = calculadora0.raizQuadrada((-1571632104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1861731516) + "'", int34 == (-1861731516));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1732706892 + "'", int37 == 1732706892);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16358302 + "'", int40 == 16358302);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.multiplicar(143, 2526);
        int int9 = calculadora0.subtrair((-499030496), (-302680881));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 361218 + "'", int6 == 361218);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-196349615) + "'", int9 == (-196349615));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.potencia((int) (byte) -1, 3500);
        int int17 = calculadora0.multiplicar((-500309854), 2371);
        int int20 = calculadora0.somar((-499035486), 4990);
        double double23 = calculadora0.porcentagem(810766104, 524700);
        double double25 = calculadora0.raizQuadrada(1527501805);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-823690138) + "'", int17 == (-823690138));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-499030496) + "'", int20 == (-499030496));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.054034592E9d + "'", double23 == 1.054034592E9d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 39083.26758345571d + "'", double25 == 39083.26758345571d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        double double16 = calculadora0.raizQuadrada(613);
        java.lang.Class<?> wildcardClass17 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 24.758836806279895d + "'", double16 == 24.758836806279895d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        boolean boolean1 = calculadora.Matematica.isPrime((-958015813));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-90), 100);
        double double11 = calculadora0.raizQuadrada(7261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9000) + "'", int9 == (-9000));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 85.21150157109074d + "'", double11 == 85.21150157109074d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        int int31 = calculadora0.dividir(4908, (-9035));
        int int34 = calculadora0.somar((-1056240805), 58870);
        int int37 = calculadora0.dividir(0, 11188);
        double double40 = calculadora0.potencia((-1411303535), 1577012826);
        int int43 = calculadora0.somar(863580415, 27083);
        double double45 = calculadora0.raizQuadrada(246323408);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1056181935) + "'", int34 == (-1056181935));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-6.40516703E8d) + "'", double40 == (-6.40516703E8d));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 863607498 + "'", int43 == 863607498);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 15694.69362555383d + "'", double45 == 15694.69362555383d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.subtrair((int) (short) -1, 53);
        int int17 = calculadora0.somar((int) 'a', 56);
        int int20 = calculadora0.somar(250156381, 529);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        double double23 = calculadora0.porcentagem(50510, 0);
        double double25 = calculadora0.raizQuadrada(367830);
        double double28 = calculadora0.porcentagem(0, 157694);
        int int31 = calculadora0.somar((int) (short) 100, 1425857463);
        double double34 = calculadora0.potencia((-36), 524700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 606.4899009876422d + "'", double25 == 606.4899009876422d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1425857563 + "'", int31 == 1425857563);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        int int14 = calculadora0.dividir(6579, 92);
        int int17 = calculadora0.multiplicar((-8), (-499035486));
        double double19 = calculadora0.raizQuadrada(5446651);
        int int22 = calculadora0.subtrair((-36), (-993954013));
        int int25 = calculadora0.dividir(0, 1048060616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-302683408) + "'", int17 == (-302683408));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2333.8061187682238d + "'", double19 == 2333.8061187682238d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 993953977 + "'", int22 == 993953977);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.subtrair((int) (short) 10, (-54));
        int int14 = calculadora0.subtrair(68284800, 2104871);
        int int17 = calculadora0.subtrair((-270610380), 7261);
        int int20 = calculadora0.subtrair((-15452), (int) (short) -1);
        double double22 = calculadora0.raizQuadrada(1577012793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 66179929 + "'", int14 == 66179929);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-270617641) + "'", int17 == (-270617641));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-15451) + "'", int20 == (-15451));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 39711.62037741598d + "'", double22 == 39711.62037741598d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        double double29 = calculadora0.potencia((-1196071565), 3061240);
        int int32 = calculadora0.somar(70, 2756);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.636990975E9d) + "'", double26 == (-1.636990975E9d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7.97190113E8d + "'", double29 == 7.97190113E8d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2826 + "'", int32 == 2826);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int int1 = calculadora.Matematica.sum(2472663);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-984322636) + "'", int1 == (-984322636));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        double double14 = calculadora0.potencia(53, (int) (byte) 10);
        int int17 = calculadora0.subtrair((int) ' ', (-1));
        int int20 = calculadora0.dividir(1, 153);
        double double23 = calculadora0.porcentagem(50510, 0);
        int int26 = calculadora0.multiplicar(0, 741);
        int int29 = calculadora0.somar(7015, (-355062730));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.254987097E9d + "'", double14 == 1.254987097E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-355055715) + "'", int29 == (-355055715));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        int int19 = calculadora0.dividir(10, 5060);
        int int22 = calculadora0.dividir((-31), 1668074498);
        java.lang.Class<?> wildcardClass23 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        double double19 = calculadora0.raizQuadrada(58870);
        int int22 = calculadora0.subtrair(5150, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calculadora0.dividir(1416889603, 0);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 242.63140769488191d + "'", double19 == 242.63140769488191d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5115 + "'", int22 == 5115);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        boolean boolean1 = calculadora.Matematica.isPrime((-1571045116));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        boolean boolean1 = calculadora.Matematica.isPrime((-15763));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem((-1915836162), 159359912);
        int int17 = calculadora0.dividir(539, (-513068772));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = calculadora0.potencia(6573, (-499030496));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.765449904E9d + "'", double14 == 1.765449904E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair(13263826, 536710257);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.potencia(47968, (-673652227));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-523446431) + "'", int16 == (-523446431));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        int int35 = calculadora0.somar((-355062730), (-1056240805));
        double double38 = calculadora0.porcentagem((-4719837), 21187);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1411303535) + "'", int35 == (-1411303535));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.214938711E9d) + "'", double38 == (-1.214938711E9d));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        double double20 = calculadora0.potencia(7015, 1135591848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.9856447E7d) + "'", double20 == (-3.9856447E7d));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        boolean boolean1 = calculadora.Matematica.isPrime((-1240419390));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int1 = calculadora.Matematica.sum(366797);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1449273733) + "'", int1 == (-1449273733));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        double double17 = calculadora0.potencia((-100), 15764);
        double double20 = calculadora0.porcentagem((-47610), 0);
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.dividir((int) (short) 1, 157641);
        int int22 = calculadora0.subtrair((int) (byte) -1, (int) 'a');
        double double24 = calculadora0.raizQuadrada((int) (short) 0);
        int int27 = calculadora0.somar(66179929, 5446651);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 71626580 + "'", int27 == 71626580);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int int1 = calculadora.Matematica.factorial((-44193860));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        boolean boolean1 = calculadora.Matematica.isPrime(13475836);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem((-1915836162), 159359912);
        double double17 = calculadora0.potencia(40, 1577012826);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = calculadora0.raizQuadrada((-463861198));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.dividir(53, 12253726);
        int int19 = calculadora0.multiplicar((int) ' ', 100);
        double double22 = calculadora0.porcentagem((int) (byte) 10, 3194128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3200 + "'", int19 == 3200);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.194128E7d + "'", double22 == 3.194128E7d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((-64), (-204480));
        double double19 = calculadora0.raizQuadrada(113732128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10664.52661865495d + "'", double19 == 10664.52661865495d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        boolean boolean1 = calculadora.Matematica.isPrime(1225678159);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        double double11 = calculadora0.potencia(1389423872, 97);
        double double14 = calculadora0.porcentagem(631809017, 961266061);
        int int17 = calculadora0.somar(1210545574, (-958015813));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.551108389E9d + "'", double14 == 1.551108389E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 252529761 + "'", int17 == 252529761);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        int int1 = calculadora.Matematica.factorial(1379021495);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        double double37 = calculadora0.potencia(6578, 4);
        int int40 = calculadora0.dividir(1425857463, (-1669858085));
        int int43 = calculadora0.somar(1969161006, (-626027316));
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-6.29010928E8d) + "'", double37 == (-6.29010928E8d));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1343133690 + "'", int43 == 1343133690);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int int1 = calculadora.Matematica.factorial((-64));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        int int9 = calculadora0.multiplicar((-90), 100);
        int int12 = calculadora0.dividir(5887, 5887);
        int int15 = calculadora0.subtrair(138970338, 631805627);
        int int18 = calculadora0.dividir(3453, 1216785600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9000) + "'", int9 == (-9000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-492835289) + "'", int15 == (-492835289));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.potencia((int) (byte) -1, 50608);
        double double18 = calculadora0.porcentagem(48, 1056240804);
        int int21 = calculadora0.multiplicar((-96), 13263826);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.4004896E8d) + "'", double18 == (-8.4004896E8d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1273327296) + "'", int21 == (-1273327296));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        double double23 = calculadora0.porcentagem((-459480627), 153);
        int int26 = calculadora0.dividir(58870, 11188);
        double double29 = calculadora0.porcentagem(162, 275009);
        int int32 = calculadora0.multiplicar(1533946295, 191028395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.581059195E9d) + "'", double23 == (-1.581059195E9d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.4551458E7d + "'", double29 == 4.4551458E7d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1820516035) + "'", int32 == (-1820516035));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        boolean boolean1 = calculadora.Matematica.isPrime((-303582066));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        int int14 = calculadora0.somar((int) '4', 561);
        int int17 = calculadora0.multiplicar((-2443669), (-2640732));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 613 + "'", int14 == 613);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2034047116 + "'", int17 == 2034047116);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        int int9 = calculadora0.multiplicar((int) (byte) 10, 0);
        double double11 = calculadora0.raizQuadrada(1313662592);
        int int14 = calculadora0.multiplicar(1126969732, 2105015);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 36244.48360785404d + "'", double11 == 36244.48360785404d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1659166044 + "'", int14 == 1659166044);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        boolean boolean1 = calculadora.Matematica.isPrime(92);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        int int6 = calculadora0.subtrair(0, 499035486);
        int int9 = calculadora0.somar(0, (-1899));
        int int12 = calculadora0.multiplicar((-982218590), 2105015);
        int int15 = calculadora0.subtrair((-367412678), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-499035486) + "'", int6 == (-499035486));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1899) + "'", int9 == (-1899));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-493836338) + "'", int12 == (-493836338));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-367412678) + "'", int15 == (-367412678));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(188191, 19371844);
        double double23 = calculadora0.porcentagem(21645002, 92);
        double double26 = calculadora0.porcentagem(649, 70714490);
        int int29 = calculadora0.somar((int) (byte) 10, (-20383));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-19183653) + "'", int20 == (-19183653));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.991340184E9d + "'", double23 == 1.991340184E9d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.350936246E9d) + "'", double26 == (-1.350936246E9d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-20373) + "'", int29 == (-20373));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(41, (-9035));
        int int19 = calculadora0.somar(10896601, (-9000));
        double double22 = calculadora0.porcentagem((-2057542204), 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-370435.0d) + "'", double16 == (-370435.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10887601 + "'", int19 == 10887601);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.02104904E8d + "'", double22 == 2.02104904E8d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double13 = calculadora0.raizQuadrada((int) '4');
        int int16 = calculadora0.subtrair((int) (short) 1, 3400);
        double double19 = calculadora0.porcentagem(5512, (-1744965562));
        java.lang.Class<?> wildcardClass20 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.818402E9d) + "'", double19 == (-1.818402E9d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
            double double21 = calculadora0.raizQuadrada((-392277632));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int int1 = calculadora.Matematica.factorial(1502);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int int1 = calculadora.Matematica.factorial((-1669858085));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.dividir((int) (byte) 0, 70714490);
        int int23 = calculadora0.somar((-677952), (-4920));
        int int26 = calculadora0.multiplicar(1555308921, 5060);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-682872) + "'", int23 == (-682872));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1483053988 + "'", int26 == 1483053988);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair(10, 1);
        int int20 = calculadora0.dividir((-10472177), (-98397944));
        double double22 = calculadora0.raizQuadrada(7261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 85.21150157109074d + "'", double22 == 85.21150157109074d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int int1 = calculadora.Matematica.sum(1732706892);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-356899729) + "'", int1 == (-356899729));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int int1 = calculadora.Matematica.sum(1596835977);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 355930349 + "'", int1 == 355930349);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.porcentagem(12758826, 52);
        int int17 = calculadora0.multiplicar((-90), 529);
        double double20 = calculadora0.porcentagem(12253726, (-459480627));
        double double23 = calculadora0.potencia(520, 613);
        java.lang.Class<?> wildcardClass24 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.63458952E8d + "'", double14 == 6.63458952E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-47610) + "'", int17 == (-47610));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.32171526E8d + "'", double20 == 2.32171526E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair(143, 100);
        double double20 = calculadora0.porcentagem((int) (byte) 0, (-15763));
        java.lang.Class<?> wildcardClass21 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.dividir((int) (byte) 0, 70714490);
        int int23 = calculadora0.subtrair(3200, 0);
        double double25 = calculadora0.raizQuadrada(649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3200 + "'", int23 == 3200);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 25.475478405713993d + "'", double25 == 25.475478405713993d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int1 = calculadora.Matematica.factorial((-1381010048));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.subtrair(2, (int) (byte) 10);
        double double8 = calculadora0.raizQuadrada(44783);
        int int11 = calculadora0.multiplicar(70, 158400);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 211.61994234948654d + "'", double8 == 211.61994234948654d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11088000 + "'", int11 == 11088000);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        int int17 = calculadora0.subtrair((int) (byte) 10, (int) (short) 100);
        int int20 = calculadora0.somar(2526, (-54));
        int int23 = calculadora0.dividir(561, 275009);
        double double25 = calculadora0.raizQuadrada(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-90) + "'", int17 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2472 + "'", int20 == 2472);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        double double20 = calculadora0.potencia(43, 97);
        int int23 = calculadora0.somar(482358766, 0);
        int int26 = calculadora0.multiplicar((int) (byte) 100, (-34));
        double double28 = calculadora0.raizQuadrada(106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.083380139E9d + "'", double20 == 1.083380139E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 482358766 + "'", int23 == 482358766);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-3400) + "'", int26 == (-3400));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.295630140987d + "'", double28 == 10.295630140987d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        int int1 = calculadora.Matematica.factorial((-823690138));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar(6126751, 12253726);
        int int15 = calculadora0.subtrair(8197332, 367830);
        int int18 = calculadora0.subtrair(0, 2526);
        double double21 = calculadora0.porcentagem(12253726, 39);
        int int24 = calculadora0.multiplicar(4990, 1431);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculadora0.dividir(246323408, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Divisa?o por zero na?o permitida.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-500309854) + "'", int12 == (-500309854));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7829502 + "'", int15 == 7829502);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2526) + "'", int18 == (-2526));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.77895314E8d + "'", double21 == 4.77895314E8d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7140690 + "'", int24 == 7140690);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.multiplicar((-2535), (-204480));
        int int14 = calculadora0.somar(4990, 5);
        int int17 = calculadora0.subtrair((-20383), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 518356800 + "'", int11 == 518356800);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4995 + "'", int14 == 4995);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-20397) + "'", int17 == (-20397));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        int int34 = calculadora0.somar(70714490, (-2443617));
        int int37 = calculadora0.somar((-1370807707), 498877845);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 68270873 + "'", int34 == 68270873);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-871929862) + "'", int37 == (-871929862));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int int1 = calculadora.Matematica.factorial((-958015813));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        int int9 = calculadora0.subtrair((-1653134308), 3300);
        int int12 = calculadora0.multiplicar(1167616454, 10887601);
        java.lang.Class<?> wildcardClass13 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1653137608) + "'", int9 == (-1653137608));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1516742630 + "'", int12 == 1516742630);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(3300, 0);
        int int19 = calculadora0.dividir(157641, (int) (short) 10);
        int int22 = calculadora0.subtrair((-16310582), (int) 'a');
        int int25 = calculadora0.dividir((-463861759), (-626166995));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15764 + "'", int19 == 15764);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-16310679) + "'", int22 == (-16310679));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.multiplicar(2526, (-107130));
        java.lang.Class<?> wildcardClass15 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-270610380) + "'", int14 == (-270610380));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int int1 = calculadora.Matematica.factorial((-825950528));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.somar(9, 32);
        int int20 = calculadora0.dividir((-196352078), (-31930));
        int int23 = calculadora0.multiplicar((-28351), 1963777243);
        double double26 = calculadora0.porcentagem(47968, (-1333113776));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6149 + "'", int20 == 6149);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 612441755 + "'", int23 == 612441755);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 9.66462976E8d + "'", double26 == 9.66462976E8d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int1 = calculadora.Matematica.factorial(2640732);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(56, (int) (byte) 1);
        int int17 = calculadora0.subtrair(64, 7829502);
        int int20 = calculadora0.subtrair(188191, 19371844);
        double double23 = calculadora0.porcentagem(21645002, 92);
        double double26 = calculadora0.porcentagem(649, 70714490);
        int int29 = calculadora0.multiplicar((-1333113776), 560);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7829438) + "'", int17 == (-7829438));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-19183653) + "'", int20 == (-19183653));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.991340184E9d + "'", double23 == 1.991340184E9d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.350936246E9d) + "'", double26 == (-1.350936246E9d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 780594944 + "'", int29 == 780594944);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        int int14 = calculadora0.multiplicar(2756, (int) (short) 0);
        int int17 = calculadora0.dividir(310854959, 362880);
        int int20 = calculadora0.somar((int) '4', 1343133690);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 856 + "'", int17 == 856);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1343133742 + "'", int20 == 1343133742);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        int int17 = calculadora0.subtrair(3200, 556209);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-553009) + "'", int17 == (-553009));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int int1 = calculadora.Matematica.factorial(16139);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada(97);
        int int11 = calculadora0.somar(108, 153);
        int int14 = calculadora0.subtrair((-2073471875), 350115344);
        double double17 = calculadora0.potencia(71626580, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.848857801796104d + "'", double8 == 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 261 + "'", int11 == 261);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1871380077 + "'", int14 == 1871380077);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar(6126751, 12253726);
        int int15 = calculadora0.subtrair(8197332, 367830);
        int int18 = calculadora0.subtrair(0, 2526);
        int int21 = calculadora0.dividir((int) (byte) 0, 1862164);
        double double23 = calculadora0.raizQuadrada(1056242184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-500309854) + "'", int12 == (-500309854));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7829502 + "'", int15 == 7829502);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2526) + "'", int18 == (-2526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32499.879753623703d + "'", double23 == 32499.879753623703d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        int int14 = calculadora0.dividir(6579, 92);
        int int17 = calculadora0.multiplicar(5202153, 3300);
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12764284) + "'", int17 == (-12764284));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        int int11 = calculadora0.multiplicar(53, (int) '4');
        double double14 = calculadora0.porcentagem((-1915836162), 159359912);
        int int17 = calculadora0.dividir(539, (-513068772));
        int int20 = calculadora0.dividir((-630030211), (-463861198));
        int int23 = calculadora0.multiplicar(863607498, (-303582066));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2756 + "'", int11 == 2756);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.765449904E9d + "'", double14 == 1.765449904E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1131420660) + "'", int23 == (-1131420660));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        int int16 = calculadora0.dividir((-31), 10896601);
        double double18 = calculadora0.raizQuadrada(6579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 81.11103500757464d + "'", double18 == 81.11103500757464d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        int int11 = calculadora0.somar(4950, (int) (short) 1);
        int int14 = calculadora0.subtrair((-255064446), 784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4951 + "'", int11 == 4951);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-255065230) + "'", int14 == (-255065230));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        double double36 = calculadora0.raizQuadrada(1168757572);
        double double39 = calculadora0.potencia(2472, 635542934);
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 34187.0965716599d + "'", double36 == 34187.0965716599d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.dividir(52, 52);
        int int17 = calculadora0.somar((-1168394692), 5115);
        double double20 = calculadora0.porcentagem(79326074, 613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1168389577) + "'", int17 == (-1168389577));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.382243106E9d + "'", double20 == 1.382243106E9d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.potencia((int) (byte) -1, 3500);
        int int17 = calculadora0.multiplicar((-500309854), 2371);
        int int20 = calculadora0.somar((-499035486), 4990);
        int int23 = calculadora0.somar(159359912, 872954676);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-823690138) + "'", int17 == (-823690138));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-499030496) + "'", int20 == (-499030496));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1032314588 + "'", int23 == 1032314588);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int1 = calculadora.Matematica.factorial(1483053988);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        double double30 = calculadora0.raizQuadrada(232201856);
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 15238.171018859186d + "'", double30 == 15238.171018859186d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        int int29 = calculadora0.somar(5512, 869209328);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-6.98074801E8d) + "'", double17 == (-6.98074801E8d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-11) + "'", int23 == (-11));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 869214840 + "'", int29 == 869214840);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        double double7 = calculadora0.raizQuadrada((int) (short) 100);
        double double10 = calculadora0.porcentagem(321403357, 644062743);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.161127717E9d) + "'", double10 == (-1.161127717E9d));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        double double19 = calculadora0.porcentagem(99, 0);
        int int22 = calculadora0.multiplicar((-1744965562), 561);
        double double25 = calculadora0.potencia(12758818, 67795271);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 326863206 + "'", int22 == 326863206);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.multiplicar(3300, 0);
        int int19 = calculadora0.dividir(157641, (int) (short) 10);
        int int22 = calculadora0.subtrair((-16310582), (int) 'a');
        double double25 = calculadora0.porcentagem((-1243182), 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15764 + "'", int19 == 15764);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-16310679) + "'", int22 == (-16310679));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-5.0970462E7d) + "'", double25 == (-5.0970462E7d));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.potencia(4950, 108);
        int int17 = calculadora0.subtrair((-2443669), (-1056241881));
        int int20 = calculadora0.multiplicar(43, (-10));
        double double23 = calculadora0.porcentagem((-4920), (-1321388763));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1053798212 + "'", int17 == 1053798212);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-430) + "'", int20 == (-430));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.347772184E9d) + "'", double23 == (-1.347772184E9d));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double14 = calculadora0.porcentagem(10896567, 53);
        double double17 = calculadora0.potencia(13000161, 612441755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.77518051E8d + "'", double14 == 5.77518051E8d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.20155487E8d) + "'", double17 == (-1.20155487E8d));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.subtrair(53, (-90));
        int int6 = calculadora0.multiplicar(43, 153);
        double double9 = calculadora0.porcentagem((-2443669), 2371);
        int int12 = calculadora0.subtrair((-500309854), 12758918);
        int int15 = calculadora0.subtrair((-88716792), 3500);
        double double18 = calculadora0.porcentagem((-86), 934575000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6579 + "'", int6 == 6579);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.498971903E9d) + "'", double9 == (-1.498971903E9d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-513068772) + "'", int12 == (-513068772));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88720292) + "'", int15 == (-88720292));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.230928624E9d + "'", double18 == 1.230928624E9d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        int int39 = calculadora0.multiplicar((int) (short) 100, (-677952));
        double double42 = calculadora0.porcentagem(56, 1075418326);
        double double45 = calculadora0.porcentagem(79326074, 1566529759);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-67795200) + "'", int39 == (-67795200));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 9.3884112E7d + "'", double42 == 9.3884112E7d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.738248006E9d + "'", double45 == 1.738248006E9d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        int int29 = calculadora0.somar(2104872, 143);
        int int32 = calculadora0.dividir((-630036684), (-1649035520));
        double double35 = calculadora0.potencia(275009, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33 + "'", int26 == 33);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2105015 + "'", int29 == 2105015);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.multiplicar((-3301), (-3301));
        double double15 = calculadora0.porcentagem((int) '#', 296384028);
        int int18 = calculadora0.subtrair(0, 0);
        int int21 = calculadora0.multiplicar(367830, (-500309854));
        int int24 = calculadora0.somar(3191602, (-355055715));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10896601 + "'", int12 == 10896601);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.783506388E9d + "'", double15 == 1.783506388E9d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1785102188 + "'", int21 == 1785102188);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-351864113) + "'", int24 == (-351864113));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int1 = calculadora.Matematica.sum(1235332973);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1232663019 + "'", int1 == 1232663019);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia(56, (int) '4');
        double double14 = calculadora0.porcentagem(5051, (-90));
        double double17 = calculadora0.potencia((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass18 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-454590.0d) + "'", double14 == (-454590.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        int int1 = calculadora.Matematica.sum((-825950528));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        double double19 = calculadora0.potencia((-784238464), 12758818);
        double double21 = calculadora0.raizQuadrada(40504501);
        int int24 = calculadora0.multiplicar(1126969732, 68274373);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6364.314652812194d + "'", double21 == 6364.314652812194d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1854588268) + "'", int24 == (-1854588268));
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.potencia((-1056240805), 153);
        double double17 = calculadora0.potencia(0, 1048044852);
        double double20 = calculadora0.potencia(529, 232207006);
        int int23 = calculadora0.somar(561, (-1173745664));
        int int26 = calculadora0.dividir(70, 1126969684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.787388357E9d) + "'", double14 == (-1.787388357E9d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.101303521E9d + "'", double20 == 2.101303521E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1173745103) + "'", int23 == (-1173745103));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        double double28 = calculadora0.raizQuadrada(0);
        int int31 = calculadora0.somar(3500, 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2526 + "'", int20 == 2526);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1915836108) + "'", int23 == (-1915836108));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-355062730) + "'", int26 == (-355062730));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3643 + "'", int31 == 3643);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        int int34 = calculadora0.somar(2527, 41);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 367830 + "'", int31 == 367830);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2568 + "'", int34 == 2568);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        double double11 = calculadora0.potencia((int) (short) 0, 0);
        double double13 = calculadora0.raizQuadrada((int) (short) 100);
        int int16 = calculadora0.subtrair((int) (byte) -1, 53);
        double double19 = calculadora0.potencia(5051000, 11781);
        int int22 = calculadora0.multiplicar(14, 56);
        double double25 = calculadora0.potencia(518356800, 50511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 784 + "'", int22 == 784);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((-1), (int) (short) 1);
        double double12 = calculadora0.porcentagem(99, 1379);
        double double15 = calculadora0.potencia((int) (byte) -1, 50608);
        double double18 = calculadora0.porcentagem(48, 1056240804);
        int int21 = calculadora0.dividir((int) '#', (-1277355836));
        // The following exception was thrown during execution in test generation
        try {
            double double23 = calculadora0.raizQuadrada((-108366441));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular a raiz quadrada de um nu?mero negativo.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 136521.0d + "'", double12 == 136521.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.4004896E8d) + "'", double18 == (-8.4004896E8d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double9 = calculadora0.porcentagem(157641, 50608);
        int int12 = calculadora0.multiplicar(108, 5115);
        int int15 = calculadora0.subtrair((-500302768), (-950697841));
        java.lang.Class<?> wildcardClass16 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-6.12038864E8d) + "'", double9 == (-6.12038864E8d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 552420 + "'", int12 == 552420);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 450395073 + "'", int15 == 450395073);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        boolean boolean1 = calculadora.Matematica.isPrime(1527806659);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        int int34 = calculadora0.somar(2527, 41);
        int int37 = calculadora0.dividir((-1810759158), 741);
        int int40 = calculadora0.multiplicar(499035646, 4908);
        java.lang.Class<?> wildcardClass41 = calculadora0.getClass();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2568 + "'", int34 == 2568);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2443669) + "'", int37 == (-2443669));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1135591848 + "'", int40 == 1135591848);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double9 = calculadora0.potencia(15764, 631809017);
        double double12 = calculadora0.porcentagem(499035496, 2104872);
        int int15 = calculadora0.subtrair((-1571632104), 44783);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.42414432E9d) + "'", double12 == (-1.42414432E9d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1571676887) + "'", int15 == (-1571676887));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.subtrair(3500, 4576);
        double double15 = calculadora0.potencia((-97864074), 68284800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1076) + "'", int12 == (-1076));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double3 = calculadora0.potencia((-90), (int) ' ');
        int int6 = calculadora0.subtrair(2, (int) (byte) 10);
        int int9 = calculadora0.multiplicar(70714490, (-367412678));
        double double12 = calculadora0.potencia(47624, 158400);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-509499484) + "'", int9 == (-509499484));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        int int28 = calculadora0.multiplicar((-1104039575), 50510);
        double double31 = calculadora0.potencia((-626166995), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3399) + "'", int16 == (-3399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5060 + "'", int19 == 5060);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 816438014 + "'", int28 == 816438014);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        double double29 = calculadora0.potencia(1126969732, 2371);
        double double32 = calculadora0.potencia((-2147483648), 285498082);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-6.98074801E8d) + "'", double17 == (-6.98074801E8d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-11) + "'", int23 == (-11));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        int int29 = calculadora0.somar(2104872, 143);
        int int32 = calculadora0.dividir((-630036684), (-1649035520));
        int int35 = calculadora0.subtrair((-1571045116), 27083);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-54) + "'", int14 == (-54));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250156910 + "'", int20 == 250156910);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33 + "'", int26 == 33);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2105015 + "'", int29 == 2105015);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1571072199) + "'", int35 == (-1571072199));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        // The following exception was thrown during execution in test generation
        try {
            double double37 = calculadora0.potencia(2371, (-826960763));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2104872 + "'", int28 == 2104872);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8197332 + "'", int31 == 8197332);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-678042) + "'", int34 == (-678042));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        int int31 = calculadora0.dividir(4908, (-9035));
        int int34 = calculadora0.somar((-1056240805), 58870);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = calculadora0.raizQuadrada((-99887451));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1056181935) + "'", int34 == (-1056181935));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair((-108366441), (-961108980));
        int int20 = calculadora0.somar(0, (-396929508));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 852742539 + "'", int17 == 852742539);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-396929508) + "'", int20 == (-396929508));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(33);
        double double16 = calculadora0.porcentagem(106, 5);
        double double18 = calculadora0.raizQuadrada(10887601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.744562646538029d + "'", double13 == 5.744562646538029d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 530.0d + "'", double16 == 530.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3299.636495130941d + "'", double18 == 3299.636495130941d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        int int9 = calculadora0.multiplicar((int) (byte) 10, 0);
        int int12 = calculadora0.subtrair(499035486, 157641);
        int int15 = calculadora0.subtrair(1555308921, (-62052391));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 498877845 + "'", int12 == 498877845);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1617361312 + "'", int15 == 1617361312);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        double double2 = calculadora0.raizQuadrada((int) '4');
        int int5 = calculadora0.somar(56, (int) (short) 0);
        int int8 = calculadora0.multiplicar(5051, (int) (byte) 10);
        int int11 = calculadora0.multiplicar((int) ' ', (int) (short) 1);
        int int14 = calculadora0.multiplicar(0, 157641);
        double double17 = calculadora0.potencia(47983, 1379);
        double double20 = calculadora0.potencia((-7829438), 2579);
        int int23 = calculadora0.dividir((-1255225024), 108367055);
        double double26 = calculadora0.porcentagem(852742800, 1547080348);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50510 + "'", int8 == 50510);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-6.98074801E8d) + "'", double17 == (-6.98074801E8d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-11) + "'", int23 == (-11));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.42585664E8d) + "'", double26 == (-2.42585664E8d));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int1 = calculadora.Matematica.sum((-684757504));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        int int32 = calculadora0.multiplicar((-430), 1235336173);
        int int35 = calculadora0.somar((int) ' ', 688061411);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1381390314 + "'", int32 == 1381390314);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 688061443 + "'", int35 == 688061443);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.dividir(1, 99);
        int int12 = calculadora0.subtrair(3500, 4576);
        int int15 = calculadora0.somar(50, 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1076) + "'", int12 == (-1076));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 770 + "'", int15 == 770);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        boolean boolean1 = calculadora.Matematica.isPrime((-499020496));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        double double28 = calculadora0.porcentagem(304857, (-9035));
        int int31 = calculadora0.somar((-97864074), 11188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-54) + "'", int16 == (-54));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 784 + "'", int22 == 784);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-161632.0d) + "'", double25 == (-161632.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.540584301E9d + "'", double28 == 1.540584301E9d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-97852886) + "'", int31 == (-97852886));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double5 = calculadora0.raizQuadrada((int) (short) 0);
        int int8 = calculadora0.multiplicar(367830, (-459480627));
        int int11 = calculadora0.somar(188191, (-1067));
        int int14 = calculadora0.somar(1313662592, (-302683408));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = calculadora0.potencia(9000, (-5262));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Na?o e? possi?vel calcular para nu?meros negativos.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 499035486 + "'", int8 == 499035486);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 187124 + "'", int11 == 187124);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1010979184 + "'", int14 == 1010979184);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        // The following exception was thrown during execution in test generation
        try {
            double double32 = calculadora0.potencia((-90796998), (-97852886));
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5455188.0d + "'", double26 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1379021495 + "'", int29 == 1379021495);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.dividir((int) (byte) 0, 5051000);
        double double20 = calculadora0.porcentagem(5051000, (-2526));
        double double23 = calculadora0.porcentagem(41, (-44727));
        double double26 = calculadora0.potencia(1134046501, 139296381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.26075888E8d + "'", double20 == 1.26075888E8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1833807.0d) + "'", double23 == (-1833807.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.904939381E9d + "'", double26 == 1.904939381E9d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir((int) (short) -1, 97);
        double double13 = calculadora0.raizQuadrada(10);
        int int16 = calculadora0.multiplicar((-10), 153);
        double double19 = calculadora0.potencia(5150, 12758818);
        int int22 = calculadora0.subtrair((int) '4', 9);
        double double25 = calculadora0.porcentagem(35, 17);
        double double28 = calculadora0.porcentagem(153, 10896754);
        int int31 = calculadora0.dividir(10896567, 50440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.1622776601683795d + "'", double13 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1530) + "'", int16 == (-1530));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43 + "'", int22 == 43);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 595.0d + "'", double25 == 595.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.667203362E9d + "'", double28 == 1.667203362E9d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 216 + "'", int31 == 216);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.porcentagem(108, 50511);
        int int14 = calculadora0.somar((-1745154368), 188806);
        double double17 = calculadora0.porcentagem((-1301739248), (-7829438));
        int int20 = calculadora0.dividir((-1810759117), 1963777343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5455188.0d + "'", double11 == 5455188.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1744965562) + "'", int14 == (-1744965562));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.93954864E9d) + "'", double17 == (-1.93954864E9d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        double double14 = calculadora0.potencia((int) (byte) 100, 0);
        int int17 = calculadora0.multiplicar(100, 50510);
        int int20 = calculadora0.multiplicar(5191, 524700);
        double double23 = calculadora0.potencia(1668074498, 1623691425);
        int int26 = calculadora0.subtrair(10897474, 265961920);
        double double28 = calculadora0.raizQuadrada(10472177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5051000 + "'", int17 == 5051000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1571249596) + "'", int20 == (-1571249596));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-255064446) + "'", int26 == (-255064446));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3236.0743192949076d + "'", double28 == 3236.0743192949076d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        int int11 = calculadora0.somar(9, (-1076));
        int int14 = calculadora0.dividir(631805627, (-499020496));
        int int17 = calculadora0.multiplicar(188806, (-4719837));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1067) + "'", int11 == (-1067));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2075314350) + "'", int17 == (-2075314350));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        int int31 = calculadora0.multiplicar(70714490, 2579);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1984043278 + "'", int31 == 1984043278);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        int int31 = calculadora0.somar(304857, (-1320864063));
        int int34 = calculadora0.somar(499035646, (-302680881));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1320559206) + "'", int31 == (-1320559206));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 196354765 + "'", int34 == 196354765);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        double double12 = calculadora0.porcentagem(228511908, 43);
        int int15 = calculadora0.subtrair(1235336173, 3200);
        double double17 = calculadora0.raizQuadrada(250156910);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.236077452E9d + "'", double12 == 1.236077452E9d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1235332973 + "'", int15 == 1235332973);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15816.349452386286d + "'", double17 == 15816.349452386286d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((int) (byte) 10, 10);
        double double8 = calculadora0.raizQuadrada(561);
        int int11 = calculadora0.subtrair((int) (short) -1, 3300);
        double double14 = calculadora0.potencia(97, 50511);
        int int17 = calculadora0.multiplicar(5446651, 1597);
        double double20 = calculadora0.potencia(43, 97);
        int int23 = calculadora0.somar(482358766, 0);
        double double26 = calculadora0.porcentagem(2527, 935867534);
        int int29 = calculadora0.subtrair(106029, (-196418871));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.68543856465402d + "'", double8 == 23.68543856465402d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3301) + "'", int11 == (-3301));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.34880929E8d + "'", double14 == 4.34880929E8d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 108367055 + "'", int17 == 108367055);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.083380139E9d + "'", double20 == 1.083380139E9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 482358766 + "'", int23 == 482358766);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.589721678E9d) + "'", double26 == (-1.589721678E9d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 196524900 + "'", int29 == 196524900);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.somar((-1), (int) (short) 100);
        int int11 = calculadora0.dividir((int) ' ', (int) ' ');
        int int14 = calculadora0.dividir(274911, 7829502);
        int int17 = calculadora0.multiplicar(4798, 68559809);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1762518210) + "'", int17 == (-1762518210));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
            double double31 = calculadora0.potencia((-97864074), (-1067));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10896754 + "'", int28 == 10896754);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        boolean boolean1 = calculadora.Matematica.isPrime(1483110624);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        int int14 = calculadora0.somar((int) '4', 56);
        int int17 = calculadora0.subtrair((-108366441), (-961108980));
        int int20 = calculadora0.somar((-40408), (-88716792));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 852742539 + "'", int17 == 852742539);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-88757200) + "'", int20 == (-88757200));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        double double11 = calculadora0.potencia(4908, 100);
        double double14 = calculadora0.porcentagem(5191, (-500302768));
        int int17 = calculadora0.dividir(2071384515, 16358302);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.383545392E9d + "'", double14 == 1.383545392E9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 126 + "'", int17 == 126);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        int int6 = calculadora0.somar((int) (short) 0, 97);
        double double8 = calculadora0.raizQuadrada(3500);
        int int11 = calculadora0.somar(9, (-1076));
        int int14 = calculadora0.dividir(11781, (-1571072199));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.16079783099616d + "'", double8 == 59.16079783099616d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1067) + "'", int11 == (-1067));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        double double16 = calculadora0.porcentagem(10, (int) (byte) -1);
        double double19 = calculadora0.potencia((-784238464), 12758818);
        double double21 = calculadora0.raizQuadrada(40504501);
        int int24 = calculadora0.dividir((-1056181935), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6364.314652812194d + "'", double21 == 6364.314652812194d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-105618193) + "'", int24 == (-105618193));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        int int29 = calculadora0.multiplicar((-2), 145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1164018784) + "'", int23 == (-1164018784));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.583850028E9d) + "'", double26 == (-1.583850028E9d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-290) + "'", int29 == (-290));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        boolean boolean1 = calculadora.Matematica.isPrime(951510);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(100, 100);
        int int14 = calculadora0.subtrair(92, (-736014630));
        double double17 = calculadora0.potencia((-678042), 0);
        int int20 = calculadora0.somar((-385386529), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 736014722 + "'", int14 == 736014722);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-385386534) + "'", int20 == (-385386534));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir(426942010, 15764);
        java.lang.Class<?> wildcardClass12 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27083 + "'", int11 == 27083);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        double double8 = calculadora0.raizQuadrada((int) (short) 0);
        double double11 = calculadora0.potencia(52, 53);
        int int14 = calculadora0.dividir(0, 53);
        double double16 = calculadora0.raizQuadrada(32);
        int int19 = calculadora0.multiplicar(5446651, 290577660);
        int int22 = calculadora0.multiplicar((-90796981), 3453);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.656854249492381d + "'", double16 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1128677140 + "'", int19 == 1128677140);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10637215 + "'", int22 == 10637215);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
            double double25 = calculadora0.potencia(0, (-509499484));
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
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        boolean boolean1 = calculadora.Matematica.isPrime(2556);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.porcentagem((-34), 33);
        int int9 = calculadora0.multiplicar(143, 35);
        java.lang.Class<?> wildcardClass10 = calculadora0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1122.0d) + "'", double6 == (-1122.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5005 + "'", int9 == 5005);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int int1 = calculadora.Matematica.sum(1527806662);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1498998262 + "'", int1 == 1498998262);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        double double7 = calculadora0.raizQuadrada(0);
        double double10 = calculadora0.porcentagem(50608, 188191);
        int int13 = calculadora0.dividir(47983, 3300);
        int int16 = calculadora0.somar(24, 1225678159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.34035536E8d + "'", double10 == 9.34035536E8d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1225678183 + "'", int16 == 1225678183);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        double double31 = calculadora0.porcentagem(47968, 21644910);
        int int34 = calculadora0.subtrair((-15451), 50440);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.119042752E9d) + "'", double31 == (-1.119042752E9d));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-65891) + "'", int34 == (-65891));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.dividir((int) '4', (int) (byte) 1);
        double double6 = calculadora0.potencia((int) '#', (int) (short) 1);
        double double9 = calculadora0.porcentagem((-1), 5150);
        int int12 = calculadora0.dividir(1, (-196418871));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-5150.0d) + "'", double9 == (-5150.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        boolean boolean1 = calculadora.Matematica.isPrime((-839593119));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double5 = calculadora0.raizQuadrada(100);
        int int8 = calculadora0.multiplicar((int) ' ', 0);
        int int11 = calculadora0.dividir(426942010, 15764);
        double double13 = calculadora0.raizQuadrada(3191602);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27083 + "'", int11 == 27083);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1786.5055275593188d + "'", double13 == 1786.5055275593188d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        calculadora.Calculadora calculadora0 = new calculadora.Calculadora();
        int int3 = calculadora0.somar((int) (byte) 1, (int) '4');
        double double6 = calculadora0.potencia(100, (int) '4');
        int int9 = calculadora0.dividir((int) (short) 1, (int) (byte) 1);
        double double11 = calculadora0.raizQuadrada(10);
        double double14 = calculadora0.potencia((-1056240805), 153);
        double double17 = calculadora0.potencia(0, 1048044852);
        double double20 = calculadora0.potencia(50608, 0);
        int int23 = calculadora0.somar(99, (-1344217536));
        double double26 = calculadora0.porcentagem(43, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.787388357E9d) + "'", double14 == (-1.787388357E9d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1344217437) + "'", int23 == (-1344217437));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2408.0d + "'", double26 == 2408.0d);
    }
}

