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
public class Calculadora {
    //Atributos
    public double iOperadorA;
    public double iOperadorB;
    //Constructor Vacío
    public Calculadora()
    {
        //ALTERAÇÃO NO RECEBIMENTO DOS DADOS
        this.iOperadorA = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        this.iOperadorB = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
    }
//Constructor
    public Calculadora(double iOperadorA, double iOperadorB) {
        this.iOperadorA = iOperadorA;
        this.iOperadorB = iOperadorB;
    }

    public double getiOperadorA() {
        return iOperadorA;
    }

    public void setiOperadorA(double iOperadorA) {
        this.iOperadorA = iOperadorA;
    }

    public double getiOperadorB() {
        return iOperadorB;
    }

    public void setiOperadorB(double iOperadorB) {
        this.iOperadorB = iOperadorB;
    }
    
    
    public double Suma()
    {
        return iOperadorA + iOperadorB;
    }
    
    public double Resta()
    {
        return iOperadorA - iOperadorB;
    }
    
    public double Multiplicacion()
    {
        return iOperadorA * iOperadorB;
    }
    
    public double Division()
    {
         return iOperadorA / iOperadorB;
    }

    public void Resultado(){
        
        JOptionPane.showMessageDialog(null, "Suma: " + Suma() + 
                                            "\nResta: " + Resta() +
                                            "\nMultiplicacion: " + Multiplicacion() +
                                            "\nDivision: " + Division());
        
        /*System.out.println("dav_branch");
        System.out.println(Suma());
        System.out.println(Resta());
        System.out.println(Multiplicacion());
        System.out.println(Division());*/
    }
    
}
