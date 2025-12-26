package com.aurora.IOStream.IOStreamDemo;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) {

    }

    /**
     * 将src/img/source/shot.jpg拷贝到src/img/dest/shot.jpg
     */
    @Test
    public void copyFile() {
        String sourcePath = "src/img/source/shot.jpg";
        String destPath = "src/img/dest/shot.jpg";
        int readLen = 0;
        byte[] buf = new byte[1024];

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            //1. 创建文件的输入流和输出流
            fileInputStream = new FileInputStream(sourcePath);
            fileOutputStream = new FileOutputStream(destPath);
            //2. 一边读，一边写
            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
            }
            System.out.println("拷贝成功！");
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入流和输出流
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
