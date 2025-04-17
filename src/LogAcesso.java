import java.util.Date;

public class LogAcesso {

    private String Usuarios;
    private String acao; // "Visualizou prontuário", "Alterou consulta"
    private Date data;

    public void gerarRelatorio() {
    }

    ;


    public LogAcesso(String usuarios, String acao, Date data) {
        Usuarios = usuarios;
        this.acao = acao;
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(String usuarios) {
        Usuarios = usuarios;
    }
}
