package av.somativa;

public class PedidoPricipal extends Pedido{
	
	public static void main(String[]args) {
	Pedido pedido1 = new Pedido();
	Pedido pedido2 = new Pedido(2, "Gloss", 1);
	
	System.out.println(pedido2.getId());
	System.out.println(pedido2.getProduto());
	System.out.println(pedido2.getQuantidade());
	
	}
}
