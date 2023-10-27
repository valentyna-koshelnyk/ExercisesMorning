package W9C5_Deserialization;
import SerializationUtils.SerializationUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.Serializable;

public class Person implements Serializable {
    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;
    transient private int salary; // prints 0 instead of the set value

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\n Salary: " + salary;
    }

    public static void main(String[] args) {
        Person person = new Person("Olivia", 1, 3250);
        String filename = "personDeser.data";


        try {
            SerializationUtils.serialize(person, filename);
            person = (Person) SerializationUtils.deserialize("fsfd.data");
            System.out.println(person.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
