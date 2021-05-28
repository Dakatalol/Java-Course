package tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LectureFour {
    public static final String EXCEPTION_MESSAGE_FOR_STRINGS_WITH_NUMBERS = "String contains numbers!";
    public static final String EXCEPTION_MESSAGE_FOR_INCORRECT_MONTH = "Incorrect month! Choose between 1-12.";


    /**
     * @param first  - first number
     * @param second - second number
     * @param third  - third number
     * @return - returns the smallest of three numbers
     */
    public int findTheSmallestOfThreeNumbers(int first, int second, int third) {
        return Math.min((Math.min(first, second)), third);
    }

    @Test
    public void printTheSmallestOfThree() {
        System.out.println(findTheSmallestOfThreeNumbers(0, -1, 7));
    }

    /**
     * @param input - input as of string
     * @return - returns every second word from a string excluding the first one[0 index] - 2,4,6 and etc.
     * @throws Exception - throws exception for a string that contains numbers
     */
    public List<String> returnEverySecondOfString(String input) throws Exception {
        if (input.matches("(.*\\s+\\d+\\s+.*)|(.*\\s+\\d+)|(\\d+\\s+.*)")) {
            throw new Exception(EXCEPTION_MESSAGE_FOR_STRINGS_WITH_NUMBERS);
        }
        String[] arrayOfSplitStrings = input.split(" ");
        List<String> listOfWords = new ArrayList<String>();
        for (int i = 1; i < arrayOfSplitStrings.length; i++) {
            if (i % 2 != 0) {
                listOfWords.add(arrayOfSplitStrings[i]);
            }
        }
        return listOfWords;
    }

    @Test
    public void printFilteredWords() throws Exception {
        String input = "I love writing methods so much.";
        System.out.println(returnEverySecondOfString(input));
    }

    /**
     * @param input - input string
     * @return - returns list of strings
     * @throws Exception - throws exception for a string that contains numbers
     */
    public List<String> returnListOfStrings(String input) throws Exception {
        if (input.matches("(.*\\s+\\d+\\s+.*)|(.*\\s+\\d+)|(\\d+\\s+.*)")) {
            throw new Exception(EXCEPTION_MESSAGE_FOR_STRINGS_WITH_NUMBERS);
        }
        String[] arrayOfSplitStrings = input.split(" ");
        List<String> listOfWords = new ArrayList<String>();
        for (int i = 1; i < arrayOfSplitStrings.length; i++) {
            listOfWords.add(arrayOfSplitStrings[i]);
        }
        return listOfWords;
    }

    /**
     * @param inputList - taking input as list of strings
     * @return - returns the size of list of strings
     */
    public int sizeOfList(List<String> inputList) {
        return inputList.size();
    }

    @Test
    public void printSizeOfWords() throws Exception {
        String input = "I love writing methods so much.";
        System.out.println(sizeOfList(returnListOfStrings(input)));
    }

    /**
     * @param investment   - initial investment number
     * @param interestRate - interest rate percentage
     * @param timeInYears  - investment time in years
     *                     printing earnings and total amount for every year
     */
    public void interestGains(double investment, double interestRate, int timeInYears) {
        double interestEarningsForYear;
        for (int years = 0; years < timeInYears; years++) {
            interestEarningsForYear = investment * interestRate / 100;
            investment = investment + interestEarningsForYear;
            System.out.println("Year:" + (years + 1) + " Interest Gained:" + interestEarningsForYear + " total:" + investment);
        }
    }

    @Test
    public void printInterestGained() {
        interestGains(10000, 5, 10);
    }

    /**
     * @param year - the year in number
     * @return - returns boolean for leap year
     */
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Test
    public void printIsLeapYear() {
        int year = 2000;
        System.out.println(isLeapYear(year));
    }

    /**
     * @param password - input of password as a string
     * @return - returns if password is valid for the following conditions:
     * 1. At least 1 capital letter
     * 2. At least 1 small letter
     * 3. At least 2 digits
     * 4. Length min<8 max>16
     */
    public boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 16) {
            System.out.println("Password length is incorrect");
            return false;
        } else if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d[2,]).+$")) {
            System.out.println("Password conditions are not correct(at least 1 capital, 1 lower, 2 digits)");
            return false;
        } else {
            System.out.println("Password validations is correct");
            return true;
        }
    }

    @Test
    public void printIsValidPassword() {
        isValidPassword("22DDDDDDDDDDDd");
    }

    /**
     * @param month = input the month starting from 1 - January
     * @return - returns the month as a Word
     * @throws Exception - throws exception for invalid input of a month
     */
    public String returnTheMonthAsWord(byte month) throws Exception {
        if (month < 1 || month > 12) {
            throw new Exception(EXCEPTION_MESSAGE_FOR_INCORRECT_MONTH);
        }
        String[] monthNames = {" ", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        return monthNames[month];
    }

    @Test
    public void printMonthAsWord() throws Exception {
        byte month = 11;
        System.out.println(returnTheMonthAsWord(month));
    }
}
