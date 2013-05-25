package br.com.parallel.web;

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
