package ch.bibbias.winedemo01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ch.bibbias.winedemo01.model.CountryEntity;
import ch.bibbias.winedemo01.repository.CountryRepository;

@Service
@Transactional(propagation = Propagation.NESTED)
public class CountryService {

	@Autowired
	private CountryRepository repository;

	public CountryService() {
		super();
	}

	public CountryEntity save(final CountryEntity entity) {
		return repository.save(entity);
	}

	public Optional<CountryEntity> findOne(final Integer id) {
		return repository.findById(id);
	}

	public List<CountryEntity> findAll() {
		return repository.findAll();
	}

	public List<CountryEntity> findbyName(final String name) {
		return repository.findByName(name);
	}

}
