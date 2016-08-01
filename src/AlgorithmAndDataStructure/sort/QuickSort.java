package AlgorithmAndDataStructure.sort;

import java.util.Scanner;

/**
 * Created by wt on 2016/5/2.
 */
public class QuickSort {
    int arr[];
    public void quickSort(int arr[],int left,int right){
        if(left > right)
            return;
        int temp = arr[left]; //key
        int i = left;
        int j = right;
        while (i != j){
            while (arr[j] >= temp && i < j)//it must from right to left!!
                j--;
            while (arr[i] <= temp && i < j)
                i++;
            if(i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    public static void main(String args[]){
        QuickSort quickSort = new QuickSort();

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        quickSort.arr = new int[count];
        for(int i = 0; i < count;i++){
            quickSort.arr[i] = scanner.nextInt();
        }

        System.out.println(count);
        quickSort.quickSort(quickSort.arr,0,count-1);
        for (int i:quickSort.arr)
            System.out.print(i + " ");
    }
}
