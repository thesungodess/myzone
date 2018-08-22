package com.imgeek.algorithm;

/**
 * auth:    xiemin
 * date:    2018-08-05
 * desc:    快速排序
 */

public class QuickSort extends MySort{

    public QuickSort(Sort sort) {
        super(sort);
    }

    @Override
    public void sort(int[] ints) {
        sort(ints,0,ints.length - 1);
    }

    private void sort(int[] arr, int start, int end) {
        boolean switchTag = false;
        int i = start, j = end;

        while (true) {
            if (i >= j) {
                break;
            }

            if (compare(arr[i], arr[j])) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                switchTag = !switchTag;
            }

            if (switchTag) {
                i++;
            } else {
                j--;
            }
        }

        if (start < i)
            sort(arr, start, i - 1);
        if (i < end)
            sort(arr, i + 1, end);

        return;
    }

    public void showForeach(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(String.valueOf(arr[i]).concat(" "));
        }
    }
}