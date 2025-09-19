/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula011;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade(){
        int preco = 1500;
        System.out.println("\n\nValor a pagar: R$ " + preco);
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + "...");
    }
    
    
}
