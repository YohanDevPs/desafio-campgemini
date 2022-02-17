package application;

import java.util.Scanner;

/**
 * A Classe <b>Questao01</b> constroi mostre na tela uma escada de tamanho n utilizando asteriscos e espaços.
 * @author Yohan Silva.
 * @since fev 2022.
 * @version 1.0
 */
public class Questao01 {
	/**
	 * @param args Metodo main
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n = ");
		int n = sc.nextInt();
		char vetor[] = new char[n];

		imprimirAsteriscos(vetor, n);
				
		sc.close();
	}
	/**
     *Função que imprime piramide de asteriscos com base e altura iguais. 
     *@param caracteres Vetor utilizado para a construção da piramide
     *@param n Quantidade de asteriscos que iram compor base e altura.
     *@return Retorna piramide de asteriscos feitas com vetores.
     */
	public static char[] imprimirAsteriscos(char[] caracteres, int n) {
		char vetor[] = new char[n];

		for (int i = vetor.length - 1; i >= 0; i--) {
			vetor[i] = '*';
			for (int j = i - 1; j > vetor.length - 1; j--) {
				vetor[j] = ' ';
			}
			System.out.println(vetor);
		}
		return vetor;
	}
}
