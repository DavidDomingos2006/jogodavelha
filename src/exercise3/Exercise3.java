package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		String[][] mat = new String[30][24];
		
		System.out.println("Bem vindo a agenda eletrônica:\n\n");
		System.out.println("Qual dia do mês você deseja alterar e a hora?\n");
		System.out.print("Dia: ");
		int dia = tec.nextInt();
		System.out.print("Hora: ");
		int hour = tec.nextInt();
		
		tec.nextLine();
		System.out.println("Digite qual atividade fazer:");
		mat[dia][hour] = tec.nextLine();
		
		System.out.println("Atividade do dia "+dia);
		System.out.println(mat[dia][hour]);
		
		tec.close();
		

	}
	
	
}
