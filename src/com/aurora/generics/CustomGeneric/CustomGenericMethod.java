package com.aurora.generics.CustomGeneric;

import java.util.ArrayList;

@SuppressWarnings("all")
public class CustomGenericMethod {
    public static void main(String[] args) {
        Car car = new Car();
        //普通类中的fan'xin
        car.fly("Audi", 100);

        System.out.println("==================");

        //T->String, R->ArrayList
        Fish<String, ArrayList>  fish = new Fish<>();
        fish.eat(111, 19.99);
        //泛型类中的泛型方法
        fish.hello(new ArrayList(), 11.3f);

    }
}
