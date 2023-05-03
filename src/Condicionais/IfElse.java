package Condicionais;

import java.util.Random;

/** 
 * Hogwarts evaluator.
 */
public class IfElse {
	public static void main(String[] args) {
		final double media = 6.0;
		int resultado = resultadoTeste();
		String resultadoString = "";

		if (resultado >= media) {
			resultadoString = "Você foi aprovado! Boas vindas a Hogwarts.";
		} else {
			resultadoString = "Você foi reprovado! Adeus.";
		}
		
		imprimeMensagem(resultadoString);
	}
	
	static int resultadoTeste() {
		int upper = 11;
		Random random = new Random();
		int random_int = random.nextInt(upper);
		
		return random_int;
	}
	
	static void imprimeMensagem(String mensagem) {
		System.out.println(mensagem);
	}
}
