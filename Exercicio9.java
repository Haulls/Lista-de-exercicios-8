package Lista8;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
			int i;
		for (i = 1;i<=10;i++) {
			System.out.println("Digite um numero : ");
			int numero = sc.nextInt();
			soma = soma+numero;
		}
		System.out.println("A soma total dos valores : "+soma);
		System.out.println("Média aritmética dos valores lidos : "+soma/10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
sc.close();
	}
}
