package br.ufpb.dce.aps.strategy;

public class ValidadorCpf implements validadorStrategy {

	@Override
	public boolean validarCampo(String srt) {
		
		try{
			Integer.parseInt(srt);
		}catch(NumberFormatException e){
			return false;
		}
		return true;
	}
	
	

}
