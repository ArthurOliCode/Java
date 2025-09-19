/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoclasse;

import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Caneta {
    protected Scanner teclado = new Scanner(System.in);
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "ml");
        System.out.println("Ela está tampada? ------- " + this.tampada);
    }
    public void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("\nErro! Não posso rabiscar com a tampa fechada!!\n");
        }else{
            System.out.println("\nEstou rabiscando!!\n");
        }
    }
    public void tipoCaneta(){
        System.out.print("\nInsira o tamanho da ponta da caneta: ");
        this.ponta = teclado.nextFloat() ;
    }
}
