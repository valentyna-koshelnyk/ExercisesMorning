package W9C1_IOBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class demoHyperskill {
    public static void sumOfFile() {
        File file = new File("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91033.txt");
        try (Scanner scanner = new Scanner(file)) {

            int count = 0;
            while (scanner.hasNext()) {
                count = 0;
                int i = scanner.nextInt();
                count = i++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        sumOfFile();

    }
}