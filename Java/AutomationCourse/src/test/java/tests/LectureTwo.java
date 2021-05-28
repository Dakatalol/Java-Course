package tests;

import org.testng.annotations.Test;

import java.text.MessageFormat;
import java.util.Arrays;

public class LectureTwo {
    @Test
    public void printFoundEvenNumbers() {
        int firstNumber = 2;
        int secondNumber = 5;

        boolean firstIntIsEven = firstNumber % 2 == 0;
        boolean secondIntIsEven = secondNumber % 2 == 0;
        boolean areEven = (firstNumber % 2 == 0) && (secondNumber % 2 == 0);
        boolean notEven = (firstNumber % 2 != 0) && (secondNumber % 2 != 0);

        System.out.println(MessageFormat.format("First is even is {0}", firstIntIsEven));
        System.out.println(MessageFormat.format("Second is even is {0}", secondIntIsEven));
        System.out.println(MessageFormat.format("First and Second are both even is {0}", areEven));
        System.out.println(MessageFormat.format("First and Second are both not even is {0}", notEven));
    }

    @Test
    public void printMultipliedNumber() {
        byte number = 7;
        switch (number) {
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("Number is prime");
                break;
            default:
                System.out.println("Number is not prime");
                break;
        }
        if (number >= 1 && number <= 5) {
            number *= 10;
        } else if (number > 5 && number <= 9) {
            number *= 100;
        }
        System.out.println(number);
    }

    @Test
    public void printNumberAsWord() {
        byte number = 0;
        String oneToNineList[] = {"zero", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine",
        };
        System.out.println(oneToNineList[number]);
    }

    @Test
    public void printPrimeNumbersFromRange() {
        int firstNumber = 101;
        int secondNumber = 15;
        int minBound = firstNumber;
        int maxBound = secondNumber;

        boolean isPrime;

        if (firstNumber > secondNumber) {
            minBound = secondNumber;
            maxBound = firstNumber;
        }

        while (minBound < maxBound) {
            isPrime = false;
            for (int divider = 2; divider <= minBound / 2; divider++) {
                // condition for non prime number
                if (minBound % divider == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime && minBound != 0 && minBound != 1) {
                System.out.print(minBound + " ");
            }
            minBound++;
        }
    }

    @Test
    public void printMatrix() {
        byte number = 4;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
            for (int j = i + 1; j <= i + (number - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    @Test
    public void printSecondLargestNumber() {
        int[] numbers = {3, -2, 1, 2, -5, 4};
        Arrays.sort(numbers);
        System.out.print("The second largest element is " + numbers[numbers.length - 2] + "\n");
    }

    @Test
    public void printEvenNumbersFromRange() {
        byte start = 10;
        byte end = 33;
        for (int currentNumber = start; currentNumber <= end; currentNumber += 2) {
            System.out.print(currentNumber + " ");
        }
    }

    @Test
    public void printModifiedNumbersFromRange() {
        //first range
        for (int currentNumber = 66; currentNumber >= 21; currentNumber -= 4) {
            System.out.print(currentNumber + " ");
        }

        System.out.println(" ");

        //second range
        for (int currentNumber = 77; currentNumber <= 99; currentNumber += 2) {
            System.out.print(currentNumber + " ");
        }
    }
}