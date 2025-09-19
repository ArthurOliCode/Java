/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testescondicionais;

import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class Testescondicionais {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("       Bem Vindo");
        System.out.println("======================");
        System.out.println("");
        System.out.println("Digite o nome do aluno:  ");
        String nome = teclado.next();
        if (nome.equals("Arthur")){
            nome = nome.replace(nome, "Lindo");
        }
        System.out.print("Escreva a Primeira nota do aluno " + nome + ": ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota do aluno " + nome + ": ");
        float n2 = teclado.nextFloat();
        float m = (float)((n1 + n2)/ 2);
        if (m > 9){
            System.out.println("Parabéns, você tirou uma média superior a 9!!");
        }else{
            if(m < 6){
                System.out.println("Você tirou uma nota inferior a 6, espero que melhore da próxima vez!!");
            }
        }
        System.out.println("A média do aluno foi " + m + "!");
    }
}
