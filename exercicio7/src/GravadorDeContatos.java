import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class GravadorDeContatos {
	
public List<Contato> leContatos() throws IOException{
		
		ObjectInputStream in = null;
			try {
				in = new ObjectInputStream(new FileInputStream("contatos.txt"));
				return (List<Contato>) in.readObject();
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
	
	public void gravaContatos(List<Contato> contatos) throws IOException{

		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream (new FileOutputStream ("contatos.txt"));
			out.writeObject(contatos);
		}catch (FileNotFoundException e){
			throw new IOException("Não foi encontrado o arquivo contatos.txt");
		}catch (IOException e){
			throw e;
		}finally {
			if (out != null){
				out.close();
		} 
		}
	} 

	
}