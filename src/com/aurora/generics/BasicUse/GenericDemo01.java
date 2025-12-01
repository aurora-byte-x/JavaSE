package com.aurora.generics.BasicUse;

import java.util.ArrayList;

public class GenericDemo01 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("旺财", 10));
        dogs.add(new Dog("发财", 1));
        dogs.add(new Dog("大黄", 5));

        //在编译期就会出错
        //dogs.add(new Cat("招财猫"), 8);

        //遍历时直接取出Dog类型就可以，不需要取出Object类型再转型
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}
