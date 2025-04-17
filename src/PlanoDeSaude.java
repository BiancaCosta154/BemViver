import java.util.ArrayList;
import java.util.Date;

public class PlanoDeSaude {
    private String nome;
    private Date dataFim;
    private ArrayList<String> procedimentos;

    public void addProcedimento(String codigo) {
    }

    ;

    public void cobreProcedimento(String codigo) {
    }

    ;

    public PlanoDeSaude(String nome, Date dataFim, ArrayList<String> procedimentos) {
        this.nome = nome;
        this.dataFim = dataFim;
        this.procedimentos = procedimentos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<String> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(ArrayList<String> procedimentos) {
        this.procedimentos = procedimentos;
    }
}
