package finterest.dao;

import finterest.model.User;

import java.util.Optional;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
