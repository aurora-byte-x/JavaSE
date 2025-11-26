package com.aurora.set.Practice;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class Practice02 {
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        Car car1 = new Car("Audi", 1000000);
        Car car2 = new Car("BMW", 1999999);
        Car car3 = new Car("Benz", 2888888);

        //1.add
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println("cars: " + cars);

        //2.remove
        cars.remove(1);
        System.out.println("remove: " + cars);

        //3.contains
        System.out.println("contains: " + cars.contains(car1));

        //4.size
        System.out.println("size: " + cars.size());

        //5.isEmpty
        System.out.println("isEmpty: " + cars.isEmpty());

        //6.clear
        cars.clear();
        System.out.println("clear: " + cars);

        //7.addAll
        ArrayList newCars = new ArrayList();
        newCars.add(car1);
        newCars.add(car2);
        newCars.add(car3);
        cars.addAll(newCars);
        System.out.println("addAll: " + cars);

        //8.containsAll
        cars.containsAll(newCars);
        System.out.println("containsAll: " + cars.containsAll(newCars));

        //9.removeAll
        cars.removeAll(newCars);
        System.out.println("removeAll: " + cars);

        //10.迭代器遍历
        cars.addAll(newCars);
        Iterator iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = (Car) iterator.next();
            System.out.println(car);
        }
    }
}
