package com.hup.basic.user.server.repository;

import com.hup.basic.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author to dapeng
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
