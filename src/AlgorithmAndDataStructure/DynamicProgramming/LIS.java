package AlgorithmAndDataStructure.DynamicProgramming;

import java.util.*;

public class LIS { //change to Main

    public static void main(String []args) throws Exception {

        int arr[];
        Scanner cin = new Scanner(System.in);
        int count = Integer.parseInt(cin.nextLine());
        while (count > 0) {
            String str[] = cin.nextLine().split(" ");
            arr = new int[str.length];
            for (int i = 0; i < str.length; i++)
                arr[i] = Integer.parseInt(str[i]);
            int max = 1;
            int f[] = new int[str.length];
            f[0] = 1;
            for (int i = 1; i < str.length; i++) {
                f[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[j] < arr[i] && f[j] + 1 > f[i]) {
                        f[i] = f[j] + 1;
                    }
                }
                if (max <= f[i])
                    max = f[i];
            }
            System.out.println(max);
            count--;
        }
    }
}
