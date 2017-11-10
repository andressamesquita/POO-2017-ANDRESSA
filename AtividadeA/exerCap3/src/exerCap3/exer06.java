package exerCap3;

public class exer06 {
	public static void main(String[] args){
		
		int a = 0, b = 1, x;
		System.out.println(a+"\n"+b);
		
		for(int i = 0; i <= 20; i++){ //o "20" eh um parametro aleatorio
			x = a + b;
			a = b;
			b = x;
			System.out.println(x);
			
			if(x > 100){
				break;
			}
		}
	}
}
