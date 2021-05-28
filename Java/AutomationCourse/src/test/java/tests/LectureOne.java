package tests;

import org.testng.annotations.Test;

import java.text.MessageFormat;

public class LectureOne {

    @Test
    public void printFirstNameUnicode() {
        char[] firstNameCharList = {'\u004A', '\u006F', '\u0072', '\u0064', '\u0061', '\u006E'};

        for (char letter : firstNameCharList) {
            System.out.print(letter);
        }
        System.out.println();
    }

    @Test
    public void printFirstNameASCII() {
        int[] firstNameAsciiList = {74, 111, 114, 100, 97, 110};

        for (int i : firstNameAsciiList) {
            System.out.print((char) i);
        }
        System.out.print("\r\n");

    }

    @Test
    public void printHelloWorld() {
        System.out.println("\\’Hello’\\ to\\\\\\ \"World\" \\’");
    }

    @Test
    public void OptimalTypeAssignmentNumbers() {
        int firstNumber = 32768;
        int secondNumber = -32768;
    }

    @Test
    public void printArithmeticOperations() {
        System.out.println(MessageFormat.format("5 + 5 = {0}", 5 + 5));
        System.out.println(MessageFormat.format("5 - 5 = {0}", 5 - 5));
        System.out.println(String.format("10 / 5 = %s", 10 / 5));
        System.out.println("10 * 5 = " + 10 * 5);
    }

    @Test
    public void printMarketCompany() {
        String firstName = "Jordan";
        String lastName = "Iliev";
        byte age = 25;
        boolean isFemale = false;
        String idNumber = "9311045544";
        int employeeNumber = 27560001;
        System.out.println(MessageFormat.format("First Name: {0} \r\nLast Name: {1} \r\nAge: {2}" +
                " \r\nFemale: {3} \r\nID Number: " + idNumber + "\r\nEmployee Number: " + employeeNumber + " ",
                firstName, lastName, age, isFemale));
    }
}
