/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;   
/**
 *
 * @author arthu_uhkw4r8
 */
public class ControleClass {
    private int volume;
    private boolean tocando;
    private boolean ligado;

    public ControleClass(){
        this.setVolume(50);
        this.setTocando(false);
        this.setLigado(false);
    }
    
    
    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    
    
    public void abrirMenu(){
        if(getLigado()){
            System.out.println("Tocando: " + getTocando());
            System.out.println("Volume:");
            for(int c=0; c < getVolume(); c+=10){
                System.out.println("-");
            }
        }
    }
    public void fecharMenu(){
        if(getLigado()){
            System.out.println("Fechando Menu.....\n");
        }
    }
        
    
    public void maisVolume(){
        if(this.getLigado() && getVolume() <= 100){
            this.setVolume(getVolume() + 5);
            for(int c=0; c < getVolume(); c+=10){
                System.out.print("|");
            }
            System.out.println("\n");
        }
    }
    
    public void menosVolume(){
        if(this.getLigado() && getVolume() >= 0){
            this.setVolume(getVolume() - 5);
            for(int c=0; c < getVolume(); c+=10){
                System.out.print("|");
            }
            System.out.println("\n");
        }
    }
    
    public void ligarMudo(){
        if(getLigado() && getVolume() > 0){
            this.setVolume(0);
            System.out.print("X");
        }
    }
    public void desligarMudo(){
        if(this.getLigado() && getVolume() == 0){
            this.setVolume(50);
            for(int c=0; c<getVolume(); c+=10){
                System.out.print("|");
            }
            System.out.println("\n");
        }
    }
    
    public void play(){
        if(this.getLigado() && !getTocando()){
            this.setTocando(true);
            System.out.println("|>");
        }
    }
    
    public void pause(){
        if(this.getLigado() && getTocando()){
            this.setTocando(false);
            System.out.println("||");
        }
    }
    
    
     public boolean getLigado(){
        return this.ligado;
    }
     
    public int getVolume(){
        return this.volume;
    }
    
    public boolean getTocando(){
        return this.tocando;
    }
    
    
    public void setTocando(boolean t){
        this.tocando = t;
    }
    
    public void setVolume(int v){
        this.volume = v;
    }
    
    public void setLigado(boolean l){
        this.ligado = l;
    }
}
