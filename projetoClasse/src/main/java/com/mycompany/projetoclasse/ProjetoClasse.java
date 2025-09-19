/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoclasse;

import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class ProjetoClasse {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Caneta c1 = new Caneta();
        System.out.println("===============================\n");
        System.out.println("\tBem Vindo\n");
        System.out.println("===============================\n\n");
        System.out.print("\nPor favor, digite o modelo da caneta: ");
        c1.modelo = teclado.next();
        System.out.print("\nDigite a cor dela: ");
        c1.cor = teclado.next();
        c1.tipoCaneta();
        System.out.print("\nDigite a quantidade em inteiro da tinta desta caneta (ml): ");
        c1.carga = teclado.nextInt();
        System.out.println("\n\n============================\n");
        System.out.println("\t\tResultados");
        System.out.println("============================\n");
        c1.status();
        c1.rabiscar();
    }
}
