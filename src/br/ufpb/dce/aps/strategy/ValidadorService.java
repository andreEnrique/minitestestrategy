package br.ufpb.dce.aps.strategy;

import java.util.LinkedList;
import java.util.List;

public class ValidadorService {
	
	private List <Campo> campos;
	
	public ValidadorService(){
		this.campos = new LinkedList<Campo>();
	}
	
	public void addCampo(Campo campo){
		campos.add(campo);
	}
	
	
	public boolean validar(){
		for(Campo campo: campos){
			if(!campo.validar()) return false;
		}
		return true;
	}
	
}
