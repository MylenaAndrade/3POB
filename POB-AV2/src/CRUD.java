import conexao.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public static void ClienteAlterar(int id, String novo, String nomeColuna){
        String sql = "UPDATE clientes SET " + nomeColuna + " = ? WHERE id = ?";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, novo);
            ps.setInt(2, id);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
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

