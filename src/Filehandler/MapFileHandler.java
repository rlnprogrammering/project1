package Filehandler;

import project1.Map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class MapFileHandler {

    public static ArrayList<Map> getMapFromFile(String filename) {
        ArrayList<Map> mapList = new ArrayList<>();

        Path file = Paths.get(filename);
        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.ISO_8859_1)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                Map map = parseNumbers(line);
                mapList.add(map);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        return mapList;
    }

    private static Map parseNumbers(String inputString) {
        String[] tokens = inputString.split(";");
        return new Map(tokens[0],tokens[1], tokens[2], tokens[3]);
    }

}
