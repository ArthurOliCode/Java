/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula012;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Aula012 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.setCorPelo("Petro malhado");
        m.setIdade(3);
        m.setMembros(4);
        m.setPeso(10.4f);
        System.out.println("");
        m.alimentar();
        System.out.println("");
        m.locomover();
        System.out.println("");
        m.emitirsom();
        System.out.println("");
        System.out.println(m.toString());
        System.out.println("");
        System.out.println("");
        
        Reptil r = new Reptil();
        r.setCorEscama("Bege");
        r.setIdade(2);
        r.setMembros(4);
        r.setPeso(2.5f);
        r.setTipoAlimen("Carnívoro");
        System.out.println("");
        r.alimentar();
        System.out.println("");
        r.locomover();
        System.out.println("");
        r.emitirsom();
        System.out.println("");
        System.out.println(r.toString());
        System.out.println("");
        System.out.println("");
        
        Peixe p = new Peixe();
        p.setCorEscama("Azul e laranja");
        p.setIdade(1);
        p.setPeso(0.3f);
        System.out.println("");
        p.soltarBolha();
        System.out.println("");
        p.alimentar();
        System.out.println("");
        p.locomover();
        System.out.println("");
        p.emitirsom();
        System.out.println("");
        System.out.println(p.toString());
        System.out.println("");
        System.out.println("");
        
        Ave a = new Ave();
        a.setCorPena("Marrom");
        a.setIdade(3);
        a.setMembros(2);
        a.setPeso(3.7f);
        System.out.println("");
        a.alimentar();
        System.out.println("");
        a.locomover();
        System.out.println("");
        a.emitirsom();
        System.out.println("");
        a.fazerNinho();    
        System.out.println("");
        System.out.println(a.toString());
        System.out.println("");
        System.out.println("");
        
        Canguru c = new Canguru();
        System.out.println("");
        c.usarBolsa();
        System.out.println("");
        c.locomover();
        System.out.println("");
        System.out.println("");
        
        Cachorro ca = new Cachorro();
        System.out.println("");
        ca.abanarRabo();
        System.out.println("");
        ca.enterrarOsso();
        System.out.println("");
        System.out.println("");
    }
}
