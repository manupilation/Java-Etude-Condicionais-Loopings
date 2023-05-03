package Condicionais;

import java.util.Random;

/** 
 * Print a list of students and your unique Id's.
 */
public class ListaAlunos {
	
	/** 
	 * Responsible for the logic.
	 */
	public static void main(String[] args) {
		String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
		int totalAlunos = alunos.length;
		String log;
		
		for (int posicao = 0; posicao < totalAlunos; posicao++) {
			int matricula = idAluno();
			
			log = "Aluno: " + alunos[posicao] + ". Matricula: " + matricula + ".\n";
			System.out.println(log);
		}
	}
	
	static int idAluno() {
		int low = 10000000;
		int high = 99999999;
		Random random = new Random();
		int random_id = random.nextInt(high - low) + low;
		
		return random_id;
	}
}
