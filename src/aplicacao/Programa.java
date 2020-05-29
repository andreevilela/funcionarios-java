package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String nome, tempNome = "", ganhouMais;
		int horas, tempHoras = 0, opcao = 1, totalHoras = 0;
		double valorHora, tempValorHora = 0, totalValorHora = 0;
		char continua = 'S';
		
		while (continua == 'S' || continua =='s') {
			System.out.println("Nome: ");
			nome = sc.next();
			
			System.out.println("Horas Trabalhadas: ");
			horas = sc.nextInt();
			while (horas <= 0) {
				System.out.println("Inválido! Informe um valor positivo: ");
				horas = sc.nextInt();
			}
			
			System.out.println("Valor por hora: ");
			valorHora = sc.nextDouble();
			while (valorHora <= 0) {
				System.out.println("Inválido! Informe um valor positivo:  ");
				valorHora = sc.nextDouble();
			}
			
			totalHoras += horas;
			totalValorHora += valorHora * horas;
			if (valorHora * horas > tempValorHora * tempHoras) {
				tempNome = nome;
			}
				
			tempHoras = horas;
			tempValorHora = valorHora;
			
			System.out.println("Digitar outro (S/N)? ");
			continua = sc.next().charAt(0);
		}

	}

}
