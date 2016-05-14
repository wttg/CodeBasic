package AlgorithmAndDataStructure;

import java.util.LinkedList;

/**
 * Created by wt on 2016/5/11.
 */
public class MaxWindow {
    public static int[] getMaxWindow(int []arr,int w){
        if(arr == null || arr.length < 1||w < 1)
            return null;
        int []res = new int[arr.length - w + 1];
        int index = 0;
        LinkedList<Integer> qmax = new LinkedList<>();
        for(int i = 0;i < arr.length;i++){
            while(!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[i])
                qmax.pollLast();
            qmax.addLast(i);
            if(qmax.peekFirst() <= i - w)
                qmax.pollFirst();
            if(i >= w -1)
                res[index++] = arr[qmax.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,5,4,3,3,6,7};
        for (int i:getMaxWindow(arr,3))
            System.out.print(i+" ");
    }
}
