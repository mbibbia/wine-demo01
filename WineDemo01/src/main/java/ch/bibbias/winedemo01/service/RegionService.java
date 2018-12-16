package ch.bibbias.winedemo01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ch.bibbias.winedemo01.model.RegionEntity;
import ch.bibbias.winedemo01.repository.RegionRepository;

@Service
@Transactional(propagation = Propagation.NESTED)
public class RegionService {

	@Autowired
	private RegionRepository repository;

	public RegionService() {
		super();
	}

	public RegionEntity save(final RegionEntity entity) {
		return repository.save(entity);
	}

	public Optional<RegionEntity> findOne(final Integer id) {
		return repository.findById(id);
	}

	public List<RegionEntity> findAll() {
		return repository.findAll();
	}

	public List<RegionEntity> findbyName(final String name) {
		return repository.findByName(name);
	}

}
