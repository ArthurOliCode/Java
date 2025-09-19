/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetormes_dias;

/**
 *
 * @author arthu_uhkw4r8
 */
public class VetorMes_Dias {

    public static void main(String[] args) {
        String mes[]= {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
            "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String dias[]= {"31","28","31","30","31","30","31","31","30","31","30","31"};
        for(int c=0; c <= mes.length - 1; c++){
            System.out.println("\t\t\tNo mês " + mes[c] +
                    " há um total de " + dias[c] + " dias!!\n");
    }
    }
}
