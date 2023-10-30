package Week10.C1_Maps;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

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

    private void assertCorrectAge(int age) {
        if (age < 0 || age >= 150) {
            throw new IllegalArgumentException("Person age cannot be negative or higher than 150");
        }
    }

    public Person(String name, int age) {
        this.name = name;
        assertCorrectAge(age);
        this.age = age;
    }

    public Person() {
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();
        System.out.println("Enter your age: ");
        this.age = sc.nextInt();
        assertCorrectAge(age);
    }

    public static Person getPersonInfo() {
        Person person;
        return person = new Person("Eve", 33);
    }

    @Override
    public String toString() {
        return String.valueOf(sb.append("|Person's name:| ").append(name)
                .append("\n" + name + "'s age: | ").append(age));
    }

    public StringBuilder stringToFile() {
        return sb.append(name + " | ")
                .append(age + " | ");
    }

    public void getAddress() {
        Person Person = getPersonInfo();
        System.out.println("Write your address: ");
        StringBuilder Person1 = Person.stringToFile();
        String address = sc.nextLine();
        address = String.valueOf(sb.append(" | " + address));

        try (FileWriter fw = new FileWriter("output.data");) {
            fw.write(String.valueOf(Person1));
            fw.write(address);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readInfo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.data"))) {
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getPersonBirthYear() {
        Person Person = getPersonInfo();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int wasBorn = currentYear - Person.getAge();
        System.out.println(sb.append(Person.getName()).append(" was born in ").append(wasBorn));
    }


    public void favoriteColour() {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter("output.data"))) {
            HashMap<Integer, String> colours = new HashMap<>();
            System.out.println("Do you like any of these colours? ");
            colours.put(1, "blue");
            colours.put(2, "yellow");
            colours.put(3, "red");
            colours.put(4, "black");
            colours.put(5, "white");
            colours.getOrDefault(6, "brown");
            colours.forEach((key, value) -> System.out.println(key + " " + value));
            System.out.println("If yes, put a number of your favorite colour: ");
            int input = sc.nextInt();
            Person Person = getPersonInfo();
            String colour = null;
            String PersonString = String.valueOf(Person.stringToFile());
            if (colours.containsKey(input)) {
                colour = colours.get(input).toString();
            }
            StringBuilder str = sb.append(PersonString).append(colour);
            bf.write(String.valueOf(str));
            System.out.println(colour);
        } catch (IllegalArgumentException e) {
            System.out.println("The colour with this number doesn't exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public int compareTo(Person otherPerson) {
        int ageComparison = Integer.compare(this.age, otherPerson.age);
        if (ageComparison == 0) {
            return this.name.compareTo(otherPerson.name);
        }
        return ageComparison;
    }
}


