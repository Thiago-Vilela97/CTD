package com.appJpaHibernate.appJpaHibernate.services;

import com.appJpaHibernate.appJpaHibernate.entities.Usuario;
import com.appJpaHibernate.appJpaHibernate.repositories.UserRepository;
import com.appJpaHibernate.appJpaHibernate.services.exceptions.ResourceNotFoundException;
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
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public Usuario insert(Usuario obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Usuario update(Long id, Usuario obj) {
        Usuario entity = repository.getReferenceById(id);
        updateDate(entity, obj);
        return repository.save(entity);
    }

    private void updateDate(Usuario entity, Usuario obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
