public class Reserva {
    private int id;
    private int idQuarto;
    private int idCama;
    private int idCliente;
    private String dtEntrada;
    private String dtSaida;

    //MÉTODO RESERVA
    public Reserva(int idQuarto, int idCama, int idCliente, String dtEntrada, String dtSaida){
        this.idQuarto = idQuarto;
        this.idCama = idCama;
        this.idCliente = idCliente;
        this.dtEntrada = dtEntrada;
        this.dtSaida = dtSaida;
    }

    //GETTERS
    public int getId() {
        return id;
    }
    public int getIdQuarto() {
        return idQuarto;
    }
    public int getIdCama() {
        return idCama;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public String getDtEntrada() {
        return dtEntrada;
    }
    public String getDtSaida() {
        return dtSaida;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }
    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }
    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }
}
