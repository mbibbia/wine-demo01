package ch.bibbias.winedemo01.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "wine_classification")
public class WineClassificationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "classification_name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "wine")
	private List<WineEntity> wines;

	public WineClassificationEntity(String name) {
		this.name = name;
	}

	public WineClassificationEntity() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WineEntity> getWines() {
		return this.wines;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
