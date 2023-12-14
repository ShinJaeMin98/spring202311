package exam05;

import java.util.*;

public class Ex07 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("이름2");
        names.add("이름1");
        names.add("이름4");
        names.add("이름3");

        Collections.sort(names, Comparator.reverseOrder());    // 내림차순 정렬
        System.out.println(names);

    }
}
