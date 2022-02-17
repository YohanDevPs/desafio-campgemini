package application;


import java.util.Scanner;

public class Questao03 {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
		char[] vetorChar = nome.toCharArray();
		int count = 0;
		
		for (int i = 0; i < vetorChar.length ; i++) {
			for(int j = (vetorChar.length-1); j > 0 ; j--) {
				if(vetorChar[i] == vetorChar[j] && j != i) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		sc.close();
	}

}
