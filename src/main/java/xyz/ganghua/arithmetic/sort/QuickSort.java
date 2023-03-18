package xyz.ganghua.arithmetic.sort;

/**
 * 快速排序
 * 
 * @author ganghua
 * @date 2023/03/14
 */
public class QuickSort implements IArraySort {

    @Override
    public int[] sort(int[] sourceArray) throws Exception {

        qsort(sourceArray, 0, sourceArray.length - 1);

        return sourceArray;
    }

    private static void qsort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = partition(arr, low, high);
        qsort(arr, low, pivot - 1); // 递归排序左子数组
        qsort(arr, pivot + 1, high); // 递归排序右子数组
    }

    /**
     * int[] sourceArray5 = {3, 38, 15, 36, 47, 40, 50, 26, 27, 2, 19, 36};
     * 
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private static int partition(int[] arr, int low, int high) {
        // System.out.println("low: " + low + " high: " + high);
        // 基准
        int pivot = arr[low];
        while (low < high) {

            while (low < high && arr[high] >= pivot) {
                high--; // 从右向左找第一个小于pivot的数
            }
            arr[low] = arr[high];

            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;

        // System.out.println("low: " + low + " high: " + high + " arr[low]: " + arr[low] + " arr[high]: " + arr[high]);
        return low;
    }

}
