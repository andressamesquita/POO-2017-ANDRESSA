package modelQuest03;

public class Triangulo {
	
	private int a;
	private int b;
	private int c;
	
	public Triangulo(int L1, int L2, int L3){
		this.a = L1;
		this.b = L2;
		this.c = L3;
	}
	
	public boolean formarTriangulo(){
		if ((b-c < a) && (b+c > a)){
			return true;
		}else{
			return false;
		}
	}
		
	public boolean ehIsoceles(){
		
		if ((a == b) || (b == c) || (a == c)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean ehEscaleno(){
		
		if((a != b) && (b != c) && (a!=c)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean ehEquilatero(){
		
		if ((a == b) && (b == c) && (a==c)){
			return true;
		}else{
			return false;
		}
	}
	
}
