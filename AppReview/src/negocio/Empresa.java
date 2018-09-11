package negocio;

public class Empresa {

	public String razaoSocial;
	public String cnpj;
	public Endereco endereco;
	
	public Empresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Empresa(String cnpj, Endereco endereco) {
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	public Empresa(String cnpj, String bairro, String cidade, String uf) {
		this.cnpj = cnpj;
		this.endereco.bairro = bairro;
		this.endereco.cidade = cidade;
		this.endereco.uf = uf;
	}
	
	public void exibir() {
		System.out.printf("Empresa: %s :: %s\n",
				razaoSocial,
				cnpj
			);
		
		endereco.exibir();
	}
}