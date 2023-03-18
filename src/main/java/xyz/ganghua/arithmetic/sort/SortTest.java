package xyz.ganghua.arithmetic.sort;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) throws Exception {

        // int[] sourceArray = {3, 38, 15, 36, 47, 40, 5};
        // int left[] = Arrays.copyOfRange(sourceArray, 0, (sourceArray.length / 2));
        // int right[] = Arrays.copyOfRange(sourceArray, (sourceArray.length / 2), sourceArray.length);
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));

        // 冒泡排序
        int[] sourceArray1 = {3, 38, 15, 36, 47, 40, 50, 26, 27, 2, 19, 36};
        IArraySort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(sourceArray1)));

        // 选择排序
        int[] sourceArray2 = {3, 38, 15, 36, 47, 40, 50, 26, 27, 2, 19, 36};
        IArraySort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(sourceArray2)));

        // 归并排序
        int[] sourceArray3 = {3, 38, 15, 36, 47, 40, 50, 26, 27, 2, 19, 36};
        IArraySort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.sort(sourceArray3)));

        // 归并排序2
        int[] sourceArray4 = {3, 38, 15, 36, 47, 40, 50, 26, 27, 2, 19, 36};
        IArraySort mergeSort2 = new MergeSort2();
        System.out.println(Arrays.toString(mergeSort2.sort(sourceArray4)));

        // 快速排序
        int[] sourceArray5 = {3, 38, 15, 36, 47, 40, 50, 26, 27, 2, 19, 36};
        IArraySort quickSort = new QuickSort();
        System.out.println(Arrays.toString(quickSort.sort(sourceArray5)));
    }

}
