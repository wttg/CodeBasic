package ACMTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by wt on 2016/8/1.
 */
public class FIFO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int count = 0;
            int n = in.nextInt();
            int m = in.nextInt();
            int []a = new int[m];

            LinkedList<Integer> linkedList = new LinkedList<>();

            int j = 0;
            for(int i = 0;i < m; i++){
                a[i] = in.nextInt();
                if(!linkedList.contains(a[i])&&linkedList.size() == n){
                    linkedList.pollFirst();
                    linkedList.add(a[i]);
                    count++;
                }
                if(!linkedList.contains(a[i])&&linkedList.size() < n){
                    linkedList.add(a[i]);
                    count++;
                }

            }
            System.out.println(count);

            }


        }
    }

