package ACMTest;

/**
 * Created by wt on 2016/10/26.
 */
public  class Demo{

    {
        System.out.println("code border");
    }
   static {
        System.out.println("static code border");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Child("x");
    }
}
class Child extends Parent{
    public Child(String name){
        System.out.println(3);
        new Parent(name+"1");
    }
    public Child(){
        System.out.println(4);
    }
}
class  Parent{
    public Parent(){
        System.out.println(1);
    }
    public Parent(String name){
        System.out.println(2);
    }

}

