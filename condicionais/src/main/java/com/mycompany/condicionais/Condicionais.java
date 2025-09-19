/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionais;
import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class Condicionais {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas o ser possui? :  ");
        int perna = tec.nextInt();
        System.out.println("\n");
        String tipo;
        System.out.print("Esse ser é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6, 8:
                tipo = "aracnídeo";
                break;
            default:
                tipo = "Extraterreste";
        }
        System.out.print(tipo + "\n\n");
    }
}
