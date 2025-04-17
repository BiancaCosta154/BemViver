import java.util.ArrayList;

public class ProntuarioEletronicos {

    private ArrayList<AnotacaoMedica> historico;
    private ArrayList<Receita> receita;

    public void adicionarAnotacao(AnotacaoMedica anotacao) {
    }

    ;

    public void resumoProntuario() {
    }

    ;

    public ProntuarioEletronicos(ArrayList<AnotacaoMedica> historico, ArrayList<Receita> receita) {
        this.historico = historico;
        this.receita = receita;
    }

    public ArrayList<AnotacaoMedica> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<AnotacaoMedica> historico) {
        this.historico = historico;
    }

    public ArrayList<Receita> getReceita() {
        return receita;
    }

    public void setReceita(ArrayList<Receita> receita) {
        this.receita = receita;
    }

}
