package treinamento;
import java.util.Scanner;
public class desafio03 {

	public static void main(String[] args) {
		Scanner letra = new Scanner(System.in);
		System.out.println("Digite F para Feminino ou M pra Masculino");
		String usuario = letra.next();
		char primeiraLetra = usuario.charAt(0);
		if((primeiraLetra == 'F')|| (primeiraLetra =='f')) {
			System.out.println("feminino");
		} else if((primeiraLetra == 'M') || (primeiraLetra == 'm')) {
			System.out.println("masculino");
		}else {
			System.out.println("letra invalida");
		}

	}

}