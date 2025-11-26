package com.aurora.set.Practice;

import java.util.ArrayList;

@SuppressWarnings("all")
public class Practice01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        //倒序遍历
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            News news = (News) arrayList.get(i);
            news.setTitle(processTitle(news.getTitle()));
        }

        System.out.println(arrayList);
    }

    //处理新闻标题的方法
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() > 15) {
            title = title.substring(1,15) + "...";
        }
        return title;
    }
}
