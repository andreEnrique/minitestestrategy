package br.ufpb.dce.aps.strategy;

public class Campo {

	public String nome;
	public String cpf;
	public String id;
	public String valor;
	
	private validadorStrategy validadorStrategy;
	
	
	public Campo(String nome, String cpf, String id, validadorStrategy validadorStrategy){
		this.nome = nome;
		this.cpf = cpf;
		this.id= id;	
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public boolean validar(){
		return validadorStrategy.validarCampo(this.valor);
	}
	
}
