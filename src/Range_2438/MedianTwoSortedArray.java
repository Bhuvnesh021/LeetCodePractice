package Range_2438;

import java.util.Arrays;

public class MedianTwoSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        MedianTwoSortedArray medianTwoSortedArray = new MedianTwoSortedArray();
        double medianSortedArrays = medianTwoSortedArray.findMedianSortedArrays(num1, num2);
        System.out.println(medianSortedArrays);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = merge(nums1, nums2);
        if(merge.length % 2 == 0) {
            int middle = merge.length / 2;
            return (double) (merge[middle] + merge[middle - 1]) / 2;
        }else {
            return merge[((merge.length / 2))];
        }
    }
    private int[] merge(int[] nums1, int[] nums2) {
        int[] sortedArray = new int[nums2.length + nums1.length];

        int fCounter = 0;
        int sCounter = 0;

        int count = 0;
        while (fCounter < nums1.length && sCounter < nums2.length) {
            if(nums1[fCounter] < nums2[sCounter]) {
                sortedArray[count++] = nums1[fCounter++];
            } else if (nums1[fCounter] > nums2[sCounter]){
                sortedArray[count++] = nums2[sCounter++];
            }else {
                sortedArray[count++] = nums1[fCounter++];
                sortedArray[count++] = nums2[sCounter++];
            }
        }
        while (fCounter < nums1.length) {
            sortedArray[count++] = nums1[fCounter++];
        }
        while (sCounter < nums2.length) {
            sortedArray[count++] = nums2[sCounter++];
        }
        return sortedArray;
    }
}
