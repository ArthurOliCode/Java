/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula011;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAum(float pgmt){
        if(getSalario() > 0){
            setSalario(getSalario() + pgmt);
        }else{
            System.out.println("Não foi possível efetuar aumento. Sa1ário está abaixo do esperado!");
        }
    }
}
