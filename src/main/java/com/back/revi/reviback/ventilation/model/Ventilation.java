package com.back.revi.reviback.ventilation.model;

import com.back.revi.reviback.travaux.model.Travaux;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "ventilation")
public class Ventilation {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@OneToOne
	@JoinColumn
	private Travaux travaux;

	@Column(name = "type_vmc")
	@Enumerated(EnumType.STRING)
	private TypeVMC typeVMC;

	@Column(name = "nombre_vmc")
	private Long nombreVMC;
}
