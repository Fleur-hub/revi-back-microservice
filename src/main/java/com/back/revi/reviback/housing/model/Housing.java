package com.back.revi.reviback.housing.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "housing")
public class Housing {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@Column(name = "adress")
	private String adress;

	@Column(name = "type_logement")
	private LogementType typeLogement;

	@Column(name = "copropriete")
	private boolean copropriete;

	@Column(name = "superfice")
	private int superfice;

	@Column(name = "date_construction")
	@Enumerated(EnumType.STRING)
	private DateConstruction dateConstruction;

	@Column(name = "budget")
	private int budget;

}
