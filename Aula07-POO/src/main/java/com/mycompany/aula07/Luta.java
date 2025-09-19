/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

import java.util.Random;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Luta {
    //Atributos especiais
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Metódos especiais
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if(isAprovada()){
            System.out.println("------Desafiado------");
            getDesafiado().apresentar();
            System.out.println("------Desafiante------");
            getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("============== Resultado ===============");
            switch(vencedor){
                case 0://Empate
                    System.out.println("\nEmpatou");
                    getDesafiante().empateLuta();
                    getDesafiado().empateLuta();
                    break;
                    
                case 1://Desafiado vence
                    System.out.println("\n" + getDesafiado().getN() + " é o vencedor!");
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;
                    
                case 2://Desafiante vence
                    System.out.println("\n" + getDesafiante().getN() + " é o vencedor!");
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    break;
            }
            System.out.println("========================================");
            
        }else{
            System.out.println("\n\nEsta luta não pode ocorrer!!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador df) {
        this.desafiante = df;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
