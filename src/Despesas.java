import java.util.Date;

public class Despesas {
    private int id;
    private String descricao;
    private Date dataValidade;

    public Despesas(int id, String descricao, Date dataValidade) {
        this.id = id;
        this.descricao = descricao;
        this.dataValidade = dataValidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
