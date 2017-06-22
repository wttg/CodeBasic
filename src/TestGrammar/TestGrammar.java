package TestGrammar;

/**
 * Created by wt on 2016/3/4.
 */
public class TestGrammar {
    public static void main(String[] args){
//        int a[] = {1,2,3,4};
//        for (int i:a)
//        System.out.println(i);
        tryTest();

    }
    static void tryTest(){
        int i = 1;
        try{
            i++;
            System.out.println("call me");
        }finally {
            i++;
            System.out.println("call me too");
        }
    }

}
