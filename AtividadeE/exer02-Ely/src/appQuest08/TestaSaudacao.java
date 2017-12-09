package appQuest08;
import modelQuest07.*;

public class TestaSaudacao {

	public static void main(String[] args) {
		
		Saudacao saudacao = new Saudacao();
		
		saudacao.texto = "Olaah, bom dia";
		saudacao.destinatario = "Hugo";
		
		System.out.println(saudacao.obterSaudacao());

	}

}
