package com.aurora.IOStream.ProcessingStream;

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
        String sourcePath = "module3/src/img/source01/picture.jpg";
        String destPath = "module3/src/img/dest01/picture.jpg";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 1. 创建节点流并包装进处理流
            bis = new BufferedInputStream(new FileInputStream(sourcePath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));

            byte[] buf =  new byte[1024];   // 1KB 的自定义中转缓冲区
            int readLen = 0;

            // 2. 循环读取并写入
            // read(buff) 返回实际读取的字节数，到达末尾返回 -1
            while ((readLen = bis.read(buf)) != -1) {
                // 将读取到的有效字节写入输出流
                bos.write(buf, 0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 释放资源
            // 只需要关闭外层的处理流即可，底层会通过源码中的 close 方法自动关闭节点流
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
