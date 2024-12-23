/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

public class Bien {
        private String tipo;
        private int valor;
        public Bien(String tipo, int valor){

                this.tipo = tipo;
                this.valor = valor;
        }
        
        public int getValor(){
            return this.valor;
        }
        public String getTipo(){
            return this.tipo;
        }
        public boolean EsVehiculo(){
            return tipo != null && tipo.equals("vehiculo");
        }
        public boolean EsVivienda(){
            return tipo != null && tipo.equals("vivienda");
        }
}

