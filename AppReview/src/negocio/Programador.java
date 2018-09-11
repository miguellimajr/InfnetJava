package negocio;

public class Programador {

	public String nome;
	public int idade;
	public Remuneracao remuneracao;
	public RedeSocial redeSocial;
	
	public void show() {
		System.out.printf("Programador :: nome: %s - idade: %d",
				nome,
				idade
				);

		remuneracao.show();
		
		redeSocial.show();
	}
	
}
