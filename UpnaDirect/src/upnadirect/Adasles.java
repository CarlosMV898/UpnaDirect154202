package upnadirect;

public class Adasles extends Aseguradora{
    public Adasles() {
        super("Adasles");
    }
    
    @Override
    public double calcularImporte(Cliente cliente){
        int porcentaje;
        
        porcentaje = 2;
        if ((cliente.calcularEdad()<20 | cliente.calcularEdad()>60) & cliente.bien.EsVehiculo()){
            porcentaje = 6;
        }
        
        double importe = (cliente.bien.getValor()*porcentaje)/100;
        this.setImporte(importe);
        
        return importe;
    }
    
    @Override
    public int calcularComision(Cliente cliente){
        int porcentaje;
        
        porcentaje = 5;
        if(this.getImporte() <= 1000){
            porcentaje = 1;
        }

        
        int comision = (int) Math.floor((this.getImporte() * porcentaje) / 100.0);
        this.setComision(comision);
                
        return comision;
    }
    
}
