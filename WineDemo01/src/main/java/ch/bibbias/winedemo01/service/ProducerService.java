package ch.bibbias.winedemo01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ch.bibbias.winedemo01.model.ProducerEntity;
import ch.bibbias.winedemo01.repository.ProducerRepository;

@Service
@Transactional(propagation = Propagation.NESTED)
public class ProducerService {

	@Autowired
	private ProducerRepository repository;

	public ProducerService() {
		super();
	}

	public ProducerEntity save(final ProducerEntity entity) {
		return repository.save(entity);
	}

	public Optional<ProducerEntity> findOne(final Integer id) {
		return repository.findById(id);
	}

	public List<ProducerEntity> findAll() {
		return repository.findAll();
	}

	public List<ProducerEntity> findbyName(final String name) {
		return repository.findByName(name);
	}

}
