package br.ufpb.dce.aps.testes;

import junit.framework.Assert;

import org.junit.Test;

import br.ufpb.dce.aps.strategy.Campo;
import br.ufpb.dce.aps.strategy.ValidadorCpf;
import br.ufpb.dce.aps.strategy.ValidadorId;
import br.ufpb.dce.aps.strategy.ValidadorNome;
import br.ufpb.dce.aps.strategy.ValidadorService;

public class Teste {
	
	private ValidadorService validadorService;
	private Campo campo;
	
	@Test
	public void addCampo(){
		validadorService = new ValidadorService();
		
		validadorService.addCampo(new Campo("andre","08323238456", "", new ValidadorNome(30)));
		validadorService.addCampo(new Campo("lulu","08323238456", "", new ValidadorId()));
		validadorService.addCampo(new Campo("lola","08323238456", "", new ValidadorCpf()));
				
	}

}
