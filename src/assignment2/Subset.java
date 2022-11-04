package assignment2;

import java.util.Arrays;
import java.util.HashSet;

//  6. WAP to check whether an array is a subset of another array.
public class Subset {

    public static void main(String [] a)
    {
        int arr1[]={1,3,1,51,51,56,12,32,76,54,8};
        int arr2[]={3,76,54};
        System.out.println(checkSubsetNaive(arr1,arr2));
        System.out.println(checkSubsetIntermediate(arr1,arr2));
    }

    // Naive Method
    // T(n) = O ( sort t(n) + t(n) )
    public static boolean checkSubsetNaive(int arr1[], int arr2[])
    {
        int flag=0, j=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1.length >= arr2.length)
        {
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == arr2[j])
                {   j++;
                    flag++;
                }
                if(arr2.length == flag) break;
            }
        }else{
            for (int i = 0; i < arr2.length; i++) {
                if(arr2[i] == arr1[j])
                {
                    j++;
                    flag++;
                }
                if(arr1.length == flag) break;
            }
        }
        if(arr1.length == flag || arr2.length == flag) return true;
        return false;
    }


    // Intermediate Level
    // Time Complexity is T(n) = O(n)
    public static boolean checkSubsetIntermediate(int arr1[], int arr2[])
    {
        int flag=0;
        HashSet hashSet = new HashSet();

        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(hashSet.contains(arr2[i]))
            {
                flag++;
            }
        }
        if(arr1.length == flag || arr2.length == flag) return true;
        return false;
    }
}
