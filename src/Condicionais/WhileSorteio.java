package Condicionais;

import java.util.Random;

/** 
 * Sort system.
 */
public class WhileSorteio {
	public static void main(String[] args) {
		final int concorrentes = 50;
		int pessoa_atual = 0;
		String mensagem;
		
		while (pessoa_atual <= concorrentes) {
			boolean resultado = resultadoSorteio();
			
			if (resultado) {
				mensagem = "Parabéns concorrente " + pessoa_atual + ". Você foi sorteado!";
			} else {
				mensagem = "Você não foi sorteado.";
			}
			imprimeMensagem(mensagem);
			pessoa_atual++;
		}
	}
	
	static boolean resultadoSorteio() {
		Random random = new Random();
		boolean random_boolean = random.nextBoolean();
		
		return random_boolean;
	}
	
	static void imprimeMensagem(String mensagem) {
		System.out.println(mensagem);
	}
}
