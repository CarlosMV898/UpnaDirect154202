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
public class BienTest {
    @Test
    public void testValidar_bien_OK() {
        Vista vista = new Vista();
        vista.setTipoBien("vivienda");
        vista.setValor(120000);
        Presentador presentador = new Presentador(vista);
        
        assertTrue(presentador.esValidoBien());
    }
    
    @Test
    public void testValidar_bien_NOK() {
        Vista vista = new Vista();
        vista.setTipoBien("viv");
        vista.setValor(120000);
        Presentador presentador = new Presentador(vista);
        
        assertFalse(presentador.esValidoBien());
    }
    
    @Test
    public void testValidar_bien_NOK2() {
        Vista vista = new Vista();
        vista.setTipoBien("vivienda");
        vista.setValor(10000);
        Presentador presentador = new Presentador(vista);
        
        assertFalse(presentador.esValidoBien());
    }
}
