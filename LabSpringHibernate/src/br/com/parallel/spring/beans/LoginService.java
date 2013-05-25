package br.com.parallel.spring.beans;

public interface LoginService {

	boolean authenticate(String username, String password);
	
}
