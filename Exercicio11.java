package Lista8;

import java.util.Scanner;

public class Exercicio11 {

	

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Float areatotal;
		
		
		
		System.out.println("Digite o nome do comodo :");
		String nome = sc.next();
	
		System.out.println("Digite a largura do comodo : ");
		Float largura = sc.nextFloat();
		
		System.out.println("Digite o comprimento : ");
		Float comprimento = sc.nextFloat();
		
		Float area = largura * comprimento;
		System.out.println("A area do(a) "+nome+" é  igual a "+area);
	
		 areatotal =+ area;
		
		System.out.println("Deseja continuar calculando ? ");
		String continuar = sc.next();
	
		while (continuar != "Nao" && continuar !="nao") {
			System.out.println("A area total do imovel é de : "+areatotal+ " Metros Quadrados.");
			break;
		}
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
