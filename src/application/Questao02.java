package application;


import java.util.Scanner;

/**
 * A Classe <b>Questao02</b> informa ao usuário status senha forte ou fraca e quantidade de caracteres faltantes para atender o requisito mínimo 6 digitos. Caso a senha seja fraca, será informado quais ações devem ser tomadas para o fortalecimento da mesma.
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
		else System.out.println("Requisito 'mínimo 6 caracteres' foi alcançado\n ");
			

		if (letrasMaiusculas == true && letrasMinusculas == true && sinais == true && sinaisdigito == true && faltam <= 0) {
			System.out.println("Sua senha é forte!");
		}else {
			System.out.println("Sua senha não é forte. Para fortalecer a senha, deve-se cumprir estes requisitos:\n ");
			if(letrasMaiusculas == false) {
				System.out.println("- Sua senha deve conter no mínimo 1 letra em maiúsculo");
			}if(letrasMinusculas == false) {
				System.out.println("- Sua senha deve conter no mínimo 1 letra em minúsculo");
			}if(sinais == false) {
				System.out.println("- Sua senha deve conter no mínimo 1 caractere especial");
			}if(sinaisdigito == false) {
				System.out.println("- Sua senha deve conter no mínimo 1 digito");
			}if(faltam > 0) {
				System.out.println("- Sua senha deve conter no mínimo 6 caracteres");
			}
		}
		
		sc.close();
	}
	
	/**
     *Função que retorna a quantidade faltante de caracteres, caso não falte, é retornado 0. 
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna número inteiro, quantidade faltante de caracteres ou zero.
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
     *Função que confirma o requisito "Contém no mínimo 1 letra em maiúsculo".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a existência ou não de um caractere maiúsculo. 
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
     *Função que confirma o requisito "Contém no mínimo 1 letra em minúsculo".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a existência ou não de um caractere minúsculo. 
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
     *Função que confirma o requisito "Contém no mínimo 1 caractere especial".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a existência ou não de caractere especial. 
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
     *Função que confirma o requisito "Contém no mínimo 1 digito".
     *@param caracteres Vetor utilizado armazenar os caracteres da senha.
     *@return Retorna boolean, que confirma a existência ou não de digitos. 
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
