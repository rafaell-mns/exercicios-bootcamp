package conta;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		String agencia;
		String nome;
		double saldo;
		
		System.out.println("INFORMAÇÕES PESSOAIS");
		
		System.out.print("Nome: ");
		nome = scan.next();
		
		System.out.print("Agência: ");
		agencia = scan.next();
		
		System.out.print("Conta: ");
		num = scan.nextInt();
		
		System.out.print("Saldo: ");
		saldo = scan.nextDouble();
		
		scan.close();
		
		System.out.println("Olá, " + nome + "! Obrigado por criar uma conta no nosso banco, sua agência é " + agencia + " conta " + num + " e com saldo de R$" + saldo);
	}
}