/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula011;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(float renovBol){
        System.out.println("\n\nRenovando bolsa do aluno " + this.getNome() + "...");
        if(!(getBolsa() == renovBol)){
            
            System.out.println("Porcentagem da bolsa saindo de " + getBolsa() +
            "% para " + renovBol + "%");
            
            setBolsa(renovBol);
        }else{
            System.out.println("\n\nNão foi possível alterar o valor da bolsa...\n\n");
        }
    }
 
    @Override
    public void pagarMensalidade(){
        System.out.print("\n\n");
        System.out.println(this.getNome() + " é bolsista, seu pagamento foi facilitado!");
    }
    
    
} 
