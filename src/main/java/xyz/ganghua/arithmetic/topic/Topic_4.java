package xyz.ganghua.arithmetic.topic;

/**
 * 4. 寻找两个正序数组的中位数
 * 
 * @author ganghua
 * @date 2023/03/09
 */
public class Topic_4 {

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 3}, nums2[] = {2, 5, 6};
        findMedianSortedArrays(nums1, nums2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m + n];

        System.out.println(merge.length);
        return 0;

    }
}
