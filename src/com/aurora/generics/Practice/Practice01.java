package com.aurora.generics.Practice;

import java.util.HashMap;
import java.util.List;

public class Practice01 {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>(new HashMap<>());

        //调用save
        dao.save("001", new User(1001, 20, "tom"));
        dao.save("002", new User(1002, 30, "jerry"));
        dao.save("003", new User(1003, 40, "jack"));
        System.out.println(dao);

        //调用get
        System.out.println(dao.get("002"));

        //调用update
        dao.update("003", new User(1010, 33, "mary"));

        //调用list
        List<User> list = dao.list();
        System.out.println(list);

        //调用delete
        dao.delete("001");
        System.out.println(dao.list());
    }
}
