package demo3;

import java.util.Arrays;

public class Car {
    public static void main(String[] args) {

        int[] a = {23, 22, 10, 33, 2, 9, 20, 5, 77, 22, 3, 99, 55, 33, 24};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int index = divide(array, begin, end);
        quickSort(array, begin, index - 1);
        quickSort(array, index + 1, end);
    }

    public static int divide(int[] array, int begin, int end) {
        int k = array[begin];
        while (begin < end) {
            while (begin < end && array[end] >= k) {
                end--;
            }
            array[begin] = array[end];
            while (begin < end && array[begin] <= k) {
                begin++;
            }
            array[end] = array[begin];
        }
        array[begin] = k;
        return begin;
    }
}
