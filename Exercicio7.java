package Lista8;

public class Exercicio7 {

	public static void main(String[] args) {
		int antecessor =1;
		int sucessor = 1;
		int contadora = 1;
		int aux;
		
		do {
			System.out.println("A sequencia de fibonacci é : "+antecessor+ "");
			aux = antecessor + sucessor;
			antecessor = sucessor;
			sucessor = aux;
			
			contadora++;
			
			
			
		} while (contadora <=15);
		
	}

}
