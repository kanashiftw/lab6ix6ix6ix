package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int [] array = new int [10];
        array [0] = 4;
        for (int i = 1; i < array.length; i++ ){
            array[i] = array[i-1] + 7;
        }
        String text = Arrays.toString(array);
        System.out.println(text);
        File file = new File("C://Users//PC//IdeaProjects//something.txt");
        try(FileOutputStream fos=new FileOutputStream("C://Users//PC//IdeaProjects//something.txt"))
        {
            byte[] buffer = text.getBytes();
            fos.write(buffer);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        FileInputStream fis = new FileInputStream(new File("C://Users//PC//IdeaProjects//something.txt"));
        FileOutputStream fos = new FileOutputStream(new File("C://Users//PC//IdeaProjects//qwe.txt"));
        byte[] buffer = new byte[512];
        while((fis.read(buffer)) != -1) {
            fos.write(buffer, 16, 6);
        }
        fos.close();
        fis.close();
    }
}
