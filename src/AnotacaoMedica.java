public class AnotacaoMedica {
    private int id;
    private String data;
    private String texto;
    private Medicos responsavel;


    public AnotacaoMedica(int id, String data, String texto, Medicos responsavel) {
        this.id = id;
        this.data = data;
        this.texto = texto;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medicos getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Medicos responsavel) {
        this.responsavel = responsavel;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
