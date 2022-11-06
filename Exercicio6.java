package Lista8;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double i = 1D;
		Double base = 1D;
		Double expoente = 1D;
		Double resultado = 1D;
		
		      System.out.println("Digite o valor da base: ");
		       base=sc.nextDouble();

		      System.out.println("Digite o valor do expoente: ");
		       expoente=sc.nextDouble();

		      for (i = 1D; i <= expoente; i++){
		            resultado = resultado * base;
		      }
	
		      System.out.println("O valor da potência da base é : "+resultado);
	
	
	
		  	sc.close();

	}
	
}
