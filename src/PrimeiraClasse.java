public class PrimeiraClasse {

    public static void  main(String args[]) {
        System.out.println("Juliana Leite");
        Paciente paciente = new Paciente();
        paciente.cadastrarPaciente("Juliana Leite");
        paciente.setHorario(8);
        paciente.setConsultorio(1);
        System.out.println(paciente.getHorario());
        paciente.imprimirConsultorio();
    }
}
