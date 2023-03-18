package xyz.ganghua.arithmetic.sort;

import java.util.Arrays;

/**
 * 选择排序 <br>
 * 选择排序，是指定第一为最小或者最大值，进行比较交换
 * 
 * @author ganghua
 * @date 2023/03/10
 */
public class SelectionSort implements IArraySort {

    @Override
    public int[] sort(int[] sourceArray) throws Exception {

        // 对 sourceArray进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

}
