package com.back.revi.reviback.user;

import com.back.revi.reviback.housing.Housing;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

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
    private List<Long> housingIds;

    public static UserDto createFromUser(User user) {
        return UserDto.builder()
                      .email(user.getEmail())
                      .userRole(user.getUserRole())
                      .username(user.getUsername())
                      .firstName(user.getFirstName())
                      .lastName(user.getLastName())
                      .phoneNumber(user.getPhoneNumber())
                      .housingIds(user.getHousings().stream().map(Housing::getId).toList())
                      .build();
    }

}
