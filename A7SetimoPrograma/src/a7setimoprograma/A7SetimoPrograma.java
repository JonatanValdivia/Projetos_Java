/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a7setimoprograma;

/**
 *
 * @author heriberto
 */
public class A7SetimoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ESTRUTURAS DE REPETIÇÃO
        int c = 0;
        while(c < 10){
             c++;
             if(c == 7){
                 //continue;
                 break;
             }
            System.out.println(c + "..");
        }
    }
    
}
