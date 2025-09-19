/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula014;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    //Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    
    //Metódo de sobrecarga.
    public void avaliar(){
        this.filme.setAvaliacao(this.filme.getAvaliacao() + 5f);
    }

    public void avaliar(float nota){
        this.filme.setAvaliacao(this.filme.getAvaliacao() + nota);
    }
    
    public void avaliar(int porc){
        int tot = 0;
        if(porc <= 10){
            tot = 1;
        }else if(porc <= 20){
            tot = 2;
        }else if(porc <= 30){
            tot = 3;
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 80){
            tot = 8;
        }else if(porc <= 90){
            tot = 9;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(this.filme.getAvaliacao() + tot);
    }
    
    
    //Getters e Setters dos atributos.
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
}
