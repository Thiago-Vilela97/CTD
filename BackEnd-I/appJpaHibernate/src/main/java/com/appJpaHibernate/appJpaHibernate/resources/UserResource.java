package com.appJpaHibernate.appJpaHibernate.resources;

import com.appJpaHibernate.appJpaHibernate.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll() {
        Usuario u = new Usuario(1L, "Maria", "Maria@gmail.com","31992004875", "123456789");
        return ResponseEntity.ok().body(u);
    }
}
