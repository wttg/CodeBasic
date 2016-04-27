package Junit;

import AlgorithmAndDataStructure.PalindromicString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by wt on 2016/4/24.
 */
@RunWith(Parameterized.class)
public class PalindromicStringTest {
    private PalindromicString palindromicString;
    private String status;
    private String string;
    public PalindromicStringTest(String status,String string){
        this.status = status;
        this.string = string;
    }

    @Before
    public void setUp() throws Exception {
        palindromicString = new PalindromicString();
    }
    @Test
    public void isPalindomeTest(){
        //assertEquals("YES",palindromicString.isPalindome("aba"));
        assertEquals(status,palindromicString.isPalindome(string));
    }

    @Parameterized.Parameters
    public static Collection context(){
        return Arrays.asList(new Object[][]{
            {"YES","aba"},
            {"No","afafasfas"}
        });
    }
}