package exercise;

import java.util.Locale;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int max = 0;
		int line = 0, colum = 0;
		
		int[][] mat = new int[4][4];
		
		for (int i = 0; i<mat.length; i++) {
			
			for (int j=0; j<mat[i].length; j++) {
				
				int x = new Random().nextInt(9);
				mat[i][j] = x;
				if(max<mat[i][j]) {
					max = mat[i][j];
					 line = i;
					 colum = j;
				}
				
			}
			
		}
		
		print(mat);
		System.out.println("Max number: "+ max);
		System.out.println("Linha e Coluna: "+ line+ ", "+ colum);

	}
	//print method
	public static void print(int mat[][]) {
		
		for(int i=0; i<mat.length; i++) {
			for(int j = 0; j< mat[i].length; j++) {
				
				System.out.print(mat[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
