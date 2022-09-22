package com.example.Aula43SecuritySinc.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional //Trabalha dentro do escopo de uma transação no banco de dados
public interface UserRepository extends JpaRepository<AppUser,Long> {

    Optional<AppUser> findByEmail(String email);
}
