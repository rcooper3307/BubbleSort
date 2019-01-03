package com.company;

public class BubbleSort {
    private int sCounter;
    public static void swap(int[]arr, int x, int y)
    {
      int temp;
      temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }
    public BubbleSort(int[]arr)
    {
        while(sCounter > 0)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    swap(arr,i, i+1);
                    sCounter++;
                }
            }
        }



    }
}
