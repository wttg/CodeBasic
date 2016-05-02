package AlgorithmAndDataStructure.DynamicProgramming;


import java.util.Scanner;

/**
 *
 * BUCT OJ 2051 Accepted.
 * Created by wt on 2016/4/27.
 */
public class LongestCommonSubsequence { //change to Main
//    public String LCS(String test,String sub){
//        String lcs = "";
//        int opt[][] = new int[test.length() + 1][sub.length() + 1];
//        for(int i = test.length()-1;i >= 0;i--)
//            for (int j = sub.length()-1;j >= 0;j--){
//                if(sub.charAt(j) == test.charAt(i))
//                    opt[i][j] = opt[i+1][j+1] + 1;
//                else
//                    opt[i][j] = Math.max(opt[i+1][j],opt[i][j+1]);
//            }
//        int i = 0;
//        int j = 0;
//        while (i < test.length()&&j < sub.length())
//            if(test.charAt(i) == sub.charAt(j)){
//                lcs += test.charAt(i);
//                i++;
//                j++;
//            }else if(opt[i+1][j] >= opt[i][j+1])
//                i++;
//            else
//                j++;
//        return lcs;
//    }
    public static void main(String []args) throws Exception{

        Scanner cin=new Scanner(System.in);
        String test=cin.next();
        String sub=cin.next();
        String lcs = "";
        int opt[][] = new int[test.length() + 1][sub.length() + 1];
        for(int i = test.length()-1;i >= 0;i--)
            for (int j = sub.length()-1;j >= 0;j--){
                if(sub.charAt(j) == test.charAt(i))
                    opt[i][j] = opt[i+1][j+1] + 1;
                else
                    opt[i][j] = Math.max(opt[i+1][j],opt[i][j+1]);
            }
        int i = 0;
        int j = 0;
        while (i < test.length()&&j < sub.length())
            if(test.charAt(i) == sub.charAt(j)){
                lcs += test.charAt(i);
                i++;
                j++;
            }else if(opt[i+1][j] >= opt[i][j+1])
                i++;
            else
                j++;
        System.out.println(lcs.length());

    }
}
