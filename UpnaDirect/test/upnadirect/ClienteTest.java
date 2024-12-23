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
public class ClienteTest {
    public ClienteTest() {
    }

    @Test
    public void testValidarCliente_edad_OK() {
        Vista vista = new Vista();
        vista.setAnoNacimiento(1970);
        Presentador presentador = new Presentador(vista);
        
        assertTrue(presentador.esValidoCliente());
    }
    
    @Test
    public void testValidarCliente_edad_NOK() {
        Vista vista = new Vista();
        vista.setAnoNacimiento(1800);
        Presentador presentador = new Presentador(vista);
        
        assertFalse(presentador.esValidoCliente());
    }
    
    @Test
    public void testValidarCliente_edad_incorrecta2() {
        Vista vista = new Vista();
        vista.setAnoNacimiento(2500);
        Presentador presentador = new Presentador(vista);
        
        assertFalse(presentador.esValidoCliente());
    }
}
