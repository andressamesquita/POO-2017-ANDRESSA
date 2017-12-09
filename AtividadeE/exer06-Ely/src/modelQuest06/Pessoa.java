package modelQuest06;

public class Pessoa {

		private String nome;
		private String sobrenome;
		
		public Pessoa(){
			
			
		}
		
		public Pessoa(String nome, String sobrenome){
			this.setNome(nome);
			this.sobrenome = sobrenome;
		}
		
		public void setAlterarNomeCompleto(String n, String s) {
			setNome(n); sobrenome = s;
			
		}
		
		public void setAlterarNome(String n) {
			setNome(n);
		}
		
		public void setAlterarSobrenome(String s) {
			sobrenome = s;
		}
		
		public String getNomeCompleto() {
			return getNome() + " " + sobrenome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
}
