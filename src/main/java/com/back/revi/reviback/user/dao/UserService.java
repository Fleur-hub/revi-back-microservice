package com.back.revi.reviback.user.dao;

import com.back.revi.reviback.user.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService {

	private UserRepository userRepo;

	public User save(User user) {
		return userRepo.save(user);
	}

	public boolean existsByEmail(String email) {
		return userRepo.existsByEmail(email);
	}

	public Optional<User> findByEmail(String email) {
		return userRepo.findByEmail(email);
	}


	public Optional<User> findByUsername(String username) {
		return userRepo.findByUsername(username);
	}
}