package com.aurora.IOStream.ProcessingStream;

import java.io.*;

public class BufferedCopy01 {
    public static void main(String[] args) {
        String sourcePath = "module3/src/file_test/IOStream/source01.txt";
        String destPath = "module3/src/file_test/IOStream/dest01.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(sourcePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destPath));
            String line;
            // readLine() 读取内容不包含换行符
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line); // 写入读取的内容
                bufferedWriter.newLine();   // 补上换行符
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
