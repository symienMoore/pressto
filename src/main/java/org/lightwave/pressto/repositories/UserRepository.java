package org.lightwave.pressto.repositories;


import org.lightwave.pressto.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {
    User findByUsername(String username);
//    User findByEmail(String email);
//    User findByUsernameOrEmail(String username, String email);
//    Boolean existsByUsername(String username);
//    Boolean existsByEmail(String email);
}
