package nelioAlvesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class baskara {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double a, b, c, delta, x1 = 0, x2 = 0;
		
		System.out.println("Coeficiente a: ");
		a = leia.nextDouble();
		System.out.println("Coeficiente b: ");
		b = leia.nextDouble();
		System.out.println("Coeficiente c: ");
		c = leia.nextDouble();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if(a == 0) {
			System.out.println("O valor deve ser maior que 0");
		}
		else if(delta < 0) {
			System.out.println("Esta equação não possui raizes reais.");
		}
		else {
			x1 = ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.printf("X1 %.4f", x1);
			System.out.printf("\nX2 %.4f", x2);
		}
	}

}
