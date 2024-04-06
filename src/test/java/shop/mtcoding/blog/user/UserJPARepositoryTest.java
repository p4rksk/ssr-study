package shop.mtcoding.blog.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest//EntityManager가 내장 돼있다.
public class UserJPARepositoryTest {

    @Autowired
    private UserJPARepository userJPARepository;

    @Test
    public void findByUsernameAndPassword_test(){
        // given
        String username = "ssar";
        String password = "1234";

        // when
       userJPARepository.findByUsernameAndPassword(username,password);

        // then

    }

    @Test
    public void findById_test(){
        // given
        int id = 1;

        // when
        Optional<User> userOptional = userJPARepository.findById(id);

        if(userOptional.isPresent()){
            User user = userOptional.get();
            System.out.println("아이디 1번 이름" +user.getUsername());
        }
        // then


    }
}