package Condicionais;

import java.util.Random;

/** 
 * Product delivery attempt system.
 */
public class DeliveryTry {
	
	/** 
	 * Main method to delivery attempt system.
	 */
	public static void main(String[] args) {
		int tentativas = 0;
		String log;
		boolean sucesso = false;
		
		do {
			sucesso = tentativaDeEntrega();
			tentativas += 1;
		} while (!sucesso);
		
		log = "Delivery completed on attempt: " + tentativas;
		System.out.println(log);
	}
	
	static boolean tentativaDeEntrega() {
		Random random = new Random();
		boolean random_boolean = random.nextBoolean();
		
		return random_boolean;
	}
}
