/*
 * CopyFile.java
 *
 * This application uses input and output streams to copy a file to another
 * location specified by the user.
 * Copyright © 2007 Aptech Software Limited. All Rights Reserved.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class accepts the path of the source file and copies the file to the
 * location specified by the user.
 * @author vincent
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t **** Welcome to the File Copier " +
                "Application ****");
        try {
            // Accept the location of the source file
            System.out.println("Enter the path of source file along with the filename:");
            Scanner input = new Scanner(System.in);
            String path = input.next();
            
            // Create a File object
            File fileName = new File(path);
            String location = path.substring(0,
                    path.indexOf(fileName.getName()));
            
            // Create an stream to read from the file
            FileInputStream fin = new FileInputStream(path);
            
            // Accept the location where the file is to be copied
            System.out.println("\n Enter the path where file is to be copied:");
            String copy = input.next();
            
            // Check if the location of the file is the same as the location
            // where the file is to be copied
            if (copy.equals(location)) {
                System.out.println("The source and the destination " +
                        "path are the same!");
                
                // Close all system resources
                fin.close();
                System.exit(0);
            } else {
                // Create a stream to write to the copy
                FileOutputStream fout = new FileOutputStream(copy +
                        fileName.getName());
                int data;
                while((data = fin.read()) != -1)
                    fout.write(data);
                System.out.println("A copy of the file :" + fileName.getName()+
                        "has been successfully created at the location :" +
                        copy + fileName.getName() + "!");
                
                // Close all system resources
                fin.close();
                fout.close();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("The file to be copied could not be located!");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("An error occurred while reading from " +
                    "the file!");
        }
    }
}