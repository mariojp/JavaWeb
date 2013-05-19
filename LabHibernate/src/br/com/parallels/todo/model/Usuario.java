package br.com.parallels.todo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable{

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
    @GeneratedValue
    private Long id;

    
    @Column
    private String nome;
    
    @Column
    private String senha;
    
    @Column
    private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
    

}
