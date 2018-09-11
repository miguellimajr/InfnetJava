package testes;

import negocio.Estudante;

public class TestaParametros {

	public static void main(String[] args) {

		float[] notasDisciplinas = new float[8];
		
		for (int i = 0; i < notasDisciplinas.length; i++) {
			notasDisciplinas[i] = Float.valueOf(args[i+2]);			
		}
		
		String nome = args[0];
		String matricula = args[1];

		Estudante e = new Estudante(nome, matricula);
		e.notas = notasDisciplinas;
		e.exibir();
	}
}