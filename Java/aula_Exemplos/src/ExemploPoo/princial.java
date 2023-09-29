package ExemploPoo;

import java.util.Random;
import java.util.Scanner;

public class princial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		gato gato = new gato();
		
		System.out.println("Cadastre o seu gatinho:");
		System.out.println("Digite o nome dele: ");
		gato.setNome(sc.nextLine());
		
		System.out.println("Digite a raça dele: ");
		gato.setRaca(sc.nextLine());
		
		System.out.println("Digite a idade dele: ");
		gato.setIdade(sc.nextInt());
		
		System.out.println("Digite o peso dele: ");
		gato.setPeso(sc.nextFloat());
		
		gato.Imprimir();
		//Gerando um sorteio em que ao gerar um número menor que 5 o gato mia
		Random sorteio = new Random();
		if(sorteio.nextInt(10) < 5) {
			gato.Miar();
		}
		sc.close();
	}

}
