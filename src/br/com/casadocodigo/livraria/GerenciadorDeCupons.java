package br.com.casadocodigo.livraria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeCupons {
	
	private Set<String> cupons;
	
	public GerenciadorDeCupons() {
		this.cupons = new HashSet<String>();
		cupons.addAll(Arrays.asList("10OFF", "20OFF", "30OFF"));
	}

	public boolean validaCupom(String cupom) {
		return this.cupons.contains(cupom);
	}
}
