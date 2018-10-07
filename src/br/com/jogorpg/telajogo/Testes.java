package br.com.jogorpg.telajogo;

import br.com.jogorpg.service.PersonagemService;

public class Testes {

	public static void main(String[] args) {
		PersonagemService ps = new PersonagemService();

		System.out.println("O personagem escolhido foi -> " + ps.escolherPersonagem(1).getNome());
	}

}
