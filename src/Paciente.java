import java.util.ArrayList;
import java.util.Date;

public class Paciente {
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private String email;
    Date dataNascimento;
    ArrayList<String> alergias;
    private PlanoDeSaude plano; // Associação com Plano de Saúde
// Verifica se o plano cobre um exame
//+ boolean possuiCobertura(String procedimento)


    public Paciente(String cpf, String nome, String telefone, String endereco, String email, Date dataNascimento, ArrayList<String> alergias, PlanoDeSaude plano) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.alergias = alergias;
        this.plano = plano;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public void setPlano(PlanoDeSaude plano) {
        this.plano = plano;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public PlanoDeSaude getPlano() {
        return plano;
    }
}
