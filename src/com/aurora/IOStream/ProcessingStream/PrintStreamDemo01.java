package com.aurora.IOStream.ProcessingStream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo01 {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;

        // 1. print 底层使用的是 write 方法
        // 源码逻辑: public void print(String s) { if (s == null) s = "null"; write(s); }
        out.print("hello, world\n");

        // 2. 也可以直接调用 write 进行字节输出
        out.write("你好".getBytes());

        // 3. 修改打印流的输出目的地
        // 可以将输出从显示器重定向到文件
        System.setOut(new PrintStream("module3/src/file_test/IOStream/test3.txt"));
        // 此时，这条信息将不再出现在控制台，而是保存在 test3.txt 中
        System.out.println("hello, Java");

        out.close();
    }
}
