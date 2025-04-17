import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> medicamentos;
    private ArrayList<ItemEstoque> materiais;

    public void alertaReposicao() {
    }

    ; // Avisa quando está acabando


    public Estoque(ArrayList<ItemEstoque> medicamentos, ArrayList<ItemEstoque> materiais) {
        this.medicamentos = medicamentos;
        this.materiais = materiais;
    }

    public ArrayList<ItemEstoque> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<ItemEstoque> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<ItemEstoque> getMateriais() {
        return materiais;
    }

    public void setMateriais(ArrayList<ItemEstoque> materiais) {
        this.materiais = materiais;
    }
}
