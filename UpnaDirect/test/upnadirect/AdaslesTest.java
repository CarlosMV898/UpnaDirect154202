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
public class AdaslesTest {
    @Test
    public void testGenerarOferta_adasles_OK() {
        Adasles aseguradora = new Adasles();
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(35000, 1970, bien);
        
        assertTrue(aseguradora.calcularImporte(cliente)==(2400) & aseguradora.calcularComision(cliente)==(120));
    }
    
    @Test
    public void testGenerarOferta_adasles_NOK() {
        Adasles aseguradora = new Adasles();
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(35000, 1970, bien);
        assertFalse(aseguradora.calcularImporte(cliente)==(2450) | aseguradora.calcularComision(cliente)==(125));
    }
}