package JavaFundamental;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by wt on 2016/3/23.
 */
public class TestLambda {
    public static void main(String[] args){
        array array = new array();
        int[] test = {1,2,3,4,5,6,7,9};
        int[] target = new int[8];
        Predicate<Integer> a = (d) -> d > 3;
        Consumer<array> b = (test2) -> test2.target = 100;


        for(int i = 0;i<8;i++)
            if(a.test(test[i])) {
                b.accept(array);
                System.out.println(array.target);
            }

    }
//    public static Predicate<String> test(){
//         return  (test) ->test.equals("g");
//    }
}
class array{
         int target;
        }
