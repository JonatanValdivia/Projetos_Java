
package a9nonoprograma;

import java.util.Arrays;

public class A9NonoPrograma {
    //Método
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
    }
   static int somar(int a, int b){
       int s = a + b;
       return s;
   }
    public static void main(String[] args) {
          // Variáveis compostas: vetores.
     /*int n[] = new int[4];    
     n[0] = 3;
     n[1] = 5;
     n[2] = 8;
     n[3] = 2;*/
     //Simplificando: 
     int n[] = {3, 5, 8, 2};
     String nome[] = {"Maria", "Cláudia", "João"};
     char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 
                        'H', 'I', 'J', 'K', 'L', 'M', 'N',
                        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 
                        'V', 'W', 'X', 'Y', 'Z'};
     String mes[] = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho",
                     "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
     int totDias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
     
     double notas[] = {1.0, 2.5, 6.9, 7.9};
        //System.out.println("O total de letras do alfabeto: " + alfabeto.length);
       //Exibir determinado array
     /*    
        for(int i = 0; i<= alfabeto.length - 1; i++){
            System.out.print(alfabeto[i]+"-");
     }
       
     for(int i = 0; i< alfabeto.length; i++){
         System.out.print(alfabeto[i]+"-");
     }*/
     for(int c = 0; c < mes.length; c++){
         System.out.println("O mês de " + mes[c] + " tem " + totDias[c] + " dias ao todo.");
     }
     
     //For Each -> para cada.
        System.out.println("\n\n");
     double vetor[] = {21.0, 43.50, 82.3, -6.8, 43.3};
     Arrays.sort(vetor);
     for(double valor: vetor){
         System.out.println(valor + " ");
     }
     System.out.println("\n\n");
      int vet[] = {3,7,6,1,9,4,2};
      //Deixa todos os vetores em ordem crescente
      Arrays.sort(vet);
        for(int valor: vet){
            System.out.print(valor+" ");
        }
        //Procura um elemento do vetor e retorna o seu índice.
      int posicao = Arrays.binarySearch(vet, 9);
        System.out.println("\nPosição: "+posicao);
     
     System.out.println("\n\n");
     int arr[] = new int[10];
     //É meio que um filtro do array, o qual podemos alterar todos os 
     //elementos do mesmo. 
     Arrays.fill(arr, 999);
     for(int valor: arr){
         System.out.print(valor + " ");
     }
     System.out.println("\n\n");
     //Método.
      soma(206, 28924);
      int som = somar(2,5); 
        System.out.println("\n"+som);
        
        Operacoes operacoes = new Operacoes();
        System.out.println(operacoes.contador(1, 5));
    }
    }
    