import java.util.ArrayList;
import java.util.List;


public class Agenda implements AgendaIF{

	
	List<Contato>contatos;
	
	public Agenda(){
		this.contatos= new ArrayList<Contato>();
	}
	
	public void adicionarContato(String nome, String tel) {
		this.contatos.add(new Contato(nome,tel));
	}

	@Override
	public Contato pesquisarContato(String nomeContato)
			throws ContatoInexistenteException {
		for(Contato c : contatos){
			if(!(nomeContato).equals(c.getNome())){
				throw new ContatoInexistenteException("Contato não encontrado");
			}
			
				return c;
			}
		
		return null;
	}

	@Override
	public void removerContato(String nomeContato)
			throws ContatoInexistenteException {
		for(Contato c : contatos){
			if(!(nomeContato).equals(c.getNome())){
				throw new ContatoInexistenteException("Contato não encontrado");
			}
			this.contatos.remove(c);
			}
		}
		
		
	
	

}
