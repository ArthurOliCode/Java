/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula013;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au!");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando o osso em algum lugar!");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo!");
    }
    
    
    //Aula 013b sobre Polimorfismo de Sobrecarga
    
    public void reagir(String abord){ //abord significa abordagem do usuário ao cachorro. Metódo feito para a abordagem do usuário, ao cachorro.
        abord = abord.toLowerCase();
        int tam = abord.length();
        if(abord.equals("olá") ||
                abord.equals("ola")){ 
            System.out.println("Abanando o rabo");
        }else if(abord.substring(0, 2).equals("Bom")){
            System.out.println("Abanando o rabo");
        }else if(abord.equals("Olha sua comida") || 
                abord.equals("Você quer comida?")){
            System.out.println("Abanando o rabo");
        }else{
            System.out.println("latir");
        }
    }
    
    public void reagir(int hora, int min){ //metódo para reação em determinado horário do dia
        if(hora <= 12 && min < 60){
            System.out.println("Abanando o rabo, e latindo");
        }else if(hora >= 18){
            System.out.println("Ignorando sua interação");
        }else{
            System.out.println("Abanando o rabo, e pulando");
        }
    }
    
    public void reagir(boolean dono){ //metódo de reação, para caso, o usuário seja dono
        if(dono){
            System.out.println("Abanando o rabo, e colocando as patas em você");
        }else{
            System.out.println("Latindo, e rosnando");
        }
    }
    
    public void reagir(int idade, float peso){ //metódo de reação por idade e peso do animal
        if(idade <= 5){ //Caso seja filhote
            if(peso < 12){
                System.out.println("abanando, e pulando"); //Caso seja leve
            }else{
                System.out.println("abanando o rabo sentado"); //Caso seja pesado
            }
        }else{
            if(peso < 12){ //Caso seja adulto
                System.out.println("latindo, e pulando"); //Caso seja leve e adulto
            }else{
                System.out.println("Ignorando"); //Caso seja pesado e adulto
            }
        }
    }
}
