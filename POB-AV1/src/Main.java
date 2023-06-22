import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        int opcao = 0;
        int id;
        String codigoBarras, sku, nome, descricao, categoria, fabricante,preco, peso;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite: \n[1]Inserir\n[2]Remover\n[3]Alterar\n[4]Listar\n[5]Sair");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o id: ");
                    id = sc.nextInt();
                    System.out.println("Digite o código de barras: ");
                    codigoBarras = sc.next();
                    System.out.println("Digite o sku: ");
                    sku = sc.next();
                    System.out.println("Digite o nome: ");
                    nome = sc.next();
                    System.out.println("Digite a descrição: ");
                    descricao = sc.next();
                    System.out.println("Digite a categoria: ");
                    categoria = sc.next();
                    System.out.println("Digite o preço: ");
                    preco = sc.next();
                    System.out.println("Digite o peso: ");
                    peso = sc.next();
                    System.out.println("Digite o fabricante: ");
                    fabricante = sc.next();
                    Produto produto = new Produto(id, codigoBarras, sku, nome, descricao, categoria, Double.parseDouble(preco), Double.parseDouble(peso), fabricante);
                    CRUD.ProdutoInserir(produtos,produto);
                    break;
                case 2:
                    System.out.println("Digite o id do produto que deseja remover: ");
                    id = sc.nextInt();
                    CRUD.ProdutoRemover(produtos,id);
                    break;
                case 3:
                    System.out.println("Digite o id do produto que deseja alterar: ");
                    id = sc.nextInt();
                    System.out.println("DIGITE NULL SE DESEJA NÃO ALTERAR UM ATRIBUTO!");
                    System.out.println("Digite o nome: ");
                    nome = sc.next();
                    System.out.println("Digite a descrição: ");
                    descricao = sc.next();
                    System.out.println("Digite a categoria: ");
                    categoria = sc.next();
                    System.out.println("Digite o preço: ");
                    preco = sc.next();
                    System.out.println("Digite o peso: ");
                    peso = sc.next();
                    CRUD.ProdutoAlterar(produtos, id, nome, descricao, categoria, preco, peso);
                    break;
                case 4:
                    CRUD.ProdutoListar(produtos);
                    break;
                default:
                    break;
            }
        }while (opcao != 5);


    }
}