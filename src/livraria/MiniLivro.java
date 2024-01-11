package livraria;

public class MiniLivro extends Livro {
	
	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	protected boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
}
