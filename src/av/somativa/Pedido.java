package av.somativa;

public class Pedido {
	
	private long id;
	private String produto;
	private int quantidade;
	
	public Pedido() {
	}
	
	public Pedido(long id, String produto, int quantidade) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	public long getId() {
		return id;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
