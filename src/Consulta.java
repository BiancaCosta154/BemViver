import java.util.Date;

public class Consulta {

    private int id;
    private TipoConsulta tipo; // Presencial, Telemedicina, Retorno
    private Paciente paciente;
    private Medicos medico;
    private Date dataHora;
    private String statusprivate;
    private String anotacoes;


    public Consulta(int id, TipoConsulta tipo, Paciente paciente, Medicos medico, Date dataHora, String statusprivate, String anotacoes) {
        this.id = id;
        this.tipo = tipo;
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.statusprivate = statusprivate;
        this.anotacoes = anotacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatusprivate() {
        return statusprivate;
    }

    public void setStatusprivate(String statusprivate) {
        this.statusprivate = statusprivate;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
}
