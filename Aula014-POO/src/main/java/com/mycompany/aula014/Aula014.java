/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula014;

/**
 *
 * @author arthu_uhkw4r8
 */
//Implementações de Classes da aula 14 e 15 do Curso Em Vídeo.
public class Aula014 {

    public static void main(String[] args) {
        //Declaração de vetores para testes
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao v2[] = new Visualizacao[4];
        
        //Utilizando objetos instanciados da classe Video.
        v[0] = new Video("Como beber água");
        v[1] = new Video("Como comer!");
        v[2] = new Video("Diablo IV é muito BOM! E eu posso provar!");
        
        //Utilizando objetos instanciados pela classe Gafanhoto
        g[0] = new Gafanhoto("Arthur", 17,"M", "Jubileu@gmail.com");
        g[1] = new Gafanhoto("Marlin", 19, "F", "subscribinmychannel@gmail.com");
        
        //Avaliação de videos, utilizando objetos instanciados de outras classes, implementados na class Visualizacao.
        v2[0] = new Visualizacao(g[0], v[0]);
        v2[0].avaliar();
        v2[2] = new Visualizacao(g[1], v[0]);
        v2[1] = new Visualizacao(g[0], v[2]);
        v2[3] = new Visualizacao(g[1], v[2]);
        v2[1].avaliar(4.20f);
        v2[3].avaliar();
        v2[1].getFilme().play();
        v2[1].getFilme().like();
        
        
        //Apresentação dos dados modificados.
        System.out.println("Vídeo 1: " + v[0].getTitulo());
        v[0].play();
        v[0].like();
        System.out.println("");
        System.out.println("Vídeo 2: " + v[1].getTitulo());
        System.out.print("Vídeo 3: " + v[2].getTitulo());
        System.out.println("");
        System.out.println(g[0].toString());
        System.out.println("");
        System.out.println(g[1].toString());
        System.out.println("");
        System.out.println("------------------");
        System.out.println(v2[0].toString());
        System.out.println(v2[1].toString());
    }
}
