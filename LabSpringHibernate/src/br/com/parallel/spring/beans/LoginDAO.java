package br.com.parallel.spring.beans;

public interface LoginDAO {
	
	boolean existsByLogin(String username, String password);

}
