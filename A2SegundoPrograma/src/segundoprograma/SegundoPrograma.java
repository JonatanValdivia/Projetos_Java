/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoprograma;

/**
 *
 * @author heriberto
 */
public class SegundoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //int idade = 30;
    //String valor = Integer.toBinaryString(idade); 
    String valor = "30";
    int idade = Integer.parseInt(valor);
    
    String valor2 = "30.5";
    float decimal = Float.parseFloat(valor2);
    
    System.out.printf("%.3f\n", decimal);
    }
    
}
