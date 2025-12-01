package com.aurora.generics.BasicUse;

public class GenericDemo02 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("aurora");
        person.show();  //class java.lang.String

        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();     //class java.lang.Integer
    }
}
