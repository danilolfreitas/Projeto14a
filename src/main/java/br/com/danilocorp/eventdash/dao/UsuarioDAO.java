package br.com.danilocorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.danilocorp.eventdash.model.Usuario;
/*
 * Essa classe faz a "ponte" para gerar os SQLs de Insert, Select, Updates, etc 
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer> { //Aqui o CrudRepository recebe a classe (tabela) que vai ser consultada e o tipo da chave primária;
	
	public Usuario findByEmailOrRacf(String email, String racf);

}
