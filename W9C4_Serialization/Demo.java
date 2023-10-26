//package W9C4_Serialization;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//public class Demo {
//    public static void main(String[] args) {
//        FileOutputStream fo;
//        ObjectOutputStream objectOutputStream = null;
//
//        try {
//             fo = new FileOutputStream("darwin.out");
//             objectOutputStream = new ObjectOutputStream(fo);
//
//            DarwinTest darwinTest = new DarwinTest();
//            objectOutputStream.writeObject(darwinTest);
//            objectOutputStream.flush();
//        } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            } finally {
//            objectOutputStream.close();
//        }
//
//}
//    }
//
//class DarwinTest extends Darwin{
//
//    int version = 66;
//    transient Contain contain = new Contain();
//}
//class Darwin {
//    int darwinVersion = 10;
//}
//class Contain implements Serializable {
//    int containVersion = 11;
//}
//
