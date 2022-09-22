package com.example.Aula28consumindoAPI;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class ProdutoCliente {

    public Produto salvar(Produto produto) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.post("http://localhost:8080/produto/salvar")
                    .header("Content-Type","application/json")
                    .body(JSonUtil.asJsonString(produto)).asString();
            produto1 = JSonUtil.objectFromString(Produto.class, response.getBody());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }

    public Produto buscarPorId(Integer id) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.get("http://localhost:8080/produto/todos").asString();
            produto1 = JSonUtil.objectFromString(Produto.class, response.getBody());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }

    public Produto alterar(Produto produto) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.put("http://localhost:8080/produto/alterar")
                    .header("Content-Type","application/json")
                    .body(JSonUtil.asJsonString(produto)).asString();
            produto1 = JSonUtil.objectFromString(Produto.class, response.getBody());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }

    public String excluir(Integer id) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.delete("http://localhost:8080/produto/"+id).asString();


        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return response != null ? String.valueOf(response.getStatus()) : null;
    }
}
