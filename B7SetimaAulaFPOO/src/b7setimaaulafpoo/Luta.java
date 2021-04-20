package b7setimaaulafpoo;

import java.util.Random;

public class Luta {
     private Lutador desafiado;
     //utilizando o próprio nome da outra classe para dar um tipo ao atributo
     private Lutador desafiante;
     private int rounds;
     private boolean aprovada;
    
    //Quando o método recebe dois paramentros, logo deve-se 
     //especificar o tipo desses dois parametros, separando-os por vírgula
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if(lutador1.getCategoria().equals(lutador2.getCategoria()) && (lutador1 != lutador2)){
            this.setAprovada(true);
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void Lutar(){
       if(this.getAprovada() == true){
           System.out.println("### DESAFIADO ###");
           this.desafiado.apresentar();
           System.out.println("### DESAFIANTE ###");
           this.desafiante.apresentar();
           
           //NESSA LUTA, E NAS DEMAIS, O VENCEDOR SERÁ ALEATÓRIAMENTE ESCOLHIDO
           //PELO PROGRAMA. USAREMOS ENTÃO O __RANDOM__, CRIANDO 
           //A ELE UM OBJETO CHAMADO __ALEATÓRIO__  
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3); // 0, 1, 2 - um desses números
           
           // AGORA QUE JÁ TEMOS UMA CLASSE QUE GERA UM NÚMERO ALEATÓRIO 
           //DE 0 À 2 (TRÊS NUMEROS NO TOTAL), CRIAREMOS CASOS (CASES) PARA CADA UM DELES
           //USANDO O OPERADOE __SWITCH__
           switch(vencedor){
               case 0: //EMPATE
                   System.out.println("=====================\nEmpatou!\n=====================");
                   this.desafiado.EmpatarLuta();
                   this.desafiante.EmpatarLuta();
                   break;
               case 1: //DESAFIADO VENCE
                   System.out.println("=====================\nVitória do " + this.desafiado.getNome()+ "\n=====================");
                   this.desafiado.GanharLuta();
                   this.desafiante.PerderLura();
                   break;
               case 2: //DESAFIANTE VENCE
                    System.out.println("=====================\nVitória do " + this.desafiante.getNome() + "\n=====================");
                   this.desafiado.PerderLura();
                   this.desafiante.GanharLuta();
                   break;
           }
           
       }else{
           System.out.println("A luta não está aprovada!");
       }
        
    }
     
     //MÉTODOS ESPECIAS 
     public void setDesafiado(Lutador desafiado){
       this.desafiado = desafiado;
     }
     
     public Lutador getDesafiado(){
         return this.desafiado;
     }
     //SetDesafiante Recebe um paremetro do tipo lutador  
     public void setDesafiante(Lutador desafiante){
         this.desafiante = desafiante;
     }
     
     public Lutador getDesafiante(){
         return this.desafiante;
     }
     
     public void setRounds(int rounds){
         this.rounds = rounds;
     }
     
     public int getRounds(){
         return rounds;
     }
     
     public void setAprovada(boolean aprovada){
         this.aprovada = aprovada;
     }
     
     public boolean getAprovada(){
         return aprovada;
     }
}
