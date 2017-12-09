package quest03TEORICA;

public class Exemplo {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 0;
		
		if ((a > 11) && (++b <= 100)){ //Se "a" for maior que onze e o valor de "b" somado mais 1 for menor ou igual a 100
			System.out.println(a*b); //multiplica um pelo outro
		}else{                       //se nao:
			System.out.println(a-b); //subtrai "b" de "a"
		}
		
		//a condição obedecida foi a do else, portanto 9-0 = 9.
		
	}

}
