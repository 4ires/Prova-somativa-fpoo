package av.somativa;

public class PrincipalProduto {

	public static void main(String[] args) {
		
		Livro produto = new Livro("É assim que começa", "Colen Hoover", 321);
		System.out.println("Nome do livro: " + produto.getNome());
		System.out.println("Nome do autor: " + produto.getAutor());
		System.out.println("Quantidade de páginas: " + produto.getPaginas());
	}

}
