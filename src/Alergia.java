public class Alergia {
    private int id;
    private String tipo;
    private String gravidade;
    private Paciente paciente;


    public Alergia(int id, String tipo, String gravidade, Paciente paciente) {
        this.id = id;
        this.tipo = tipo;
        this.gravidade = gravidade;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
}
