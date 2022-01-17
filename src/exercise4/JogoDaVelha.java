package exercise4;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean winP = false;
		boolean winCpu = false;

		String[][] mat = new String[3][3];
		int i, j;
		zerarTabuleiro(mat);

		System.out.println();
		System.out.println("Bem vindo ao jogo da Velha\n");

		// turn player
		while (!winP && !winCpu) {
			do {
				System.out.println("Escolha primeiro em qual linha deseja jogar: 1, 2 ou 3");
				i = scan.nextInt();
				i--;
				System.out.println("Agora em qual coluna: 1, 2 ou 3");
				j = scan.nextInt();
				j--;
				if (mat[i][j].equalsIgnoreCase("X") || mat[i][j].equalsIgnoreCase("O")) {
					System.out.println("\n\nJa existe jogada neste espaço, tente outra vez\n\n");
				}
			} while (mat[i][j].equalsIgnoreCase("X") || mat[i][j].equalsIgnoreCase("O"));
			scan.nextLine();

			mat[i][j] = "X";
			if ((mat[0][0].equalsIgnoreCase("x") && mat[0][1].equalsIgnoreCase("x") && mat[0][2].equalsIgnoreCase("x"))
					|| (mat[1][0].equalsIgnoreCase("x") && mat[1][1].equalsIgnoreCase("x")
							&& mat[1][2].equalsIgnoreCase("x"))
					|| (mat[2][0].equalsIgnoreCase("x") && mat[2][1].equalsIgnoreCase("x")
							&& mat[2][2].equalsIgnoreCase("x"))
					|| (mat[0][0].equalsIgnoreCase("x") && mat[1][0].equalsIgnoreCase("x")
							&& mat[2][0].equalsIgnoreCase("x"))
					|| (mat[0][1].equalsIgnoreCase("x") && mat[1][1].equalsIgnoreCase("x")
							&& mat[2][1].equalsIgnoreCase("x"))
					|| (mat[0][2].equalsIgnoreCase("x") && mat[1][2].equalsIgnoreCase("x")
							&& mat[2][2].equalsIgnoreCase("x"))
					|| (mat[0][0].equalsIgnoreCase("x") && mat[1][1].equalsIgnoreCase("x")
							&& mat[2][2].equalsIgnoreCase("x"))
					|| (mat[0][2].equalsIgnoreCase("x") && mat[1][1].equalsIgnoreCase("x")
							&& mat[2][0].equalsIgnoreCase("x"))) {
				winP = true;
				System.out.println();
				printTabuleiro(mat);
				System.out.println("\n\nPlayer wins");
				System.out.println("End Game");
				break;
			} else {
				do {
					i = new Random().nextInt(3);
					j = new Random().nextInt(3);
				} while (mat[i][j].equalsIgnoreCase("X") || mat[i][j].equalsIgnoreCase("O"));
				mat[i][j] = "O";

				if ((mat[0][0].equalsIgnoreCase("o") && mat[0][1].equalsIgnoreCase("o")
						&& mat[0][2].equalsIgnoreCase("o"))
						|| (mat[1][0].equalsIgnoreCase("o") && mat[1][1].equalsIgnoreCase("o")
								&& mat[1][2].equalsIgnoreCase("o"))
						|| (mat[2][0].equalsIgnoreCase("o") && mat[2][1].equalsIgnoreCase("o")
								&& mat[2][2].equalsIgnoreCase("o"))
						|| (mat[0][0].equalsIgnoreCase("o") && mat[1][0].equalsIgnoreCase("o")
								&& mat[2][0].equalsIgnoreCase("o"))
						|| (mat[0][1].equalsIgnoreCase("o") && mat[1][1].equalsIgnoreCase("o")
								&& mat[2][1].equalsIgnoreCase("o"))
						|| (mat[0][2].equalsIgnoreCase("o") && mat[1][2].equalsIgnoreCase("o")
								&& mat[2][2].equalsIgnoreCase("o"))
						|| (mat[0][0].equalsIgnoreCase("o") && mat[1][1].equalsIgnoreCase("o")
								&& mat[2][2].equalsIgnoreCase("o"))
						|| (mat[0][2].equalsIgnoreCase("o") && mat[1][1].equalsIgnoreCase("o")
								&& mat[2][0].equalsIgnoreCase("o"))) {
					winCpu = true;
					System.out.println();
					printTabuleiro(mat);
					System.out.println("CPU wins");
					System.out.println("End Game");

					break;
				}
				
			}

			printTabuleiro(mat);
		}

		scan.close();

	}

	public static void printTabuleiro(String mat[][]) {

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j] + "|");

			}
			System.out.println();
			System.out.print("------");
			System.out.println();
		}

	}

	public static void zerarTabuleiro(String mat[][]) {

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = " ";
				System.out.print(mat[i][j] + "|");

			}
			System.out.println();
			System.out.print("------");
			System.out.println();
		}

	}

}
