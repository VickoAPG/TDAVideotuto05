/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdavideotuto05;

/**
 *
 * @author vical
 */
public class TDAEsfera {
    
    private double radio;
    //Constructor
    public TDAEsfera (double radioInicial){
        if (radioInicial>0){
            this.radio= radioInicial;
        }else{
            this.radio= 0.0;
        }
    }
    //Creamos los metodos u operaciones del TDAEsfera
    public double getRadio(){
        return this.radio;
    }
    public double getDiametro(){
        return (radio*2);
    }
    public double getCircunferencia(){
        return (Math.PI * getDiametro());
    }
    public double getArea(){
        return (4*Math.PI*radio*radio);
    }
    public double getVolumen(){
        return (4*Math.PI*Math.pow(radio,3))/3;
    }

}
