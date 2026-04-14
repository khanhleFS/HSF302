package repository;

import dto.UserDTO;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {
     boolean existsByName(String name);
     boolean existsByPassword(String password);
     User findByName(String name);
}
