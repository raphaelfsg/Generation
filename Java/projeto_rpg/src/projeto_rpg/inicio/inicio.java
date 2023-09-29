package projeto_rpg.inicio;

import java.util.Scanner;

import projeto_rpg.Personagem.usuario;

public class inicio {

	public static void main(String[] args) {
		
		int opcaoClasse = 0;
		String classe = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n          [MENU PRINCIPAL]");
		System.out.println("\n          Escolha uma opção:");
		System.out.println("\n [1] Criar personagem          \n [2] Lutar          \n [3] Sair");
		int opcao = Integer.parseInt(sc.nextLine());
		
		//System.out.println("\n          Escolha uma classe:");
		//System.out.println("\n[1] Guerreiro          \n[2] Arqueiro          \n[3] Mago");
		
		do {
			switch(opcao) {
			case 1:
				System.out.println("\n          Escolha uma classe:");
				System.out.println("\n [1] Guerreiro          \n [2] Arqueiro          \n [3] Mago");
				opcaoClasse = sc.nextInt();
				if(opcaoClasse == 1) {
					classe = "guerreiro";
				}
				usuario.classe(classe);
				return;
			case 2:
				return;
				}
			}
		while(opcao != 0);

	}
	
	public static 
}
