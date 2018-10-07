package br.com.jogorpg.model;

public class Ataque {
	
	private Integer codigo;
	private String nome;
	private double chanceDeAcerto;
	private double chanceDeCritico;
	private Integer dano;
	private Integer consumoDePM;
	
	
	
	
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
	public double getChanceDeAcerto() {
		return chanceDeAcerto;
	}
	public void setChanceDeAcerto(double chanceDeAcerto) {
		this.chanceDeAcerto = chanceDeAcerto;
	}
	public double getChanceDeCritico() {
		return chanceDeCritico;
	}
	public void setChanceDeCritico(double chanceDeCritico) {
		this.chanceDeCritico = chanceDeCritico;
	}
	public Integer getDano() {
		return dano;
	}
	public void setDano(Integer dano) {
		this.dano = dano;
	}
	public Integer getConsumoDePM() {
		return consumoDePM;
	}
	public void setConsumoDePM(Integer consumoDePM) {
		this.consumoDePM = consumoDePM;
	}
	
	
	
}
