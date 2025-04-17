import java.util.Date;

public class Medicos {

    private String crm;
    private String nome;
    private String especialidade; // Ex: Cardiologia Pediátrica
    private boolean atendeTelemedicina;

    public boolean estaDisponivel(Date data) {
        return false;
    }

    public Medicos(String crm, String nome, String especialidade, boolean atendeTelemedicina) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.atendeTelemedicina = atendeTelemedicina;
    }


    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isAtendeTelemedicina() {
        return atendeTelemedicina;
    }

    public void setAtendeTelemedicina(boolean atendeTelemedicina) {
        this.atendeTelemedicina = atendeTelemedicina;
    }
}
