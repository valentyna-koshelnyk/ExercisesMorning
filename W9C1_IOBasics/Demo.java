package W9C1_IOBasics;

import java.io.*;
import java.nio.file.Path;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static java.nio.file.Files.copy;

public class Demo {

    Scanner sc = new Scanner(System.in);


    // Exercise 1: Reading from the Console

    public void readFromConsole(){
        System.out.println("Say something: ");
        String string = sc.nextLine();
        System.out.println(string);
        sc.close();
    }

    // Exercise 2: Writing to the Console

    public void writeToConsole(){
        System.out.println("What's your name?");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append(name);
        sc.close();

    }

    //Exercise 3: Reading and Writing to Files

    // possible exception

    public void readFiles() {
        try {
            Reader reader = new FileReader("input.txt");
            Writer writer = new FileWriter("output.txt");
            {
                int c;
                while ((c = reader.read()) != - 1) {
                    writer.write(c);
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Exercise 4: Copying a File
    public void copyFile() throws FileNotFoundException {
        String sourceFileName = "source.txt";
        String destinationFileName = "destination.txt";

        try (
                FileInputStream inputStream = new FileInputStream(sourceFileName);
                FileOutputStream outputStream = new FileOutputStream(destinationFileName);
        ) {
            int bytesRead;
            byte[] buffer = new byte[1024];

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Exercise 5: Reading and Writing CSV Files
    public void csvReader(){
    try
            (BufferedReader br = new BufferedReader(new FileReader("fileName"))) {
        String line;
        while (( line = br.readLine()) != null){
            System.out.println(line);
        } }
    catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }
    }




  // Exercise 1: Counting Words in a File

    public void countWordsFile() {
        File file = new File("sample.txt");
        Map<String, Integer> wordFrequencies = new HashMap<>();

        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            int count = 0;
            while (sc.hasNext()) {
               String word = sc.next();
                count++;
                wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
            }
            System.out.println("Number of words: " + count);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for(Map.Entry<String, Integer> entry : wordFrequencies.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

    // Exercise 2: Reading User Input until 'Exit'

 //   Bonus: Store all the entered strings in an ArrayList and, upon exit,
    //   write all the strings to a file named "userInputs.txt".


    public void getInputExit() throws FileNotFoundException{
        File file = new File("pathToFile");

        try (Scanner scanner = new Scanner(file)) {
            List<String>userInp = new ArrayList<>();

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.print(line + " ");
                userInp.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + "pathToFile");
        }

    }

    //Exercise 3: Appending to a File


    public void appendFile()  throws IOException {
        String fileName = "append.txt";
        String textToAppend = "data";

        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textToAppend);
            String originalContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Exercise 4: Reading a Properties File
public void readProperties() {
    Properties prop = new Properties();
    InputStream input = null;
    Map<String, String> propMap = new HashMap<>();

    try {
        input = new FileInputStream("conf.properties");
        prop.load(input);

        String input1 = prop.getProperty("inputOne");
        String input2 = prop.getProperty("inputTwo");

        propMap.put(input1, input2);
    } catch (IOException e){
        e.printStackTrace();
    }
}
  // Exercise 5: Creating Directories

    public void createDir(){
        File f = new File("pathname");
        if (f.mkdir() == true){
            System.out.println("Directory has been created successfully");
        }
        else {
            System.out.println("Directory cannot be created");
        }
    }




















    public static void main(String[] args) {










    }
}
