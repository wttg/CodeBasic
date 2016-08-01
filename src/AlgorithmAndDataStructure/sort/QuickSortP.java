package AlgorithmAndDataStructure.sort;

/**
 * Created by wt on 2016/7/30.
 */
public class QuickSortP {

    public static int partation(int a[],int start,int end){

        int small = start - 1;
        for(int index = start;index<end;index++)
            if(a[index] < a[end]) {
                small++;
                if(small != index)
                    swap(a,small,index);
            }
        small++;
        swap(a,small,end);
        return small;

    }
    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void quicksort(int a[],int start,int end){
        if(start == end)
            return;
        int index = partation(a,start,end);
        if(index > start)
            quicksort(a,start,index-1);
        if(index < end)
            quicksort(a,index+1,end);
    }



    public static void main(String[] args) {
        int[] a = {3,4,5,5,2};
        quicksort(a,0,4);
        for(int i:a)
            System.out.print(i+" ");
    }
}
