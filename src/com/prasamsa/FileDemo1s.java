package com.prasamsa;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class FileDemo1s {

    public static void main(String[] args) {
        String pathName = "C:\\Users\\ravis\\Desktop\\emu.txt";
        File file = new File(pathName);
        try {
            if(file.createNewFile()) {
                System.out.println("file created...");
            }
            else {
                System.out.println("file already exists...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
