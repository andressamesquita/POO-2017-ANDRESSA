package modelQuest02;

public class Dummy {
	
	int atributo1;
	int atributo2;
	
	int metodo1() { return ++atributo1; }
	
	int metodo2() { return ++atributo2; }
	
	public void metodo3() {
		if (atributo1 == 0 && (metodo1() == 0) && metodo2() == 0) {
			System.out.print(atributo1 + atributo2);
		} else {
			System.out.print(2*atributo1 - atributo2);
		}
	}
	
}
