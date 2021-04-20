package b1zzexercicio01;
public class Cedula {
    private int valorNota;
    private int anoDaNota;
    private String tipoDeNota;
    
    void setValorNota(int valorNota){
        this.valorNota = valorNota;
    }
    
    void setAnoDaNota(int anoDaNota){
        if( anoDaNota >= 2000){
            this.anoDaNota = anoDaNota;
        }else{
            System.out.println("Data da cédula não válida.");
        }     
    }
    
    void setTipoDeNota(String tipoDeNota){
        if(tipoDeNota == " Reais"){
             this.tipoDeNota = tipoDeNota;
        }else{
            System.out.println("Nota inválida");
        }
       
    }
    
    public int getValorDaNota(){
        return this.valorNota;
    }
    
    public int getAnoDaNota(){
        return this.anoDaNota;
    }
    
    public String getTipoDeNota(){
        return this.tipoDeNota;
    }
}
