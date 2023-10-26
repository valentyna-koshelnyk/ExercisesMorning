package W9C4_Serialization;

import SerializationUtils.SerializationUtils;

import java.io.*;
import java.util.Arrays;

import static W9C4_Serialization.Exercises.*;

class Main{

    public static void externalize(Vehicle[] vehicles, String filename) throws IOException, ClassNotFoundException {
        Vehicle bmw = new Vehicle();
        bmw.setMake("Germany");
        bmw.setModel("BMW");
        bmw.setYear(2013);

        FileOutputStream fileOutputStream = new FileOutputStream("vehicles.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        bmw.writeExternal(objectOutputStream);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static void deexternalize(String filename) throws IOException, ClassNotFoundException {
        Vehicle volkswagen = new Vehicle();
        volkswagen.setMake("Germany");
        volkswagen.setModel("Volkswagen");
        volkswagen.setYear(1995);

        FileInputStream fileInputStream = new FileInputStream("vehicles.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        volkswagen.readExternal(objectInputStream);

        objectInputStream.close();
        fileInputStream.close();

    }

    public static void main(String[] args) {
        String filename = "users.out";
        try {
            SerializationUtils.serialize(getPersons(), filename);
            Person[] people = (Person[]) SerializationUtils.deserialize(filename);
            System.out.println(Arrays.toString(people));

        } catch (IOException e) {
            System.out.println("Exception occurred");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        filename = "vehicles.out";

        try {
            externalize(Vehicle.getVehicles(), filename);
            Vehicle[] vehicles = (Vehicle.getVehicles()); deexternalize(filename);
        } catch (IOException e) {
            System.out.println("Exception occurred");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}