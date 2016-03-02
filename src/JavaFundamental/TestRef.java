package JavaFundamental;

/**
 * Created by wt on 2016/3/1.
 *
 * clone method
 */
class Obj{
    public void setStr(String str){
        this.str = str;
    }
    private String str = "default value";
    public String toString(){ //toString method
        return str;
    }
}
public class TestRef {
    private Obj aObj = new Obj();
    private int aInt = 0;
    public Obj getAObj(){
        return aObj;
    }
    public int getAInt(){
        return aInt;
    }
    public void changeObj(Obj inObj){
        inObj.setStr("changed value");
    }
    public void changeInt(int inInt){
        inInt = 1;
    }
    public static void main(String[] args){
        TestRef oRef = new TestRef();
        System.out.println("*******************Test clone******************");
        System.out.println("Before call changeObj():"+oRef.getAObj());
        oRef.changeObj(oRef.getAObj());
        System.out.println("After call changeObj():"+oRef.getAObj());
        System.out.println("*****************Basic Data Type***************");
        System.out.println("Before call changeInt():"+ oRef.getAInt());
        oRef.changeInt(oRef.getAInt());
        System.out.println("After call changeInt():"+oRef.getAInt());
    }
}
