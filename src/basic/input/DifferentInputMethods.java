package basic.input;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
In Java, there are several ways to take input from the user. Here are some common methods:
 */

public class DifferentInputMethods {
    public static void main(String[] args) {
//        InputUsingScanner();
//        InputUsingBufferedReader();
//        InputUsingDataInputStream();
        InputUsingJOptionPane();

    }


    //swing package.
    private static void InputUsingJOptionPane() {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

//        System.out.println("sdsd" + name);
    }

    // io package
    private static void InputUsingDataInputStream() {
        System.out.println("Input using DataInputStream");


        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter your name: ");

        try {
            String name = dis.readLine();
            System.out.println("Output, " + name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // io package
    private static void InputUsingBufferedReader() {
        System.out.println("Input using BufferedReader");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        System.out.println("Enter Integer e.g 1,2,3");

        try {
//            int anInt = reader.read(); // read single character
//            System.out.println("Integer " + anInt);

            System.out.println("Enter Line e.g name");
            String line = reader.readLine();
            System.out.println("Output " + line);

        } catch (IOException e) {
            System.out.println("Something wrong: " + e.getLocalizedMessage());
            throw new RuntimeException(e);
        }


    }

    // util package
    private static void InputUsingScanner() {
        System.out.println("Input using Scanner Class");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Integer e.g 1,2,3");
        int anInt = scanner.nextInt();

        System.out.println("Enter String e.g name");
        String str = scanner.next();

        System.out.println("Integer " + anInt);
        System.out.println("String " + str);
    }
}
