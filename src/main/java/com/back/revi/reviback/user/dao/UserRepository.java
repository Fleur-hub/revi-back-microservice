package com.back.revi.reviback.user.dao;

import com.back.revi.reviback.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Transactional
	@Modifying
	@Query("update User u set u.email = :email where u.id = :id")
	void updateEmailById(@NonNull @Param("email") String email, @NonNull @Param("id") long id);

	@Query("select (count(u) > 0) from User u where u.email = :email")
	boolean existsByEmail(@Param("email") @NonNull String email);

	@Query("select u from User u where u.email = :email")
	@NonNull
	Optional<User> findByEmail(@Param("email") String email);

	Optional<User> findByUsername(String username);
}