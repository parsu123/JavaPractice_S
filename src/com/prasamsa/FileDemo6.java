package com.prasamsa;

import java.io.*;

public class FileDemo6 {
    public static void main(String[] args) {
        String rPathName = "C:/Users/ravis/Desktop/j.txt";
        String wPathName = "C:/Users/ravis/Desktop/demo/demu3.txt";

        try (
                FileReader fr = new FileReader(rPathName);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(wPathName);
                BufferedWriter bw = new BufferedWriter(fw);
        ){
            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
