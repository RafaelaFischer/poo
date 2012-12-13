

import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[]args){
	

		Agenda agenda = new Agenda();
		
	
		int opc = 0;

		while (opc != 4) {
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("1.Adicionar" + '\n' + "2.Pesquisar" + '\n' + "3.Remover" + '\n' + "4.Sair"));
		
		

			switch (opc) {

			case 1:
			
					
					String nome = JOptionPane.showInputDialog("Informe nome do Contato:");
					String telefone =JOptionPane.showInputDialog("Informe telefone do Contato:");
					Contato c = new Contato(nome,telefone);
					agenda.adicionarContato(c.getNome(),c.getTel());
				break;

			case 2:
				String contato = JOptionPane.showInputDialog("Informe nome do contato que deseja pesquisar");
				try{
				c = agenda.pesquisarContato(contato);
				JOptionPane.showMessageDialog(null,"Nome: "+c.getNome()+"\n" + "Telefone: "+c.getTel());
				}catch(ContatoInexistenteException e){
					System.err.println(e.getMessage());
				}				
				
				break;
				
			case 3:
				
				String nomeContato = JOptionPane.showInputDialog("Informe nome do contato que deseja remover");
				try{
				c= agenda.pesquisarContato(nomeContato);
				JOptionPane.showMessageDialog(null,"Contato Removido!");
				}catch(ContatoInexistenteException e){
					System.err.println(e.getMessage());
				}
				
				
				
			
				break;
				
			case 4:
				
				break;

			}

		}
		
		
	}

	
	

}
