import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class GravadorDePedido {
	
public List<Pedido> lePedido() throws IOException{
		
		ObjectInputStream in = null;
			try {
				in = new ObjectInputStream(new FileInputStream("pedidos.txt"));
				return (List<Pedido>) in.readObject();
			} catch (FileNotFoundException e) {
				throw new IOException("Não foi encontrado o aquivo contatos.txt");
			} catch (IOException e) {
				throw e;
			} catch (ClassNotFoundException e) {
				throw new IOException("Classe dos objetos gravados no arquivo"
										+ "contatos.txt não exite", e);
			} finally{
				if(in!=null){
					in.close();
				}
			}
	 }
	
	public void gravaPedido(List<Pedido> pedidos) throws IOException{

		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream (new FileOutputStream ("pedidos.txt"));
			out.writeObject(pedidos);
		}catch (FileNotFoundException e){
			throw new IOException("Não foi encontrado o arquivo pedidos.txt");
		}catch (IOException e){
			throw e;
		}finally {
			if (out != null){
				out.close();
		} 
		}
	} 
	
	
}





	


