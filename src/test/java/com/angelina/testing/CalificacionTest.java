package com.angelina.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {

    Calificacion calificacion = new Calificacion();

    @Test
    public void testCalcularPromedio() {
        
        assertEquals(15.0, calificacion.calcularPromedio(15, 14, 16));
        assertEquals(12.0, calificacion.calcularPromedio(10, 12, 14));
        assertEquals(18.0, calificacion.calcularPromedio(20, 18, 16));
    }

    @Test
    public void testEstaAprobado() {
        
        assertTrue(calificacion.estaAprobado(15.0));
        assertTrue(calificacion.estaAprobado(13.0)); // Límite
        assertFalse(calificacion.estaAprobado(12.0));
        assertFalse(calificacion.estaAprobado(5.0));
    
        assertFalse(calificacion.estaAprobado(12.9)); 
    }
}