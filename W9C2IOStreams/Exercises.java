package W9C2IOStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercises {
    static void fileInputStream() throws IOException {
        try (FileInputStream fileinput = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C2IOStreams/input.txt")) {
            int x = 0;
            while ((x = fileinput.read()) != - 1) {
                System.out.println((char) x);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }
    }

    static void binaryInputStream() {
        try (FileInputStream fileinput = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C2IOStreams/image.jpg")) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(fileinput.toString().getBytes());
            int y = 0;
            while (byteArrayInputStream.read() != - 1) {
                System.out.println((char) y);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // read binary
    static void copyBinaryInputOutputStream() throws IOException {
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        try {
            infile = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C2IOStreams/image.jpg");
            outfile = new FileOutputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C2IOStreams/copy_image.jpg");
            int i = 0;
            while ((i = infile.read()) != - 1) {
                outfile.write(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (infile != null) {
                infile.close();
            }
            if (outfile != null) {
                outfile.close();
            }
        }
    }

    static void csvReader() {
        try (FileInputStream fileInputStream = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C2IOStreams/data.csv");
             BufferedReader csvReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            String line;
            List<String[]> data = new ArrayList<>();

            while ((line = csvReader.readLine()) != null) {
                String[] columns = line.split(",");
                data.add(columns);
            }

            if (! data.isEmpty()) {
                int numColumns = data.get(0).length;
                int columnWidth = 30;

                for (String[] row : data) {
                    for (int i = 0; i < numColumns; i++) {
                        System.out.format("%-" + columnWidth + "s", row[i]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("The CSV file is empty.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readChunks() {
        int n = 1;
        try (FileInputStream fileInputStream = new FileInputStream("/Users/valentynakoshelnyk/Desktop/StartStepGitClass/ExercisesMorning/W9C2IOStreams/large_data.txt");
             BufferedReader txtReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            String line;
            List<String> lines;
            do {
                lines = readNLines(txtReader, n);
                System.out.println(lines);
            } while (! lines.isEmpty());
        } catch(
    FileNotFoundException e)

    {
        throw new RuntimeException(e);
    } catch(IOException e)
        {
        throw new RuntimeException(e);
    }

}
    private static List<String> readNLines(BufferedReader reader, int numberOfLines) throws IOException {
        List<String> lines = new ArrayList<>(numberOfLines);
        String line;
        while (lines.size() < numberOfLines && ((line = reader.readLine()) != null)) {
            lines.add(line);
        }
        return lines;
    }





    public static void main(String[] args) {
       copyBinaryInputOutputStream();
      //  csvReader();
       // readChunks();

    }

}





