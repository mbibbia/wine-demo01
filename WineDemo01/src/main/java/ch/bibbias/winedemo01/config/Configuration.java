package ch.bibbias.winedemo01.config;

import org.springframework.beans.factory.annotation.Autowired;

import ch.bibbias.winedemo01.model.CountryEntity;
import ch.bibbias.winedemo01.model.WineEntity;
import ch.bibbias.winedemo01.service.CountryService;
import ch.bibbias.winedemo01.service.WineService;

public class Configuration {

	@Autowired
	WineService wineService;

	@Autowired
	CountryService countryService;

	private void configureDatabase() {
		System.out.println("Konfiguriere Datenbank..");

		// Wines anlegen
		WineEntity w1 = new WineEntity("Barolo");
		WineEntity w2 = new WineEntity("Langhe Nebbiolo");

		// Countries anlegen
		CountryEntity countryEntity = new CountryEntity("IT");
		countryService.save(countryEntity);

		System.out.println("Konfiguration abgeschlossen");
	}

}
