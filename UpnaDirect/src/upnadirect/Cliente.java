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
public class Cliente {
    private int salario;
    private int anoNcto;
    public Bien bien;
    public Cliente(int salario, int anoNcto, Bien bien){
        this.salario = salario;
        this.anoNcto = anoNcto;
        this.bien = bien;
    }

    public int calcularEdad(){
        Calendar calendario = Calendar.getInstance();
        int anoActual = calendario.get(Calendar.YEAR);
        return(anoActual - this.anoNcto);
    }

    public int getSalario(){
        return this.salario;
    }
    
    public int getAnoNcto(){
        return anoNcto;
    }
}
