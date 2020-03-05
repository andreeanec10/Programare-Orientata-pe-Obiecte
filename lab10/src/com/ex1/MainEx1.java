package com.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx1 {

    private static void readAndPrintLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Read a line from stdin and print it to stdout
        // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally)
        try {
            System.out.println(reader.readLine());
        }  finally {
            if(reader != null) {
                reader.close();
            }
        }


    }

    public static void main(String[] args) throws IOException {
        readAndPrintLine();
    }
}
