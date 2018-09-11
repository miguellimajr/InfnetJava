package negocio;

public class Estudante {

	public String nome;
	public String matricula;
	public float[] notas;
	
	public Estudante(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public void exibir() {
		System.out.printf(
		"O aluno %s - %s - cursou %d disciplinas e tem o CR %.2f",
		nome,
		matricula,
		notas.length,
		calcularCR());
	}
	
	private float calcularCR() {
		
		float soma = 0;
		
		for(float nota : notas) {
			soma = soma + nota;
		}
	
		return soma / notas.length;
	}
}