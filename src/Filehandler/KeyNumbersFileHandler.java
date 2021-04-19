package Filehandler;

import project1.KeyNumbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class KeyNumbersFileHandler {
    public static ArrayList<KeyNumbers> getKeyNumbersFromFile(String filename) {
        ArrayList<KeyNumbers> participants = new ArrayList<>();

        Path file = Paths.get(filename);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                KeyNumbers student = parseStudent(line);
                participants.add(student);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        return participants;
    }

    private static KeyNumbers parseStudent(String inputString) {
        String[] tokens = inputString.split(";");
        return new KeyNumbers(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],tokens[9],tokens[10],tokens[11],tokens[12],tokens[13],tokens[14],tokens[15],tokens[16],tokens[17],tokens[18],tokens[19],tokens[20],tokens[21],tokens[22],tokens[23],tokens[24]);
    }
}
