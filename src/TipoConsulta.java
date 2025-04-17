public class TipoConsulta {
    private String presencial;
    private String Telemedicina;

    public TipoConsulta(String presencial, String telemedicina) {
        this.presencial = presencial;
        Telemedicina = telemedicina;
    }

    public String getPresencial() {
        return presencial;
    }

    public void setPresencial(String presencial) {
        this.presencial = presencial;
    }

    public String getTelemedicina() {
        return Telemedicina;
    }

    public void setTelemedicina(String telemedicina) {
        Telemedicina = telemedicina;
    }
}
