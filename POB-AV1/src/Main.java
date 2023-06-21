import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto produto = new Produto(10, "1112", "16HG1", "Laranja", "É laranja a laranja", "Fruta", 2.99, 1, "CortaFruit");
        produtos.add(produto);
        produto = new Produto(12, "1142", "14IL1", "Ovo", "A galinha chorou para colocar", "Proteína", 10.99, 2, "OvoOvo");
        produtos.add(produto);
        produto = new Produto(18, "1569", "178TY", "Maça", "Newton chorou de dor quando ela caiu", "Fruta", 3.99, 1, "Gravidade");
        produtos.add(produto);
        produto.ProdutoListar(produtos);
        produto.ProdutoAlterar(produtos,12, "Manga", null, 0,4);
        produto.ProdutoListar(produtos);

    }
}