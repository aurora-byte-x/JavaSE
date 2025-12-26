package com.aurora.IOStream.ProcessingStream;

import java.util.Scanner;

public class StandardIO {
    public static void main(String[] args) {

        /**
         * 1. System.in 分析
         * 编译类型: InputStream
         * 运行类型: BufferedInputStream (因为底层被包装过，提高效率)
         */
        System.out.println("System.in的运行类型：" + System.in.getClass());

        /**
         * 2. System.out 分析
         * 编译类型: PrintStream
         * 运行类型: PrintStream
         */
        System.out.println("System.out的运行类型：" + System.out.getClass());

        /**
         * 3. 传统输出：使用 System.out 将数据输出到显示器
         */
        System.out.println("--- 正在使用标准输出 ---");
        System.out.println("Hello, Java 标准输出流");

        /**
         * 4. 传统输入：配合 Scanner 从键盘接收数据
         * Scanner 构造函数接收一个 InputStream 类型的参数，即 System.in
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n请输入一段内容并按回车：");
        String str = scanner.next();
        System.out.println("str = " + str);

        // 注意：Scanner 最好不要随意关闭，因为它关联的是 System.in，
        // 一旦关闭，整个程序运行期间都无法再开启 System.in。
    }
}
