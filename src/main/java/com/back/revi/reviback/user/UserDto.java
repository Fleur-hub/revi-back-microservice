package com.back.revi.reviback.user;

import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {
	private long id;
	private String email;
	private UserRole userRole;
	private String username;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Timestamp signDate;
	
	public static UserDto createFromUser(User user){
		return UserDto.builder()
					  .email(user.getEmail())
					  .userRole(user.getUserRole())
					  .username(user.getUsername())
					  .firstName(user.getFirstName())
					  .lastName(user.getLastName())
					  .phoneNumber(user.getPhoneNumber())
					  .build();
	}
	
}
