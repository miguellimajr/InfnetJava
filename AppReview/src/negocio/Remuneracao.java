package negocio;

import auxiliar.Constante;

public class Remuneracao {

	public float salarioBase;
	public float gratificacao;
	
	public void show() {
		System.out.printf("Remunera��o :: sal�rio base: %.2f - gratifica��o: %.2f\n",
				salarioBase,
				gratificacao
				);		
		System.out.printf("Sal�rio = %.2f",
				calcular()
				);
	}	
	private float calcular() {
		return (salarioBase + gratificacao) * 2 + 
				Constante.TX_SALARIAL;
	}
}
