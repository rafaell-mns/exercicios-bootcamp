package loop_excecao;

import java.util.Scanner;

public class ControleFluxo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		int num1 = scan.nextInt();
		System.out.print("Número 2: ");
		int num2 = scan.nextInt();
		
		if (num2 < num1) throw new ParametrosInvalidosException();
		
		for(int i=num1; i<=num2; i++) {
			System.out.println(i - num1);
		}
		
		scan.close();
	}
}
