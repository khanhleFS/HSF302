package repository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
     boolean existsByName(String name);
     boolean existsByPassword(String password);
     void save(entity.User user);
     entity.User findByName(String name);
}
