/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Ejecutor {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Presentador presentador = new Presentador(vista);
        
        presentador.vista.registrarSalario();
        presentador.vista.registrarAnoNacimiento();
        
        while(!presentador.esValidoCliente()){
            System.out.print("Datos del cliente incorrectos, vuelve a introducirlos: \n");
            presentador.vista.registrarSalario();
            presentador.vista.registrarAnoNacimiento();
        }
        
        presentador.vista.registrarTipoBien();
        presentador.vista.registrarValor();
            
        while(!presentador.esValidoBien()){
            System.out.print("Datos del bien incorrectos, vuelve a introducirlos: \n");
            presentador.vista.registrarTipoBien();
            presentador.vista.registrarValor();
        }
        
        presentador.crearBien();
        presentador.crearCliente();
        
        presentador.buscarMejorOferta();
        vista.mostrarOferta();
    }
}
    

