package AlgorithmAndDataStructure;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by wt on 2016/2/29.
 * A way for Array Reverse
 */
public class ArrayReverse {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{1, 3, 5, 7, 9};
        Arrays.sort(list, Collections.reverseOrder());//Reverse Api
        for (Integer i : list) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
