package com.api_tecnica.teste_tecnico.infrastructure.adapters.http.controllers;

import com.api_tecnica.teste_tecnico.usecases.StringGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StringController {

    private final StringGateway stringGateway;

    public StringController(StringGateway stringGateway) {
        this.stringGateway = stringGateway;
    }

    @GetMapping("/count-a")
    public ResponseEntity<String> countA(@RequestParam String input) {
        int count = stringGateway.countOccurencesOfA(input);
        return ResponseEntity.ok("Quantidade de letras 'a' ou 'A' na string: " + count);
    }
}
