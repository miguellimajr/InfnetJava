package testes;

import javax.swing.JOptionPane;

import negocio.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		String[] disciplinas = new String[3];
		
		for (int i = 0; i < disciplinas.length; i++) {
			disciplinas[i] = JOptionPane.showInputDialog("Digite o nome da disciplina:");
		}
		
		Professor p = new Professor();		
		p.anoNascimento = 1978;
		p.cpf = "12345678901";
		p.disciplinas = disciplinas;
		p.email = "elberth.moraes@gmail.com";
		p.nome = "Elberth Moraes";		
		p.imprimir();
		
		Professor a = new Professor("Elberth Moraes", "elberth.moraes@gmail.com");
		a.anoNascimento = 1978;
		a.cpf = "12345678901";
		a.disciplinas = disciplinas;
		a.imprimir();

		new Professor("Elberth Moraes", "elberth.moraes@gmail.com", "12345678901", 1978, disciplinas).imprimir();
	}
}