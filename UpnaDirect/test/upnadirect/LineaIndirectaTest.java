/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author alumno
 */
public class LineaIndirectaTest {
    @Test
    public void testGenerarOferta_lineaIndirecta_OK() {
        LineaIndirecta aseguradora = new LineaIndirecta();
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(35000, 1970, bien);
        double a = aseguradora.calcularImporte(cliente);
        
        assertTrue(aseguradora.calcularImporte(cliente)==(4800) & aseguradora.calcularComision(cliente)==(192));
    }

    @Test
    public void testGenerarOferta_lineaIndirecta_NOK() {
        LineaIndirecta aseguradora = new LineaIndirecta();
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(35000, 1970, bien);
        assertFalse(aseguradora.calcularImporte(cliente)==(3700) | aseguradora.calcularComision(cliente)==(110));
    }
}
