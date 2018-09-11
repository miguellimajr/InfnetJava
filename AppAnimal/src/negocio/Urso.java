package negocio;

public class Urso extends Animal {
	
	Caracteristica caracteristica = new Caracteristica();
	
	
	public void exibe() {		
		super.exibe();
		caracteristica.exibe();
		System.out.println();
	}

	
	public Caracteristica getCaracteristicas() {
		return caracteristica;
	}

	public void setCaracteristicas(Caracteristica caracteristicas) {
		this.caracteristica = caracteristicas;
	}
	
	
	

}
