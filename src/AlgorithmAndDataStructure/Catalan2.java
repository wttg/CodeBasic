package AlgorithmAndDataStructure;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by wt on 2016/5/8.
 */
public class Catalan2 { //time limit
    public static void main(String[] args) {

        BigInteger s1[][] = new BigInteger[2000][1000];
        BigInteger fac[]= new BigInteger[2000];
        BigInteger sumfac = BigInteger.ONE;
        for(int i = 1; i < 2000; i++) {
            sumfac = sumfac.multiply(BigInteger.valueOf(i));
            fac[i] = sumfac;
        }
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        while(count > 0){
            int m =scanner.nextInt();
            int n =scanner.nextInt();
            BigInteger sum ;
            sum = fac[m+n].multiply(BigInteger.valueOf(m-n+1));
            sum = sum.divide(fac[m+1]);
            sum = sum.divide(fac[n]);
            s1[m+n][n] = sum;
            System.out.println(s1[m+n][n].mod(BigInteger.valueOf(10000009)));
            count--;
        }
    }
}
