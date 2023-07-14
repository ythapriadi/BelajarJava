package com.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class COntoh {
    public static void main(String[] args) throws IOException {

        FileInputStream inputFile = new FileInputStream("input.txt");
        System.out.println((char) inputFile.read());
    }
}
