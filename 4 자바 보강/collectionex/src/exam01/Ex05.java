package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");


        Iterator<String> iter = names.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        iter = names.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        /*
        for(String name : names) {  // 향상된 for 문 - 컬랙션, 배열
            System.out.println(name);
        }

         */
        //names.forEach(System.out::println);
    }
}
