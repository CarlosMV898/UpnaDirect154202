package upnadirect;

public class Aseguradora {
    private String nombre;
    private double importe;
    private int comision;
    public Aseguradora(String nombre)
    {
        this.nombre = nombre;
        this.importe = 0;
        this.comision = 0;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getImporte() {
        return importe;
    }

    public int getComision() {
        return comision;
    }
    
    public double calcularImporte(Cliente cliente){
        return importe;
    }
    
    public int calcularComision(Cliente cliente){
        return comision;
    }

    
}