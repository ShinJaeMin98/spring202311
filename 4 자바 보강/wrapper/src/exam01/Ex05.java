package exam01;

import java.util.Optional;

public class Ex05 {
    public static void main(String[] args) {
        String str = "값이 있지렁이";
        //Optional<String> opt = Optional.of(str);
        Optional<String> opt = Optional.ofNullable(str);
        //String str2 = opt.get(); // 값이 없으면 예외 발생
        // String str2 = opt.orElse("기본값");
        // System.out.println(str2);
        /*
        String str2 = opt.orElse(null);
        if(str2 == null) {
            throw new RuntimeException("값이 없음..예외발생..");
        }

         */
        //String str2 = opt.orElseThrow();    // NoSuchElementException
        String str2 = opt.orElseThrow(() -> new RuntimeException("값이 없음.. 예외발생"));
        System.out.println(str2);
    }
}
