package negocio;

public class Caracteristica {
	
	private float peso;
	private double altura;
	private String cor;
		

	public Caracteristica() {
		
	}
	
	public void exibe() {
		System.out.printf("Peso: %.2f Kg \n"
				+"Altura: %.2f CM\n"
				+"Cor: %s \n",				
				peso,
				altura,
				cor);		
		
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double d) {
		this.altura = d;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


}
