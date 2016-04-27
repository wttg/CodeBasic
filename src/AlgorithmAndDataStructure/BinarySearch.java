package AlgorithmAndDataStructure;

/**
 * Created by wt on 2016/4/27.
 */
public class BinarySearch {
    public int binarySearch(int []a,int goal){
        int low = 0;
        int high = a.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(a[mid] < goal)
                low = mid + 1;
            else if(a[mid] > goal)
                high = mid -1;
            else
                return mid;
        }
        return -1;

    }

    public static void main(String []args){
        BinarySearch binarySearch = new BinarySearch();
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int goal = 6;
        System.out.println(binarySearch.binarySearch(a,goal));
    }
}
