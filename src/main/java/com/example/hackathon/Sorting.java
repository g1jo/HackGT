package com.example.hackathon;
import java.util.*;

public class Sorting {
    private ArrayList<Clothing> sorted = new ArrayList<Clothing>();
    /**
     * Creates a sorting object using Singleton design
     */
    private static Sorting sorting;
    private Sorting() {}
    public static Sorting getSorting() {
        if (sorting == null) {
            sorting = new Sorting();
        }
        return sorting;
    }


    /**
     * Finds how much an item differs from wanted item
     * @param desired
     * @param item
     * @return array of difference from desired
     */
    public int[] diffFromDesired(int[] desired, int[] item) {
        int[] diff = new int[desired.length];
        for (int i = 0; i < desired.length; i++) {
            diff[i] = desired[i] - item[i];
        }
        return diff;
    }

    /**
     * Compares two clothing items
     * @param cloth1
     * @param cloth2
     * @return positive if cloth1 greater, negative if cloth2 greater, 0 if =
     */
    private int compareClothes(Clothing cloth1, Clothing cloth2) {
        int[] cloth1Arr = toVector(cloth1);
        int[] cloth2Arr = toVector(cloth2);
        int sum1 = sum(cloth1Arr);
        int sum2 = sum(cloth2Arr);
        return sum1 - sum2;
    }

    /**
     * Converts clothing object to an array
     * @param clothing
     * @return array representing clothing object
     */
    private int[] toVector(Clothing clothing) {
        int[] arr = new int[4];
        arr[0] = clothing.rain() ? 1 : 0;
        arr[1] = clothing.getStyleRange();
        arr[2] = clothing.getTempRange();
        arr[3] = toInt(clothing.getColor());
        return arr;
    }

    /**
     * Convert color to ints
     * @param color
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
     * @param arr
     * @return sum of an array
     */
    private int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
