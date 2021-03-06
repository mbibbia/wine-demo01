package ch.bibbias.winedemo01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ch.bibbias.winedemo01.model.WineEntity;

public interface WineRepository extends AbstractRepository<WineEntity, Integer> {

	@Query("select w from WineEntity w join w.country c where (c.code = :code) ")
	public List<WineEntity> findByCountry(@Param("code") String code);

}
