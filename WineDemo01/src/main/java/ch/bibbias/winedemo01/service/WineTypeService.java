package ch.bibbias.winedemo01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ch.bibbias.winedemo01.model.WineTypeEntity;
import ch.bibbias.winedemo01.repository.WineTypeRepository;

@Service
@Transactional(propagation = Propagation.NESTED)
public class WineTypeService {

	@Autowired
	private WineTypeRepository repository;
	
	public WineTypeService() {
		super();
	}

	public WineTypeEntity save(final WineTypeEntity entity) {
		return repository.save(entity);
	}

	public Optional<WineTypeEntity> findOne(final Integer id) {
		return repository.findById(id);
	}

	public List<WineTypeEntity> findAll() {
		return repository.findAll();
	}

	public List<WineTypeEntity> findbyName(final String name) {
		return repository.findByName(name);
	}

}
