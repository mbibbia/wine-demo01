package ch.bibbias.winedemo01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ch.bibbias.winedemo01.model.WineEntity;
import ch.bibbias.winedemo01.repository.WineRepository;

@Service
@Transactional(propagation = Propagation.NESTED)
public class WineService {

	@Autowired
	private WineRepository repository;

	public WineService() {
		super();
	}

	public WineEntity save(final WineEntity entity) {
		return repository.save(entity);
	}

	public Optional<WineEntity> findOne(final Integer id) {
		return repository.findById(id);
	}

	public List<WineEntity> findAll() {
		return repository.findAll();
	}

	public List<WineEntity> findbyName(final String name) {
		return repository.findByName(name);
	}

	public List<WineEntity> findbyCountryCode(final String countryCode) {
		return repository.findByCountry(countryCode);
	}

}
