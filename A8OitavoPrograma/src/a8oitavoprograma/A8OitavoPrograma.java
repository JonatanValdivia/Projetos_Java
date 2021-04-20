package a8oitavoprograma;
import java.util.Scanner;
public class A8OitavoPrograma {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        //ESTRUTURAS DE REPETIÇÃO 02 (TESTE LÓGICOO NO FINAL)
        /*int c = 0;
        do{
            System.out.println(c + "..");
            c++;
        } while(c<10);*/
        
       /* int n, s=0;
        String resp;
       
        do{
            System.out.print("Digite um número: ");
            n = ler.nextInt();
            s += n;
            System.out.print("Quer continuar [S/N]? ");
            resp = ler.next(); //No caso para ler a string pode 
                                   //ser line ou apenas o next()
        }while(resp.equals("S"));
        System.out.println("\nA soma de todos os valores é: " + s);*/
       
       
       
       //Repetição com variável de controle 
       //DECRESCENTE:
       for(int i = 20; i >= 2; i-=2){
           System.out.println(i);
       }
       
       /*CRESCENTE:
       for(int i = 2; i <= 20; i+=2){
           System.out.println(i);
       }*/
       /*int i = 0
         while(i <= 3){
         System.out.print(i);
         i++;
       }
       
       */
       
       System.out.println("\n\n\n");
       //Exercício:
       for(int k = 100; k <= 1000; k+=100){
           System.out.println(k);
       }
       
       
     //ESTRUTURAS DE REPETIÇÃO ANINHADAS:
        System.out.println("\n\n\n");
     for(int y = 1; y <= 3; y++){
         for(int x = 0; x <= 2; x+=2){
             System.out.println(y+ " " +x);
     }
     }
       
       
    } 
}
