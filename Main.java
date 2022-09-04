package com.company;

import javax.imageio.*;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.imageio.metadata.IIOMetadataNode;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static class Image {
        File file;
        BufferedImage image;
        int[][] pixels;

        Image(String path) throws IOException {
            file = new File(path);
            image = ImageIO.read(file);
            pixels = new int[image.getHeight()][image.getWidth()];
        }

        public File getFile() {
            return file;
        }

        public BufferedImage getImage() {
            return image;
        }
    }

        public static void main(String[] args) throws IOException{
            Map<String, Image> mymap = new HashMap<String, Image>();
            Image pic = new Image("C://Users//PC//IdeaProjects//Lab6z5//pic.bmp");
            BufferedImage bimg = ImageIO.read(new File("C://Users//PC//IdeaProjects//Lab6z5//pic.bmp"));
            int width          = bimg.getWidth();
            int height         = bimg.getHeight();
            ColorModel color = ImageIO.read(new File("C://Users//PC//IdeaProjects//Lab6z5//pic.bmp")).getColorModel();
            color.getPixelSize();
            System.out.println("Данные о файле:");
            System.out.println(pic.getImage());
            System.out.println("Размер файла в пикселях: " + width + "x" + height);
            System.out.println("Количество бит на пиксель: " + color);
        }
    }

