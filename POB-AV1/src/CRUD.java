import java.util.ArrayList;
import java.util.Iterator;

public class CRUD {
    public static void ProdutoInserir(ArrayList<Produto> produtos, Produto produto){
        produtos.add(produto);
    }
    public static void ProdutoRemover(ArrayList<Produto> produtos, int id){
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getId() == id) {
                iterator.remove();
            }
        }
    }

    public static void ProdutoAlterar(ArrayList<Produto> produtos, int id, String novoNome, String novaDescricao, String novaCategoria, String novoPreco, String
            novoPeso){
            String nulo = "null";
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                if(!novoNome.equals(nulo)){
                    produto.setNome(novoNome);
                }
                if(!novaDescricao.equals(nulo)){
                    produto.setDescricao(novaDescricao);
                }

                if(!novaCategoria.equals(nulo)){
                    produto.setCategoria(novaCategoria);
                }

                if(!novoPreco.equals(nulo)){
                    produto.setPreco(Double.parseDouble(novoPreco));
                }

                if(!novoPeso.equals(nulo)){
                    produto.setPeso(Double.parseDouble(novoPeso));
                }
                break;
            }
        }
    }

    public static void ProdutoListar(ArrayList<Produto> produtos){
        for (Produto produto: produtos) {
            System.out.println("Nome: " + produto.getNome() + "\n" + "Descrição " + produto.getDescricao() + "\n" + "Preço por Kg: " + produto.getPreco() + " " + produto.getPeso() + "Kg" + "\n");
        }
    }

}
