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
@Table(name = "travaux")
public class Travaux {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@Enumerated(EnumType.STRING)
	private  TravauxType travauxType;

	@ManyToOne
	private Housing housing;

}
