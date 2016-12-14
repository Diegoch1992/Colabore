/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colabore_veash;

import MODELO.MODELO;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Colabore_Veash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a,b;
       a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
       b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo número: "));
       MODELO o1=new MODELO(a,b);
       o1.sumar();
       o1.resta();
       JOptionPane.showMessageDialog(null, o1.sumar());
       JOptionPane.showMessageDialog(null, o1.resta());

    }
    
}
