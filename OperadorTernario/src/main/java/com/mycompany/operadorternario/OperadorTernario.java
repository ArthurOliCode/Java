/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadorternario;

/**
 *
 * @author arthu_uhkw4r8
 */
public class OperadorTernario {

    public static void main(String[] args) {
        // Operador Ternário:
        int n1 = 12;
        int n2 = 19;
        int m = (n1 > n2)? n1:n2;
        int men = (n1 < n2)? n1:n2;
        System.out.printf("O primeiro número é %d", n1);
        System.out.println();
        System.out.printf("O segundo número é %d", n2);
        System.out.println();
        System.out.printf("O maior número é %d", m);
        System.out.println();
        System.out.printf("O menor número é %d", men);
        System.out.println();
        // Comparação entre strings:
        String nome1 = "Arthur";
        String nome2 = "Arthur";
        String nome3 = new String("Arthur");
        String comp = (nome1.equals(nome3))? "Igual":"Diferente";
        System.out.printf("%s é %s de %s", nome1, comp, nome3);
        System.out.println();
        // Operadores Lógicos:
        int x = 10;
        int y = 15;
        int z = 20;
        boolean r;
        r = (x<y || y<z)? true:false;
        System.out.println("x é menor que y, ou y é menor do que z? ");
        System.out.println(r);
    }
}
