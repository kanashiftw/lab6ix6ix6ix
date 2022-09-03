package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int i = 0;
        String text = "Жди меня, мы когда-нибудь встретимся 3аново\n" +
                "Жди меня, обречённо и может быть радостно\n" +
                "Жди меня, в этом городе с0лнце как станция\n" +
                "Как бы не сгореть мне, как бы не сгореть\n" +
                "Жди меня, я когда-нибудь выйду из комнаты\n" +
                "Жди меня, я приду этой осенью, кажется\n" +
                "Жди меня, за меня там все молятся, жмур9тся\n" +
                "Как бы не сгореть мне, как бы не задеть их";
        File file = new File("C://Users//PC//IdeaProjects//Lab6z3//file1.txt");
        try(FileOutputStream fos=new FileOutputStream("C://Users//PC//IdeaProjects//Lab6z3.//file1.txt"))
        {
            byte[] buffer = text.getBytes();
            fos.write(buffer);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        Pattern pattern = Pattern.compile("[0-9]+");
        FileOutputStream fos = new FileOutputStream(new File("C://Users//PC//IdeaProjects//Lab6z3//file2.txt"));
        FileReader fr = new FileReader("C://Users//PC//IdeaProjects//Lab6z3//file1.txt");
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                byte[] buffer = line.getBytes(StandardCharsets.UTF_8);
                fos.write(buffer);
                fos.write("\n".getBytes(StandardCharsets.UTF_8));
            }else{
                i++;
            }
                System.out.println(line);
                line = reader.readLine();
            }
        System.out.println("Количество строчек без цифры = " + i);

        }
    }



