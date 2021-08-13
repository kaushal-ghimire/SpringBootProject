package com.rimesh.student;

import static org.assertj.core.api.Assertions.assertThat;

import com.rimesh.student.entities.User;
import com.rimesh.student.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.junit.jupiter.api.Test;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {

        User user = new User();

        User savedUser = repo.save(user);
      User existUser = entityManager.find(User.class, savedUser.getId());
       assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }
//    @Test
//    public void testFindUserBymail(){
//        String email ="rita@gmail.com";
//        User user = repo.findByEmail(email);
//        assertThat(user).isNotNull();
//    }
}
