package com.example.Aula43SecuritySinc.login;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String password = bCryptPasswordEncoder.encode("password");
        String password2 = bCryptPasswordEncoder.encode("password2");

        userRepository.save(new AppUser("Jose","jose","jose@gmail",password,AppUserRoles.ROLE_USER));
        userRepository.save(new AppUser("Maria","maria","maria@gmail",password2,AppUserRoles.ROLE_ADMIN));

    }
}
