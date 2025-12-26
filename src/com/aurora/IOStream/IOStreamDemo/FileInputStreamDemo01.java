package com.aurora.IOStream.IOStreamDemo;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) {

    }

    /**
     * 读取文件方式一：单个字节读取
     * 缺点：效率低，频繁读取磁盘
     */
    @Test
    public void readFile01() {
        String filePath = "src/file_test/hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            // 1. 创建 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);

            // 2. 循环读取。read() 从流中读取一个字节的数据。
            // 如果返回 -1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                // 读取到的是字节，转成 char 显示（注意：如果是中文可能会乱码，因为 UTF-8 中文占 3 字节）
                System.out.println((char)  readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭文件流，释放系统资源
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 读取文件方式二：使用字节数组读取（缓冲区）
     * 优点：提高读取效率
     */
    @Test
    public void readFile02() {
        String filePath = "src/file_test/hello.txt";
        //定义字节数组作为缓冲区
        byte[] buf = new byte[8];   //一次最多读取8个字节
        int readLen = 0;    //记录实际读取到的字节数
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);

            // read(byte[] b) 从该输入流读取最多 b.length 字节的数据到字节数组。
            // 如果读取正常，返回实际读取的字节数；如果返回 -1，表示读取完毕。
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //将字节数组 buf 中，从下标 0 开始，长度为 readLen 的内容转换为字符串。
                System.out.println(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
