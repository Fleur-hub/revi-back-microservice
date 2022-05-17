package com.back.revi.reviback.chauffeeau;

import com.back.revi.reviback.housing.Housing;
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
	private Housing housing;

	@Column(name = "chauffe_eau_type")
	@NotBlank
	private ChauffeEauType chauffeEauType;

}
