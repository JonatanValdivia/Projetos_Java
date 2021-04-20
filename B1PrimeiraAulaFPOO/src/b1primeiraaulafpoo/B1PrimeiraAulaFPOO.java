package b1primeiraaulafpoo;
public class B1PrimeiraAulaFPOO {
    public static void main(String[] args) {
       //duas instancias C1 e C2
       Caneta c1 = new Caneta();
       Caneta c2 = new Caneta();
       c1.cor = "Azul";
       c1.ponta = (float) 0.5;
       //Caso fosse tampar(), exibiria mensagem de erro na tela, pois não há como rabiscar
       //com a caneta estando tampada. Destampada(): dá permição ao método rabiscar() funcionar
       c1.tampar();
       c1.status();
       c1.rabiscar();
       
       c2.cor = "Vermelha";
       c2.ponta = (float) 1;
       c2.destampar();
       c2.status();
       c2.rabiscar();
    }
    
}
