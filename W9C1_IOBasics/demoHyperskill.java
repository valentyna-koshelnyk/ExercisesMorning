package W9C1_IOBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class demoHyperskill {
    public static void sumOfFile() {
        File file = new File("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C1_IOBasics/dataset_91065.txt");
        try (Scanner scanner = new Scanner(file)) {
            int count = 0;
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                    if (number % 2 == 0 && number != 0) {
                        count++;
                    } else if (number == 0){
                        break;
                }
                System.out.println(count);
            }
        }
         catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }


    public static void main(String[] args) {
        sumOfFile();

    }
}