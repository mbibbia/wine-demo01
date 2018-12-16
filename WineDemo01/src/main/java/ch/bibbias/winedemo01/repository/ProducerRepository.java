package ch.bibbias.winedemo01.repository;

import org.springframework.data.repository.CrudRepository;

import ch.bibbias.winedemo01.model.ProducerEntity;

public interface ProducerRepository extends CrudRepository<ProducerEntity, Integer> {

}
