package ACMTest;

import java.util.Scanner;

/**
 * Created by wt on 2016/8/1.
 */
public class WordsJudge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            String []string = new String[num];
            for(int i = 0;i<num;i++){
                string[i] = in.next();
            }
            for(int i = 1;i<num;i++){
                if(string[i].charAt(0) != string[i-1].charAt(string[i-1].length()-1)){
                    System.out.println("No");
                    break;
                }
                if(i == num-1)
                    System.out.println("Yes");
            }

        }
    }
}
