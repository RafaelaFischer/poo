package br.ufpb.sistemapedidos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe implementa os metodos da InterfaceSistemaDeControle, e metodo
 * adicional.
 * 
 * @author Fischer
 * 
 */

public class ControleDePedido implements InterfaceSistemaDeControle {

	List<Pedido> pedidos;

	/**
	 * construtor onde esta inicializando a lista de pedidos.
	 * 
	 */
	public ControleDePedido() {
		pedidos = new ArrayList<Pedido>();
	}

	/**
	 * 
	 * cadastra um novo pedido.
	 * 
	 * @param p Pedido.
	 */

	@Override
	public void adicionarPedido(Pedido p) {
		pedidos.add(p);
	}

	/**
	 * Pesquisa Pedido incluindo os produtos quando é passado o codigo do
	 * produto.
	 * 
	 * @param codProduto Codigo do Produto.
	 * @return a lista com todos os itens do pedido.
	 */

	@Override
	public List<Pedido> pesquisaPedidosincluindoProduto(long codProduto) {
		List<Pedido> aux = new ArrayList<Pedido>();

		for (Pedido p : pedidos) {
			for (ItemDePedido itens : p.getItens()) {
				if (itens.getCodProduto() == codProduto) {
					aux.add(p);
				}
			}
		}
		return aux;
	}

	/**
	 * Remove o pedido apartir do numero do pedido que for passado.
	 * 
	 * @param numPedido Numero do Pedido.
	 * 
	 */

	@Override
	public void removePedido(long numPedido) {
		for (Pedido p : pedidos) {
			if (p.getNumeroDoPedido() == numPedido) {
				pedidos.remove(numPedido);
				System.out.println("Pedido " + numPedido + " removido!");
			} else {

				System.out.println("Pedido " + numPedido
						+ " não foi encontrado!");
			}
		}

	}

	/**
	 * Calcula a quantidade de pedidos de um cliente cujo nome é passado por
	 * paramentro.
	 * 
	 * @param nome Nome do Cliente.
	 * @return a quantidade de Pedidos de um certo cliente.
	 * 
	 */

	public int calculaQuantidadeDePedidoDoCliente(String nome) {
		int quantidade = 0;

		for (Pedido p : pedidos) {
			if (p.getCliente().getNome().equalsIgnoreCase(nome)) {
				quantidade++;
			}
		}
		return quantidade;
	}
}
