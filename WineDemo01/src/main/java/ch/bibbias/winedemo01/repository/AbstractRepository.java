package ch.bibbias.winedemo01.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface AbstractRepository<T, ID> extends CrudRepository<T, ID> {

	public List<T> findByName(String name);

	@Override
	List<T> findAll();

}
