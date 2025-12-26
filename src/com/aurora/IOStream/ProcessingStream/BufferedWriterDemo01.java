package com.aurora.IOStream.ProcessingStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException {
        String filePath = "module3/src/file_test/IOStream/test1.txt";

        // 参数 true 表示以追加方式写入，否则为覆盖写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("hello, 教育");
        bufferedWriter.newLine();   // 插入系统相关的换行符
        bufferedWriter.write("hello, world");
        bufferedWriter.newLine();

        // 关闭外层流即可
        bufferedWriter.close();
    }
}
