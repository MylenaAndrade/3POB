public class Cama {
    private int id;
    private String codigoCama;
    private boolean ehBeliche;
    private String posicao;
    private String descricao;

    //MÉTODO CAMA
    public Cama(String codigoCama, boolean ehBeliche, String posicao, String descricao){
        this.codigoCama = codigoCama;
        this.ehBeliche = ehBeliche;
        this.posicao = posicao;
        this.descricao = descricao;
    }

    //GETTERS
    public int getId() {
        return id;
    }
    public String getCodigoCama() {
        return codigoCama;
    }
    public boolean isEhBeliche() {
        return ehBeliche;
    }
    public String getPosicao() {
        return posicao;
    }
    public String getDescricao() {
        return descricao;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setCodigoCama(String codigoCama) {
        this.codigoCama = codigoCama;
    }
    public void setEhBeliche(boolean ehBeliche) {
        this.ehBeliche = ehBeliche;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
