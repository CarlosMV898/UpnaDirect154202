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
public class Mafro extends Aseguradora{
    public Mafro() {
        super("Mafro");
    }
    
    @Override
    public double calcularImporte(Cliente cliente){
        int porcentaje;
        
        porcentaje = 3;
        if (cliente.calcularEdad()<20 & cliente.bien.EsVehiculo()){
            porcentaje = 5;
        }
        
        if (cliente.bien.getValor()>200000 & cliente.bien.EsVivienda() & cliente.getSalario()<20000){
            porcentaje = 2;
        }
                
        double importe = (cliente.bien.getValor()*porcentaje)/100;
        this.setImporte(importe);
        
        return importe;
    }
    
    @Override
    public int calcularComision(Cliente cliente){
        int porcentaje;
        
        porcentaje = 3;
        if(this.getImporte() <= 1000){
            porcentaje = 1;
        }

        int comision = (int) Math.floor((this.getImporte() * porcentaje) / 100.0);
        this.setComision(comision);
                
        return comision;
    }
}
