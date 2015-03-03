package andreFernande;

public class Cliente {

		private int id;
		private String nome, sexo, email,cpf, rg;

		public Cliente(int id, String nome, String sexo, String email, String cpf, String rg){
			setId(id);
			setNome(nome);
			setSexo(sexo);
			setEmail(email);
			setCpf(cpf);
			setRg(rg);
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		
		
}
