package AlgorithmAndDataStructure.DynamicProgramming;

/**
 * Created by wt on 2016/4/28.
 */
public class LongestCommonSubstring {
    public static void main(String []args){

        String str1 = "tasfasfasgasga";
        String str2 = "gst5ewswfasfasfatga";
        int x=0,y=0;//each end of string
        int opt[][] = new int[str1.length()+1][str2.length()+1];
        int max = 0;

        //max large
       // for(int i = 0;i < str1.length()+1;i++)
      //      opt[i][0] = 0;
     //   for(int i = 0;i < str2.length()+1;i++)
       //     opt[0][i] = 0;
        System.out.println(opt[0][0]);
        for(int i = 1;i < str1.length()+1;i++) {
            for (int j = 1; j < str2.length() + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    opt[i][j] = opt[i - 1][j - 1] + 1;
                else
                    opt[i][j] = 0;
                if(opt[i][j] > max){
                    max = opt[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        //print LCS
        int i = x - 1;
        int j = y - 1;
        int k = max;
        char s[] = new char[max];

        while(i >= 0&&j >= 0){
            if(str1.charAt(i) == str2.charAt(j)){
                k--;
                s[k] = str1.charAt(i);
                i--;
                j--;
            }
            else
                break;
        }
        for(char n:s)
            System.out.print(n);

        System.out.println(max);


    }
}
