package ch.bibbias.winedemo01.repository;

import org.springframework.data.repository.CrudRepository;

import ch.bibbias.winedemo01.model.WineClassificationEntity;

public interface WineClassificationRepository extends CrudRepository<WineClassificationEntity, Integer> {

}
