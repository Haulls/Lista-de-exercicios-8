package Lista8;

public class Exercicio5 {

	public static void main(String[] args) {
		int i = 0;
		int x = 3;
		int numero = 0;
		while (i < 16) {

			if (i == 0) {
				numero = 1;
			}
			if (i == 1) {
				numero = x;

			}
		System.out.println(+x+ " elevado a " +i+ " é igual a " +numero );
		numero = numero*x;
		i=i+1;
		
		}
		
	}

}
