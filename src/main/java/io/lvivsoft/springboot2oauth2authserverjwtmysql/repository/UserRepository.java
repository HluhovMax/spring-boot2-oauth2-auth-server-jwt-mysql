package io.lvivsoft.springboot2oauth2authserverjwtmysql.repository;

import io.lvivsoft.springboot2oauth2authserverjwtmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
