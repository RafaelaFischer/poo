package br.ufpb.sistemapedidos;

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main (String[]args){
		
		
		Scanner sc = new Scanner(System.in);
		double valorTotal =0;
		long cod = 1;
		Pedido p = new Pedido(1);
		


		while(cod !=0){

			System.out.println("quantidade:");
			int quantidade = sc.nextInt();
			System.out.println("Valor");
			double valor = sc.nextDouble();
			System.out.println("codido produto");
			cod = sc.nextLong();
			 
			 
		
			
			ItemDePedido item = new ItemDePedido(quantidade,cod,valor);
			p.adicionaItem(item);
			
			
			 valorTotal += (valor*quantidade);
		}
	}

}
