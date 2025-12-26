package com.aurora.IOStream.IOStreamDemo;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {
    public static void main(String[] args) {

    }

    //使用FileReader 从story.txt 读取内容，并显示
    /**
     * 单个字符读取示例
     */
    @Test
    public void reader_txt() {
        String filePath = "src/file_test/IOStream/story.txt";
        FileReader  fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            // 循环读取：返回的是 int 类型的字符编码
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void reader_txt_array() {
        String filePath = "src/file_test/IOStream/story.txt";
        FileReader  fileReader = null;
        int readLen = 0;
        char[]  buf = new char[8];  // 定义 8 个字符大小的缓冲区
        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
