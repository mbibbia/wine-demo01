package ch.bibbias.winedemo01.repository;

import org.springframework.data.repository.CrudRepository;

import ch.bibbias.winedemo01.model.RegionEntity;

public interface RegionRepository extends CrudRepository<RegionEntity, Integer> {

}
