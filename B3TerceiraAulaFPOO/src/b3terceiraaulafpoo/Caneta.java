/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3terceiraaulafpoo;

/**
 *
 * @author heriberto
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String modelo, String cor, float ponta){ //Este é o método construtor, 
        //e ele recebe o mesmo nome da classe. 
        this.tampada = true;
        this.cor = cor;
        this.ponta = ponta;
        this.modelo = modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setPonta (float ponta){
        this.ponta = ponta;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo() + "\nPonta: " + this.getPonta() +"\nCor: "+ this.getCor() + "\nTampada: "+ this.tampada);
    }
}
