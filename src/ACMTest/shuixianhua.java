package ACMTest;

import java.util.Scanner;

/**
 * Created by wt on 2016/9/5.
 */
public class shuixianhua {
    public static void main(String[] args) {
        pingfanggen te = new pingfanggen();
        te.a = "";
        int a[] = new int [1000];
        a[100] = 0;

        for(int i = 100;i<=999;i++){
            String test = String.valueOf(i);
            int hun =  Integer.parseInt(String.valueOf(test.charAt(0)));
            int ten = Integer.parseInt(String.valueOf(test.charAt(1)));
            int ge = Integer.parseInt(String.valueOf(test.charAt(2)));
            if(i == hun*hun*hun+ten*ten*ten+ge*ge*ge)
                a[i] = a[i-1]+1;

        }
           Scanner in = new Scanner(System.in);
       while (in.hasNext()) {
           int m = in.nextInt();
           int n = in.nextInt();
           int count = 0;
           for(int i= m;i <= n;i++){
               if(a[i] >= 1)
                   System.out.print(i+" ");
               else
                   count++;
           }
           if(count == n-m+1)
               System.out.println("no");
       }
    }
}
