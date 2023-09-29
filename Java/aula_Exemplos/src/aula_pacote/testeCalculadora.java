package aula_pacote;

import java.util.Scanner;

import aula_pacotes.calculo.calculadora;

public class testeCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		float numero1 = 0, numero2 = 0;
		
		System.out.println("Digite o primeiro número ");
		float numero1 = sc.nextFloat();
		
		System.out.println("Digite o segundo número ");
		float numero2 = sc.nextFloat();
		
		System.out.println("Soma = " + calculadora.soma(numero1, numero2));
		System.out.println("Soma = " + calculadora.subtracao(numero1, numero2));
		System.out.println("Soma = " + calculadora.multiplicacao(numero1, numero2));
		System.out.println("Soma = " + calculadora.divisao(numero1, numero2));	

		sc.close();
	}

}
