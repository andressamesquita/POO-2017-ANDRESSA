package exerCap3;

public class exer04 {
	public static void main(String[] args){
		
		int fatorial = 1;
		
		for (int n = 1; n <= 10; n++) {
			fatorial = n * fatorial;
			System.out.println("Fatorial de "+ n +" eh " + fatorial);
		}
	}

}
