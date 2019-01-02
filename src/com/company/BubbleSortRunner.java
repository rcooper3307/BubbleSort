package com.company;

public class BubbleSortRunner {

    public static void main(String[] args) {
        // Random array of test integers
        int[] testArr = {8,6,7,2,5,3,9};
        //Print of the array before the sort
        System.out.print("Before: ");
        for (int num:testArr) {
            System.out.print(num + " ");
        }

            System.out.println();
            //Sorting method
            BubbleSort.bubbleSort(testArr);

            //Print of the array after the sort
            System.out.print("After: ");
            for (int num:testArr)
            {
                System.out.print(num+" ");
                System.out.println();
        }
    }
}
