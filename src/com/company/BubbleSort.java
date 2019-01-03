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
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    swap(arr,j+1, j);
                }
            }
    }
}
