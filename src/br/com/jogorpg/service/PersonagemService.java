package br.com.jogorpg.service;


import br.com.jogorpg.model.Personagem;

public class PersonagemService {
	private final static Personagem[] personagens;

	static {
		personagens = new Personagem[4];
		personagens[0] = new Personagem(1, "Guerreiro", 150, 40, 30, 20);
		personagens[1] = new Personagem(2, "Mago", 120, 80, 15, 10);
		personagens[2] = new Personagem(3, "Ladrão", 125, 20, 25, 15);
		personagens[3] = new Personagem(4, "Arqueiro", 100, 35, 35, 15);
	}

	public Personagem escolherPersonagem(Integer escolha) {
		for (int i = 0; i < personagens.length; i++) {
			if (personagens[i].getCodigo() == escolha) {
				return personagens[i];
			}
		}
		return null;
	}

	public static Personagem[] getPersonagens() {
		return personagens;
	}

}
