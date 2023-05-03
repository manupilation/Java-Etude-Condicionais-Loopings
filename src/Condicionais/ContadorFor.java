package Condicionais;

/** 
 * Simple for looping counter.
 */
public class ContadorFor {
	public static void main(String[] args) {
		int numero;
		String log;
		
		for(numero = 1; numero <= 20; numero += 1) {
			log = "O numero atual é: " + numero + "\n";
			System.out.println(log);
		}
	}
}
