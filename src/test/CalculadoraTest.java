package test;

import calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setup(){
        calculadora = new Calculadora();
    }

    @Test
    public void testSomar() {
        assertEquals(8, calculadora.somar(5, 3));
        assertEquals(-2, calculadora.somar(-5, 3));
        assertEquals(0, calculadora.somar(0, 0));
    }

    @Test
    public void testSubtrair() {
        assertEquals(2, calculadora.subtrair(5, 3));
        assertEquals(-8, calculadora.subtrair(-5, 3));
        assertEquals(0, calculadora.subtrair(0, 0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15, calculadora.multiplicar(5, 3));
        assertEquals(-15, calculadora.multiplicar(-5, 3));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }
    
    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(-6, 3));
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(6, 0));
    }

    @Test
    public void testRaizQuadrada() {
        assertEquals(2, calculadora.raizQuadrada(4));
        assertEquals(0, calculadora.raizQuadrada(0));
        assertThrows(IllegalArgumentException.class, () -> calculadora.raizQuadrada(-4));
    }

    @Test
    public void testPotencia() throws  IllegalArgumentException{
        assertEquals(8, calculadora.potencia(2,3));
    }

    @Test
    public void testPotenciaIgual0() throws  IllegalArgumentException{
        assertEquals(1, calculadora.potencia(2,0));
    }

    @Test
    public void testPotenciaNegativo()   {
        assertThrows(IllegalArgumentException.class, () -> calculadora.potencia(2,-1));
    }


}
