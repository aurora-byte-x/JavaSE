package com.aurora.IOStream.ProcessingStream;

// 模拟包装流
public class BufferedReader_ extends Reader_{

    private Reader_ reader_;    // 属性是 Reader_ 类型，体现了包装

    // 接收 Reader_ 的任何子类对象（多态）
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    //基础封装
    public void readFile() {
        reader_.readFile();
    }

    public void readString() {
        reader_.readString();
    }

    //包装，扩展功能：多次读取文件，也可以增加其他功能，例如加缓冲byte[] ....
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    //包装，扩展功能：批量处理字符串
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
