package Exercise42;

import java.util.Arrays;import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size){
        int[] fullArray = new int[size];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size ; i++){

            System.out.println("Enter a number \t");
            fullArray[i] = scanner.nextInt();
        }

        return fullArray;
    }

    public static void printArray(int[] fullArray){
        for (int i = 0; i < fullArray.length ; i++){
            System.out.println("Element " + i + " contents " +
                    fullArray[i]);
        }
    }

    public static int[] sortIntegers(int[] fullArray) {
        int[] newArray = new int[fullArray.length];
    Arrays.sort(fullArray);
        int j = 0;

        for (int i = fullArray.length - 1; i >= 0; i--) {
            newArray[j] = fullArray[i];
            j++;
        }

        return newArray;
    }

}