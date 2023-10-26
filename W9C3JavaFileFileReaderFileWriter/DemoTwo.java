//package W9C3JavaFileFileReaderFileWriter;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class DemoTwo {
//    Scanner sc = new Scanner(System.in);
//
//    //Ex 1 Develop an application that continuously collects textual
//    // input from a user, ensuring that duplicate words aren't saved.
//    // When the user types "Export", save all the unique words to the "output.txt" file.
//    // If the user runs the app multiple times, always ensure that the
//    // previous inputs are maintained, and show the existing content to the user upon
//    // starting the app.
//
////    public void textCollect(){
////        File f = new File("W9C3JavaFileFileReaderFileWriter/output.txt");
////        if (f.exists()){
////        try (FileReader fr = new FileReader(f)){
////            int ch;
////            while ((ch = fr.read(char[] array)) != -1){
////                System.out.println((char) ch);
////                System.out.println("Write your input");
////                String str = sc.nextLine();
////              //  if(ch)
////            }
////        }
////
////        }
////    }
//
//    public static void lineCounter() throws IOException {
//        try (FileReader fr = new FileReader("W9C3JavaFileFileReaderFileWriter/input.txt")) {
//            BufferedReader br = new BufferedReader(fr);
//            long lines = 0;
//            while ((br.readLine()) != null) {
//                lines++;
//            }
//            System.out.println("Total number of lines: " + lines);
//        } catch (
//                FileNotFoundException e) {
//            System.out.println("File was not found");
//        }
//    }
//
////    public static void convertUpperCase() {
////        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("W9C1IOStreams/input.txt"));
////             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("W9C1IOStreams/output.txt"))) {
////            String line;
////            while ((line = bufferedReader.readLine()) != null) {
////                line.toUpperCase();
////                System.out.println(line.toUpperCase());
////            }
////        }
////    }
////}
//
//
////    public static void main(String[] args) {
//////        try {
//////            lineCounter();
//////        } catch (IOException e) {
//////            throw new RuntimeException(e);
//////        }
////
////    }
//
