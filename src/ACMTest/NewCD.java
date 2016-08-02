package ACMTest;

import java.util.Scanner;

/**
 * Created by wt on 2016/7/31.
 *
 * Accepted newcoder 出专辑
 */
public class NewCD {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {//注意while处理多个case

            int n = in.nextInt();
            int s = in.nextInt();
            int l = in.nextInt();
            if (n == 1 && s == 1)
                System.out.println(1);
            else {
                int num = (l + 1) / (s + 1) > n ? n : (l + 1) / (s + 1);
                if (num % 13 == 0)
                    num--;
                int count;
                if (n % num == 0)
                    count = n / num;
                else
                    count = n / num + 1;
                if ((n % num) % 13 == 0 && (num - 1) % 13 == 0 && n % num == num - 1)
                    System.out.println(count + 1);
                else
                    System.out.println(count);


            }
        }
    }
}