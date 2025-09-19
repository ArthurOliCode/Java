/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresaritmeticos;

/**
 *
 * @author arthu_uhkw4r8
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("          Bem vindo ao Sistema de testes para Aritméticos!!");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        int n1 = (int)5;
        int n2 = (int)6;
        int soma = n1 + n2;
        System.out.printf("A soma entre " + n1 + " e " + n2 + " é " + soma + " !");
        System.out.println();
        float f1 = (float)5.6;
        float f2 = (float)9.2;
        float div = f2 / f1;
        System.out.printf("A divisão entre %f e %f, é igual a %f", f1, f2, div);
        System.out.println();
        int num = (int)8;
        System.out.printf("O Decremento de num é igual a " + num);
        System.out.println();
        int x = (int)8;
        x -= 2;
        x = (int)Math.pow(x, 4);
        System.out.println("X é igual a " + x);
    }
}
