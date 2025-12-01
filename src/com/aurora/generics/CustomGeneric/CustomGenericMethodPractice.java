package com.aurora.generics.CustomGeneric;

public class CustomGenericMethodPractice {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);  //10 会被自动装箱 Integer10, 输出Integer
        apple.fly(new Dog());   //Dog
    }
}
