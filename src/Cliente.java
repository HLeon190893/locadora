import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private boolean alugado;

	public Cliente(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.alugado = false;
	}

	public Cliente(String nome, int idade) {
		this.id = 0;
		this.nome = nome;
		this.idade = idade;
		this.alugado = false;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void Alugar(Filme filme) {
		if (this.alugado == true) {
			System.out.println("O cliente " + this.nome + " possui um filme alugado, devolva seu filme primeiro.");
		} else if (filme.status == 1) {
			System.out.println("Filme já alugado!");
		} else if (filme.status == 3) {
			System.out.println("Filme Indisponível! Mídia Quebrada");
		} else {
			filme.setStatus(2);
		}
	}

	// STATUS 1 = DISPONIVEL, STATUS 2 = ALUGADO, STATUS 3 = INDISPONIVEL;
	public void Devolver(Filme filme) {
		if (this.alugado == false) {
			System.out.println("O cliente " + this.nome + " não possui um filme alugado.");
		} else if (filme.status == 2) {
			System.out.println("Filme já alugado!");
		} else if (filme.status == 3) {
			System.out.println("Filme Indisponível! Mídia Quebrada");
		} else {
			filme.setStatus(1);
		}
	}

	public static void mostrar(Cliente cliente) {
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getIdade());
	}

	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			mostrar(cliente);
		}
	}
}
