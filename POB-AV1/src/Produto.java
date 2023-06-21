import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Produto {
    private int id;
    private String codigoDeBarras;
    private String sku;
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;
    private double peso;
    private String fabricante;

    public Produto(int id, String codigoDeBarras, String sku, String nome, String descricao, String categoria ,double preco, double peso, String fabricante){
        this.id = id;
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.sku = sku;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.peso = peso;
        this.fabricante = fabricante;
    }

    public void ProdutoRemover(ArrayList<Produto> produtos, int id){
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getId() == id) {
                iterator.remove();
            }
        }
    }

    public void ProdutoAlterar(ArrayList<Produto> produtos, int id, String novoNome, String novaDescricao, double novoPreco, double
            novoPeso){
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                if(novoNome != null){
                    produto.setNome(novoNome);
                }
                if(novaDescricao != null){
                    produto.setDescricao(novaDescricao);
                }

                if(novoPreco != 0){
                    produto.setPreco(novoPreco);
                }

                if(novoPeso != 0){
                    produto.setPeso(novoPeso);
                }
                break;
            }
        }
    }

    public void ProdutoListar(ArrayList<Produto> produtos){
        for (Produto produto: produtos) {
            System.out.println("Nome: " + produto.getNome() + "\n" + "Descrição " + produto.getDescricao() + "\n" + "Preço por Kg: " + produto.getPreco() + " " + produto.getPeso() + "Kg" + "\n");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
