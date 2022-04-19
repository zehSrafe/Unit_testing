package be.intec.service;

public class FizzBuzzLogic {
    String output = "";
    public String parseInput(Integer givenNumber) {
        if (givenNumber % 3 == 0) return "Fizz";
        if (givenNumber % 5 == 0) return "Buzz";
        if (givenNumber % 3 != 0 && givenNumber % 5 != 0) return "You failed to give a number dividable by 3 or 5.";
        if (givenNumber % 3 == 0 && givenNumber % 5 == 0) return "FizzBuzz";
        return givenNumber.toString();
    }

    public String parseInputV2(Integer givenNumber) {
        output += givenNumber % 3 == 0 ? "Fizz" : "";
        output += givenNumber % 5 == 0 ? "Buzz" : "";
        if (output.length() == 0) {
            output = "You failed to give a number dividable by 3 or 5.";
        }
        return output;
    }
}
