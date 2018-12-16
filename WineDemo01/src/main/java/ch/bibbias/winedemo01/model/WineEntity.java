package ch.bibbias.winedemo01.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "wine")
@NamedQueries({ @NamedQuery(name = "WineEntity.getAllWines", query = "select w from WineEntity w"),
				@NamedQuery(name = "WineEntity.getById", query = "select w from WineEntity w where w.id = :id") })

public class WineEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1196773550835053847L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;

	@Column(name = "wine_name")
	private String name;

	@OneToOne
	@JoinColumn(name = "wine_type")
	private WineTypeEntity wineType;
	@JoinColumn(name = "wine_classification")
	private WineClassificationEntity classification;
	@JoinColumn(name = "wine_country")
	private CountryEntity country;
	@JoinColumn(name = "wine_region")
	private RegionEntity region;
	@JoinColumn(name = "wine_producer")
	private ProducerEntity producer;

	public WineEntity(String name) {
		this.name = name;

	}

	public WineEntity() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WineTypeEntity getWineType() {
		return wineType;
	}

	public void setWineType(WineTypeEntity wineType) {
		this.wineType = wineType;
	}

	public WineClassificationEntity getClassification() {
		return classification;
	}

	public void setClassification(WineClassificationEntity classification) {
		this.classification = classification;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

	public RegionEntity getRegion() {
		return region;
	}

	public void setRegion(RegionEntity region) {
		this.region = region;
	}

	public ProducerEntity getProducer() {
		return producer;
	}

	public void setProducer(ProducerEntity producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
