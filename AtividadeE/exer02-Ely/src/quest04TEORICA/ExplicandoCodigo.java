package quest04TEORICA;

public class ExplicandoCodigo {

	public static void main(String[] args) {
		
		int op = 1;
		
		switch(op){
			case 1: 
				System.out.println(op); 
			case 2:
				System.out.println(op); 
			default:
				System.out.println(op); 
		
		//Com a aus�ncia do "break" todos os casos ser�o rodados, portanto o numero 1 ser� "printado" 3 vezes.
		}
		
	}

}
