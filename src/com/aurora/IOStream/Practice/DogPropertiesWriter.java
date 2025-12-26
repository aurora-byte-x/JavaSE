package com.aurora.IOStream.Practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 写入一个dog.properties
 * name=tom
 * age=5
 * color=red
 */
public class DogPropertiesWriter {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");

        properties.store(new FileWriter("module3/src/file_test/IOStream/dog.properties"), "Dog Properties");

    }
}
