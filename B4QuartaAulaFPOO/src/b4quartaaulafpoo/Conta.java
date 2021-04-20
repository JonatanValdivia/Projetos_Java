package b4quartaaulafpoo;
public class Conta {
   private String numeroDaConta;
   protected String tipo;
   private String DonoDaConta;
   private double saldo;
   private boolean status;
   //Métodos Personalizados
   
   public void estadoAtual(){
       System.out.println("\n----------------------------------\n");
       System.out.println("Conta: " + this.getNumeroDaConta());
       System.out.println("Tipo da conta: " + this.getTipo());
       System.out.println("Dono da conta: " + this.getDonoDaConta());
       System.out.println("Saldo da conta: " + this.getSaldo());
       System.out.println("Status: " + this.getStatus());
   }
   
   public void abrirConta(String tipo){
       //Métodos modificadores. O setTipo recebe tipo para a execução 
       //do teste lógico logo abaixo
       setTipo(tipo);
       setStatus(true);
       if("Corrente".equals(tipo)){
           this.setSaldo(50);
       }else if("Poupança".equals(tipo)){
           this.setSaldo(150);
       }
       System.out.println("Conta aberta com sucesso!");
       
   }
   
   public void fecharConta(){
       //Só pode-se fechar a conta se o saldo for igual a zero. Não podendo ser 
       //negativo e nem positivo
       if(this.getSaldo() > 0){
           System.out.println("Conta com dinheiro");
       } else if(this.getSaldo() < 0){
           System.out.println("Conta em débito");
       } else{
           this.setStatus(false);
           System.out.println("Conta fechada com sucesso!");
       }
   }
   
   public void depositar(double depositar){
       if(this.getStatus()){
          this.setSaldo(this.getSaldo() + depositar);
           System.out.println("Depósito realizado com sucesso na conta de " + this.getDonoDaConta());
       }else{
           System.out.println("Conta inativa. Impossível depositar");
       }
   }
     
   public void sacar(double sacar){
       if (this.getStatus()){
            if(sacar <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - sacar);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDonoDaConta());
            }else{
                System.out.println("Saldo insuficiente. Impossível sacar");
            }
        }else{
           System.out.println("Conta inativa. Impossível sacar");
       } 
       
   }
   
   public void pagarMensalidade(){
       int pagarMensalidade = 0; 
       if(this.getTipo() == "Corrente"){
           pagarMensalidade = 12;   
       }else if(this.getTipo() == "Poupança"){
            pagarMensalidade = 20;
       }
       if(this.getStatus()){
            this.setSaldo(getSaldo() - pagarMensalidade);
            System.out.println("Mensalidade paga com sucesso por " + this.getDonoDaConta());
       } else{
           System.out.println("Impossível pagar uma conta fechada!");
       }
   }
   
    public Conta(){
       this.saldo = 0;
       this.status = false;
   }
    
    //Métodos Especiais
   public void setNumeroDaConta(String numeroDaConta){
       this.numeroDaConta = numeroDaConta;
   }
   
   public String getNumeroDaConta(){
       return this.numeroDaConta;
   }
   
   public void setTipo (String tipo){
       this.tipo = tipo;
   }
   
   public String getTipo(){
       return this.tipo;
   }
   
   public void setDonoDaConta(String DonoDaConta){
       this.DonoDaConta = DonoDaConta;
   }
   
   public String getDonoDaConta(){
       return this.DonoDaConta;
   }
   
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   
   public double getSaldo(){
       return this.saldo;
   }
   
   public void setStatus(boolean status){
       if(status == true){
           this.status = status;
       }else{
           System.out.println("Esta conta está inativa");
       }
    }
   
   public boolean getStatus(){
       return this.status;
   }
}
