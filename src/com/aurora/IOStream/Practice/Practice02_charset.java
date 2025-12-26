package com.aurora.IOStream.Practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice02_charset {
    public static void main(String[] args) {
        /**
         * 要求:使用BufferedReader读取一个文本文件，为每行加上行号，再连同内容一并输出到屏幕。
         * 在读取文件时指定编码
         */
        String filePath = "module3/src/file_test/IOStream/practice02.txt";

        BufferedReader bufferedReader = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            int lineNum = 0;
            while ((line = bufferedReader.readLine()) !=  null) {
                lineNum++;
                System.out.println(lineNum + "." + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
