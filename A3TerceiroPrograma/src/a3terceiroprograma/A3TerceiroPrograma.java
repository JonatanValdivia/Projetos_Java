/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3terceiroprograma;

/**
 *
 * @author heriberto
 */
import java.util.Scanner;
public class A3TerceiroPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //OPERADOR UNÁRIO DE PRÉ-INCREMENTO
       Scanner ler = new Scanner(System.in);
       int numero = 5;
       int valor = 5+ ++numero;
        System.out.println("Pré-incremento: " + valor);
        
       //OPERAADOR UNÁRIO DE PÓS-INCREMENTO
       int numero2 = 5;
       int valor2 = 5+ numero2++;
        System.out.println("Pós-incremento: " + valor2);
        
        //OPERADOR UNÁRIO DE PRÉ-DECREMENTO
        int numero3 = 10;
        int valor3 = 5 + --numero3;
        System.out.println("Pré-decremento: " + valor3);
        
        //OPERADOR UNÁRIO DE PÓS-DECREMENTO 
        int numero4 = 10;
        int valor4 = 5 + numero4--;
        System.out.println("Pós-decremento: " + valor4);
        System.out.println("\n-----------------------------\n");
        //OPERADORES DE ATRIBUIÇÃO
        int x = 10;
        x += 10;
        System.out.println("Valor de x é: " + x);
        int y = 10;
        y -= 10;
        System.out.println("Valor de y é: " + y);
        int z = 10;
        z *= 10;
        System.out.println("Valor de z é: " + z);
        int w = 10;
        w /= 10;
        System.out.println("Valor de w é: " + w);
        int v = 10;
        v %= 10;
        System.out.println("Valor de v é: " + v);
        
        System.out.println("\n-----------------------------\n");
        
        //USANDO A CLASSE MATH
         //PI
        float pi =(float) Math.PI;
        System.out.println("O número PI equivale a: " + pi+"...");
        //RAIZ QUADRADA
        System.out.print("Qual número deseja obter a RAIZ? ");
        float Calcular1 =(float) ler.nextFloat();
        float raiz = (float) Math.sqrt(Calcular1);
        System.out.println("A raiz de " + Calcular1 + " é: " + Math.sqrt(Calcular1));
        //EXPONENCIAÇÃO
        System.out.println("Digite o valor um: ");
        int n = ler.nextInt();
        System.out.println("Digite o valor dois: ");
        int m = ler.nextInt();
        int ex = (int) Math.pow(n,m);
        System.out.println("A exponenciação de " + n + " elevado à " + m + " é: " + ex);
        //RAIZ CÚBICA
        System.out.println("Digite o valor que deseja obter a raiz ao cubo: ");
        double n1 = ler.nextInt();
        double cubo = Math.cbrt(n1);
        System.out.println( n1+" elevado ao cubo é: " + cubo);
        
         System.out.println("\n-----------------------------\n");
         
        //ARREDONTAMENTOS (MATH)
        System.out.println("Qual número deseja arredondar? ");
        float arredondar = (float) ler.nextFloat();
        float abs = (float) Math.abs(arredondar);
        float floor = (float) Math.floor (arredondar);
        float ceil = (float) Math.ceil(arredondar);
        float round = (float) Math.round(arredondar);
        
        System.out.println("Número: " + arredondar);
        System.out.println("Absoluto (abs) " + abs);
        System.out.println("Floor (para baixo) " + floor);
        System.out.println("Ceil (para cima) " + ceil);
        System.out.println("Round (volta) " + round);
        //GERADOR DE NÚMERO DE 0 A 1
        double ale = Math.random();
        int numerozin = (int) (1 + ale *(10-1));
        System.out.println("Gerador de número aleatório (de 1 a 10):  " + numerozin);
        
        
    }
    
}
