package br.com.mariojp.todo.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.mariojp.todo.service.LoginService;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(name = "service", value = "#{loginService}")
	private LoginService service;

	public void setService(final LoginService service) {
		this.service = service;
	}

	
	private String usuario = "Usuario";
	
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	 
	
}
