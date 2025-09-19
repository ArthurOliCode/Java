/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula012;

/**
 *
 * @author arthu_uhkw4r8
 */
public abstract class Animal {
    protected float peso; //Peso do animal
    protected int membros; //Membros totais que ele possui
    protected int idade; //Idade deste animal
    
    public abstract void locomover(); //Metódo para locomoção
    public abstract void alimentar(); //Metódo para alimentação
    public abstract void emitirsom(); //Metódo para emição do som respectivo ao animal

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", membros=" + membros + ", idade=" + idade + '}';
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
    
    
    
}
