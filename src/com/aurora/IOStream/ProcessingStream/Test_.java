package com.aurora.IOStream.ProcessingStream;

public class Test_ {
    public static void main(String[] args) {
        // 包装文件节点流
        BufferedReader_ bufferedReader_1 = new BufferedReader_(new FileReader_());
        bufferedReader_1.readFiles(5);

        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
        bufferedReader_2.readStrings(5);
    }
}
