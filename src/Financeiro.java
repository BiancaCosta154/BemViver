import java.util.ArrayList;

public class Financeiro {

    private ArrayList<Fatura> faturas;
    private ArrayList<Despesas> despesas;

    public void calcularLucroMensal() {
    }

    ;

    public Financeiro(ArrayList<Fatura> faturas, ArrayList<Despesas> despesas) {
        this.faturas = faturas;
        this.despesas = despesas;
    }

    public ArrayList<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(ArrayList<Fatura> faturas) {
        this.faturas = faturas;
    }

    public ArrayList<Despesas> getDespesas() {
        return despesas;
    }

    public void setDespesas(ArrayList<Despesas> despesas) {
        this.despesas = despesas;
    }
}
