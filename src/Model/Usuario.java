package Model;

import java.util.Date;

public class Usuario extends Pessoa {

	protected String senha;
	protected String niveldeacesso;
	 
	
	public Usuario(int id, String nome, String senha) {
		super(id, nome);
		this.senha = senha;
	}


	public Usuario(int id, String nome, char sexo, String datanascimento, String telefone, String email, String rg) {
		super(id, nome, sexo, datanascimento, telefone, email, rg);
		this.senha = senha;
		this.niveldeacesso = niveldeacesso;
		
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNiveldeacesso() {
		return niveldeacesso;
	}


	public void setNiveldeacesso(String niveldeacesso) {
		this.niveldeacesso = niveldeacesso;
	}
	
	
	
}

