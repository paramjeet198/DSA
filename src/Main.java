import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        InputStreamReader reader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(reader);

//        DataInputStream dis = new DataInputStream(System.in);
        String name = JOptionPane.showInputDialog("Enter your name:");

        System.out.println("Hello world! "+ name);
    }
}