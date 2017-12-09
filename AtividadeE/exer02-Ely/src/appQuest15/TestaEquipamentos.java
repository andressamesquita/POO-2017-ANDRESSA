package appQuest15;
import modelQuest14.*;

public class TestaEquipamentos {

	public static void main(String[] args) {
		
		Equipamento guitarra = new Equipamento();
		Equipamento teclado = new Equipamento();
		
		guitarra.ligado = true;
		teclado.ligado = false;
		
		guitarra.inverte();
		teclado.inverte();
		
		if(guitarra.ligado == true){
			System.out.println("Ligado");
		}else{
			System.out.println("Desligado");
		}
		
		if(teclado.ligado == true){
			System.out.println("Ligado");
		}else{
			System.out.println("Desligado");
		}

	}

}
