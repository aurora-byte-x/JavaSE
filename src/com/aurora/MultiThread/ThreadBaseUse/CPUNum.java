package com.aurora.MultiThread.ThreadBaseUse;

public class CPUNum {
    public static void main(String[] args) {
        //获取当前的Runtime实例
        Runtime rt = Runtime.getRuntime();

        //获取当前电脑的CPU核心数
        int CPUNums = rt.availableProcessors();
        System.out.println("CPUNums: " + CPUNums);
    }
}
