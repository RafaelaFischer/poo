
import java.util.ArrayList;
import java.util.List;


public class Pedido {
	
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;
	
	public Pedido(long numeroDoPedido){
		itens = new ArrayList<ItemDePedido>();
		this.numeroDoPedido=numeroDoPedido;
		
	}

	public List<ItemDePedido> getItens(){
        return itens;
    }
    
    public void adicionaItem(ItemDePedido item){
        itens.add(item);
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(long numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}
	
	


	

}
