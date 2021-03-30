package epam.jwd.task4.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task4.unit.EvenNumbersLogics;

public class Runner {

    public static void main(String[] args) {
        int[] enteredNumbers = new int[4];
        System.out.print("Enter 4 integer numbers: ");
        for(int i=0;i<enteredNumbers.length;i++) {
            enteredNumbers[i] = DataScanner.enterIntegerFromConsole();
        }

        boolean inputContainsAtLeastTwoEvenNumbers = EvenNumbersLogics.areEvenAtLeastTwo(enteredNumbers[0],
                enteredNumbers[1], enteredNumbers[2], enteredNumbers[3]);

        System.out.println("At least two of entered numbers are even: " + inputContainsAtLeastTwoEvenNumbers);
    }
}
