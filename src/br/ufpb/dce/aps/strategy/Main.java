package br.ufpb.dce.aps.strategy;

public class Main {
	
	public static void main (String args []){
		
		ValidadorService service = new ValidadorService();
		
		service.addCampo(new Campo("nome","08323238456", "", new ValidadorNome(30)));
		service.addCampo(new Campo("nome","08323238456", "", new ValidadorId()));
		service.addCampo(new Campo("nome","08323238456", "", new ValidadorCpf()));
	}

}
