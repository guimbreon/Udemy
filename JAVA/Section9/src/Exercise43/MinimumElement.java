package Exercise43;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    private static int[] readElements(int number){
        int[] numberArray = new int[number];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < number; i++){
            numberArray[i] = scanner.nextInt();
        }
        return numberArray;
    }

    private static int findMin(int[] numberArray){
        int min = 12313113;
        for(int i = 0; i < numberArray.length ;i++){
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }
}