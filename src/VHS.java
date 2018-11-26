
public class VHS extends Filme{

	public VHS(int id, String nome, Genero genero) {
		super(id, nome, genero);
		//MIDIA 2 = VHS
		super.midia = 2;
		//STATUS 1 = DISPONIVEL, STATUS 2 = ALUGADO, STATUS 3 = INDISPONIVEL;
		super.status = 1;		
	}
	
	public VHS(String nome, Genero genero) {
		super(nome, genero);
		super.midia = 2;
		super.status = 1;
	}
	
}
