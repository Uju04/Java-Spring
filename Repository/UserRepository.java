package com.summer.winter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.summer.winter.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    User findByFullName(String FullName);
}
