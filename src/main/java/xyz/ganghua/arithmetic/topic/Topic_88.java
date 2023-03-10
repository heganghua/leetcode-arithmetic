package xyz.ganghua.arithmetic.topic;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 
 * @author ganghua
 * @date 2023/03/09
 */
public class Topic_88 {

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0}, m = 3, nums2[] = {2, 5, 6}, n = 3;
        // merge_my(nums1, m, nums2, n);
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = nums1.length;

        while (n > 0) {
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[--i] = nums1[--m];
            } else {
                nums1[--i] = nums2[--n];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge_my(int[] nums1, int m, int[] nums2, int n) {
        int[] nu3 = new int[m + n];
        if (0 == n) {
            nu3 = nums1;
            System.out.println(Arrays.toString(nu3));
            return;
        } else if (0 == m) {
            nu3 = nums2;
            System.out.println(Arrays.toString(nu3));
            return;
        }

        int i = 0, j = 0, z = 0;

        do {
            int nu1 = nums1[i];
            int nu2 = nums2[j];
            if (nu1 <= nu2) {
                nu3[z] = nu1;
                i++;
            } else {
                nu3[z] = nu2;
                j++;
            }
            z++;

        } while (i <= m && j <= n);

        if (i <= m) {
            while (i < m) {
                nu3[n + 1] = nums2[i];
                n++;
                i++;
            }
        } else if (j <= n) {
            while (j < n) {
                nu3[m + 1] = nums2[j];
                m++;
                j++;
            }
        }
        nums1 = nu3;
        System.out.println(Arrays.toString(nu3));
    }

}
