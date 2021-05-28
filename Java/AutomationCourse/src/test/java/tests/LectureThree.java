package tests;

import org.testng.annotations.Test;

import java.util.*;

public class LectureThree {
    @Test
    public void printSortedArrayAsString() {
        int[] numbers = {1788, 2025, 1869, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        Arrays.sort(numbers);
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        System.out.println(Arrays.toString(strings));
    }

    @Test
    public void printSummedNumbersFromFirstArray(){
        int[] numbers = {1788, 2025, 1869, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }

    @Test
    public void printTwoDimensionalMatrix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number Of Matrix Rows");
        int matrixRow = scan.nextInt();
        System.out.println("Enter The Number Of Matrix Columns");
        int matrixCol = scan.nextInt();

        //defining 2D array to hold matrix data
        int[][] matrix = new int[matrixRow][matrixCol];

        System.out.println("Enter Matrix Data");
        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Your Matrix is : ");
        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }

            System.out.println();
        }
    }

    @Test
    public void printConvertedArrayToList() {
        List<String> stringList = new ArrayList<String>(Arrays.asList("This", "is", "how", "we", "roll", "arrays"));
        for (String element : stringList) {
            System.out.print(element + " ");
        }
    }

    @Test
    public void printConvertedListToArray() {
        List<String> stringList = new ArrayList<String>(Arrays.asList("This", "is", "how", "we", "roll", "arrays"));
        String[] stringArray = new String[6];

        for (int i = 0; i < stringList.size(); i++) {
            stringArray[i] = stringList.get(i);
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
    }

    @Test
    public void printReversedLinkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("This");
        linkedList.add("is");
        linkedList.add("how");
        linkedList.add("we");
        linkedList.add("roll");
        linkedList.add("arrays");
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }

    @Test
    public void printCopiedHashMap() {
        HashMap<Integer, String> firstHashMap = new HashMap<Integer, String>();
        HashMap<Integer, String> secondHashMap = new HashMap<Integer, String>();
        firstHashMap.put(0, "This");
        firstHashMap.put(1, "is");
        firstHashMap.put(2, "how");
        firstHashMap.put(3, "we");
        firstHashMap.put(4, "roll");
        firstHashMap.put(5, "arrays");
        secondHashMap.putAll(firstHashMap);
        System.out.println("The copied map looks like this: " + secondHashMap);
    }

    @Test
    public void printHashMap() {
        HashMap<Integer, String> firstHashMap = new HashMap<Integer, String>();
        firstHashMap.put(0, "This");
        firstHashMap.put(1, "is");
        firstHashMap.put(2, "how");
        firstHashMap.put(3, "we");
        firstHashMap.put(4, "roll");
        firstHashMap.put(5, "arrays");
        if (firstHashMap.containsValue("This")) {
            System.out.println("The 'this' word is contained in the map");
        } else {
            firstHashMap.put(66, "This");
        }
        if (firstHashMap.containsValue("That")) {
            System.out.println("The 'that' word is contained in the map");
        } else {
            firstHashMap.put(77, "That");
        }
        System.out.println("The new map looks like this: " + firstHashMap);
    }
}
