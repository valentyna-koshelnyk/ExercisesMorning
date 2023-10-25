package W9C3JavaFileFileReaderFileWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void read() throws IOException {
        int ch;
        try (FileReader fr = new FileReader("W9C3JavaFileFileReaderFileWriter/input.txt")) {
            while ((ch = fr.read()) != - 1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }


    public static void write() throws IOException {
        int ch;
        String str = "Welcome to a new world";

        try (FileWriter fw = new FileWriter(new File("W9C3JavaFileFileReaderFileWriter/output.txt"))) {
            ;

            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i));
            }
            System.out.println("Finished");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readWrite() {
        int ch;
        try (FileReader fr = new FileReader("W9C3JavaFileFileReaderFileWriter/input.txt");
             FileWriter fw = new FileWriter("W9C3JavaFileFileReaderFileWriter/output.txt", false)) {
            while ((ch = fr.read()) != - 1) {
                fw.write(ch);
            }
            System.out.println("Successfully copied");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addInfo() {
        try (FileWriter fw = new FileWriter("W9C3JavaFileFileReaderFileWriter/output.txt", true)) {
            String str = "\n Welcome to StartSteps";
            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i));
            }
            System.out.println("Finished");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readWriteNums() {
        try (FileReader fr = new FileReader("W9C3JavaFileFileReaderFileWriter/input_numbers.txt");
             FileWriter fw = new FileWriter(new File("W9C3JavaFileFileReaderFileWriter/output_numbers.txt"));
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            int sum = 0;

            while ((line = br.readLine()) != null) {
                try {
                    int num = Integer.parseInt(line);
                    sum += num;
                    fw.write(Integer.toString(sum) + "\n");
                } catch (NumberFormatException e) {
                }
            }
            System.out.println("Sum of integers: " + sum);

        } catch(FileNotFoundException e)

    {
        System.out.println("Original file has not been found");
    } catch (IOException e)
    {
        System.out.println("File cannot be created");
    }

}









    public static void main(String[] args) {
    //    readWriteNums();
    }
}