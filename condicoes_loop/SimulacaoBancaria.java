package condicoes_loop;

import java.util.Scanner;

public class SimulacaoBancaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		double saldo = 0;
		
		while (true) { 
		    int opcao = scanner.nextInt(); 
		    if (opcao == 0) {
		    	System.out.println("Programa encerrado.");
		    	break;
		    }
		    if(opcao == 3) System.out.println("Saldo atual: " + saldo);

		    
		    
		    if(opcao == 1) {
		    	double valor = scanner.nextDouble();
		    	saldo += valor;
		    	System.out.println("Saldo atual: " + saldo);
		    }
		    if(opcao == 2) {
		    	double valor = scanner.nextDouble();
		    	if (saldo >= valor) {
		    		saldo -= valor;
		    		System.out.println("Saldo atual: " + saldo);
		    	}
	            else System.out.println("Saldo insuficiente.");
		    }
		    		}
		scanner.close();
	}
}
