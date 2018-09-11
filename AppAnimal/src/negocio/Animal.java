package negocio;

public class Animal {
	
	private String nome;
	private String donos[];
	private int idade;
	
	
	
	public Animal(String nome, String[] donos, int idade) {
		super();
		this.nome = nome;
		this.donos = donos;
		this.idade = idade;
	}
	
	public Animal() {
		
	}
	
	public void exibe() {
		System.out.printf("Nome: %s \n"				
				+"Idade: %d \n"
				+ "Donos: ",				
				nome,
				idade);	
		this.exibeDono();
						
	}
	
	private void exibeDono() {
		
		for (int i = 0; i < donos.length; i++) {
			
			System.out.printf("%s",donos[i]);			
			System.out.printf("%s",(i<(donos.length-1)) ? ", " : ".\n");
			
		}
		
		
	}
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String[] getDonos() {
		return donos;
	}


	public void setDonos(String[] donos) {
		this.donos = donos;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	

}
