package negocio;

public class Endereco {
	public String bairro;
	public String cidade;
	public String uf;
	
	public void exibir() {
		System.out.printf("Endere�o (%s - %s - %s)\n",
				bairro,
				cidade,
				uf
			);
	}	
}