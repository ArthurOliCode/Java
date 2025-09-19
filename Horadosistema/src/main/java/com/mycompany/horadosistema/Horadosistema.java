/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Horadosistema {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Date data = new Date();
        System.out.print("A data do seu sitema é ");
        System.out.print(data.toString());
        System.out.println();
        Locale linguagem 
                = new Locale("Português", "Brasil");
        System.out.println("A linguagem do seu dispositivo é " + linguagem.getLanguage());
        System.out.println("O país ao qual seu dispositivo está inserido é " + linguagem.getCountry());
        Dimension resolution
             = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)resolution.getWidth();
        int altura = (int)resolution.getHeight();
        System.out.println("A resolução do seu sistema é " + largura + "X" + altura);
        
    }
}