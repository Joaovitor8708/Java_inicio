package treinamento;
import java.util.Scanner;
public class desafio02 {
	
	public static void main(String[] args) {
		Scanner pergunta = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota = pergunta.nextDouble();
		System.out.println("Digite  segunda nota: ");
		double nota2 = pergunta.nextDouble();
		double media = (nota + nota2) / 2;
		System.out.printf("Sua media e: "+ media);
		
		
		

	}

}
