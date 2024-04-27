package condicoes_loop;

import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        try {
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            scanner.close();
        }

    }
 

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 
    		if (numeroConta.length() != 8) throw new IllegalArgumentException("Numero de conta invalido.\nDigite exatamente 8 digitos.");
        }
    }
