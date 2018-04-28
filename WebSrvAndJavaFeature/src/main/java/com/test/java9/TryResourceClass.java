package com.test.java9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

        // BufferedReader is declared outside try() block
        BufferedReader br = new BufferedReader(new FileReader("C://Users/Admin/Desktop/JavaJars/Test.txt"));
 
        // Java 9 make it simple
        try (br) {
            String line;
            while (null != (line = br.readLine())) {
                // processing each line of file
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
