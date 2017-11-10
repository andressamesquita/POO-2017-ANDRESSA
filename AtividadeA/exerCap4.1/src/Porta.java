
public class Porta {
	
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	public void abre(){
		
		aberta = true; 
	}
	
	public void fecha(){
		
		aberta = false;
	}
	
	public void pinta(String s){
		cor = s;
		System.out.println(cor);
	}
	
	public boolean estaAberta(){
		
		if (aberta == true){
			return true;
		} else {
			return false;
		}
		
	}
}
