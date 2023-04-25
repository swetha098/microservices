package com.UST.userservice.reopsitory;

import com.UST.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

    User findByUserId(Long userId);
}
