package br.com.parallel.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("databaseLoginService")
public class DatabaseLoginService implements LoginService {

    @Autowired
	LoginDAO loginDAO;
	
	
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	
	
	@Override
	public boolean authenticate(String username, String password) {
		return loginDAO.existsByLogin(username, password);
	}

}
