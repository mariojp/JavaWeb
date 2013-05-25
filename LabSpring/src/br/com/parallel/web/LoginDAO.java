package br.com.parallel.web;

public interface LoginDAO {
	
	boolean existsByLogin(String username, String password);

}
