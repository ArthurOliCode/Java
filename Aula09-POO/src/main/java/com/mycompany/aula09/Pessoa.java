/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, int idade, String sx) {
        setNome(n);
        setIdade(idade);
        setSexo(sx);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public void FazerAniver(){
        setIdade(getIdade() + 1);
    }
}
