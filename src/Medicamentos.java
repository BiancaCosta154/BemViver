import java.util.Date;

public class Medicamentos {
    private int id;
    private String descricao;
    private Date dataValidade;
    private int qtdeComprimidos;
    private String posologia;


    public Medicamentos(int id, String descricao, Date dataValidade, int qtdeComprimidos, String posologia) {
        this.id = id;
        this.descricao = descricao;
        this.dataValidade = dataValidade;
        this.qtdeComprimidos = qtdeComprimidos;
        this.posologia = posologia;
    }


    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public int getQtdeComprimidos() {
        return qtdeComprimidos;
    }

    public void setQtdeComprimidos(int qtdeComprimidos) {
        this.qtdeComprimidos = qtdeComprimidos;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
