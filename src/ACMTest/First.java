package ACMTest;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wt on 2016/8/6.
 */
public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int sum[] = new int[num];
            int a[] = new int [num];
            int b[] = new int [num];
            for(int i = 0;i < num;i++){
                a[i] = in.nextInt();
            }
            for(int i = 0;i < num;i++){
                b[i] = in.nextInt();
            }
            for(int i = 0;i < num;i++){
                sum[i] = a[i] + b[i];
            }
            Arrays.sort(sum);
            System.out.println(sum[0]-2);

        }

    }
}