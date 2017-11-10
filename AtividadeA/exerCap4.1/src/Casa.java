
public class Casa {
	
	String cor;
	boolean  porta1, porta2, porta3;
		
	public void pinta(String s){
		cor = s;
		System.out.println(cor);
	}
	
	public int quantasPortasEstaoAbertas(){
		
		if(porta1 == true & porta2 == true & porta3 == true){
			return 3;
		} else if (porta1 == true & porta2 == true){
			return 2;
		}else{
			return 1;
		}
	}
	
}
