package Lista8;

public class Exercicio10 {

	public static void main(String[] args) {
		int soma = 0;
		int i;
		float media;
		int quantidade = 0;
		
		for (i=50;i<71;i++) {
			if(i%2==0) {
				soma = soma+i;
			quantidade++;
				
			}
		}
		
		media = soma/quantidade;
		System.out.println(" A soma dos numeros pares de 50 a 70 é de : "+soma);
		System.out.println("A média dos números é de : "+media);
		
		
		
		
		
		
		
		
		
		
	}

}
