
public class Main {
	public static void main (String[]args){
	int quantidade=0;
	Cliente cliente = new Cliente("Rafaela");       
	ControleDePedido cpedido = new ControleDePedido();
	
    Pedido pedido = new Pedido(1,cliente);
    ItemDePedido lapis = new ItemDePedido(1,12,1.50);
    pedido.adicionaItem(lapis);
    cpedido.adicionarPedido(pedido);
    
    Pedido pedido2 = new Pedido(2,cliente);
    ItemDePedido livro = new ItemDePedido(2,12345, 25.0);    
    pedido2.adicionaItem(livro);
    cpedido.adicionarPedido(pedido2);
    
    quantidade=cpedido.calculaQuantidadeDePedidoDoCliente("Rafaela");
    
    if(quantidade==2){
    	System.out.println("Programa Correto");
    }else{
    	System.out.println("Programa Incorreto");
    	
    }
        	
               
    

    
	}
    

}
