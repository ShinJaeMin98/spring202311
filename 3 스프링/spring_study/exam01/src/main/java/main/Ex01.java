package main;

import config.AppCtx;
import models.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new
                AnnotationConfigApplicationContext(AppCtx.class);
        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("이름이");

        // class 클래스 : class에 대한 정보가 담겨있는 객체
        // 클래스에 대한 구성요소들을 조회할 때 사용
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println(g1 == g2);

        ctx.close();
    }
}
