package com.aurora.IOStream.IOStreamDemo;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo01 {
    public static void main(String[] args) {

    }

    @Test
    public void writer() {
        String filePath = "src/file_test/IOStream/note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', '\n'};

        try {
            fileWriter = new FileWriter(filePath, true);    //追加模式

            // 1. 写入单个字符
            fileWriter.write('A');

            // 2. 写入字符数组
            fileWriter.write(chars);

            // 3. 写入字符数组的部分内容
            fileWriter.write(chars, 1, 3);

            // 4. 写入整个字符串
            fileWriter.write("春风若有怜花意，可否使我再少年\n");

            // 5. 写入字符串的部分内容 (offset, len)
            fileWriter.write("北京上海天津", 0, 4);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
