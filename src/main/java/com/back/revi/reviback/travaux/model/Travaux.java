package com.back.revi.reviback.travaux.model;

import com.back.revi.reviback.housing.model.Housing;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(
		name = "travaux",
		uniqueConstraints =
		@UniqueConstraint(columnNames = {"housing_id", "travaux_type"})
)
public class Travaux {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@ManyToOne
	@JoinColumn(name = "housing_id")
	private Housing housing;

	@Enumerated(EnumType.STRING)
	@Column(name = "travaux_type")
	private TravauxType travauxType;

}
