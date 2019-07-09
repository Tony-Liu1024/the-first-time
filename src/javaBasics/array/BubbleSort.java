package javaBasics.array;

import java.util.Arrays;

/*
冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {1, 0, 4, 2};
        arithmetic(arr);
    }

    public static void arithmetic(int [] arr1){

        int temp;

        for (int i = 0; i < arr1.length-1; i++)
            for (int j = 0; j < arr1.length-1-i; j++)
        {
            if (arr1[j] > arr1[j+1])
            {
                temp = arr1[j];
                arr1[j] = arr1[j+1];
                arr1[j+1] = temp;
            }

        }

        System.out.println(Arrays.toString(arr1));

    }
}
