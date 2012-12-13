import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Agenda implements AgendaIF {

	List<Contato> contatos;
	GravadorDeContatos gravador = new GravadorDeContatos();

	public Agenda() {
		try {
			this.contatos = gravador.leContatos();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			this.contatos = new ArrayList<Contato>();
		}

	}

	public void adicionarContato(String nome, String tel) {
		this.contatos.add(new Contato(nome, tel));
		gravarContato();
	}

	@Override
	public Contato pesquisarContato(String nomeContato)
			throws ContatoInexistenteException {
		for (Contato c : contatos) {
			if (nomeContato.equalsIgnoreCase(c.getNome())) {		
				return c;
			}
			

		}
		throw new ContatoInexistenteException("Contato não encontrado");
	}

	@Override
	public void removerContato(String nomeContato)
			throws ContatoInexistenteException {
		for (Contato c : contatos) {
			if (nomeContato.equalsIgnoreCase(c.getNome())) {
				this.contatos.remove(c);
				gravarContato();
				return;
			}
			

		}
		throw new ContatoInexistenteException("Contato não encontrado");
	}
	
	

	public void gravarContato() {
		try {
			this.gravador.gravaContatos(this.contatos);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public Iterator<Contato> getContatosOrdenados(){
		List <Contato> contato = new ArrayList<Contato>();
		contato.addAll(contatos);
		Collections.sort(contatos);
		return contatos.iterator();
		
		
	}
	

	@Override
	public Collection <Contato> getContato(){
		Collection<Contato> contato = new ArrayList<Contato>();
		contato.addAll(contatos);
		return contato;
	}
	
	
	

	

}
