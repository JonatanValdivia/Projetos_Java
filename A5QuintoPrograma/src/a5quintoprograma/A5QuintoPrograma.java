/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5quintoprograma;

import java.util.Scanner;

/**
 *
 * @author heriberto
 */
public class A5QuintoPrograma {

    /**
     * @param args the command line arguments
     */
    
    //CONDIÇÃO SIMPLES
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        /*float n1, n2;
        System.out.print("Primeira nota: ");
        n1 = ler.nextFloat();
        System.out.print("Segunda nota: ");
        n2 = ler.nextFloat();
        float media = (n1 + n2)/2;
        if (media>=7){
            System.out.print("Parabéns!! ");
        }
        System.out.println("Sua média foi: " + media);*/
        
    //COMDIÇÃO COMPOSTA
    System.out.print("Informe o ano do seu nascimento: ");
    int nascimento = ler.nextInt();
    int idade = 2020 - nascimento;
    System.out.print("Sua idade é: " + idade);
    if(idade>= 18){
        System.out.println(", e você é maior de idade.");
    }else{
        System.out.println(", e você é menor de idade.");
     }
    
    //Par ou impar com condição composta
    int n1;
    System.out.println("Informe-nos um número: ");
    n1 = ler.nextInt();
    if(n1%2==0){
        System.out.println(n1 + " é um número é par");  
    }else{
        System.out.println(n1 + " é um número é impar");
     }
    
    
    
    }
    
}
