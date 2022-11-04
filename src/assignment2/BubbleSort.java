package assignment2;

import java.util.Arrays;

//  3. WAP to sort an array using Bubble Sort Algorithm.
public class BubbleSort {

    public static void main(String[] args) {

        int arr [] ={3,54,2,54,23,54,79,2,1,98,6,45};
        bubbleSortAsc(arr);
        System.out.println(Arrays.toString(arr));

    }


    // complexity of Bubble sort is T(n)= 0(n^2)
    static void bubbleSortAsc(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    // complexity of Bubble sort is T(n)= 0(n^2)
    static void bubbleSortDesc(int [] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] > arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
