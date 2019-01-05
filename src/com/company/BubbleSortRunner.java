package com.company;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] testArr = SortUtils.randIntArr(10);
        System.out.print("Before: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        long time = System.nanoTime();
        SortUtils.bubbleSort(testArr);
        System.out.print("After: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}