package it.bcc.bccsi.alerts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bcc.bccsi.alerts.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
