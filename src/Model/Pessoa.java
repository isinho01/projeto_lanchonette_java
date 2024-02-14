package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

 abstract public class Pessoa {

	protected int id;
	protected String nome;
	protected char sexo;
	protected Date datanascimento;
	protected String telefone;
	protected String email;
	protected String rg;
	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Pessoa(int id, String nome, char sexo, String datanascimento, String telefone, String email, String rg) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		try {
			this.datanascimento = new SimpleDateFormat("dd/MM/yyyy HH:mm ").parse(datanascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
}
