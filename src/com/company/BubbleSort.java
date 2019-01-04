package com.company;

public class BubbleSort {
    public static void swap(int[]arr, int x, int y)
    {
      int temp;
      temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }
    public static void bubbleSort(int[]arr)
    {
        while(!Check(arr))
       for(int i = 0; i < (arr.length-1); i++)
       {
           if(arr[i] > arr[i+1])
           {
               swap(arr,i,i+1);
           }
       }
    }
    public static boolean Check(int[]arr)
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
