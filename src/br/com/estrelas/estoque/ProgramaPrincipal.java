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
			//vc vai trabalhar nesse aqui agora ok?
			opcao = input.next();

			switch (opcao) {

			case "ALIMENTICIO":
				MenuProdutoAlimenticio.menuAlimentacao();

			case "LIMPEZA":
				MenuProdutoLimpeza.menuLimpeza();
				break;
			}
			
		} while (opcao == "SAIR");
	}
}