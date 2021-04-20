package b1zzexercicio02;
public class AulaOnline {
    private String nomeDaAula;
    private String duracaoDaAula;
    private String nomeDoProfessor;
    private int idadeMinimaParaAAula;
    
    public void setNomeDaAula(String nomeDaAula){
        this.nomeDaAula = nomeDaAula;
    }
    
    public void setDuracaoDaAula(String duracaoDaAula){
        this.duracaoDaAula = duracaoDaAula;
    }
    
    public void setNomeDoProfessor(String nomeDoProfessor){
        this.nomeDoProfessor = nomeDoProfessor;
    }
    
    public void setIdadeMinimaParaAAula(int idadeMinimaParaAAula){
        if(idadeMinimaParaAAula >= 14){
            this.idadeMinimaParaAAula = idadeMinimaParaAAula;
        }else
            System.out.println("Idade de " + idadeMinimaParaAAula + " anos não é válida.");
    }
    
    public String getNomeDaAula(){
        return this.nomeDaAula;
    }
    
    public String getDuracaoDaAula(){
        return this.duracaoDaAula;
    }
    
    public String getNomeDoProfessor(){
        return this.nomeDoProfessor;
    }
    
    public int getIdadeMinimaParaAAula(){
        return this.idadeMinimaParaAAula;
    }
}
