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
		
		//Com a ausência do "break" todos os casos serão rodados, portanto o numero 1 será "printado" 3 vezes.
		}
		
	}

}
