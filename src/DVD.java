
public class DVD extends Filme {

	public DVD(int id, String nome, Genero genero) {
		super(id, nome, genero);
		//MIDIA 1 = DVD
		super.midia = 1;
		//STATUS 1 = DISPONIVEL, STATUS 2 = ALUGADO, STATUS 3 = INDISPONIVEL;
		super.status = 1;
	}
	
	public DVD(String nome, Genero genero) {
		super(nome, genero);
		super.midia = 1;
		super.status = 1;
	}
	
	
	
}
