package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// 1. WAP to find the duplicates present in an array.
public class Duplicates {

    public static void main(String [] a)
    {
        int arr[] = {11,2,4,6,1,2,11};
        System.out.println(Arrays.toString(naive(arr)));
        System.out.println(intermediate(arr));
    }

    // naive  methods
    // time complexity takes to order of ( sorted t(n) + (n) )
   public static int [] naive(int [] arr)
    {
        int duplicate[] = new int[arr.length/2];
        // using sorting
        Arrays.sort(arr);
        // logic
        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1])
            {
                duplicate[j++] = arr[i];
            }
        }
    return duplicate;
        // print data upto > 0
    }

    // Intermediate Method
    // Time Complexity takes Order of ( T(n) = O(n))
    public static ArrayList intermediate(int [] arr)
    {
        ArrayList list = new ArrayList<Integer>();
        HashSet hashSet = new HashSet<Integer>();

        // copy the element from Array - O(n)
        for (int i = 0; i < arr.length; i++) {
            if(hashSet.contains(arr[i]))
            {
                list.add(arr[i]);
            }
            hashSet.add(arr[i]);
        }

        return list;
    }
}
