package com.aurora.IOStream.ProcessingStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        String filePath = "module3/src/file_test/IOStream/test.java";

        // 1. 创建 BufferedReader 包装 FileReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        // 2. 按行读取
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 3. 只需关闭外层流
        bufferedReader.close();

    }
}
