package xyz.ganghua.arithmetic.sort;

import java.util.Arrays;

/**
 * 冒泡排序 <br>
 * 进行了两次循环 所以时间复杂度为O(n*n)
 * 
 * @author ganghua
 * @date 2023/03/10
 */
public class BubbleSort implements IArraySort {

    @Override
    public int[] sort(int[] sourceArray) throws Exception {

        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        boolean swap;
        // 总共需要循环数组长度减一次
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            // 每循环一次都要减少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    swap = true;
                }
            }

            if (swap == false) {
                break;
            }
        }
        return arr;
    }

}
