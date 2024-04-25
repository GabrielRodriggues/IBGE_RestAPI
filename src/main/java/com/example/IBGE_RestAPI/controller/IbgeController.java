package com.example.IBGE_RestAPI.controller;

import com.example.IBGE_RestAPI.service.IbgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IbgeController {
    @Autowired
    private IbgeService ibgeService;

    @GetMapping("/noticias")
    public String consultarMarcas() {
        return ibgeService.consultarMarcas();
    }

   /* @GetMapping("/modelos/{marca}")
    public String consultarModelos(@PathVariable int marca) {
        return ibgeService.consultarModelos(marca);
    }

    @GetMapping("/anos/{marca}/{modelo}")
    public String consultarAnos(@PathVariable int marca, @PathVariable int modelo) {
        return ibgeService.consultarAnos(marca, modelo);
    }

    @GetMapping("/valor/{marca}/{modelo}/{ano}")
    public String consultarValor(@PathVariable int marca, @PathVariable int modelo, @PathVariable String ano) {
        return ibgeService.consultarValor(marca, modelo, ano);
    }*/
}

