package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividendo = 0;
		int divisor = 0;
		int resul = 0;
		
		//catch(RuntimeException a) {   OU    catch(Exception a) {
		
			try {
				
			System.out.println("Digite o dividendo: ");
			dividendo = sc.nextInt();
			
			System.out.println("Digite o divisor: ");
			divisor = sc.nextInt();
			
			resul = dividendo / divisor;
			System.out.println("Resultado: " + resul);
			} catch(ArithmeticException e) {
				System.err.println("\nExceção: " + e);
				System.out.println("\nDigite números inteiros maiores que zero!");
				
			} catch(InputMismatchException a) {
				System.err.println("\nExceção: " + a);
				System.out.println("\nVocê digitou letras. Apenas números inteiros são aceitos");
			} finally {
				System.out.println("Executando.");
			}
			sc.close();
	}
}
