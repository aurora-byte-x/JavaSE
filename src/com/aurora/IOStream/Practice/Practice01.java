package com.aurora.IOStream.Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 在判断module3/src/file_test下是否有文件夹mytemp ,如果没有就创建mytemp
         * 2. 在module3/src/file_test/mytemp目录下，创建文件hello.txt
         * 3. 如果hello.txt已经存在，提示该文件已经存在,就不要再重复创建了
         * 4. 并且在hello.txt文件中，写入hello,world~
         */

        //1. 在判断e盘下是否有文件夹mytemp ,如果没有就创建mytemp
        File file = new File("module3/src/file_test/mytemp");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("创建文件夹成功");
            } else {
                System.out.println("创建文件夹失败");
            }
        }

        //2. 在e:llmytemp目录下，创建文件hello.txt
        file = new File("module3/src/file_test/mytemp/hello.txt");

        //3. 如果hello.txt已经存在，提示该文件已经存在,就不要再重复创建了
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("文件创建成功");
                //4. 并且在hello.txt文件中，写入hello,world~
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("hello, world");
                bw.close();
            } else {
                System.out.println("文件创建失败");
            }
        } else {
            System.out.println("文件已经存在");
        }
    }
}
