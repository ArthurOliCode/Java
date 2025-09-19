/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula09;

/**
 *
 * @author arthu_uhkw4r8
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2] ;
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Marcia", 23, "F");
        p[1] = new Pessoa("José", 32, "M");
        
        l[0] = new Livro("Aves e Pássaros junto a programação", "Carlos", 152, p[0]);
        l[1] = new Livro("Programação Orientada a Objeto", "José", 400, p[1]);
        l[2] = new Livro("Lorial Ipsum aks0fsajio", "Kaise", 200, p[0]);
        
        l[0].abrir();
        l[0].folhear(50);
        System.out.println(l[0].detalhes());
    }
}
