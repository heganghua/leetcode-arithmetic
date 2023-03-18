package xyz.ganghua.arithmetic.sort;

/**
 * 归并排序<br>
 * 归并排序采用的是分儿治之，递归将数组分为两边，使两边都有序，最后合并 <br>
 * 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列<br>
 * 设定两个指针，最初位置分别为两个已经排序序列的起始位置<br>
 * 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置<br>
 * 重复步骤3直到某一指针到达序列尾<br>
 * 将另一序列剩下的所有元素直接复制到合并序列尾<br>
 * 时间复杂度:O(nlogn) 。代价是需要额外的内存空间。 <br>
 * 空间复杂度：O(n)
 * 
 * @author ganghua
 * @date 2023/03/13
 */
public class MergeSort implements IArraySort {

    @Override
    public int[] sort(int[] sourceArray) throws Exception {
        int[] temp = new int[sourceArray.length];
        internalMergeSort(sourceArray, temp, 0, sourceArray.length - 1);

        return sourceArray;
    }

    public static void internalMergeSort(int arr[], int temp[], int left, int right) {

        if (left < right) {
            // 默认四舍五入
            int middle = (left + right) / 2;
            internalMergeSort(arr, temp, left, middle);
            internalMergeSort(arr, temp, middle + 1, right);
            mergeSortedArray(arr, temp, left, middle, right);
        }
    }

    public static void mergeSortedArray(int arr[], int temp[], int left, int midlle, int right) {

        int i = left;
        int j = midlle + 1;
        int k = 0;

        while (i <= midlle && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= midlle) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = 0; i < k; i++) {
            arr[left + i] = temp[i];
        }
    }

}
