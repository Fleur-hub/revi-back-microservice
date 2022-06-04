package com.back.revi.reviback.financial.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "financial_information")
public class FinancialInformation {
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@Column(name = "nb_personnes_foyer_fiscal")
	private Long nbPersonnesFoyerFiscal;

	@Column(name = "revenu_fiscal")
	private Long revenuFiscal;

	@Column(name = "type_proprietaire")
	@Enumerated(EnumType.STRING)
	private TypeProprietaire typeProprietaire;
}
