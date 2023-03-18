package xyz.ganghua.arithmetic.sort;

import java.util.Arrays;

/**
 * 归并排序<br>
 * 归并排序采用的是分儿治之，递归将数组分为两边，使两边都有序，最后合并
 * 
 * 
 * @author ganghua
 * @date 2023/03/13
 */
public class MergeSort2 implements IArraySort {

    @Override
    public int[] sort(int[] sourceArray) throws Exception {

        int arr[] = Arrays.copyOf(sourceArray, sourceArray.length);

        // 推出条件
        if (arr.length < 2) {
            return arr;
        }

        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    public static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];
        int i = 0;

        while (left.length > 0 && right.length > 0) {
            if (left[0] < right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        for (int x = 0; x < left.length; x++) {
            result[i++] = left[x];
        }

        for (int y = 0; y < right.length; y++) {
            result[i++] = right[y];
        }

        return result;
    }

}
