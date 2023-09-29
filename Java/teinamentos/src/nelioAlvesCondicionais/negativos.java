package nelioAlvesCondicionais;

import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

	    System.out.print("Quantos números você vai digitar? ");
	    int repeticao = leia.nextInt();
	    
	    
	    int numero = 0;
	    int bau = 0;
	    if(repeticao > 0 || repeticao <= 10) {
			do {
		        System.out.print("Digite um número: ");
		        numero = leia.nextInt();
		        bau++;
		    }
		    while(bau < repeticao);
	    }
	    
	    if(numero < 0) {
		System.out.print("Numeros negativos : \n" + numero);
	    }
	    else {
	    	System.out.print("Digite um número positivo menor ou igual a 10.");
	    }
	}
}
