package b3terceiraaulafpoo;
public class B3TerceiraAulaFPOO {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta("CIC", "AZUL", (float) 0.9);
        canetaUm.status();
        // Caneta canetaDois = new Caneta();
        //canetaDois.status();
        Caneta canetaDois = new Caneta("FIC", "AMARELA", (float) 1.0);
        canetaDois.status();
        Caneta canetaTres = new Caneta("GIC", "Vermelha", (float) 0.4);
        canetaTres.status();
        
    }
    
}
