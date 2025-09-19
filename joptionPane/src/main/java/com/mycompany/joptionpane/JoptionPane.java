/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author arthu_uhkw4r8
 */
public class JoptionPane {

    public static void main(String[] args) {
        int n, s=0, tot=0, par=0, imp=0, maiq100=0;
        float media=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "
                + "<html></br><em>(0 interrompe)</em></html>", 
                "Sistema de análise de números", JOptionPane.INFORMATION_MESSAGE));
            if(n % 2 == 0){
                par++;   
            }else{
                imp++;
            }
            if(n > 100){
                maiq100++;
            }
            tot++;
            if(n != 0){
                s += n;
            }
            
        }while(n != 0);
        media = s/tot;
        JOptionPane.showMessageDialog(null,"<html><em><hr></hr>Resultado Final<hr></hr></br></html>"
                + "<html><em></br></br><hr></hr>A soma total de todos os número foi " + s + "</em></html>"
                + "<html><em></br>O total de números foi________________" + tot + "</em></html>"
                + "<html><em></br>A quantidade de pares foi_____________" + par + "</em></html>"
                + "<html><em></br>A quantidade de ímpares foi___________" + imp + "</em></html>"
                + "<html><em></br>Total de números maiores que 100 foi__" + maiq100 + "</em></html>"
                + "<html><em></br>A média dos números foi______________" + media + "</em></br></br><hr></hr></html>", 
                "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}