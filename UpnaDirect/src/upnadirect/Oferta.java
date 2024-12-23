/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Oferta {
    public Cliente cliente;
    public Aseguradora mejorAseguradora;
    public List<Aseguradora> listaAseguradoras;
            
    public Oferta(Cliente cliente){
        this.cliente = cliente;
        listaAseguradoras = new ArrayList<>();
    }
    
    private void crearAseguradoras(){
        listaAseguradoras.add(new Mafro());
        listaAseguradoras.add(new LineaIndirecta());
        listaAseguradoras.add(new Adasles());
        
        for (Aseguradora aseguradora : listaAseguradoras) {
            aseguradora.calcularImporte(cliente);
            aseguradora.calcularComision(cliente);
        }
    }
    
    public void compararAseguradoras(){
        double mejorOferta = 0;
        
        crearAseguradoras();
        
        mejorAseguradora = listaAseguradoras.get(0);
        mejorOferta = mejorAseguradora.getComision() + mejorAseguradora.getImporte();
        
        for (Aseguradora aseguradora : listaAseguradoras) {
            if((aseguradora.getComision() + aseguradora.getImporte()) < mejorOferta){
                mejorOferta = aseguradora.getComision() + aseguradora.getImporte();
                mejorAseguradora = aseguradora;
            }
        }
    }

    public Aseguradora getMejorAseguradora() {
        return mejorAseguradora;
    }    
}
