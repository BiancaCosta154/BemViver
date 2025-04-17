public class Fatura {
    private Consulta consulta;
    private double valor;
    private String formaPagamento; // Cartão, Boleto, Convênio, Boleto
    private boolean reembolsavel;

    public Fatura(Consulta consulta, double valor, String formaPagamento, boolean reembolsavel) {
        this.consulta = consulta;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.reembolsavel = reembolsavel;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public boolean isReembolsavel() {
        return reembolsavel;
    }

    public void setReembolsavel(boolean reembolsavel) {
        this.reembolsavel = reembolsavel;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
