package AlgorithmAndDataStructure.arraymatrix;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个无序数组arr，其中元素可正可负可0，给定一个整数k。求arr
 * 所有子数组中累加和为k的最长子数组长度以及起始位置。
 * Created by wt on 2016/5/6.
 */
public class MaxLength {
    public int[] maxLength(int []arr,int k){
        int []res = new int[2];
        res[0] = res[1] = 0;
        if(arr == null ||arr.length ==0)
            return null;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);//important
        int len = 0;
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
            if(map.containsKey(sum - k)) {
                if(i - map.get(sum - k) > len) {
                    len = i - map.get(sum - k);
                    res[0] = map.get(sum - k) +1;
                    res[1] = len;
                }
                res[1] = len;
            }
            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxLength maxLength = new MaxLength();
        int arr[] = {1,2,1,1,1};
        for (int i:maxLength.maxLength(arr,3))
            System.out.println(i + " ");
    }
}
