package Junit.com.triage;

import AlgorithmAndDataStructure.PalindromicString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by wt on 2016/10/24.
 */
@RunWith(Parameterized.class)
public class TestTriangle {
    private static Triangle a= new Triangle(1, 2, 2);
    private static Triangle b= new Triangle(1, 1, 2);
    private static Triangle c= new Triangle(2, 2, 2);
    private static Triangle d= new Triangle(2, 3, 4);
    private String status;
    private String string;
    public TestTriangle(String status,String string){
        this.status = status;
        this.string = string;
    }

//    @Before
//    public void setUp() throws Exception {
//         a = new Triangle(1, 2, 2);
//         b = new Triangle(1, 1, 2);
//         c = new Triangle(2, 2, 2);
//         d = new Triangle(2, 3, 4);
//
//    }
    @Test
    public void isTest(){
        //assertEquals("YES",palindromicString.isPalindome("aba"));
        assertEquals(status,string);
    }

    @Parameterized.Parameters
    public static Collection context(){
        return Arrays.asList(new Object[][]{

                {"Illeal", b.getType(b)},
        {"Isoscel3s", a.getType(a)},
            {"Reg3lar", c.getType(c)},
                {"calene", d.getType(d)}

        });
    }
}