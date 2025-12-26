package com.aurora.IOStream.IOStreamDemo;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) {

    }

    /**
     * 请使用FileOutputStream 在a.txt 文件，中写入“hello，world”. 如果文件不存在，会创建文件(注意：前提是目录已经存在)
     */
    @Test
    public void fileWriter() {
        String filePath = "src/file_test/a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            // 1. 创建对象（追加模式）
            // new FileOutputStream(filePath, true) 创建方式，当写入内容是，是追加到文件后面
            fileOutputStream = new FileOutputStream(filePath, true);

            // 2. 写入数据
            // 方式 A: .写入单个字符
            fileOutputStream.write('#');
            String str = "hello, world";
            // 方式 B: 写入整个字符串转出的字节数组
            fileOutputStream.write(str.getBytes());
            // 方式 C: 写入数组的一部分 (从索引0开始写入3个字节，即 "hel")
            fileOutputStream.write(str.getBytes(), 0, 3);
        } catch (IOException e)  {
            e.printStackTrace();
        } finally {
            // 3. 释放资源：必须放在 finally 中确保执行
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
