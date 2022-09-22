package com.appJpaHibernate.appJpaHibernate.repositories;

import com.appJpaHibernate.appJpaHibernate.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Usuario, Long> {
}
