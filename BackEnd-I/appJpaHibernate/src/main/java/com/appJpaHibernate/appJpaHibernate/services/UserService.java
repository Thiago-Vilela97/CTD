package com.appJpaHibernate.appJpaHibernate.services;

import com.appJpaHibernate.appJpaHibernate.entities.Usuario;
import com.appJpaHibernate.appJpaHibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.get();
    }
}
