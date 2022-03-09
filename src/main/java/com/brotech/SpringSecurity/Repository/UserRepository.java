package com.brotech.SpringSecurity.Repository;

import com.brotech.SpringSecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);
}
