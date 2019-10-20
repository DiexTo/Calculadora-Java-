/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código2508;

import javax.swing.JOptionPane;

/**
 *
 * @author dtorres9
 */
public class Código2508 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Bem-vindo! Informe 2 \n valores para realizar as \n 4 operações matemáticas!");
       
        Calculadora c1 = new Calculadora(Double.parseDouble(JOptionPane.showInputDialog("Insira o promeiro valor:")),
                                         Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor:")));
        
        //UMA INSTÂNCIA JÁ É O SUFICIENTE
        //Calculadora cDefecto = new Calculadora();
        //dav_branch example
        c1.Resultado();
        
        /* System.out.println("Con valores:");
        System.out.println(c1.Suma());
        System.out.println(c1.Resta());
        System.out.println(c1.Multiplicacion());
        System.out.println(c1.Division()); */
    }
    
}

