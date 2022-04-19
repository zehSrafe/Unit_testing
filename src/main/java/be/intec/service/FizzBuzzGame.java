package be.intec.service;

import java.util.Scanner;

public class FizzBuzzGame {
    private FizzBuzzLogic logic = new FizzBuzzLogic();
    private Scanner input = new Scanner(System.in);

    public void play() {
        System.out.println("Give number: ");
        Integer givenNumber = input.nextInt();
        String output = logic.parseInputV2(givenNumber);
        System.out.printf(output);
    }
}
