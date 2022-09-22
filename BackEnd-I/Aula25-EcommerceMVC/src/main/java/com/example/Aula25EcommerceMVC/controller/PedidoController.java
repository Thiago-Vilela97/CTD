package com.example.Aula25EcommerceMVC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @RequestMapping(value = "/findPedido", method = RequestMethod.GET)
    public String getPedidoAll() {
        return "Você buscou todos os pedidos";
    }
}
