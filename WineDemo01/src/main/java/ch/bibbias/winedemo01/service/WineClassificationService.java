package ch.bibbias.winedemo01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ch.bibbias.winedemo01.model.WineClassificationEntity;
import ch.bibbias.winedemo01.repository.WineClassificationRepository;

@Service
@Transactional(propagation = Propagation.NESTED)
public class WineClassificationService {

	@Autowired
	private WineClassificationRepository repository;

	public WineClassificationService() {
		super();
	}

	public WineClassificationEntity save(final WineClassificationEntity entity) {
		return repository.save(entity);
	}

	public Optional<WineClassificationEntity> findOne(final Integer id) {
		return repository.findById(id);
	}

	public List<WineClassificationEntity> findAll() {
		return repository.findAll();
	}

	public List<WineClassificationEntity> findbyName(final String name) {
		return repository.findByName(name);
	}

}
