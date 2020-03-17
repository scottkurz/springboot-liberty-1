package it.bcc.bccsi.alerts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bcc.bccsi.alerts.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
