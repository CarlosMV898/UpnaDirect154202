/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import java.util.Scanner;

public class Vista {
    private int salario;
    private int anoNacimiento;
    private int valor;
    private String tipoBien;
    private String OfertaFormato;
    
    public void registrarSalario(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el salario del cliente: ");
        salario = scan.nextInt();       
    }
    
    public void registrarAnoNacimiento(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el año de nacimiento del cliente: ");
        anoNacimiento = scan.nextInt();
    }
    
    public void registrarTipoBien(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el tipo de bien: ");
        tipoBien = scan.nextLine();
    }
    
    public void registrarValor(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el valor del bien: ");
        valor = scan.nextInt();
    }

    public int getSalario() {
        return salario;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public int getValor() {
        return valor;
    }

    public String getTipoBien() {
        return tipoBien;
    }

    public String getOfertaFormato() {
        return OfertaFormato;
    }

    public void setOfertaFormato(String OfertaFormato) {
        this.OfertaFormato = OfertaFormato;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setTipoBien(String tipoBien) {
        this.tipoBien = tipoBien;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void mostrarOferta(){
        System.out.print(this.OfertaFormato + "\n");
    }
    
}
