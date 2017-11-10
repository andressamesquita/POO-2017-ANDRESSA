package exerCap3;

public class exer05 {
	public static void main(String[] args){
		
		long fatorial = 1;
		
		for(int n = 1; n <= 40; n++){
			fatorial = n * fatorial;
			System.out.println("O fatorial de " + n + " eh " + fatorial);
		}
	}

}
