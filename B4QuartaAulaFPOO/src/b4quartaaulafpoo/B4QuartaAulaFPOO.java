package b4quartaaulafpoo;
public class B4QuartaAulaFPOO {
    public static void main(String[] args) {
      Conta contaDoJoao = new Conta();
      Conta contaDaAna = new Conta();
      contaDoJoao.setNumeroDaConta("9999-6");
      contaDoJoao.abrirConta("Poupança");
      contaDoJoao.setDonoDaConta("João de Almeida Barreto");
      contaDoJoao.pagarMensalidade();
      contaDoJoao.depositar(70);
      contaDoJoao.sacar(50);
      contaDoJoao.estadoAtual();
      contaDaAna.setNumeroDaConta("9999-7");
      contaDaAna.setDonoDaConta("Ana Carla Revíval");
      contaDaAna.abrirConta("Corrente");
      contaDaAna.pagarMensalidade();
      contaDaAna.depositar(400);
      contaDaAna.sacar(138);
      contaDaAna.estadoAtual();
      
      
    }
    
}
