package AlgorithmAndDataStructure.DynamicProgramming;

import java.util.Scanner;

/**
 * Created by wt on 2016/8/1.
 */
public class LCSP {
    public static void main(String []args) {

        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {

            String test = in.next();

            String lcs = "";
            int opt[][] = new int[test.length() + 1][test.length() + 1];
            for (int i = test.length() - 1; i >= 0; i--)
                for (int j = 0; j <= test.length()-1; j++) {
                    if (test.charAt(j) == test.charAt(i))
                        opt[i][test.length()-1-j] = opt[i + 1][test.length()-j ] + 1;
                    else
                        opt[i][test.length()-1-j] = Math.max(opt[i + 1][test.length()-1-j], opt[i][test.length()-j]);
                }
            int i = 0;
            int j = 0;
            while (i < test.length() && j < test.length())
                if (test.charAt(i) == test.charAt(test.length()-1-j)) {
                    lcs += test.charAt(i);
                    i++;
                    j++;
                } else if (opt[i + 1][j] >= opt[i][j + 1])
                    i++;
                else
                    j++;
            System.out.println(test.length()-lcs.length());
        }
    }
}
