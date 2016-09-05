package ACMTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wt on 2016/8/6.
 */
public class Second {


    public static boolean isPalindome(String input) {


        StringBuffer stringBuffer = new StringBuffer(input);
        StringBuffer stringBufferRev = stringBuffer.reverse();
        if (stringBufferRev.toString().equals(input))
            return true;
        else
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            StringBuilder  test = new StringBuilder (a);
            int count = 0;

            for(int i = 0;i<a.length()+1;i++){
                if(isPalindome(test.insert(i, b).toString()))
                    count++;
                test = new StringBuilder (a);
            }
            System.out.println(count);
        }
    }
}
