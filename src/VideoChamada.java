public class VideoChamada {
    private String link;
    private boolean gravacaoAutorizada;

    public void iniciarChamada() {
    }

    ;
    public VideoChamada(String link, boolean gravacaoAutorizada) {
        this.link = link;
        this.gravacaoAutorizada = gravacaoAutorizada;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isGravacaoAutorizada() {
        return gravacaoAutorizada;
    }

    public void setGravacaoAutorizada(boolean gravacaoAutorizada) {
        this.gravacaoAutorizada = gravacaoAutorizada;
    }
}
