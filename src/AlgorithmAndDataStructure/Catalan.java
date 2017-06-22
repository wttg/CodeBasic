package AlgorithmAndDataStructure;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * BUCTOJ 1924 Accepted.
 * Created by wt on 2016/5/8.
 */
public class Catalan {
    public static void main(String[] args) {
        Long catalan[] = new Long[10001];
        catalan[0] = catalan[1] = 1L;

        for(int i = 2; i <= 10000; i++)
        {
            catalan[i] = 0L;
            for(int j = 0; j < i; j++) {
                catalan[i] += (catalan[j] %10000009* catalan[i - 1 - j]%10000009);
                catalan[i] = catalan[i] %10000009;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        while (count > 0){
            System.out.println(catalan[scanner.nextInt()]);
            count--;
        }


    }
}
