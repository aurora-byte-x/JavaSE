package com.aurora.IOStream.ProcessingStream.ObjectStream;

import java.io.Serializable;

// 引用类型属性也需要实现序列化
public class Master implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Master{}";
    }
}
