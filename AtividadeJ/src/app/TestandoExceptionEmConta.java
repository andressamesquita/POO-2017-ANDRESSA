package app;
import model.*;

public class TestandoExceptionEmConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(4556);
		cc.deposita(-178.00);
		
		ContaCorrente c = new ContaCorrente(8766);
		c.deposita(34000);
		c.saca(-37);
	
	}

}
