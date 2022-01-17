package exercise2;

import java.util.Random;

import exercise.Exercicio1;

public class Exercise2 {

	public static void main(String[] args) {

		int[][] mat = new int[10][10];
		int max, minus;
		max = Integer.MIN_VALUE;
		minus = Integer.MAX_VALUE;
		

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j<mat[i].length; j++) {
				
				int x = new Random().nextInt(9);
				mat[i][j]= x;
				if(max< mat[4][j]) {
					max = mat[i][j];
				}
				if(minus>mat[4][j]) {
					minus = mat[i][j];
				}
			}
			
			

		}
		System.out.println("Print the matrix \n"
				+ "_________________________________________________\n");
		Exercicio1.print(mat);
		System.out.println();
		System.out.println("Show the max value and the minimum value of line 5");
		System.out.println("Max = " + max);
		System.out.println("Minus = " + minus);

	}

}
