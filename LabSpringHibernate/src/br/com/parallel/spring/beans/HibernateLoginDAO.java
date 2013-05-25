package br.com.parallel.spring.beans;

import org.springframework.stereotype.Repository;

@Repository("loginDAO")
public class HibernateLoginDAO implements LoginDAO {

	@Override
	public boolean existsByLogin(String username, String password) {
		throw new UnsupportedOperationException("Ainda não criado");
	}

}
