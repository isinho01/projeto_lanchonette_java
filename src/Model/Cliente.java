package Model;

import java.util.Date;

public class Cliente extends Pessoa{

	private String endereco;
	private String cep;
	
	public Cliente(int id, String nome, char sexo, String datanascimento, String telefone, String email, String rg) {
		super(id, nome, sexo, datanascimento, telefone, email, rg);

	}
	

	public Cliente(int id, String nome) {
		super(id, nome);
		this.endereco = endereco;
		this.cep = cep;
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
