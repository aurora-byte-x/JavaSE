package com.aurora.IOStream.Practice;

import java.io.*;

public class practice02_advanced {
    public static void main(String[] args) {
        /**
         * 要求:使用BufferedReader读取一个文本文件，为每行加上行号，再连同内容一并写入另一文件内。
         */
        String filePath = "module3/src/file_test/IOStream/practice02.txt";
        String destPath = "module3/src/file_test/IOStream/practice02_lineNum.txt";

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(destPath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            int lineNum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                lineNum++;
                bufferedWriter.write(lineNum + "." + line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
