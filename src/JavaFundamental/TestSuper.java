package JavaFundamental;

/**
 * Created by wt on 2016/3/2.
 * Test super and this
 */
class Base{
    public Base(){
        System.out.println("Base");
    }
}
class Sub extends Base{
    public Sub(){
        super();
        System.out.println("Sub");
    }
}
public class TestSuper {
    public static void main(String[] args){
        Base s = new Sub();
    }
}
