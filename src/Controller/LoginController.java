package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {
	
	private final Login view;
	private LoginHelper helper;

	public  LoginController(Login view) {
		this.view = view;
		this.helper = new LoginHelper(view);
	}
	public void entrarNoSistema() {
	Usuario usuario =helper.obterModelo();
		
	}
	public void fizTarefa() {
		System.out.println("Busquei algo do banco de dados. ");
		this.view.exibeMensagem("Executei e fiz a tarefa! ");
	}
	
}
