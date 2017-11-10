
public class testCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		
		casa.cor = "Yellow";
		casa.porta1 = false;
		casa.porta2 = true;
		casa.porta3 = false;
		
		casa.pinta("Red");
		
		int abertas = casa.quantasPortasEstaoAbertas();
		System.out.println(abertas);

	}

}
