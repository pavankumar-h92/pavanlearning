package com.filehandaling;

import java.io.*;

public class Filecopy {
    public static void main(String[] args)
    {
        File f1= new File("D:\\FilesPractice\\PavanKumar_QA-Resume.pdf");
        File f2= new File("D:\\FilesPractice\\PavanKumar_QA-Resume-copy.pdf");

        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream=new FileInputStream(f1);
            fileOutputStream = new FileOutputStream(f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i=0;
        while(true) {
            try {
                if (!((i=fileInputStream.read())!=-1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            fileOutputStream.write(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(fileInputStream !=null)
            {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (fileOutputStream !=null)
                {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }
        System.out.println("File Copied Sucessfully ");
    }
}
