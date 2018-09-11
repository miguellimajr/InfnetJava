package testes;

import negocio.Empresa;
import negocio.Endereco;

public class TestaEmpresa {

	public static void main(String[] args) {

		Empresa e1 = new Empresa(args[0]);
		e1.cnpj = args[1];
		
		Endereco end = new Endereco();
		end.bairro = args[2];
		end.cidade = args[3];
		end.uf = args[4];		
		e1.endereco = end;		
		e1.exibir();
		
		Empresa e3 = new Empresa(args[6], end);
		e3.razaoSocial = args[5];
		e3.exibir();
	}
}