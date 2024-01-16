package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class MiniLivro extends Livro {
	
	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	protected boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
}
