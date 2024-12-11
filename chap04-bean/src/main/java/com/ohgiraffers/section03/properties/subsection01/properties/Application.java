package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.section02.initdestroy.subsection02.annotation.ContextConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);

        String[] beanNames = context.getBeanDefinitionNames();

        for (String str : beanNames){
            System.out.println("str = " + str);
        }

        Product kimchi = context.getBean("kimchi", Food.class);
        Product coke = context.getBean("coke", Drink.class);
        Product soda = context.getBean("soda", Drink.class);

        Cart cart1 = context.getBean("cart", Cart.class);
        cart1.addItem(soda);
        cart1.addItem(kimchi);

        System.out.println("첫번쨰 손님 카트 목록 : " + cart1.showCart());

        Cart cart2 = context.getBean("cart", Cart.class);
        cart2.addItem(coke);

        System.out.println("두번쨰 손님 카트 목록 : " + cart2.showCart());

        System.out.println(cart1.hashCode() + " , " + cart2.hashCode());

        System.out.println("첫번쨰 손님 카트 목록 : " + cart1.showCart());

        //Bean 은 singleton 이다
        // @Scope("prototype") 을 작성하면 getBean 할때마다 새로운 인스턴스를 생성 수 있다.

        // 컨테이너 억지로 닫기
        ((AnnotationConfigApplicationContext)context).close();
    }
}
