package com.brotech.SpringSecurity.Repository;

import com.brotech.SpringSecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
