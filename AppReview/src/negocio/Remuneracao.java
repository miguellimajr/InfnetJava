package negocio;

import auxiliar.Constante;

public class Remuneracao {

	public float salarioBase;
	public float gratificacao;
	
	public void show() {
		System.out.printf("Remuneração :: salário base: %.2f - gratificação: %.2f\n",
				salarioBase,
				gratificacao
				);		
		System.out.printf("Salário = %.2f",
				calcular()
				);
	}	
	private float calcular() {
		return (salarioBase + gratificacao) * 2 + 
				Constante.TX_SALARIAL;
	}
}
