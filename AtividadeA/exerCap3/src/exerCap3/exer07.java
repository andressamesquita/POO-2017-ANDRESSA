package exerCap3;
import java.util.Scanner;

public class exer07 {
	private static Scanner n;

	public static void main(String[] args){
		n = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x = n.nextInt();
		
		while (x != 1){
			if(x % 2 == 0){
				x = x / 2;
			}else{
				x = (3 * x) + 1;
			}
			System.out.print(x + " ");
		}
		
	}
	
}
