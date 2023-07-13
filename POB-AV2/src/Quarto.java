public class Quarto {
    private int id;
    private String nomeQuarto;
    private int qtdeCamas;
    private boolean temBanheiro;
    private String descricao;

    //MÉTODO QUARTO
    public Quarto(String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao){
        this.nomeQuarto = nomeQuarto;
        this.qtdeCamas = qtdeCamas;
        this.temBanheiro = temBanheiro;
        this.descricao = descricao;

    }

    //GETTERS
    public int getId() {
        return id;
    }
    public String getNomeQuarto() {
        return nomeQuarto;
    }
    public int getQtdeCamas() {
        return qtdeCamas;
    }
    public boolean isTemBanheiro() {
        return temBanheiro;
    }
    public String getDescricao() {
        return descricao;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNomeQuarto(String nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }
    public void setQtdeCamas(int qtdeCamas) {
        this.qtdeCamas = qtdeCamas;
    }
    public void setTemBanheiro(boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
