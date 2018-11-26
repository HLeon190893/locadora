
public class Filme {
	protected int id;
	protected String nome;
	protected Genero genero;
	protected int status;
	protected int midia;
	
	public Filme(int id, String nome, Genero genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
	}
	
	public Filme(String nome, Genero genero) {
		this.id = 0;
		this.nome = nome;
		this.genero = genero;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public int getMidia() {
		return midia;
	}
	
	
}

