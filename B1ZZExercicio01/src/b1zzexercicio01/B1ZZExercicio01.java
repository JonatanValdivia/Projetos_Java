package b1zzexercicio01;
public class B1ZZExercicio01 {

    public static void main(String[] args) {
        Cedula cedula1 = new Cedula();
        cedula1.setValorNota(10);
        cedula1.setAnoDaNota(2000);
        cedula1.setTipoDeNota(" Reais");
        System.out.println("Nota de: " + cedula1.getValorDaNota() + cedula1.getTipoDeNota() + " ano: " + cedula1.getAnoDaNota());
    }
    
}
