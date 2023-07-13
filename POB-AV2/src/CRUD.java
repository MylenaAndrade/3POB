import conexao.conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class CRUD {
    public void ClienteInserir(Cliente cliente) {
        String sql = "INSERT INTO CLIENTES (nome, endereco, postalCode,pais, cpf,passaporte,email,dtNascimento) VALUES(?,?,?,?,?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getPostalCode());
            ps.setString(4, cliente.getPais());
            ps.setString(5, cliente.getCpf());
            ps.setString(6, cliente.getPassaporte());
            ps.setString(7, cliente.getEmail());
            ps.setString(8, cliente.getDtNascimento());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


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

    }

    public static void ClienteListar(ArrayList<Cliente> clientes){
        for (Cliente cliente: clientes) {
            System.out.println("Nome: " + cliente.getNome() + "\n" + "Endereço " + cliente.getEndereco() + "\n" +
                    "Código Postal: " + cliente.getPostalCode() + "\n" + "País: " + cliente.getPais() + "\n" +
                    "CPF" + cliente.getCpf() + "\n" + "Passaporte: " + cliente.getPassaporte() + "\n" +
                    "Data de Nascimento" + cliente.getDtNascimento());
        }
    }
}



