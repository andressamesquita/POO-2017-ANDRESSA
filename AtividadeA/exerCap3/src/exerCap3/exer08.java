package exerCap3;

import javax.swing.JOptionPane;

public class exer08 {
	
	
	public static void main(String[] args){
		
		int n = Integer.valueOf(JOptionPane.showInputDialog("Numero: "));
				
		//fors encadeados
		for (int i = 1; i <= n; i++){
			for (int j = i; j <= i*i; j += i){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
