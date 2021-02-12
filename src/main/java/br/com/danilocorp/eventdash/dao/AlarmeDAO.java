package br.com.danilocorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.danilocorp.eventdash.model.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme, Integer> {
	

}
