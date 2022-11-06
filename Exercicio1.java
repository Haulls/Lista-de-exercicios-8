package Lista8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor : ");
		int valor = sc.nextInt();
		
		int contador = 0;
		while (contador<=10) {
			System.out.println(valor+ " x "+contador+" = "+contador*valor);
			contador ++;
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
