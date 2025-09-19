/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testefuncao;

import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class TesteFuncao {

    //int valores()
    static int soma(int n1, int n2){
        int s = n1 + n2;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.print("\nEscreva o segundo número: ");
        int n2 = teclado.nextInt();
        int sm = soma(n1, n2);
        System.out.println("A soma entre " + n1 + " + " + n2 +
                " equivale a " + sm+ "!!");
    }
}
