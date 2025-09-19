/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    
    public void setCor(String c){
        this.cor = c;
    }
    public String getCor(){
        return this.cor;
    }
    
    
    public void tampar(){
        this.tampada = true;
    }
    
    
    public void destampar(){
        this.tampada = false;
    }
    
    
    public void status(){
        System.out.println("\t\tStatus da caneta");
        System.out.println("Modelo --> " + this.getModelo());
        System.out.println("Ponta --> " + this.getPonta());
        System.out.println("Cor --> " + this.getCor());
        System.out.println("Tampada --> " + this.tampada);
    }
}
