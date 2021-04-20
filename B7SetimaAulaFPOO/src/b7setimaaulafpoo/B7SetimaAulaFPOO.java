
package b7setimaaulafpoo;

public class B7SetimaAulaFPOO {

    public static void main(String[] args) {
        // TODO code application logic here
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador ("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lutador[1] = new Lutador ("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutador[2] = new Lutador ("SnapShadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutador[3] = new Lutador ("DeadCode", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutador[4] = new Lutador ("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutador[5] = new Lutador ("Nerdaand", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        //Mudando as posições dos índices, muda-se os lutadores
        UEC01.marcarLuta(lutador[2], lutador[3]); 
        UEC01.Lutar();
        lutador[2].status();
        //O STATUS atualiza, mudando conforme as vitórias, derrotas e empates dos lutadores,
        //somando-as por conseguinte
        lutador[3].status();
    }
    
}

