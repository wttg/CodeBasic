package ACMTest;

import java.util.Scanner;

/**
 * Created by wt on 2016/8/6.
 */
public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int w = in.nextInt();
            int h = in.nextInt();
            int some = 0;
            int row = h/4;
            some += row *w*2;
            if(h%4 == 1||h%4 == 2){
                some += w/4 *2*h%4;
                if(w%4 == 1 || w%4 == 2)
                    some += w%4;
                if(w%4 == 3)
                    some += 2;
            }
            if(h%4 == 3){
                some += w/4 *2*h%4;
                if(w%4 == 1 || w%4 == 2)
                    some += w/4 *2;
                if(w%4 == 3)
                    some = w/4 *2 + 1;
            }
            System.out.println(some);
        }
    }
}
