/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula012;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Reptil extends Animal{
    protected String corEscama; //Cor da Escama do réptil
    protected String tipoAlimen; //Tipo de alimentação

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getTipoAlimen() {
        return tipoAlimen;
    }

    public void setTipoAlimen(String tipoAlimen) {
        this.tipoAlimen = tipoAlimen;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        switch (tipoAlimen.toUpperCase().substring(0, 1)) {
            case "C":
                System.out.println("Se alimentando de outros seres vivos");
                break;
            case "H":
                System.out.println("Se alimentando de frutos e plantas");
                break;
            default:
                System.out.println("Comendo folhas ou carne");
                break;
        }
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de réptil");
    }
    
}
