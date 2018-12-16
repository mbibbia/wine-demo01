package ch.bibbias.winedemo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ch.bibbias.winedemo01.model.WineEntity;
import ch.bibbias.winedemo01.repository.WineRepository;

@Component
@Transactional
public class WineManager {

	@Autowired
	WineRepository repository;

	public void manage() {

		System.out.println("Finding Wine by Name: Barolo");
		for (WineEntity wine : repository.findByName("Barolo")) {
			System.out.println(wine);
		}

		System.out.println("Finding Wine by Country Code: IT");
		for (WineEntity wine : repository.findByCountry("IT")) {
			System.out.println(wine);
		}

	}

}
