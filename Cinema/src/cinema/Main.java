package cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		Filme filme = new Filme(1,"Casablanca","US", 1954,90);
		filmes.add(filme);
		filme = new Filme(2,"E o Vento Levou...", "US",1955,110);
		filmes.add(filme);
		filme = new Filme(3,"Ben HUr", "US",1957,120);
		filmes.add(filme);
		filme = new Filme(4,"007", "US",1960,90);
		filmes.add(filme);
		
		ArrayList<Sala> salas = new ArrayList<Sala>();
		Sala sala = new Sala(1,4,5);
		salas.add(sala);
		sala = new Sala(2,4,5);
		salas.add(sala);
		sala = new Sala(3,4,5);
		salas.add(sala);
		
		ArrayList<Sessao> sessoes = new ArrayList<Sessao>();
		Sessao sessao = new Sessao(1,1,1,LocalDateTime.now());
		sessoes.add(sessao);
		sessao = new Sessao(2,1,1,LocalDateTime.now().plusMinutes(120));
		sessoes.add(sessao);
		sessao = new Sessao(3,1,1,LocalDateTime.now().plusMinutes(240));
		sessoes.add(sessao);
		
		filmes.forEach((x->System.out.println(x.getNome())));
		salas.forEach(x->System.out.println("Salas: " + x.getId() + " Quantidade de filas: " + x.getFilas() + " Quantidade cadeira por filas: " + x.getCadeirasPorFila()));
	}

}
