package b2segundaaulafpoo;
public class Caneta {
    public String modelo;  
    public String cor;
    private float ponta;  
    protected int carga;
    protected boolean tampada;
    
    public void setponta(float ponta){
        this.ponta = ponta;
    }
    
     public void status(){
        System.out.println("Uma caneta: " + this.modelo + "\nCor: "+ this.cor + "\nPonta: " + this.ponta + "\nTampada?: " + this.tampada); 
    }
     public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO!!! Não posso rabiscar!");
        }else
            System.out.println("Estou rabiscando!");
    }
    
     public void tampar(){
        this.tampada = true;
        //this é o nome do objeto que o chuamou, no caso, é o c1. 
        //Então this faz referência à esse objeto
    }
    
     public void destampar(){
        this.tampada = false;
    }
}
