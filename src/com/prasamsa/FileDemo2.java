package com.prasamsa;

import java.io.File;

public class FileDemo2 {

    public static void main(String[] args) {

    String pathName = "C:/Users/ravis/Desktop/emu";
    File file = new File(pathName);
    if(file.mkdir()) {
        System.out.println("directory created...");
    }
    else {
        System.out.println("directory already exists...");
    }
}
}