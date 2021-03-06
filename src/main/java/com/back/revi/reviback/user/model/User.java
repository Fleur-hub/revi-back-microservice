package com.back.revi.reviback.user.model;

import com.back.revi.reviback.financial.model.FinancialInformation;
import com.back.revi.reviback.housing.model.Housing;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "user")
public class User {

	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	@Column(name = "email", unique = true)
	@Email
	@NotBlank
	private String email;

	@Column(name = "user_role")
	private UserRole userRole;

	@Column(name = "username", unique = true)
	@NotBlank
	private String username;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "sign_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date signDate;

	@OneToMany
	@JoinColumn(name = "user_id")
	private List<Housing> housings;

	@OneToOne
	@JoinColumn
	private FinancialInformation financialInformation;

}
