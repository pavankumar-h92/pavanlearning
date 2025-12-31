package com.filehandaling;

import java.io.File;

public class DeleteFiles
{

        public static void deleteFiles(File dirPath) {
            File filesList[] = dirPath.listFiles();
            for(File file : filesList) {
                if(file.isFile()) {
                    file.delete();
                } else {
                    deleteFiles(file);
                }
            }
        }
        public static void main(String args[])  {

            //Creating a File object for directory
            File file = new File("D:\\FilesPractice");

            //List of all files and directories
            deleteFiles(file);
            System.out.println("Files deleted.");
        }
}
