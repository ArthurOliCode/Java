/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeros;

import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Numeros {

    public static void main(String[] args) {
        int n, s = 0;
        long espere = 1500;
        Scanner teclado = new Scanner(System.in);
        String resp;
        do{
            System.out.println("------------------------------------------------------------------------");
            System.out.println("\tWelcome to the System Soma");
            System.out.println("\tIn this program you can plus multiples"
                    + "number between they!!");
            System.out.println("------------------------------------------------------------------------\n\n");
            System.out.println("Insira um número para começarmos!! :  ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Deseja continuar a somar? : ");
            resp = teclado.next();
        }while(resp.toLowerCase().equals("s"));
        System.out.println("\n\nA soma de todos os números digitados foi " + s);
        System.out.println("Obrigado por usar o programa!!");
        System.out.println("Saindo...");
    }
}
