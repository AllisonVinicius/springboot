package br.com.springboot.repository;

import org.springframework.data.jpa.repository.*;
import br.com.springboot.model.User;

public interface  UserRepository extends JpaRepository<User, Long>
{

}
