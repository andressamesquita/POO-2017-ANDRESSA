package quest05;

public class Exemplo {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 0;
		
		if ((a-- > 11) || (++b <= 100)){
			System.out.println(a*b);
		} else {
			System.out.println(a-b);
		}
	}
	
	//RESULTADO: 0
}
