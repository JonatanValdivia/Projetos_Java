package b5quintaaulafpoo.java;
public class ControleRemoto implements Controlador{
   private int volume;
   private boolean ligado;
   private boolean tocando;
   
   //Método construtor
   
   public ControleRemoto(){
       this.volume = 0;
       this.ligado = false;
       this.tocando = false;
       
   }
   
   //Métodos especiais
   
   private void setVolume(int volume){
       this.volume = volume;
   }
   
   private int getVolume(){
       return this.volume;
   }
   
   private void setLigado(boolean ligado){
       this.ligado = ligado;
   }
   
   private boolean getLigado(){
       return this.ligado;
   }
   
   private void setTocando(boolean tocando){
       this.tocando = tocando;
   }
   
   private boolean getTocando(){
       return this.tocando;
   }
   
   //MÉTODOS ABSTRATOS
   //Override significa subescrever
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("[] ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 1);
        } else{
            System.out.println("IMPOSSÍVEL AUMENTAR VOLUME");
        }
    }

    @Override
    public void menosVolume() {
         if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 1);
        } else{
             System.out.println("iMPOSSÍVEL DIMINUIR VOLUME");
         }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
            
        
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        } else{
            System.out.println("NÃO É POSSÍVEL TIRAR DO MUDO!");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && !(this.getTocando() == true)){
            this.setTocando(true);
        } else{
            System.out.println("NÃO É POSSÍVEL DAR PLAY!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
        } else{
            System.out.println("NÃO É POSSÍVEL DAR PAUSE!");
        }
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
