package AlgorithmAndDataStructure;

/**
 * Created by wt on 2016/3/3.
 * KMP Algorithm
 */
public class KMPTest {
    public int[] getNext(String b){
        int len = b.length();
        int j = 0;
        int next[] = new int[len+1];
        next[0] = next[1] = 0;
        for(int i = 1;i < len;i++){
            while (j > 0 && b.charAt(i) != b.charAt(j))
                j = next[j];
            if(b.charAt(i) == b.charAt(j))
                j++;
            next[i+1] = j;
        }
        return next;
    }
    public void search(String original,String sub,int[] next){
        int j = 0;
        for (int i = 0;i < original.length();i++){
            while (j > 0 && original.charAt(i) != sub.charAt(j))
                j = next[j];
            if(original.charAt(i) == sub.charAt(j))
                j++;
            if(j == sub.length()){
                System.out.println("find at position" + (i - j + 2));
                System.out.println(original.subSequence(i - j + 1,i + 1));
                j = next[j];
            }
        }
    }
    public static void main(String[] args){
        KMPTest test = new KMPTest();
        String original = "ABCABCABCABCABCABCABCABCABCABC";
        String sub = "ABCABC";
        test.search(original,sub,test.getNext(sub));
    }
}
