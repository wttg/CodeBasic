package AlgorithmAndDataStructure.DynamicProgramming;

/**
 * Created by wt on 2016/4/28.
 */
import java.util.*;

public class AllLCS{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        while(count>0){
            String str1 = sc.next();
            String str2 = sc.next();
            LCS lcs = new LCS(str1, str2);
            int max = lcs.LCSLength();
            lcs.printAll();
            System.out.println(max+" "+lcs.count);
            count--;

        }


    }

}

class LCS {
    int count = 0;
    String source;
    String target;
    int[][] c;
    int[][] last1;
    int[][] last2;
    int lcsLength;
    char[] tmp;
    String alphabet;
    HashSet<String> set = new HashSet<String>();

    public LCS() {
    }

    public LCS(String s, String t) {
        this.source = s;
        this.target = t;
    }

    public int LCSLength() {
        int m = source.length();
        int n = target.length();
        c = new int[m+1][n+1];

        c[0][0] = 0;
        for(int i = 1; i <= m; ++i) {
            c[i][0] = 0;
        }
        for(int j = 1; j <= n; ++j) {
            c[0][j] = 0;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(source.charAt(i-1) == target.charAt(j-1)) {
                    c[i][j] = c[i-1][j-1] + 1;
                } else if(c[i-1][j] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                } else {
                    c[i][j] = c[i][j-1];
                }

            }
        }
        return lcsLength = c[m][n];
    }

    private void lastIndexOf(String s, int[][] last) {
        for (int j = 0; j < alphabet.length(); ++j) {
            char c = alphabet.charAt(j);
            for (int i = 1; i <= s.length(); ++i) {
                int lastIndex;
                for (lastIndex = i; lastIndex >= 1; --lastIndex) {
                    if(c == s.charAt(lastIndex-1)) {
                        last[i][j] = lastIndex;
                        break;
                    }
                }
                if(lastIndex <= 0) {
                    last[i][j] = 0;
                }
            }
        }
    }

    private void backTraceAll(int index1, int index2, int len) {
        if(len <= 0) {
            String str = new String(tmp);
            set.add(str);
            count++;
            if(count >= 2012)
                count = count % 2012;
            return;
        }
        if(index1 > 0 && index2 > 0) {
            for(int j = 0; j < alphabet.length(); ++j) {
                int t1 = last1[index1][j];
                int t2 = last2[index2][j];
                if(c[t1][t2] == len) {
                    tmp[len-1] = alphabet.charAt(j);
                    backTraceAll(t1-1, t2-1, len-1);
                }
            }
        }
    }

    public void printAll() {
        int m = source.length();
        int n = target.length();


        HashSet<Character> alpha = new HashSet<Character>();
        for(int i = 0; i < m; ++i) {
            alpha.add(source.charAt(i));
        }
        for(int j = 0; j < n; ++j) {
            alpha.add(target.charAt(j));
        }
        int length = alpha.size();
        Character[] characters = new Character[length];
        alpha.toArray(characters);
        char[] chars = new char[length];
        for(int i = 0; i < length; ++i) {
            chars[i] = characters[i];
        }
        alphabet = new String(chars);

        last1 = new int[m+1][alphabet.length()];
        last2 = new int[n+1][alphabet.length()];

        lastIndexOf(source, last1);
        lastIndexOf(target, last2);
        tmp = new char[lcsLength];
        backTraceAll(m, n, lcsLength);
    }


}

