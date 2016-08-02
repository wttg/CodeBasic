package ACMTest;

import java.util.Scanner;

/**
 * Created by wt on 2016/8/1.
 */
public class MoveBigBack {
    public static void partation(char a[],int start,int end){

            int small = start - 1;
            for(int index = start;index<end;index++)
                if(a[index] <= 'Z'&&a[index]>='A') {
                    small++;
                    if(small != index)
                        swap(a,small,index);
                }
            small++;
            swap(a,small,end);


        }
        public static void swap(char a[],int i,int j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            while (in.hasNext()) {
                String str = in.nextLine();
                char []a =str.toCharArray();
                partation(a,0,a.length-1);
                System.out.println(String.valueOf(a));
            }
        }
    }

