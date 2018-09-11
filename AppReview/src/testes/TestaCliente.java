package testes;

import negocio.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("joao", "12345678901", "centro", "rio de janeiro", "RJ");
		c1.exibir();
		
		Cliente c2 = new Cliente("icarai", "niteroi", "RJ");
		c2.nome = "maria";
		c2.cpf = "98765432101";
		c2.exibir();
		
		Cliente c3 = new Cliente();
		c3.exibir();
	}
}
