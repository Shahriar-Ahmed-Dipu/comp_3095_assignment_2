package ca.gbc.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ca.gbc.userservice.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods if needed
}
