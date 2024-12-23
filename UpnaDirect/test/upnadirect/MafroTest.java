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
public class MafroTest {
    @Test
    public void testGenerarOferta_mafro_OK() {
        Mafro aseguradora = new Mafro();
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(35000, 1970, bien);
        
        assertTrue(aseguradora.calcularImporte(cliente)==(3600) & aseguradora.calcularComision(cliente)==(108));
    }
    
    @Test
    public void testGenerarOferta_mafro_NOK() {
        Mafro aseguradora = new Mafro();
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(35000, 1970, bien);
        assertFalse(aseguradora.calcularImporte(cliente)==(3700) | aseguradora.calcularComision(cliente)==(110));
    }
}
