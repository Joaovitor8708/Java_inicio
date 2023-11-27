package treinamento;
import java.util.Scanner;
public class desafios {

	public static void main(String[] args) {
		
		 Scanner pergunta = new Scanner(System.in);
		 
		 System.out.println("Digite um numero: ");
		 double a = pergunta.nextDouble();
		 
		 
		 if(a == 1){
			 System.out.println("Domingo");
		 }
		 else if(a == 2) {
			 System.out.println("Segunda");
		 }
		 else if(a == 3){
			 System.out.println("Terca");
		 }
		 else if(a == 4) {
			 System.out.println("Quarta");
		 }
		 else if(a == 5) {
			 System.out.println("Quinta");	
		 }
		 else if(a == 6) {
			 System.out.println("Sexta");
		 }
		 else if(a == 7) {
			 System.out.println("Sabado");
		 }
		 else {
			 System.out.println("Opçao Invalida");
		 }
	}
}
