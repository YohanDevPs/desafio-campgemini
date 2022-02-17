package application;


import java.util.Scanner;

/**
 * A Classe <b>Questao02</b> informa ao usu�rio status senha forte ou fraca e quantidade de caracteres faltantes para atender o requisito m�nimo 6 digitos. Caso a senha seja fraca, ser� informado quais a��es devem ser tomadas para o fortalecimento da mesma.
 * @author Yohan Silva.
 * @since fev 2022.
 * @version 1.0
 */
public class Questao02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		String senha = sc.next();
		char[] senhaArray = senha.toCharArray();

		boolean letrasMinusculas = caracterContemMinusculo(senhaArray);
		boolean letrasMaiusculas = caracterContemMaiusculo(senhaArray);
		boolean sinais = caracterEspecial(senhaArray);
		boolean sinaisdigito = caracterContemDigito(senhaArray);
		int faltam = caracteresFaltantes(senhaArray);
		
		if(faltam > 0) System.out.println("Faltam " + faltam +" caracteres\n");
		else System.out.println("Requisito 'm�nimo 6 caracteres' foi alcan�ado\n ");
			

		if (letrasMaiusculas == true && letrasMinusculas == true && sinais == true && sinaisdigito == true && faltam <= 0) {
			System.out.println("Sua senha � forte!");
		}else {
			System.out.println("Sua senha n�o � forte. Para fortalecer a senha, deve-se cumprir estes requisitos:\n ");
			if(letrasMaiusculas == false) {
				System.out.println("- Sua senha deve conter no m�nimo 1 letra em mai�sculo");
			}if(letrasMinusculas == false) {
				System.out.println("- Sua senha deve conter no m�nimo 1 letra em min�sculo");
			}if(sinais == false) {
				System.out.println("- Sua senha deve conter no m�nimo 1 caractere especial");
			}if(sinaisdigito == false) {
				System.out.println("- Sua senha deve conter no m�nimo 1 digito");
			}if(faltam > 0) {
				System.out.println("- Sua senha deve conter no m�nimo 6 caracteres");
			}
		}
		
		sc.close();
	}
	
	/**
     *Fun��o que retorna a quantidade faltante de caracteres, caso n�o falte, � retornado 0. 
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna n�mero inteiro, quantidade faltante de caracteres ou zero.
     */
	public static Integer caracteresFaltantes(char[] caracteres) {
		int caracteresFaltantes = 0;
		if(caracteres.length >=6) {
			return 0;
		}else {
			caracteresFaltantes = 6 - caracteres.length;
			return caracteresFaltantes;
		}
	}
	
	/**
     *Fun��o que confirma o requisito "Cont�m no m�nimo 1 letra em mai�sculo".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a exist�ncia ou n�o de um caractere mai�sculo. 
     */
	public static boolean caracterContemMaiusculo(char[] caracteres) {
		boolean aux = false;
		for (int i = 0; i < caracteres.length; i++) {
			if (Character.isUpperCase(caracteres[i])) {
				aux = true;
				return aux;
			}
		}
		return aux;
	}
	
	/**
     *Fun��o que confirma o requisito "Cont�m no m�nimo 1 letra em min�sculo".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a exist�ncia ou n�o de um caractere min�sculo. 
     */
	public static boolean caracterContemMinusculo(char[] caracteres) {
		boolean aux = false;
		for (int i = 0; i < caracteres.length; i++) {
			if (Character.isLowerCase(caracteres[i])) {
				aux = true;
				return aux;
			}
		}
		return aux;
	}
	/**
     *Fun��o que confirma o requisito "Cont�m no m�nimo 1 caractere especial".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a exist�ncia ou n�o de caractere especial. 
     */
	public static boolean caracterEspecial(char[] caracteres) {
		boolean aux = false;
		
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == '!' || caracteres[i] == '@' || caracteres[i] == '#' || caracteres[i] == '$'
					|| caracteres[i] == '%' || caracteres[i] == '^' || caracteres[i] == '&' || caracteres[i] == '*'
					|| caracteres[i] == '(' || caracteres[i] == ')' || caracteres[i] == '-' || caracteres[i] == '+') {
				aux = true;
				return aux;
			}
		}
		return aux;
	}
	/**
     *Fun��o que confirma o requisito "Cont�m no m�nimo 1 digito".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a exist�ncia ou n�o de digitos. 
     */
	public static boolean caracterContemDigito(char[] caracteres) {
		boolean aux = false;
		
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == '1' || caracteres[i] == '2' || caracteres[i] == '3' || caracteres[i] == '4'
					|| caracteres[i] == '5' || caracteres[i] == '6' || caracteres[i] == '7' || caracteres[i] == '8'
					|| caracteres[i] == '9' || caracteres[i] == '0') {
				aux = true;
				return aux;
			}
		}
		return aux;
	}

}
