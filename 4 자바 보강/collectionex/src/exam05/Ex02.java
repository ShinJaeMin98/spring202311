package exam05;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40};
        int[] nums2 = {10, 20, 30, 40};

        boolean isSame = Arrays.equals(nums1, nums2);
        System.out.println(isSame);
    }
}
