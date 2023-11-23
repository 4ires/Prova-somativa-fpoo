package av.somativa;

public class Livro extends Produto{
	
	private String autor;
	private int paginas;
	
	public Livro(String nome, String autor, int paginas) {
		super(nome);
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public int getPaginas() {
		return paginas;
	}
}
