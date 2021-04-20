/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaOnlineYoutube_Java;

/**
 *
 * @author heriberto
 */
import java.util.Scanner;
public class A1EntradaDeDados_Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite uma nota: ");
        float nota = ler.nextFloat(); 
        System.out.println("Digite uma outra nota: ");
        float nota2 = ler.nextFloat();
        double media = (nota + nota2)/2;
        System.out.println("Sua média é: " + media);
        
        
    }
    
}
