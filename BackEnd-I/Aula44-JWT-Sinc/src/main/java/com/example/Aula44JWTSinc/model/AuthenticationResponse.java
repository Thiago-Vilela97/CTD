package com.example.Aula44JWTSinc.model;

    //Essa classe vai voltar com o token, necessariamente somente para fazer o teste
public class AuthenticationResponse {
    private final String jwt;

    public AuthenticationResponse(String jwt){
        this.jwt = jwt;
    }

        public String getJwt() {
            return jwt;
        }
    }
