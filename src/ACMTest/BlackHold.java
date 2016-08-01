package ACMTest;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wt on 2016/7/31.
 *
 * Accepted in newcoder 1019 数字黑洞
 */
public class BlackHold { //change to Main

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {//注意while处理多个case
            String num = in.next();
            if(num.length()==1)
                num = "000"+num;
            if(num.length()==2)
                num = "00"+num;
            if(num.length()==3)
                num = "0"+num;

            if(num.charAt(0) == num.charAt(1)&&num.charAt(2) == num.charAt(3)&&num.charAt(0) == num.charAt(2)
                    &&num.charAt(1) == num.charAt(3)&&num.charAt(0) == num.charAt(3)&&num.charAt(2) == num.charAt(1))
                System.out.println(num+" "+"-"+" "+num+" "+"="+" "+"0000");
            else{
                //while(num)
                int result = 0;
                while (result != 6174){
                    char [] charArr = num.toCharArray();
                    Arrays.sort(charArr);
                    char[] revArr = new char[4];
                    revArr[0] = charArr[3];
                    revArr[1] = charArr[2];
                    revArr[2] = charArr[1];
                    revArr[3] = charArr[0];

                    result = Integer.parseInt(String.valueOf(revArr))-Integer.parseInt(String.valueOf(charArr));
                    System.out.println(String.valueOf(revArr)+" "+"-"+" "+String.valueOf(charArr)+" "+"="+" "+result);
                    num = String.valueOf(result);
                    if(num.length()<4)
                        num = "0"+num;
                }
            }
        }
    }
}