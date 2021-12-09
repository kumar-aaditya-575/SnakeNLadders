package com.company.service;

import java.util.Random;

public class DieService {
    private static final int maxDie = 6;
    static int rollDie(){
        return new Random().nextInt(maxDie) + 1;
    }
}
