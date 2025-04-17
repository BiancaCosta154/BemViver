import java.util.Date;

public class ItemEstoque {
    private int id;
    private String nome;
    private int quantidade;
    private Date validade;
    private String tipo;


    public ItemEstoque(int id, String nome, int quantidade, Date validade, String tipo) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.validade = validade;
        this.tipo = tipo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


