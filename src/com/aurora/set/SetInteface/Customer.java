package com.aurora.set.SetInteface;

public class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    // 注意：实际开发中放入 Set 的对象通常需要重写 hashCode 和 equals
    //这里由于不添加重复的Customer元素，所以没写
}
