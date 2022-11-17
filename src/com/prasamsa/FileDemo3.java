package com.prasamsa;

import java.io.File;

public class FileDemo3 {

    public static void main(String[] args) {
        String pathName = "C:/Users/ravis/Desktop/demo.txt";
        File file = new File(pathName);

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());

        file.setWritable(true);
        System.out.println(file.canWrite());

        pathName = "C:/Users/ravis/Desktop/demo/javademo.txt";
        File file1 = new File(pathName);
        file.renameTo(file1);
       file1.delete();

        System.out.println(file1.exists());

    }
}
