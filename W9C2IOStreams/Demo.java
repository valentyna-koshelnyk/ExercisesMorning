//package W9C2IOStreams;
//
//import java.io.*;
//
//public class Demo {
//
//    static void fileInputStream() {
//        try (FileInputStream fileinput = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91007.txt")) {
//            int x = 0;
//            while ((x = fileinput.read()) != - 1) {
//                System.out.println((char) x);
//            }
//            fileinput.close();
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
//    }
//
//    static void bufferedInputStream(){
//        FileInputStream fileInputStream;
//        try (BufferedInputStream bf = new BufferedInputStream(FileInputStream fileInputStream = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91007.txt")))
//        {;
//            int x = 0;
//            while ((x = bf.read()) != - 1) {
//                System.out.println((char) x);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
//    }
//
//    static void byteArrayStream(){
//        try (FileInputStream fileinput = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91007.txt")) {
//            StringBuilder text = new StringBuilder();
//            int x = 0;
//            while ((x = fileinput.read()) != -1){
//                text.append((char) x);
//            }
//
//            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(text.toString().getBytes());
//            int y = 0;
//            while ((y = byteArrayInputStream.read() != -1){
//                System.out.println((char) y);
//            }
//        } catch (Exception e){
//            System.out.println(e);
//        }
//
//
//    }
//
//    static void fileOutputStream(){
//        try(FileOutputStream fileoutnput = new FileOutputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91007.txt")) {
//            String text = "WELCOME";
//            char arr[] = text.toCharArray();
//
//            int x = 0;
//            while (x < text.length()) {
//                fileoutnput.write(arr[x++]);
//
//            }
//        } catch (Exception e){
//            System.out.println(e);
//        }
//    }
//
////    static void bufferedFileOutputStream(){
////        FileOutputStream fileoutnput;
////        try(BufferedOutputStream bf = new BufferedOutputStream(FileOutputStream fileoutnput = new FileOutputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91007.txt"))
////            {
////            String text = "WELCOME";
////            char arr[] = text.toCharArray();
////
////            int x = 0;
////            while (x < text.length()) {
////                bf.write(arr[x++]);
////
////            }
////        } catch (Exception e){
////            System.out.println(e);
////        }
////    }
//
////    static void byteArrayOutPutStream(){
////        try(FileOutputStream fileoutnput = new FileOutputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91007.txt"){
////            String text = "Welcome";
////
////            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
////            byteArrayOutputStream.write(text.getBytes());
////            byteArrayOutputStream.writeTo(fileoutnput);
////        } catch (Exception e){
////            System.out.println(e);
////
////        }
////    }
//
//
//
//
//    public static void main(String[] args) {
//
//
//    }
//}
