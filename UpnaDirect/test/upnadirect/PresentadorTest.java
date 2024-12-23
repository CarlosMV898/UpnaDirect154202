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
public class PresentadorTest {
    @Test
    public void testValidarCliente_edad_correcta() {
        Vista vista = new Vista();
        vista.setAnoNacimiento(2005);
        vista.setSalario(15000);
        vista.setTipoBien("vehiculo");
        vista.setValor(30000);
        Presentador presentador = new Presentador(vista);
        
        presentador.crearBien();
        presentador.crearCliente();
        
        presentador.buscarMejorOferta();
        
        assertTrue(vista.getOfertaFormato().equals("La oferta más ventajos es: LineaIndirecta | 900.0 | 9"));
    }
    
}
