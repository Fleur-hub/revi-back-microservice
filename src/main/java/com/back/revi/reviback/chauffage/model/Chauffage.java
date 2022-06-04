package com.back.revi.reviback.chauffage.model;

import com.back.revi.reviback.travaux.model.Travaux;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chauffage")
public class Chauffage {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@ManyToOne
	@JoinColumn
	private Travaux travaux;

	@Column(name = "chauffage_type")
	@Enumerated(EnumType.STRING)
	private ChauffegeType chauffegeType;

	@Column
	private Long surface;

	@Column(name = "nombre_radiateur")
	private Long nombreRadiateur;

}
