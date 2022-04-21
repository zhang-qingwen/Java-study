package day18;

import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Demo.txt");
        fw.write("Hello world!");
        fw.flush();
    }
}
