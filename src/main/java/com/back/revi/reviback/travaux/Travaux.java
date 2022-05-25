package com.back.revi.reviback.travaux;

import com.back.revi.reviback.housing.Housing;
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
		@UniqueConstraint(columnNames = {"housing", "travaux_type"})
)
public class Travaux {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@ManyToOne
	private Housing housing;

	@Enumerated(EnumType.STRING)
	@Column(name = "travaux_type")
	private TravauxType travauxType;

}
