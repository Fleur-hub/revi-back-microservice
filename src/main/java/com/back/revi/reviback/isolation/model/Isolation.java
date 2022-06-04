package com.back.revi.reviback.isolation.model;

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
@Table(name = "isolation")
public class Isolation {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@ManyToOne
	@JoinColumn
	private Travaux travaux;

	@Column(name = "isolation_type")
	@Enumerated(EnumType.STRING)
	private IsolationType isolationType;

	@Column
	private Long surface;

	@Column(name = "nb_joint_calfeutrage")
	private Long nbJointCalfeutrage;
}
