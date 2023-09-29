package nelioAlvesCondicionais;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int semestre = 1;
		double nota = 0;
		double total = 0;
		
		do {
			System.out.print("Digite a nota do semestre " + semestre + ":");
			nota = leia.nextDouble();
			total += nota;
			semestre++;
		}
		
		while(semestre <= 4);
		
		double media = total / 4;
		
		if(media > 60.0) {
			System.out.print("Nota final: " + media);
			System.out.print("\nAprovado");
		}
		else {
			System.out.print("Nota final: " + media);
			System.out.print("\nReprovado");
		}
	}
}
