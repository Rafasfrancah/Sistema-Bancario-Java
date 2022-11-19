package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Digite o n�mero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite o nome do titular da conta");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Tem dep�sito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.println("Digite o valor do dep�sito inicial:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero,titular,depositoInicial);
					
		}
		else {
			conta = new Conta(numero, titular);
		}
			
		System.out.println();
		System.out.println("Data da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do dep�sito: ");
		double valorDoDeposito = sc.nextDouble();
		conta.deposito(valorDoDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		
		
		

		sc.close();

	}

}
