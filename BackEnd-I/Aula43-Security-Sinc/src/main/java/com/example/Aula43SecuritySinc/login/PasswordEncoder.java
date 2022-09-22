package com.example.Aula43SecuritySinc.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration //Essa classe é apenas de configuração
public class PasswordEncoder {

    @Bean //Estou dizendo que esse método da classe terá que ser executado logo no começo da aplicação
    //pois eu preciso do encoder logo no começo antes de acessar o meu sistema, porque quando eu mandar
    //meu usuário ele vai pegar o encoder para verificar se a senha é a mesma que está salva no banco de dados
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
