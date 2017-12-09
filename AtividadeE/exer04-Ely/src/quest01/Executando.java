package quest01;

public class Executando {

	public static void main(String[] args) {
		
		int[] a = new int[5];
/*
 *		for (int i = 0; i <= a.length; i++) {
 *			a[i] = i;
 *			System.out.println(a[i]);
 *		}
 *		
 *		----> O "for" imprime os elementos do array obedecendo a condicão, mas dá erro de index uma vez que a mesma passa o tamanho do array e nao o acesso até o ultimo elemento.
 *		
 *		----> O CORRETO SERIA:
 */		
		for (int i = 0; i <= a.length-1; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
	}

}
