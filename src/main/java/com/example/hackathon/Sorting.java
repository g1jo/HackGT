package com.example.hackathon;
import java.util.*;

public class Sorting {
    private int[] desired;

    /**
     * Creates a sorting object
     * @param desired clothes
     */
    public Sorting(int[] desired) {
        this.desired = desired;
    }

    /**
     * Merge sort for array of clothing values
     * @param arr of clothes
     * @return sorted array of Clothing values
     */
    public Clothing[] mergeSort(Clothing[] arr) {
        if (arr.length < 2) {
            Clothing[] ex = new Clothing[1];
            return ex;
        }
        Clothing[] leftSub = new Clothing[arr.length / 2];
        for (int i = 0; i < leftSub.length; i++) {
            leftSub[i] = arr[i];
        }
        Clothing[] rightSub = new Clothing[arr.length - leftSub.length];
        for (int i = 0; i < rightSub.length; i++) {
            rightSub[i] = arr[i + leftSub.length];
        }
        mergeSort(leftSub);
        mergeSort(rightSub);
        return merge(arr, leftSub, rightSub);
    }

    /**
     * Helper for merge sort
     * @param arr to be sorted
     * @param leftSub part of array
     * @param rightSub part of array
     * @return final sorted array
     */
    private Clothing[] merge(Clothing[] arr, Clothing[] leftSub, Clothing[] rightSub) {
        int i = 0, j = 0, k = 0;
        while (i < leftSub.length && j < rightSub.length) {
            if (compare(leftSub[i], rightSub[j]) <= 0) {
                arr[k] = leftSub[i];
                i++;
            } else {
                arr[k] = rightSub[j];
                j++;
            }
            k++;
        }
        while (i < leftSub.length) {
            arr[k] = leftSub[i];
            i++;
            k++;
        }
        while (j < rightSub.length) {
            arr[k] = rightSub[j];
            j++;
            k++;
        }
        return arr;
    }

    /**
     * Compares two clothing items
     * @param cloth1 to be compared
     * @param cloth2 to be compared
     * @return positive if cloth1 greater, negative if cloth2 greater, 0 if =
     */
    private int compare(Clothing cloth1, Clothing cloth2) {
    int[] cloth1Arr = toArr(cloth1);
    int[] cloth2Arr = toArr(cloth2);
    int[] diff1 = diffFromDesired(desired, cloth1Arr);
    int[] diff2 = diffFromDesired(desired, cloth2Arr);
    int sum1 = sum(diff1);
    int sum2 = sum(diff2);
    return sum1 - sum2;
    }

    /**
     * Finds how much an item differs from wanted item
     * @param desired item
     * @param item current item
     * @return array of difference from desired
     */
    private int[] diffFromDesired(int[] desired, int[] item) {
        int[] diff = new int[desired.length];
        for (int i = 0; i < desired.length; i++) {
            diff[i] = desired[i] - item[i];
        }
        return diff;
    }

    /**
     * Converts clothing object to an array
     * @param clothing to be converted to array
     * @return array representing clothing object
     */
    private int[] toArr(Clothing clothing) {
        int[] arr = new int[4];
        arr[0] = clothing.rain() ? 1 : 0;
        arr[1] = clothing.getStyleRange();
        arr[2] = clothing.getTempRange();
        arr[3] = toInt(clothing.getColor());
        return arr;
    }

    /**
     * Convert color to ints
     * @param color of item
     * @return int for each color
     */
    private int toInt(String color) {
        switch (color) {
            case "white":
                return 1;
            case "black":
                return 2;
            case "gray":
                return 3;
            case "red":
                return 4;
            case "orange":
                return 5;
            case "yellow":
                return 6;
            case "green":
                return 7;
            case "blue":
                return 8;
            case "purple":
                return 9;
            case "navy":
                return 10;
            case "brown":
                return 11;
        }
        return 0;
    }

    /**
     * Finds the sum of the array
     * @param arr to be summed
     * @return sum of an array
     */
    private int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Combine two arrays of clothes
     * @param arr1 first array to be combined
     * @param arr2 second array to be combined
     * @return combined array of clothes
     */
    private Clothing[] concat(Clothing[] arr1, Clothing[] arr2) {
        Clothing[] arr = new Clothing[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i + arr1.length] = arr2[i];
        }
        return arr;
    }
}
