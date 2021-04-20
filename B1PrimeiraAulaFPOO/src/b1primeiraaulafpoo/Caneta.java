package b1primeiraaulafpoo;

public class Caneta {
    
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;
    
    void status(){
        System.out.println("Uma caneta: " + this.cor + "\nPonta: " + this.ponta + "\nTampada?: " + this.tampada); 
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO!!! Não posso rabiscar!");
        }else
            System.out.println("Estou rabiscando!");
    }
    
    void tampar(){
        this.tampada = true;
        //this é o nome do objeto que o chuamou, no caso, é o c1. 
        //Então this faz referência à esse objeto
    }
    
    void destampar(){
        this.tampada = false;
    }
}
