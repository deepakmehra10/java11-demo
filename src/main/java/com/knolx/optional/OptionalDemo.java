package com.knolx.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> deepak = Optional.of("Deepak");
        System.out.println(deepak.isEmpty());
        
        if (!deepak.isPresent()) {
            System.out.println("I want to do something!");
        }
    }
}
