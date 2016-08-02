package ACMTest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by wt on 2016/7/29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (in.hasNext()) {//注意while处理多个case

            String s1 = "";
            String s2 = "";
            String a = in.next();
            String da = in.next();
            String b = in.next();
            String db = in.next();

            char ca = da.charAt(0);
            for(int j=0;j<a.length();j++)
                if(a.charAt(j) == ca)
                    s1+=da;


            char cb = db.charAt(0);
            for(int j=0;j<b.length();j++)
                if(b.charAt(j) == cb)
                    s2+=db;

            BigDecimal num1=new BigDecimal(s1);
            BigDecimal num2=new BigDecimal(s2);

            System.out.println(num1.add(num2));

            }





        }
    }




