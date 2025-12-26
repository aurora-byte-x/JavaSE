package com.aurora.IOStream.ProcessingStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 将字节流 FileInputStream 转换为字符流 InputStreamReader，并指定编码为 gbk，最后包装成 BufferedReader 提高读取效率。
         */
        String filePath = "module3/src/file_test/IOStream/song.txt";

        // 1. 创建字节输入流
        FileInputStream fileInputStream = new FileInputStream(filePath);

        // 2. 将字节流转换为字符流，并指定编码格式为 gbk
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");

        // 3. 进一步包装成 BufferedReader 以便按行读取
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // 4. 读取数据
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 5. 关闭流（只需关闭最外层流即可）
        bufferedReader.close();
    }
}
