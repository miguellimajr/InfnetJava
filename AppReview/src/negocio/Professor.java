package negocio;

public class Professor {

	public String nome;
	public String email;
	public String cpf;
	public int anoNascimento;
	public String[] disciplinas;
	
	public Professor() {		
	}
	
	public Professor(String nome, String email) {
		this();
		this.nome = nome;
		this.email = email;
	}

	public Professor(String nome, String email, String cpf, int anoNascimento, String[] disciplinas) {
		this(nome, email);
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.disciplinas = disciplinas;
	}

	public void imprimir() {
		System.out.printf("Professor %s tem %d disciplinas\n",
				nome,
				disciplinas.length
			);
		
		show();
	}	
	private void show() {		
		for (String disciplina : disciplinas) {
			System.out.println(disciplina);
		}
	}
}