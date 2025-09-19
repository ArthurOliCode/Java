/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula07;

/**
 *
 * @author arthu_uhkw4r8
 */
public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[0].apresentar();
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68d, 57.8d, 14, 2, 3);
        l[1].apresentar();
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65d, 80.9d, 12, 2 , 1);
        l[2].apresentar();
        l[3] = new Lutador("DeadCode", "Austrália", 28, 1.93d, 81.6d, 13, 0, 2);
        l[3].apresentar();
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70d, 119.3d, 5, 4, 3);
        l[4].apresentar();
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81d, 105.7d, 12, 2, 4);
        l[5].apresentar();
        
        System.out.println("\n\n");
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
        Luta UEC02 = new Luta();
        UEC02.marcarLuta(l[0], l[0]);
        UEC02.lutar();
        
    }
}
