package com.fserapian;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        int[] sorted = sortArray1(intArray);

        for (int value : sorted) {
            System.out.println(value);
        }
    }

//    private static int[] sortArray(int[] intArray) {
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
//            int newElement = intArray[firstUnsortedIndex];
//
//            int i;
//
//            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
//                intArray[i] = intArray[i - 1];
//            }
//
//            intArray[i] = newElement;
//        }
//        return intArray;
//    }

    private static int[] sortArray1(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i = firstUnsortedIndex;

            while (i > 0 && intArray[i - 1] > newElement) {
                intArray[i] = intArray[i - 1];
                i--;
            }

            intArray[i] = newElement;
        }
        return intArray;
    }
}
