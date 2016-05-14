package AlgorithmAndDataStructure;

import java.util.LinkedList;

/**
 * Created by wt on 2016/5/12.
 */
public class CardSort {
    public static LinkedList<Integer> card(int n){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1;i <= n;i++){
            list.add(i);
            if(list.size() > 1 && i < n) {
                list.add(list.peekFirst());
                list.pollFirst();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 13;
        LinkedList<Integer> list;
        list = card(n);
        for (int i = 0;i < n;i++){
            System.out.print(list.peekLast());
            System.out.print(" ");
            list.pollLast();

        }

    }
}
