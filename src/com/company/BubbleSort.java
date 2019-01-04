package com.company;

public class BubbleSort {
    public static void Sort(int i, int j){
        int temp = 0;
        i =0;
        j =0;
        int []beforeArr = testArr;
        for (i=0;i<testArr.length -1;i++){
            for (j=0;j<testArr.length-1-i;j++){
                if(testArr[j]>testArr[j+1]){
                    temp=testArr[j];
                    testArr[j]= testArr[j+1];
                    testArr[j+1]=temp;

                }
            }
        }
        int[]newArr = testArr;
    }
}
