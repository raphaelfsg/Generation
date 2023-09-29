package exceptions;

import java.util.Scanner;

public class Throw {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade;
		
		try {
			System.out.println("\nDigite uma idade: ");
			idade = sc.nextInt();
			
			validarIdade(idade);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}
	public static void validarIdade(int idade) {
		if(idade < 18)
			throw new ArithmeticException("A pessoa não pode dirigir!");
		else
			System.out.println("A pessoa pode dirigir!");
	}
}
