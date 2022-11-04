package assignment2;


import java.util.Arrays;

//  2. WAP to sort an array using Quick Sort Algorithm.
public class QuickSort {

    public static void main(String[] args) {
        int [] arr={0,158,12,6,5,9,4,120,215,9,9,62,6};
        Qsort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));

    }
    static void Qsort(int[]arr, int low , int high)
    {
        if(low>=high) return;
        int s=low,e=high;
        int mid= s + (e - s) / 2;
        int pivot=arr[mid];

        while(s<=e)
        {
            while(arr[s]<pivot) s++;
            while(arr[e]>pivot) e--;

            if(s<=e)
            { // swap
                int temp =arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                e--; s++;
            }
        }

        Qsort(arr,low,e);
        Qsort(arr,s,high);

    }
}