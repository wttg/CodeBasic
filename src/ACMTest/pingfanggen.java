package ACMTest;

import java.util.Scanner;
/**
 * Created by wt on 2016/9/5.
 */
public class pingfanggen {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double sum = 0;
            double m = in.nextDouble();
            double n = in.nextDouble();

            for(int i = 0;i < n;i++) {
                sum += m;
                m = Math.sqrt(m);
            }

            System.out.println(String.format("%.2f", sum));
        }
    }

}
