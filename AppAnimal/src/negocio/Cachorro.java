package negocio;

public class Cachorro extends Animal {
	
	private Caracteristica caracteristica;
	private String raca;	
	
	
	public void exibe() {
		
		super.exibe();
		caracteristica.exibe();
		System.out.printf("Raça: %s \n\n", raca);		
		
	}


	public Caracteristica getCaracteristicas() {
		return caracteristica;
	}


	public void setCaracteristicas(Caracteristica caracteristicas) {
		this.caracteristica = caracteristicas;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
