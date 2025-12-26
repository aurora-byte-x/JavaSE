package com.aurora.IOStream.ProcessingStream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 将字节流 FileOutputStream 转换为字符流 OutputStreamWriter，并将字符串按指定编码（如 utf-8）保存到文件。
         */

        String filePath = "module3/src/file_test/IOStream/test2.txt";
        // 1. 创建字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        // 2. 将字节流转换为字符流，并指定编码格式为 utf-8
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");

        // 3. 进一步包装成 BufferedReader 提升效率
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        // 4. 写入内容
        bufferedWriter.write("hello world");

        // 5. 关闭流
        bufferedWriter.close();

        System.out.println("文件已写入成功");
    }
}
