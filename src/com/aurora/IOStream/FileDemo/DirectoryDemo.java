package com.aurora.IOStream.FileDemo;

import org.junit.jupiter.api.Test;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {

    }

    //  判断 src/file_test/news1.txt是否存在，如果存在就删除
    @Test
    public void Directory01() {
        File file = new File("src/file_test/news1.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该文件不存在");
        }
    }

    //  判断 src/file_test/demo是否存在，存在就删除,否则提示不存在.
    @Test
    public void Directory02() {
        File file = new File("src/file_test/demo");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该目录不存在");
        }
    }

    //  判断 src/file_test/a/b/c目录是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void Directory03() {
        File file = new File("src/file_test/a/b/c");
        if (file.exists()) {
            System.out.println("目录已经存在");
        } else {
            if (file.mkdirs()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }
        }
    }
}
