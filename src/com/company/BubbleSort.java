package com.company;

public class BubbleSort {
    private int sCounter;
    public static void swap(int[]arr, int i, int j)
    {
      int temp;
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    public BubbleSort(int[]arr)
    {
        while(sCounter > 0)
        {
            for(i = 0; i < arr.length; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    swap(arr,i,i+1);
                    sCounter++;
                }
            }
        }



    }
}
