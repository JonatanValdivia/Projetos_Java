/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4quartoprograma;

/**
 *
 * @author heriberto
 */
import java.util.Scanner;
public class A4QuartoPrograma {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //OPERADOR TERNÁRIO
       /* int n1, n2, r;
        n1 = 18;
        n2 = 19;
        r = (n1 > n2)?n1+n2:n2-n1;
        System.out.println(r);
       */
        
        //COMPARAÇÃO STRING
        String l1 = "Jonatan";
        String l2 = "Jonatan";
        String l3 = new String("Jonatan");
        String res;
        res = (l1 == l2)?"São iguais":"São diferentes";
        System.out.println(res);
        String res2; 
        res2 = (l1.equals(l3))?"São iguais":"São diferentes";
        System.out.println(res2);
        System.out.println("\n---------------------\n");
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x>y || y>z)?true:false;
        System.out.println(r);
        System.out.println("\n---------------------\n");
        
        System.out.println("Qual a sua idade?");
        int idade = ler.nextInt();
        String resposta;
        resposta = ((idade >= 16 && idade<18) || (idade>70))?"È  opicional":"È obrigatório";
        System.out.println(resposta);

        
        
    }
    
}
