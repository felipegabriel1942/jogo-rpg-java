package br.com.jogorpg.model;

public class Personagem {
	
	private Integer codigo;
	private String nome;
	private Integer pontosDeVida;
	private Integer pontosDeMagia;
	private Integer ataque;
	private Integer defesa;
	
		
	public Personagem(Integer codigo, String nome, Integer pontosDeVida, Integer pontosDeMagia, Integer ataque,
			Integer defesa) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.pontosDeVida = pontosDeVida;
		this.pontosDeMagia = pontosDeMagia;
		this.ataque = ataque;
		this.defesa = defesa;
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(Integer pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
	public Integer getPontosDeMagia() {
		return pontosDeMagia;
	}
	public void setPontosDeMagia(Integer pontosDeMagia) {
		this.pontosDeMagia = pontosDeMagia;
	}
	public Integer getAtaque() {
		return ataque;
	}
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}
	public Integer getDefesa() {
		return defesa;
	}
	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	
	
	
}
