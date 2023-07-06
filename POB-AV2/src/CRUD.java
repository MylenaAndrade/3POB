import java.util.ArrayList;
import java.util.Iterator;

public class CRUD {
    public static void ClienteInserir(ArrayList<Cliente> clientes, Cliente cliente){
        clientes.add(cliente);
    }
    public static void ClienteRemover(ArrayList<Cliente> clientes, int id){
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getId() == id) {
                iterator.remove();
            }
        }
    }

    public static void ClienteAlterar(ArrayList<Cliente> clientes, int id, String novoNome, String novoEndereco, String novoPostalCode, String novoPais, String
            novoCPF, String novoPassaporte, String novadtNascimento){
        String nulo = "null";
        for (Cliente produto : clientes) {
            if (produto.getId() == id) {
                if(!novoNome.equals(nulo)){
                    produto.setNome(novoNome);
                }
                if(!novoEndereco.equals(nulo)){
                    produto.setEndereco(novoEndereco);
                }

                if(!novoPostalCode.equals(nulo)){
                    produto.setPostalCode(novoPostalCode);
                }

                if(!novoPais.equals(nulo)){
                    produto.setPais(novoPais);
                }

                if(!novoCPF.equals(nulo)){
                    produto.setCpf(novoCPF);
                }

                if(!novoPassaporte.equals(nulo)){
                    produto.setPassaporte(novoPassaporte);
                }
                if(!novadtNascimento.equals(nulo)){
                    produto.setCpf(novadtNascimento);
                }
                break;
            }
        }

        public static void ClienteListar(ArrayList<Cliente> clientes){
            for (Cliente produto: clientes) {
                System.out.println("Nome: " + produto.getNome() + "\n" + "Descrição " + produto.getDescricao() + "\n" + "Preço por Kg: " + produto.getPreco() + " " + produto.getPeso() + "Kg" + "\n");
            }
        }
    }
}
