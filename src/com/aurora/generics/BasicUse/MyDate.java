package com.aurora.generics.BasicUse;

public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年"
                + month + "月"
                + day + "日";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearCompare = this.year - o.year;
        if (yearCompare != 0) {
            return yearCompare;
        }

        int monthCompare = this.month - o.month;
        if (monthCompare != 0) {
            return monthCompare;
        }

        return this.day - o.day;
    }
}
