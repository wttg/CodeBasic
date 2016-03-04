package ACMTest;

import java.util.Scanner;

/**
 * Created by wt on 2016/3/4.
 * BUCT OJ 1035 Accepted
 */
public class CountDataFromString { //"CountDataFromString" need to change "Main"
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String testString = null;
        testString = scan.nextLine();
        int countLetter = 0;
        int countNumber = 0;
        int countSpace = 0;
        int countOthers = 0;
        for(int i = 0;i < testString.length();i++){
            if((testString.charAt(i)>='a'&&testString.charAt(i)<='z')
                    ||(testString.charAt(i)>='A'&&testString.charAt(i)<='Z'))
                countLetter++;
            else if(testString.charAt(i)>='0'&&testString.charAt(i)<='9')
                countNumber++;
            else if(testString.charAt(i) == ' ')
                countSpace++;
            else countOthers++;
        }
        System.out.println(countLetter+" "+countNumber+" "+countSpace+" "+countOthers+" ");
    }
}
