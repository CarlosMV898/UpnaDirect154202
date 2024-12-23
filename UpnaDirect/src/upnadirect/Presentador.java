/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class Presentador {
    public Vista vista;
    public Cliente cliente;
    public Bien bien;
    public Oferta oferta;
    
    public Presentador(Vista vista){
        this.vista = vista;
    }
    
    public boolean esValidoCliente(){
        Calendar calendario = Calendar.getInstance();
        int anoActual = calendario.get(Calendar.YEAR);
        return(vista.getAnoNacimiento()>1900 && vista.getAnoNacimiento()<=anoActual);
    }
    
    public boolean esValidoBien(){
        boolean b=false;
        if(vista.getTipoBien().equals("vivienda") && vista.getValor()>=50000){
            b = true;
        }
        if(vista.getTipoBien().equals("vehiculo") && vista.getValor()<=50000){
            b = true;
        }
        return b;
    }
    
    public void crearCliente(){
        cliente = new Cliente(vista.getSalario(), vista.getAnoNacimiento(), this.bien);
    }
    
    public void crearBien(){
        bien = new Bien(vista.getTipoBien(), vista.getValor());
    }
    
    public void buscarMejorOferta(){
        Aseguradora aseguradora;
        
        oferta = new Oferta(this.cliente);
        oferta.compararAseguradoras();
        aseguradora = oferta.getMejorAseguradora();
        vista.setOfertaFormato("La oferta más ventajos es: " + aseguradora.getNombre() +" | " + aseguradora.getImporte() + " | " + aseguradora.getComision());
    }
}
