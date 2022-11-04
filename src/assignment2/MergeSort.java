package assignment2;

import java.util.Arrays;


// 4. WAP to sort an array using Merge Sort Algorithm.
public class MergeSort {

    public static void main(String[] args) {
        int [] arr={0,158,12,6,5,9,4,120,215,9,9,62,6};
        System.out.print(Arrays.toString(mergesort(arr)));
    }

    // T(n) = 0 ( n.logn )
    static int[] mergesort(int[]arr)
    {
        if(arr.length==1) return arr;

        int mid = arr.length/2;

        int[] left =mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right =mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge2array(left,right);
    }

    // merge two array
    // arr1 , aar2

   public static int[] merge2array(int arr1[] , int arr2[])
   {
       int [] mix = new  int[arr1.length + arr2.length];
       int j=0,k=0,i=0;

       while(i< arr1.length && j< arr2.length)
       {
           if(arr1[i]<arr2[j])
           {
               mix[k]= arr1[i++];
           }else{
               mix[k]= arr2[j++];
           }
           k++;
       }

       // one of array is completed

       while(i<arr1.length)
       {
           mix[k++] = arr1[i++];
       }
       while(j<arr2.length)
       {
           mix[k++] = arr2[j++];
       }

       return mix;
   }

}
