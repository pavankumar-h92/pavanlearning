package com.filehandaling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Fileallprint {
    public static void main(String[] args) {
        createFileUsingFileOutputStream();
        createFileUsingCreateNewFile();
        createFileUsingFilesWrite();
        System.out.println("-------------------------------");
        readUsingFileInputStream();
        readUsingFilesReadAllLines();
        System.out.println("---------------------------------");
    }

    //Create File Using FileOutputStream()
    private static void createFileUsingFileOutputStream() {
        String path = "D:\\FilesPractice\\FOS_File.txt";
        String content = "File created using FileOutputStream constructor.\n";

        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(content.getBytes());
            System.out.println("1) File created using FileOutputStream()");
        } catch (IOException e) {
            System.out.println("Error in FileOutputStream(): " + e.getMessage());
        }
    }

    // Create File Using File.createNewFile()
    private static void createFileUsingCreateNewFile() {
        String path = "D:\\FilesPractice\\CreateNewFile_File.txt";
        File file = new File(path);

        try {
            if (file.createNewFile()) {
                System.out.println("2) File created using createNewFile()");

                FileWriter writer = new FileWriter(file);
                writer.write("File created using File.createNewFile().\n");
                writer.close();
            } else {
                System.out.println("File already exists (createNewFile)");
            }
        } catch (IOException e) {
            System.out.println("Error in createNewFile(): " + e.getMessage());
        }
    }

    // Create File Using Files.write()
    private static void createFileUsingFilesWrite() {
        Path path = Paths.get("D:\\FilesPractice\\FilesWrite_File.txt");
        String content = "File created using Files.write() method.\n";

        try {
            Files.write(path, content.getBytes());
            System.out.println("3) File created using Files.write()");
        } catch (IOException e) {
            System.out.println("Error in Files.write(): " + e.getMessage());
        }
    }

    //READ File using FileInputStream()
    private static void readUsingFileInputStream() {
        String path = "D:\\FilesPractice\\FOS_File.txt";

        System.out.println("Reading using FileInputStream:");
        try (FileInputStream fis = new FileInputStream(path)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n");
        } catch (IOException e) {
            System.out.println("Error reading FOS file: " + e.getMessage());
        }
    }
    //READ File using Files.readAllLines()
    private static void readUsingFilesReadAllLines() {
        Path path = Paths.get("D:\\FilesPractice\\FilesWrite_File.txt");

        System.out.println("Reading using Files.readAllLines():");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading Files.write file: " + e.getMessage());
        }
    }


}
