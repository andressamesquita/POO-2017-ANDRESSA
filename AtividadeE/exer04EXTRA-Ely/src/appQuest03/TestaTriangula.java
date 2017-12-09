package appQuest03;
import modelQuest03.*;

public class TestaTriangula {

	public static void main(String[] args) {
		
		Triangulo triangulo1 = new Triangulo(4,4,4);
		Triangulo triangulo2 = new Triangulo(1,6,7);
		Triangulo triangulo3 = new Triangulo(8,4,8);
		
		boolean formaTriangulo1 = triangulo1.formarTriangulo();
		boolean formaTriangulo2 = triangulo2.formarTriangulo();
		boolean formaTriangulo3 = triangulo3.formarTriangulo();
		
		if(formaTriangulo1 == true && formaTriangulo2 == true && formaTriangulo3 == true){
			
			System.out.println("Siiiiim, forma triangulo. Descubra qual o tipo deles.");
		
		}else{
			
			if(formaTriangulo1 == false){
				System.out.println("Nao forma triangulo.");
			
			}else if(formaTriangulo2 == false){
				System.out.println("Nao forma triangulo.");
				
			}else if(formaTriangulo3 == false){
				System.out.println("Nao forma triangulo.");
		}
		}
		
		System.out.println(triangulo1.ehEquilatero());
		System.out.println(triangulo2.ehEscaleno());
		System.out.println(triangulo3.ehIsoceles());
	}		
}
