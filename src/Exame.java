import java.util.Date;

public class Exame {
    private int id;
    private String codigoTUSS; // Padrão ANS
    private String descricao;
    private String laboratorio;
    private Date dataRealizacao;
    private String resultado;

    public void enviarResultado(Paciente paciente) {
    }

    ;// SMS/Email


    public Exame(int id, String codigoTUSS, String descricao, String laboratorio, Date dataRealizacao, String resultado) {
        this.id = id;
        this.codigoTUSS = codigoTUSS;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.dataRealizacao = dataRealizacao;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoTUSS() {
        return codigoTUSS;
    }

    public void setCodigoTUSS(String codigoTUSS) {
        this.codigoTUSS = codigoTUSS;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
