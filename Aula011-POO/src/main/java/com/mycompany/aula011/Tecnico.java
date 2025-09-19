/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula011;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Tecnico extends Aluno{
    private int registroProf;

    public int getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }
    
    public void praticar(){
        if(getRegistroProf() > 0){
            System.out.println("\n\nO aluno " + this.getNome() + " irá praticar....\n");
        }else{
            System.out.println("\n\nO aluno " + this.getNome() + " não pode praticar!\n");
        }
    }
}
