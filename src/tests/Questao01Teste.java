package tests;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import application.Questao01;

public class Questao01Teste {
	Questao01 questao01 = new Questao01();

	@Test
	public void testImprimirAsteriscos() {
		
		char vetor[] = new char[4];
		for (int i = vetor.length - 1; i >= 0; i--) {
			vetor[i] = '*';
			for (int j = i - 1; j > vetor.length - 1; j--) {
				vetor[j] = ' ';
			}
			System.out.println(vetor);
		}
		 
		 char[] resultadoEsperado = vetor;
		 char[] resultado = questao01.imprimirAsteriscos(vetor, 4);
		 
		 assertTrue(Arrays.equals(resultado, resultadoEsperado));
		 
	}
}
