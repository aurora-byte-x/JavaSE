package com.aurora.IOStream.ProcessingStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo01 {
    public static void main(String[] args) throws IOException {

        // 方式 A: 输出到控制台
        PrintWriter pw1 = new PrintWriter(System.out);
        pw1.print("hello, world");

        // 方式 B: 输出到文件
        PrintWriter pw2 = new PrintWriter(new FileWriter("module3/src/file_test/IOStream/test4.txt"));
        pw2.print("hello, Java");

        // 注意：必须关闭流或显式调用 flush()
        // close() 内部会先调用 flush()，数据才会真正写入文件
        pw1.close();
        pw2.close();
    }
}
