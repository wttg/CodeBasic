package AlgorithmAndDataStructure;

/**
 * Created by wt on 2016/4/27.
 * two kinds of methods
 * one is followed
 * the other is open the comment and comment line 45
 */
public class KMP {
    public int[] getNext(String subString){
        int j = 0;
        int k = -1;
        int next[] = new int[subString.length()];
        next[0] = -1;
        while(j < subString.length()-1){
            if(k == -1 || subString.charAt(k) == subString.charAt(j)){
                j++;
                k++;
//                if(subString.charAt(j)== subString.charAt(k))
//                    next[j] = next[k];
//                else
                    next[j] = k;
            }
            else
                k = next[k];
        }
        return next;

    }
    public void searchKMP(String sub,String test){
        int []next = getNext(sub);
        int i = 0;
        int j = 0;
        while (i < test.length()&&j < sub.length()){
            if (j == -1||sub.charAt(j)==test.charAt(i)){
                j++;
                i++;
            }
            else
                j = next[j];
            if(j == sub.length()) {
                System.out.println("find at position" + (i - j + 1));
//                i = i - j + 1;
//                j = 0;
                j = next[j-1]+1;
            }
        }

    }
    public static void main(String []args){
        KMP kmp = new KMP();

        String original = "ABCABCABCABCABCABCABCABCABCABC";
        String sub = "ABCABC";

        kmp.searchKMP(sub,original);
    }
}
