package com.angelina.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoTest {

    Descuento calculadora = new Descuento();

    @Test
    public void testCalcularPrecioFinal() {
        assertEquals(90.0, calculadora.calcularPrecioFinal(100.0, 10.0));
        assertEquals(160.0, calculadora.calcularPrecioFinal(200.0, 20.0));
        assertEquals(50.0, calculadora.calcularPrecioFinal(50.0, 0.0));
        assertEquals(250.0, calculadora.calcularPrecioFinal(500.0, 50.0));

        assertEquals(0.0, calculadora.calcularPrecioFinal(100.0, 100.0));
    }
}