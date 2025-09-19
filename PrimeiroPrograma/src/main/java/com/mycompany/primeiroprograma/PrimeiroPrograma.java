/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprograma;
import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class PrimeiroPrograma {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nome, reg1="", reg2="", reg3="", reg4="", resp="";
        int qnome=0,repet=0;
        do{
            System.out.println("\n\n\n");
            System.out.println("\n\t\t\t-----------------------------------------");
            System.out.println("\n\t\t\t\tBem Vindo a Registrador");
            System.out.println("\n\t\t\t-----------------------------------------\n\n");
            for(int c=1;c<=4;c++){
                System.out.print("Escreva o " + c + "° nome: ");
                nome = teclado.next();
                qnome++;
                if(c==1){
                    reg1 = nome;
                }
                if(c==2){
                    reg2 = nome;
                }
                if(c==3){
                    reg3 = nome;
                }else{
                    reg4 = nome;
                }
            }
            System.out.println("\n\n\n\t\t\t---------------------------");
            System.out.println("\n\t\t\t\tResultados");
            System.out.println("\n\t\t\t---------------------------\n\n");
            System.out.println("______________________________________________________________________________");
            System.out.println("\n\t\t1° nome ------------------------------ " + reg1);
            System.out.println("\n\t\t2° nome ------------------------------ " + reg2);
            System.out.println("\n\t\t3° nome ------------------------------ " + reg3);
            System.out.println("\n\t\t4° nome ------------------------------ " + reg4);
            System.out.println("\n\nObrigado por usar o programa!!");
            System.out.print("\n\nDeseja continuar?: ");
            resp =teclado.next();
            while (!(resp.equals("não")) && (!(resp.equals("sim"))) 
                    && (!(resp.equals("s"))) && (!(resp.equals("n")))){
                System.out.println("\nErro!! Por favor, digite uma resposta válida [sim/não]: ");
                resp=teclado.next();
            }
            if(resp.equals("sim") || (resp.equals("s") || (resp.equals("yes")))){
                repet++;
            }
        }while(resp.equals("sim") || (resp.equals("s"))
                || (resp.equals("yes")));
        System.out.println("\n\n\n\n\t\t\t---------------------------------------------------------");
        System.out.println("\n\t\t\t\tTabela de Resultados");
        System.out.println("\n\t\t\t---------------------------------------------------------\n\n");
        System.out.println("\n\t\t\tQuantidade repetições do programa -------------------------------------------- " + repet);
        System.out.println("\n\t\t\tQuantidade de nomes inseridos -------------------------------------------- " + qnome);
        System.out.println("\n\n\nObrigado por usar o programa!!");
    }   
    }
