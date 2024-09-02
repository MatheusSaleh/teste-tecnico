package com.api_tecnica.teste_tecnico.infrastructure.adapters.http.controllers;

import com.api_tecnica.teste_tecnico.usecases.FibonacciGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FibonnacciController {

    private final FibonacciGateway fibonacciGateway;

    public FibonnacciController(FibonacciGateway fibonacciGateway) {
        this.fibonacciGateway = fibonacciGateway;
    }

    @GetMapping("/fibonacci")
    public ResponseEntity<String> checkFibonacci(@RequestParam int number){
        return ResponseEntity.ok(fibonacciGateway.isFibonacci(number) ? "O número pertence a sequencia de Fibonacci" : "O número não pertence a sequencia de Fibonacci");
    }
}
