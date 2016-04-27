package AlgorithmAndDataStructure;

import java.util.Scanner;

/**
 * Created by wt on 2016/4/2.
 *
 * about palindromic
 *
 *judge a string is a palindromic
 * after adding a letter
 */
public class PalindromicString {

    public String isPalindome(String input) {
        final String Y = "YES";
        final String N = "No";
        int length = input.length();
        StringBuffer stringBuffer = new StringBuffer(input);
        for (int i = 0; i < length; i++) {
            stringBuffer.deleteCharAt(i);
            String temp = stringBuffer.toString();
            if (stringBuffer.reverse().toString().equals(temp))
                return Y;
            else {
                stringBuffer = new StringBuffer(input);
            }
        }
        return N;
    }


    public static void main(String[] args) {

        String input;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            input = cin.next();
            System.out.println(new PalindromicString().isPalindome(input));
        }

    }
}