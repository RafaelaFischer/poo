import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;


public class Contato implements Serializable, Comparable<Contato>{
	
	private String nome;
	private String tel;
	
	
	public Contato(String nome, String tel){
		this.nome=nome;
		this.tel=tel;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

	public String toString(){
		return "Nome:" + nome + '\n' + "Telefone: " + tel;
	}


	@Override
	public int compareTo(Contato contato) {
		if (this.nome.compareTo(contato.getNome()) == 0) {
			return 0;

		} else if (this.nome.compareTo(contato.getNome()) < 0) {

			return -1;

		} else {
			return 1;
		}
	
	}


	

}
