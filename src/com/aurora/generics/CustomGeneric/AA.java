package com.aurora.generics.CustomGeneric;

//当我们去实现IA接口时，因为IA在继承IUsb 接口时，指定了U 为String R为Double
//在实现IUsb接口的方法时，使用String替换U, 是Double替换R
public class AA implements IA{
    @Override
    public Double get(String s) {
        return 0.0;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
