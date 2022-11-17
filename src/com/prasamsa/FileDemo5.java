package com.prasamsa;

import java.io.*;

public class FileDemo5 {

    public static void main(String[] args) {
        String rPathName = "C:/Users/ravis/Desktop/j.txt";
        String wPathName = "C:/Users/ravis/Desktop/demo/demu2.txt";

        try (
                FileReader fis = new FileReader(rPathName);
                FileWriter fos = new FileWriter(wPathName);
                ){
        int len;
        while ((len = fis.read()) != -1) {

                System.out.println(len);
                fos.write(len);
            }
        }catch(IOException e){
                e.printStackTrace();
            }

    }
}