package com.api_tecnica.teste_tecnico.usecases.impl;

import com.api_tecnica.teste_tecnico.usecases.StringGateway;
import org.springframework.stereotype.Service;

@Service
public class StringImpl implements StringGateway {

    @Override
    public int countOccurencesOfA(String input) {
        if (input == null || input.isEmpty()) return 0;

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }
}
