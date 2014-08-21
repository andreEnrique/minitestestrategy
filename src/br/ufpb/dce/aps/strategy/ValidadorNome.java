package br.ufpb.dce.aps.strategy;

public class ValidadorNome implements validadorStrategy {
	
	private int tamanhoMax;
	
	public ValidadorNome (int tamanhoMax){
		this.tamanhoMax = tamanhoMax;
	}

	@Override
	public boolean validarCampo(String srt) {
		
		return srt.length() <= tamanhoMax;
	}

}
