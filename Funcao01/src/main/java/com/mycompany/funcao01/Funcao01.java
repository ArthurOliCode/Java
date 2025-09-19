 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcao01;



import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Funcao01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        Fatorial f = new Fatorial();
        f.setValor(n);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
