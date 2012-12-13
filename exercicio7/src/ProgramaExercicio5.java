
public class ProgramaExercicio5 {
	public static void main(String[]args){
	
	Agenda a = new Agenda();
	
	Contato c = new Contato("Rafaela","12345789");
	
	a.adicionarContato(c.getNome(),c.getTel());
	try{
	a.pesquisarContato("Rafaela");
	a.pesquisarContato("Fischer");
	}catch(ContatoInexistenteException e){
		System.out.println("Contato não Encontrato");
		
	}
	}
	

}
