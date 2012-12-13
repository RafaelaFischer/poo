import java.util.Iterator;


public class Main {
	public static void main(String[]args){
		
		Agenda a = new Agenda();
		
		a.adicionarContato("RAFA","21455");
		a.adicionarContato("ANA", "12345");
		a.adicionarContato("João", "3456");
		
		
		Iterator<Contato> lista = a.getContatosOrdenados();
		
		while(lista.hasNext()){
			System.out.println(lista.next().toString());
		}
	
		
		}
		


}
