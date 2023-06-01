package cinema;

public class Sala {
	private int id;
	private int filas;
	private int cadeirasPorFila;
	
	public Sala(int id, int filas, int cadeirasPorFila) {
		this.id = id;
		this.filas = filas;
		this.cadeirasPorFila = cadeirasPorFila;
	}

	public int getId() {
		return id;
	}

	public int getFilas() {
		return filas;
	}

	public int getCadeirasPorFila() {
		return cadeirasPorFila;
	}
	

}
