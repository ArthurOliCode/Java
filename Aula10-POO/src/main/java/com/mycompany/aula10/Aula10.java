/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula10;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Aula10 {

    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Luan");
       p2.setNome("Kaio");
       p3.setNome("Akashi");
       p4.setNome("Mari");
       
       p1.setSexo("M");
       p2.setSexo("M");
       p3.setSexo("M");
       p4.setSexo("F");
       
       p1.setIdade(24);
       p2.setIdade(32);
       p3.setIdade(23);
       p4.setIdade(19);
       
       p2.setCurso("DS");
       p2.setMatr(102319023);
       p2.cancelarMatr();
       p2.fazerAniver();
       
       p3.setEspecialidade("Química");
       p3.setSalario(1500);
       p3.receberAum(200);
       
       p4.setSetor("Segurança de Software");
       p4.setTrabalhando(true);
        
        System.out.println("\n\t\t-------------");
        System.out.println("\t\tPessoa\n\n\t\t" + p1.toString());
        System.out.println("\t\t-------------\n\n\n");
       
        System.out.println("\n\t\t-----------");
        System.out.println("\t\tAluno\n\n\t\t" + p2.toString());
        System.out.println("\t\t------------");
        System.out.println("\t\tP2 Curso: " + p2.getCurso());
        System.out.println("\t\tP2 Matrícula: " + p2.getMatr());
        System.out.println("\n\n");
       
        System.out.println("\n\t\t--------------");
        System.out.println("\t\tProfessor\n\t\t" + p3.toString());
        System.out.println("\n\t\t------------");
        System.out.println("\t\tP3 Especialidade: " + p3.getEspecialidade());
        System.out.println("\t\tP3 Salário: " + p3.getSalario());
        System.out.println("\n\n");
       
        System.out.println("\n\t\t-------------");
        System.out.println("\t\tFuncionário\n\t\t" + p4.toString());
        System.out.println("\n\t\t------------");
        System.out.println("\t\tP4 Setor: " + p4.getSetor());
        System.out.println("\t\tP4 Trabalhando: " + p4.isTrabalhando());
       
       
    }
}
