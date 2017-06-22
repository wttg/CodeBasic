package ACMTest;

/**
 * Created by wt on 2016/10/26.
 */
public class TestCountOne {
    public static void main(String[] args) {

        System.out.println(fun(9999));
    }
    static int fun(int x){
        int count = 0;
        while(x!=0){
            count++;
            x = x&(x-1);
        }
        return count;
    }

}
