package br.com.casadocodigo.livraria;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	
	private Map<String, Double> cupons;
	
	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		cupons.put("cab11", 10.0);
		cupons.put("cab22", 12.0);
		cupons.put("cab33", 13.0);
		cupons.put("cab44", 14.0);
	}
	
	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}
}
