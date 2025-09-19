/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula014;

/**
 *
 * @author arthu_uhkw4r8
 */

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    
    //Declaração de um construtor para a classe
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Metódo próprio
    public void viuMaisUm(){
        this.ganharExp();
    }

    //Getters e Setters.
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login: " + login + 
                ", totAssistido: " + totAssistido + '}';
    }
    
    
}
