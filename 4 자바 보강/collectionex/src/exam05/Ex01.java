package exam05;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3");

        System.out.println(names);

        int[] nums = new int[10];
        Arrays.fill(nums, 7);

        System.out.println(Arrays.toString(nums));
    }
}
