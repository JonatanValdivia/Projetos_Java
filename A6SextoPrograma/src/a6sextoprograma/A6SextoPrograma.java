/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6sextoprograma;

/**
 *
 * @author heriberto
 */
import java.util.Scanner;
public class A6SextoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONDIÇÃO COMPOSTA ENCADEADA
        Scanner ler = new Scanner (System.in);
      /*  System.out.println("Em que ano nasceu?");
        int anoNascimento = ler.nextInt();
        int idade = 2020 - anoNascimento;
        System.out.println("Sua idade é: " + idade);
        if( idade < 16) {
            System.out.println("Não vota!");
        }else{
            if((idade>=16 && idade<18) || (idade>70)){
                System.out.println("Voto é opcional");
            }else{
                System.out.println("Voto Obrigatório");
            }
         }*/
 
      //CONDIÇÃO DE MÚLTIPLA ESCOLHA 
      int pernas = ler.nextInt();
      String tipo;
        System.out.print("Isso é um ");
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case  2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
      }
    }
    
