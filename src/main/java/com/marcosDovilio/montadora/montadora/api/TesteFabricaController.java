package com.marcosDovilio.montadora.montadora.api;

import com.marcosDovilio.montadora.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class TesteFabricaController {

    @Autowired
    //@Qualifier("motorAspirado")
    //@Aspirado
    //@Eletrico
    @Turbo
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new FiatToro(motor);
        return carro.darIgnicao(chave);
    }
}
