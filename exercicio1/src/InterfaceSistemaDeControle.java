import java.util.List;


public interface InterfaceSistemaDeControle {
	
	public void adicionarPedido(Pedido p);
	public List<Pedido> pesquisaPedidosincluindoProduto(long codProduto);
	public void removePedido(long numPedido);

}
