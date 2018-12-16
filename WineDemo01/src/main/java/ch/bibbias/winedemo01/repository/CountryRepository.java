package ch.bibbias.winedemo01.repository;

import org.springframework.data.repository.CrudRepository;

import ch.bibbias.winedemo01.model.CountryEntity;

public interface CountryRepository extends CrudRepository<CountryEntity, Integer> {

}
