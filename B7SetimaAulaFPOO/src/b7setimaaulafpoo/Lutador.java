/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b7setimaaulafpoo;

/**
 *
 * @author heriberto
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public void apresentar(){
        System.out.println("CHEGOU A HORA, TELESPECTADORES, COM VOCÊS: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("Idade da: " + this.getIdade());
        System.out.println("Altura de: " + this.getAltura());
        System.out.println("Peso de: " + this.getPaso());
        System.out.println("Somando vitórias de: " + this.getVitorias());
        System.out.println("Derrotas de: " + this.getDerrotas());
        System.out.println("E seus empates: " + this.getEmpates());
        System.out.println("---------------------------------------");
    }
    public void status(){
        System.out.println(this.getNome()+" é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("\n--------------------------------------\n");
    }
     public void GanharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void PerderLura(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void EmpatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPaso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPaso() {
        return peso;
    }

    public void setPaso(double paso) {
        this.peso = paso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    //Categoria muda automaticamente quando se muda o peso
    //Então também não seria nenhum problema torná-lo privado
    public void setCategoria() {
        if(this.getPaso() < 52.2){
            this.categoria = "Inválido";
        } else if(this.getPaso() <= 70.3){
            this.categoria = "Leve";
        } else if(this.getPaso() <= 83.9){
            this.categoria = "Médio";
        } else if(this.getPaso() <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}

