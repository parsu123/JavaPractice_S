package com.prasamsa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleDemo4 {

    public static void main(String[] args) {
        String rPathName = "C:/Users/ravis/Desktop/j.txt";
        String wPathName = "C:/Users/ravis/Desktop/demo/demu.txt";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(rPathName);
            fos = new FileOutputStream(wPathName);
            int len;
            while((len = fis.read()) != -1) {
                System.out.println(len);
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
