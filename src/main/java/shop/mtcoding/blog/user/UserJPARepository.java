package shop.mtcoding.blog.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserJPARepository extends JpaRepository {

    Optional<User> findByUsernameAndaPassword(@Param("username") String username, @Param("password") String password);
    Optional<User> findByUsername(@Param("username") String username);
}
