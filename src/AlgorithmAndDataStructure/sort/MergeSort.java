package AlgorithmAndDataStructure.sort;

/**
 * Created by wt on 2016/5/14.
 */
public class MergeSort {
    public static int count = 0;
    public static void merge(int []a,int left,int middle,int right){
        int []temp = new int[a.length];
        int k = left;
        int i = left;
        int j = middle + 1;
        while(i <= middle && j <= right){
            if(a[i] < a[j])
                temp[k++] = a[i++];
            else{
                temp[k++] = a[j++];
                //count += middle + 1 - i; //用来求取逆序数
            }
        }
        while(i <= middle)
            temp[k++] = a[i++];
        while(j <= right)
            temp[k++] = a[j++];
        for(int t = left;t <= right;t++)
            a[t] = temp[t];
    }
    public static void mergeSort(int []a,int left,int right){
        if(left >= right)
            return;
        int mid = left + (right-left)/2;
        mergeSort(a,left,mid);
        mergeSort(a,mid+1,right);
        merge(a,left,mid,right);
    }

    public static void main(String[] args) {
        int a[] = {4,5,2,1,6,0,3,8,7,9};
        mergeSort(a,0,9);
        for(int i:a)
            System.out.print(i + " ");
        System.out.println();
        System.out.println(count);
    }

}
