package ACMTest;

/**
 * Created by wt on 2016/8/2.
 */
class X {
    {System.out.print("1");}
    {System.out.print("2");}
    Y y=new Y();

    public X(){
        System.out.print("X");
    }


}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Z extends X {
    {
        System.out.print("3");
    }

    Y y = new Y();

    public Z() {
        System.out.print("Z");
    }

    {
        System.out.print("4");
    }

    public static void main(String[] args) {
        new Z();
    }
}