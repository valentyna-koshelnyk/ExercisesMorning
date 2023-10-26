package W9C4_Serialization;

import SerializationUtils.SerializationUtils;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;

import static com.sun.tools.javac.jvm.ClassFile.externalize;

public class Exercises {

    public static class Person implements Serializable {
        private String name;
        private int age;
        private Address address;
        private transient LocalDateTime currentDateTime;

        private static final long serialVersionUID = 1L;


        public void setAddress(Address address) {
            this.address = address;
        }

        public Address getAddress() {
            return address;
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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", address ='" + address +
                    '}';
        }

        private String reverseString(String str) {
            return new StringBuilder(str).reverse().toString();
        }
        @Override
        private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
        {
            StringBuilder sb = new StringBuilder();
            name = ois.readUTF();
            name = reverseString(name);
            age = ois.readInt();
            address = ois.readUTF();
        }

//        @Override
//        public void writeObject(ObjectOutputStream oos) throws IOException{
//            StringBuilder sb = new StringBuilder();
//            name =



        }
    }


    public static Person[] getPersons() {
        // Maria

        Person maria = new Person();
        maria.setName("Maria");
        maria.setAge(32);

        Address mariaAddress = new Address();
        mariaAddress.setCountry("Germany");
        mariaAddress.setCity("Berlin");
        mariaAddress.setStreet("LollwitzPlatz 27");

        maria.setAddress(mariaAddress);

        // Frank

        Person frank = new Person();
        frank.setName("Frank");
        frank.setAge(40);

        Address frankAddress = new Address();
        frankAddress.setCountry("UK");
        frankAddress.setCity("London");
        frankAddress.setStreet("Oscar Wilde Street 27");

        frank.setAddress(frankAddress);

        return new Person[]{maria, frank};


    }

    public static class Address implements Serializable {
        private static final long serialVersionUID = 1L;
        private String country;
        private String city;
        private String street;


        public void setCountry(String country) {
            this.country = country;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }


    }

    public static class Vehicle implements Externalizable {
        private String make;
        private String model;
        private int year;

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        private static final long serialVersionUID = 1L;


        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeUTF(make);
            out.writeUTF(model);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            this.make = in.readUTF();
            this.model = in.readUTF();
            this.year = in.readInt();
        }

        public static Vehicle[] getVehicles() {

            Vehicle volkswagen = new Vehicle();
            volkswagen.setMake("Germany");
            volkswagen.setModel("Volkswagen");
            volkswagen.setYear(1995);

            Vehicle bmw = new Vehicle();
            bmw.setMake("Germany");
            bmw.setModel("BMW");
            bmw.setYear(2013);

            return new Vehicle[]{volkswagen, bmw};


        }
    }
}

