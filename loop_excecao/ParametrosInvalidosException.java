package loop_excecao;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception{
	ParametrosInvalidosException(){
		super("O segundo número deve ser maior");
	}
}
