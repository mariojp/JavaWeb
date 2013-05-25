package br.com.parallel.web;

public class DatabaseLoginService implements LoginService {

	
	LoginDAO loginDAO;
	
	
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	
	
	@Override
	public boolean authenticate(String username, String password) {
		return loginDAO.existsByLogin(username, password);
	}

}
