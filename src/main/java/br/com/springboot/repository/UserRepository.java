package br.com.springboot.repository;

import org.springframework.data.jpa.repository.*;
import br.com.springboot.model.User;
import org.springframework.data.repository.query.*;

import java.util.*;

public interface  UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT userss from User userss where userss.id > :id")
    public List<User> findAllMoreThan(@Param("id") Long id);

}
