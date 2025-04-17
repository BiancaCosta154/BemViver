import java.util.ArrayList;
import java.util.Date;

public class Receita {
    private int id;
    private Date data;
    private ArrayList<Medicamentos> medicamentos;
    private Medicos prescritor;

    public void adicionarMedicamento(Medicamentos med) {
    }

    ;


    public Receita(int id, Date data, ArrayList<Medicamentos> medicamentos, Medicos prescritor) {
        this.id = id;
        this.data = data;
        this.medicamentos = medicamentos;
        this.prescritor = prescritor;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setMedicamentos(ArrayList<Medicamentos> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void setPrescritor(Medicos prescritor) {
        this.prescritor = prescritor;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<Medicamentos> getMedicamentos() {
        return medicamentos;
    }

    public Medicos getPrescritor() {
        return prescritor;
    }
}
