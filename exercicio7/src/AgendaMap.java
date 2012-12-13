import java.util.HashMap;
import java.util.Map;


public class AgendaMap implements AgendaIF {
	
	Map<String,Contato> contatos;
	
	public AgendaMap(){
		this.contatos = new HashMap<String,Contato>();
	}

	@Override
	public void adicionarContato(String nome, String tel) {
	
		this.contatos.put(nome,new Contato(nome,tel));
		
	}

	@Override
	public Contato pesquisarContato(String nomeContato)
			throws ContatoInexistenteException {
			for(Contato c : contatos.values()){
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
		Contato c = pesquisarContato(nomeContato);
		this.contatos.remove(c);
		
	}

}
