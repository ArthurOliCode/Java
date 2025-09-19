/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testevetorunidimensional;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class TesteVetorUnidimensional {

    public static void main(String[] args) {
        String n[];
        n = new String[4];
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        System.out.println("Digite nomes para serem lidos pelo programa: ");
        for(int c=0; c <= 3; c++){
            System.out.print("Digite o " + i + "° nome: ");
            n[c] = teclado.next();
            i++;
        }
        i=1;
        for(String valor: n){
            System.out.println(" ");
            System.out.println("O nome guardado na posição " + i + " é " + valor);
            i++;
        }
        i=1;
        System.out.println("\n\n\n");
        System.out.println("Vetor Double.\n");
        double v[] = {2.4,4.6,23.1,-3.34,-23.331};
        Arrays.sort(v);
        for(double valor: v){
            System.out.println("O valor na posição " + i + " é igual a " + valor);
            i++;
        }
        i=1;
        System.out.println("\n\n");
        System.out.println("Vetor com Arrays.Fill\n\n");
        int x[] = new int[30];
        Arrays.fill(x, 10);
        for(int val:x){
            System.out.println("O valor guardado na posição " + i + " é igual a " + val);
            i++;
        }
        System.out.println("\n\n\n");
    }
}
