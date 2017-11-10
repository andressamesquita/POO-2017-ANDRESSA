
public class testPorta {

	public static void main(String[] args) {
		
		Porta porta = new Porta();
		
		porta.cor = "amarelo";
		porta.dimensaoX = 2;
		porta.dimensaoY = 1;
		porta.dimensaoZ = 3;
		
		porta.abre();
		
		porta.fecha();
		
		porta.pinta("azul");
		porta.pinta("magenta");
		porta.pinta("marrom");
		
		boolean estado = porta.estaAberta();
		System.out.println(estado);
	}

}
