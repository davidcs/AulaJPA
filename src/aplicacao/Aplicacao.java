package aplicacao;

import dominio.Pessoa;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa	p1 = new Pessoa(1, "David Correia", "Testes@testes.com.br");
		Pessoa	p2 = new Pessoa(2, "Carlos roberto", "Roberto@testes.com.br");
		Pessoa	p3 = new Pessoa(3, "Rayane Grattz", "Grattz@testes.com.br");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
