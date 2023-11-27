package treinamento;
import java.util.Scanner;
public class desafio04 {

	public static void main(String[] args) {
		int contador = 0;
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Telefonou para a vitima?Se sim 1 se não 0->  ");
		double resp = pergunta.nextDouble();
		if(resp ==1) {
			contador+=1;
		}
		System.out.print("Esteve no local do crime? Se sim 1 se não 0-> ");
		resp = pergunta.nextDouble();
		if(resp ==1) {
			contador+=1;
		}
		System.out.print("Mora perto da vitima? Se sim 1 se não 0-> ");
		resp = pergunta.nextDouble();
		if(resp==1) {
			contador+=1;
		}
		System.out.print("Devia para a vitima? Se sim 1 se não 0-> ");
		resp = pergunta.nextDouble();
		if(resp==1) {
			contador+=1;
		}
		System.out.print("Ja trabalhou com a vitima? Se sim 1 se não 0-> ");
		resp = pergunta.nextDouble();
		if(resp==1) {
			contador+=1;
		}if(contador == 1) {
			System.out.println("Inocente");
		}else if(contador == 2) {
			System.out.println("Suspeito");
		}else if(contador == 3 || contador == 4) {
			System.out.println("Cumplice");
		}else {
			System.out.println("Assassino");
		}
		
	}

}
