package com.back.revi.reviback.chauffeeau.model;

import com.back.revi.reviback.travaux.model.Travaux;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chauffe_eau")
public class ChauffeEau {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@OneToOne
	@JoinColumn
	private Travaux travaux;

	@Column(name = "chauffe_eau_type")
	@NotBlank
	@Enumerated(EnumType.STRING)
	private ChauffeEauType chauffeEauType;

}
