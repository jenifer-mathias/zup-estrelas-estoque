package br.com.estrelas.estoque;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(" BEM-VINDO(A) AO MERCADO! ");
		System.out.println("");
		
		String opcao;
		do {

			System.out.println(" Digite ALIMENTICIO para as opera��es relacionadas a produtos aliment�cios ");
			System.out.println(" Digite LIMPEZA para as opera��es relacionadas a produtos de limpeza ");
			System.out.println(" SAIR para cancelar as opera��es ");
			
			opcao = input.next();
			
			

			if(opcao.toLowerCase().equals("alimenticio")) {
				MenuProdutoAlimenticio.menuAlimentacao();
				
			}else if(opcao.toLowerCase().equals("limpeza")){
				
				MenuProdutoLimpeza.menuLimpeza();
			}else if(opcao.toLowerCase().equals("sair")) {
				System.out.println("at� logo !");
			}

			
			
		} while (!opcao.toLowerCase().equals("sair"));
	}
}