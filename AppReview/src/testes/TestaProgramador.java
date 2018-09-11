package testes;

import negocio.Programador;
import negocio.RedeSocial;
import negocio.Remuneracao;

public class TestaProgramador {

	public static void main(String[] args) {
		Programador programador = new Programador();
		programador.nome ="ze";
		programador.idade = 10;
		
		Remuneracao remuneracao = new Remuneracao();
		remuneracao.salarioBase = 1000;
		remuneracao.gratificacao = 100;		
		
		RedeSocial redeSocial = new RedeSocial();
		redeSocial.facebook = "face";
		redeSocial.instagram = "insta";
		
		programador.redeSocial = redeSocial;
		programador.remuneracao = remuneracao;
		

		programador.show();
	}
}
