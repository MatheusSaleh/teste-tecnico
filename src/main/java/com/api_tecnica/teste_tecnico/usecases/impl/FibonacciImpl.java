package com.api_tecnica.teste_tecnico.usecases.impl;

import com.api_tecnica.teste_tecnico.usecases.FibonacciGateway;
import org.springframework.stereotype.Service;

@Service
public class FibonacciImpl implements FibonacciGateway {

    @Override
    public boolean isFibonacci(int number) {
        if (number < 0) return false;

        int a = 0;
        int b = 1;

        while (a <= number){
            if (a == number) return true;
            int temp = a;
            a = b;
            b = temp + b;
        }

        return false;
    }
}
