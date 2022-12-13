public class Paciente {

    private int horario;

    private int consultorio;

    private String nomePaciente;

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    public void cadastrarPaciente(String nomePaciente) {
        this.nomePaciente= nomePaciente;
    }
    public void imprimirConsultorio() {
    System.out.println(this.consultorio);
    }
}
