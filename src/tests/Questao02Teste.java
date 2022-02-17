package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import application.Questao02;

public class Questao02Teste {

	Questao02 questao02 = new Questao02();
	@Test
	public void testCaracteresFaltantes() {
		
		String senhaTesteFaltaCarac = "huT";
		char[] senhaArrayFaltaCarac = senhaTesteFaltaCarac.toCharArray();
		int resultadoFaltaCarac = questao02.caracteresFaltantes(senhaArrayFaltaCarac);
		int resultadoEsperadoFaltaCarac = 3;
		assertTrue(resultadoFaltaCarac == resultadoEsperadoFaltaCarac);
			
		String senhaTesteNaoFalta = "huThasuhs";
		char[] senhaArrayNaoFalta = senhaTesteNaoFalta.toCharArray();
		int resultadoNaoFalta = questao02.caracteresFaltantes(senhaArrayNaoFalta);
		int resultadoEsperadoNaoFalta = 0;
		assertTrue(resultadoNaoFalta == resultadoEsperadoNaoFalta);		
	}

	@Test
	public void testCaracterContemMaiusculo() {	
		
		String senhaTesteTrue = "TTtt";
		char[] senhaArrayTrue = senhaTesteTrue.toCharArray();
		boolean resultadoTrue = questao02.caracterContemMaiusculo(senhaArrayTrue);
		boolean resultadoEsperadoTrue = true;
		assertTrue(resultadoEsperadoTrue == resultadoTrue);
		
		String senhaTesteFalse = "tttt";
		char[] senhaArrayFalse = senhaTesteFalse.toCharArray();
		boolean resultadoFalse = questao02.caracterContemMaiusculo(senhaArrayFalse);
		boolean resultadoEsperadoFalse = false;
		assertTrue(resultadoEsperadoFalse == resultadoFalse);		
	}

	@Test
	public void testCaracterContemMinusculo() {
		
		String senhaTesteTrue = "TTtt";
		char[] senhaArrayTrue = senhaTesteTrue.toCharArray();
		boolean resultadoTrue = questao02.caracterContemMinusculo(senhaArrayTrue);
		boolean resultadoEsperadoTrue = true;
		assertTrue(resultadoEsperadoTrue == resultadoTrue);				
		
		String senhaTesteFalse = "TTTT";
		char[] senhaArrayFalse = senhaTesteFalse.toCharArray();
		boolean resultadoFalse = questao02.caracterContemMinusculo(senhaArrayFalse);
		boolean resultadoEsperadoFalse = false;
		assertTrue(resultadoEsperadoFalse == resultadoFalse);		
	}

	@Test
	public void testCaracterEspecial() {
		
		String senhaTesteFalse = "huT3";
		char[] senhaArrayFalse = senhaTesteFalse.toCharArray();
		boolean resultadoFalse = questao02.caracterEspecial(senhaArrayFalse);
		boolean resultadoEsperadoFalse = false;
		assertTrue(resultadoEsperadoFalse == resultadoFalse);
		
		String senhaTesteTrue = "huT%$3";
		char[] senhaArrayTrue = senhaTesteTrue.toCharArray();
		boolean resultadoTrue = questao02.caracterEspecial(senhaArrayTrue);
		boolean resultadoEsperadoTrue = true;
		assertTrue(resultadoEsperadoTrue == resultadoTrue);		
	}

	@Test
	public void testCaracterContemDigito() {
		
		String senhaTesteFalse = "huTsf";
		char[] senhaArrayFalse = senhaTesteFalse.toCharArray();	
		boolean resultadoFalse = Questao02.caracterContemDigito(senhaArrayFalse);
		boolean resultadoEsperadoFalse = false;	
		assertTrue(resultadoEsperadoFalse == resultadoFalse);
						
		String senhaTesteTrue = "huT3";
		char[] senhaArrayTrue = senhaTesteTrue.toCharArray();
		boolean resultadoTrue = Questao02.caracterContemDigito(senhaArrayTrue);
		boolean resultadoEsperadoTrue = true;
		assertTrue(resultadoEsperadoTrue == resultadoTrue);		
	}
}
	
		

