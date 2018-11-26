import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
	private Connection conn;

	public ClienteDAO() throws SQLException {
		this.conn = Factory.getConnection();
	}

	public void criarTabela() throws SQLException {
		String sql = "CREATE TABLE " 
				+ "cliente(id SERIAL8  PRIMARY KEY" 
				+ ",nome VARCHAR(40) NOT NULL"
				+ ",idade VARCHAR(2) NOT NULL" 
				+ ",alugado BOOLEAN NOT NULL)";
		PreparedStatement ps = conn.prepareStatement(sql);
		if (!ps.execute()) {
			System.out.println("Tabela ok");
		} else {
			System.out.println("Erro");
		}
	}

	public Cliente getCliente(int id) throws SQLException {
		String sql = "SELECT * FROM cliente where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return new Cliente(rs.getInt(1), rs.getString(2), rs.getInt(3));
	}

	public ArrayList<Cliente> listarClientes() throws SQLException {
		String sql = "SELECT * FROM cliente";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Cliente> aux = new ArrayList<Cliente>();
		while (rs.next()) {
			aux.add(new Cliente(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		}
		return aux;
	}

	public void inserirCliente(Cliente cli) throws SQLException {
		String sql = "INSERT INTO Cliente(nome,idade,alugado) VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, cli.getNome());
		ps.setInt(2, cli.getIdade());
		ps.setBoolean(3, cli.isAlugado());
		if (!ps.execute()) {
			System.out.println("O cliente foi registrado");
		} else {
			System.out.println("Erro");
		}
	}

	public void deletarCliente(int id) throws SQLException {
		String sql = "DELETE FROM Cliente where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		if (!ps.execute()) {
			System.out.println("O cliente foi deletado");
		} else {
			System.out.println("Erro");
		}
	}
}
