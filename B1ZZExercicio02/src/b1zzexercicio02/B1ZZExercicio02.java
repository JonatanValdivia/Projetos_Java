package b1zzexercicio02;
public class B1ZZExercicio02 {
    public static void main(String[] args) {
        AulaOnline aula1 = new AulaOnline();
        aula1.setNomeDaAula("FPOO");
        aula1.setDuracaoDaAula("300m");
        aula1.setNomeDoProfessor("Gustavo Guanabara");
        aula1.setIdadeMinimaParaAAula(13);
        System.out.println("Aula de " + aula1.getNomeDaAula() + " dura em cerca de " + aula1.getDuracaoDaAula() + ", realizada por " + aula1.getNomeDoProfessor() + "\nIdade mínima para a aula é 14. Qual a sua idade? " + aula1.getIdadeMinimaParaAAula());
    }
    
}
