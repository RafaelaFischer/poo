package br.ufpb.sistemapedidos;


import java.util.List;

/**
 * Esta interface define as operações de um sistema
 * que controla os pedidos, itens e cadastros
 * de clientes.
 * 
 * @author Fischer
 * 
 */


public interface InterfaceSistemaDeControle {
	
	/**
	 * 
	 * cadastra um novo pedido.
	 * @param p  Pedido.
	 * 
	 */

	public void adicionarPedido(Pedido p);
	
	/**
	 * 
	 * Pesquisa Pedido incluindo os produtos quando é passado o codigo do produto.
	 * @param codProduto Codigo do Produto.
	 * @return a lista com todos os itens do pedido.
	 * 
	 */
	
	public List<Pedido> pesquisaPedidosincluindoProduto(long codProduto);
	
	/**
	 * 
	 * Remove o pedido apartir do numero do pedido que for passado.
	 * @param numPedido Numero do Pedido.
	 * 
	 */
	public void removePedido(long numPedido);

}
