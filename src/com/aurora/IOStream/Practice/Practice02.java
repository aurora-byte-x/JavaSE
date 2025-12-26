package com.aurora.IOStream.Practice;

import java.io.*;

public class Practice02 {
    public static void main(String[] args) {
        /**
         * 要求:使用BufferedReader读取一个文本文件，为每行加上行号，再连同内容一并输出到屏幕上。
         */

        String filePath = "module3/src/file_test/IOStream/practice02.txt";
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            int lineNum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                lineNum++;
                System.out.println(line = lineNum + "." + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
