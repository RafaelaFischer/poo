import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ControleDePedido implements InterfaceSistemaDeControle {
	
	List<Pedido>pedidos;
	GravadorDePedido gravador = new GravadorDePedido();
	
	public ControleDePedido(){
		try{
			this.pedidos=gravador.lePedido();
		}catch(IOException e){
			System.err.println(e.getMessage());
			pedidos=new ArrayList<Pedido>();
		}
	
	}

	@Override
	public void adicionarPedido(Pedido p) {
		pedidos.add(p);	
		try {
			gravador.gravaPedido(pedidos);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			
		}
	}

	@Override
	public List<Pedido> pesquisaPedidosincluindoProduto(long codProduto) {
			List<Pedido>aux= new ArrayList<Pedido>();
			
			for(Pedido p : pedidos){
				for(ItemDePedido itens:p.getItens()){
					if(itens.getCodProduto()==codProduto){
						aux.add(p);
					}
				}
			}
			return aux;
		}
		
	

	@Override
	public void removePedido(long numPedido) {
	     for (Pedido p: pedidos) {
	            if (p.getNumeroDoPedido()==numPedido){
	            		pedidos.remove(numPedido);
	                System.out.println("Pedido " + numPedido + " removido!");
	            }
	            else{
	        
	        System.out.println("Pedido " + numPedido + " não foi encontrado!");
	    }
	     }
		
	}
	
	public int calculaQuantidadeDePedidoDoCliente(String nome){
		int quantidade=0;
		
		for(Pedido p: pedidos){
			if(p.getCliente().getNome().equalsIgnoreCase(nome)){
				quantidade ++;
			}
		}
	return quantidade;
	}
}
		
		


