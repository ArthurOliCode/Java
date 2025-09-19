/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula011;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Aula011 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Arthur");
        v1.setIdade(17);
        v1.setSexo("M");
        System.out.println("\n");
        System.out.println(v1.toString());
        System.out.println("\n\n");

        Aluno al = new Aluno();
        al.setNome("Heitor");
        al.setSexo("M");
        al.setIdade(10);
        al.setMatricula(1203412);
        al.setCurso("Desenvolvimento de Sistemas");
        al.pagarMensalidade();
        System.out.println("\n");
        System.out.println(al.toString());
        System.out.println("\n\n");
        
        Professor pf = new Professor();
        pf.setNome("João");
        pf.setIdade(27);
        pf.setSexo("M");
        pf.setSalario(4500);
        pf.setEspecialidade("Fisíca");
        pf.receberAum(500);
        System.out.println("\n");
        System.out.print(pf.toString());
        System.out.println(pf.getSalario());
        System.out.println("\n\n");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Arthur");
        b1.setIdade(16);
        b1.setSexo("M");
        b1.setCurso("DS");
        b1.setMatricula(20123);
        b1.setBolsa(15.2f);
        b1.renovarBolsa(15.2f);
        b1.pagarMensalidade();
        System.out.println("\n");
        System.out.print(b1.toString());
        System.out.print("; Bolsa: " + b1.getBolsa() + "; Matricula: " + b1.getMatricula() + "; Curso: " + b1.getCurso());
        System.out.println("\n\n");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("João");
        t1.setIdade(16);
        t1.setSexo("M");
        t1.setCurso("Ds");
        t1.setMatricula(2912932);
        t1.setRegistroProf(0);
        t1.praticar();
        System.out.print(t1.toString());
        System.out.println("; Curso: " + t1.getCurso() + "; Matrícula: " + t1.getMatricula() + "; Registro Profissional: " + t1.getRegistroProf());
        
    }
}
