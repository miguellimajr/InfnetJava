package negocio;

public class Cliente {

	public String nome;
	public String cpf;
	public Endereco endereco;
	
	public Cliente() {
		nome = "Cliente não informado";
		cpf = "999.999.999-99";

		endereco = new Endereco();		
		endereco.bairro = "Centro"; 
		endereco.cidade = "Rio de Janeiro"; 
		endereco.uf = "RJ";
	}
	
	public Cliente(String bairro, String cidade, String uf) {
		this();
		endereco.bairro = bairro;
		endereco.cidade = cidade;
		endereco.uf = uf;
	}
	
	public Cliente(String nome, String cpf, String bairro, String cidade, String uf) {
		this(bairro, cidade, uf);
		this.nome = nome;
		this.cpf = cpf;		
	}
	
	public void exibir() {
		System.out.printf("Cliente: %s :: %s\n",
				nome,
				cpf
			);		
		
		endereco.exibir();
	}
}