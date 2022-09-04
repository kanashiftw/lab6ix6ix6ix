package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File theDir = new File("C://Users//PC//IdeaProjects//Lab6z4//Popa");
        if (!theDir.exists()){
            theDir.mkdir();
        }else{
            System.out.println("Error !");
        }
        File original = new File("C://Users//PC//IdeaProjects//Lab6z3//file1.txt");
        File copied = new File("C://Users//PC//IdeaProjects//Lab6z4//Popa//copied.txt");
        try (
                InputStream in = new BufferedInputStream(
                        new FileInputStream(original));
                OutputStream out = new BufferedOutputStream(
                        new FileOutputStream(copied))) {

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Последнее изменение" + copied.lastModified());
        System.out.println("Размер файла" + copied.getUsableSpace());
    }
}
