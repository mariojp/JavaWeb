package br.com.parallel.spring.beans;

import org.springframework.stereotype.Service;

@Service("debugLoginService")
public class DebugLoginService implements LoginService {

	@Override
	public boolean authenticate(String username, String password) {
		if (username == "admin" && password == "admin") {
			return true;
		} else {
			return false;
		}
	}

}
