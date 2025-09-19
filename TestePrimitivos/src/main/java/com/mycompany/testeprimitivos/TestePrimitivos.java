/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeprimitivos;

import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class TestePrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome:  ");
        String nome = teclado.nextLine();
        System.out.println();
        System.out.print("Digite uma nota:  ");
        float nota = teclado.nextFloat();
        System.out.println();
        System.out.printf("A nota de %s é %.2f! \n", nome, nota);
        System.out.print("Digite um número:  ");
        int num = teclado.nextInt();
        System.out.println();
        System.out.println("O valor é " + num);
        String valor = String.valueOf(num);
        System.out.format("O valor string é %s", valor);
    }
}
