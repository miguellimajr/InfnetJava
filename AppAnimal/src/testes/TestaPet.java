package testes;

import negocio.*;

public class TestaPet {
	
	public static void main(String[] args) {
		
		Gato gargamel = new Gato();	
		
		gargamel.setNome("Gargamel");
		String gatoDonos[] = {"Tom", "Jerry"};		
		gargamel.setCastrado(true);
		gargamel.setIdade(5);
		
		gargamel.setDonos(gatoDonos);
		gargamel.exibe();	
		
		
		Urso tobe = new Urso();
		tobe.setNome("Tobe");
		tobe.setIdade(8);
		String tobeDonos[] = {"Marsha"};
		tobe.setDonos(tobeDonos);
		Caracteristica tobeCaracteristicas = new Caracteristica();
		tobeCaracteristicas.setAltura(2.3);
		tobeCaracteristicas.setPeso(100);
		tobeCaracteristicas.setCor("Branco");		
		tobe.setCaracteristicas(tobeCaracteristicas);				
		tobe.exibe();

		
		Cachorro olga = new Cachorro();
		olga.setNome("Olga");
		olga.setIdade(10);
		olga.setRaca("Pug");
		String olgaDonos[] = {"João", "Maria"};
		olga.setDonos(olgaDonos);
		Caracteristica olgaCaracteristicas = new Caracteristica();
		olgaCaracteristicas.setAltura(15);
		olgaCaracteristicas.setPeso(15);
		olgaCaracteristicas.setCor("Marrom");
		olga.setCaracteristicas(olgaCaracteristicas);				
		olga.exibe();
		
		
		Cachorro ronda = new Cachorro();
		ronda.setNome("Ronda");
		ronda.setIdade(2);
		ronda.setRaca("Rottweiler");
		String rondaDonos[] = {"Hugo", "José", "Luís"};
		ronda.setDonos(rondaDonos);
		Caracteristica rondaCaracteristicas = new Caracteristica();
		rondaCaracteristicas.setAltura(50);
		rondaCaracteristicas.setPeso(40);
		rondaCaracteristicas.setCor("Preta");
		ronda.setCaracteristicas(rondaCaracteristicas);		
		ronda.exibe();
		
		
		

		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
