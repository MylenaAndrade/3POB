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

    //QUARTO
    public void QuartoInserir(Quarto quarto) {
        String sql = "INSERT INTO quartos (nome,qtdeCamas,temBanheiro,descricao) VALUES(?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, quarto.getNomeQuarto());
            ps.setInt(2, quarto.getQtdeCamas());
            ps.setBoolean(3, quarto.isTemBanheiro());
            ps.setString(4, quarto.getDescricao());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void QuartoRemover(int id) {
        String sql = "DELETE FROM quartos WHERE ID = ?";

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
    public void QuartoAlterar(int id, String novo, String nomeColuna){
        String sql = "UPDATE quartos SET " + nomeColuna + " = ? WHERE id = ?";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            if(nomeColuna.equals("qtdeCamas")){
                ps.setInt(1, Integer.parseInt(novo));
            }else if(nomeColuna.equals("temBanheiro")){
                ps.setBoolean(1, Boolean.getBoolean(novo));
            }else{
                ps.setString(1, novo);
            }

            ps.setInt(2, id);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void QuartoListar(int id) {
        CRUD crud = new CRUD();
        Quarto quarto = crud.QuartoBuscar(id);

        System.out.println("Nome do Quarto: " + quarto.getNomeQuarto() + "\n" + "Quantidade de camas: " +
                quarto.getQtdeCamas() + "\n" + "Tem Banheiro?: " + quarto.isTemBanheiro() + "\n" + "Descrição: "
                + quarto.getDescricao() + "\n");
    }
    public Quarto QuartoBuscar(int id) {
        Quarto quarto = null;
        try {
            String sql = "SELECT * FROM quartos WHERE id = ?";
            PreparedStatement ps = null;
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nomeQuarto = (rs.getString("nome"));
                int qtdeCamas = (rs.getInt("qtdeCamas"));
                Boolean temBanheiro = (rs.getBoolean("temBanheiro"));
                String descricao = (rs.getString("descricao"));

                quarto = new Quarto(nomeQuarto, qtdeCamas, temBanheiro, descricao);
            }
            return quarto;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //CAMA
    public void CamaInserir(Cama cama) {
        String sql = "INSERT INTO camas (codigoCama,ehBeliche,posicao,descricao) VALUES(?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cama.getCodigoCama());
            ps.setBoolean(2, cama.isEhBeliche());
            ps.setString(3, cama.getPosicao());
            ps.setString(4, cama.getDescricao());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void CamaRemover(int id) {
        String sql = "DELETE FROM camas WHERE ID = ?";

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
    public void CamaAlterar(int id, String novo, String nomeColuna){
        String sql = "UPDATE camas SET " + nomeColuna + " = ? WHERE id = ?";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            if(nomeColuna.equals("ehBeliche")){
                ps.setBoolean(1, Boolean.getBoolean(novo));
            }else{
                ps.setString(1, novo);
            }

            ps.setInt(2, id);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void CamaListar(int id) {
        CRUD crud = new CRUD();
        Cama cama = crud.CamaBuscar(id);

        System.out.println("Código da Cama: " + cama.getCodigoCama() + "\n" + "É beliche? : " +
                cama.isEhBeliche() + "\n" + "Posição: " + cama.getPosicao() + "\n" + "Descrição: "
                + cama.getDescricao() + "\n");
    }
    public Cama CamaBuscar(int id) {
        Cama cama = null;
        try {
            String sql = "SELECT * FROM camas WHERE id = ?";
            PreparedStatement ps = null;
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String codigoCama = (rs.getString("codigoCama"));
                boolean ehbeliche = (rs.getBoolean("ehbeliche"));
                String posicao = (rs.getString("posicao"));
                String descricao = (rs.getString("descricao"));

                cama = new Cama(codigoCama, ehbeliche, posicao, descricao);
            }
            return cama;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

