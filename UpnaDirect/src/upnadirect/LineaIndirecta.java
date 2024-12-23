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
public class LineaIndirecta extends Aseguradora{
    
    public LineaIndirecta() {
        super("LineaIndirecta");
    }
    
    @Override
    public double calcularImporte(Cliente cliente){
        int porcentaje;
        
        porcentaje = 3;
        if ((cliente.bien.EsVehiculo() & cliente.bien.getValor()<20000) | (cliente.bien.EsVivienda() & cliente.bien.getValor()<150000)){
            porcentaje = 4;
        }
        
        if (cliente.bien.getValor()>=20000 & cliente.bien.EsVehiculo() & cliente.calcularEdad()>60){
            porcentaje = 6;
        }
                
        double importe = (cliente.bien.getValor()*porcentaje)/100;
        this.setImporte(importe);
        
        return importe;
    }
    
    @Override
    public int calcularComision(Cliente cliente){
        int porcentaje;
        
        porcentaje = 4;
        if(this.getImporte() <= 1000){
            porcentaje = 1;
        }

        int comision = (int) Math.floor((this.getImporte() * porcentaje) / 100.0);
        this.setComision(comision);
                
        return comision;
    }
}
