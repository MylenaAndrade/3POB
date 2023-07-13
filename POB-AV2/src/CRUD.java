import conexao.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CRUD {
    //CLIENTE
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
    public void ClienteRemover(int id) {
        String sql = "DELETE FROM CLIENTES WHERE ID = ?";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
    public static void ClienteAlterar(int id, Cliente cliente){
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
    public void ClienteListar(int id) {
        CRUD crud = new CRUD();
        Cliente cliente = crud.buscarCliente(id);

        System.out.println("Nome: " + cliente.getNome() + "\n" + "Endereço: " + cliente.getEndereco() + "\n" +
                "Código Postal: " + cliente.getPostalCode() + "\n" + "País: " + cliente.getPais() + "\n" +
                "CPF: " + cliente.getCpf() + "\n" + "Passaporte: " + cliente.getPassaporte() + "\n" +
                "Data de Nascimento: " + cliente.getDtNascimento() + "\n");
    }
    public Cliente buscarCliente(int id) {
        Cliente cliente = null;
        try {
            String sql = "SELECT * FROM Clientes WHERE id = ?";
            PreparedStatement ps = null;
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nome = (rs.getString("nome"));
                String endereco = (rs.getString("endereco"));
                String postalCode = (rs.getString("postalCode"));
                String pais = (rs.getString("pais"));
                String cpf = (rs.getString("cpf"));
                String passaporte = (rs.getString("passaporte"));
                String email = (rs.getString("email"));
                String dtNascimento = (rs.getString("dtNascimento"));

                cliente = new Cliente(nome, endereco, postalCode, pais, cpf, passaporte, email, dtNascimento);
            }
            return cliente;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //
}

