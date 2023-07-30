package Exercise44;

import java.util.Arrays;
public class ReverseArray {
    private static void reverse(int[] fullArray) {
        int[] newArray = new int[fullArray.length];

        int j = 0;
        for (int i = fullArray.length - 1; i >= 0; i--) {
            newArray[j] = fullArray[i];
            j++;
        }
        System.out.println("Array = " + Arrays.toString(fullArray)
                + "Reversed array = " + Arrays.toString(newArray));
    }
}