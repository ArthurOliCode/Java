/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("cc");
        c1.setDono("José");
        c1.setNumConta(1042001011);
        c1.setSaldo(1550f);
        c1.pagarMensalidade();
        System.out.println("\t\tStatus da Conta 1");
        c1.status();
        
        ContaBanco c2 = new ContaBanco();
        System.out.println("\n\n\t\tConta 2 ");
        c2.setSaldo(50f);
        c2.setTipo("cp");
        System.out.println("\t\tStatus da Conta 2");
        c2.status();
    }
}
