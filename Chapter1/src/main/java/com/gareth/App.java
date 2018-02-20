package com.gareth;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        int rand = randomGenerator();

    }

    static int randomGenerator() {

        Random newRandom = new Random();

        int rand = newRandom.nextInt(100) + 1;

        System.out.println(rand);

        return rand;
    }
}