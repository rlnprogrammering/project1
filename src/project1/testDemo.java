package project1;

import Filehandler.KeyNumbersFileHandler;
import java.util.ArrayList;

public class testDemo {
    public static void main(String[] args) {
        KeyNumbersFileHandler keyNumbersFileHandler = new KeyNumbersFileHandler();
        ArrayList<KeyNumbers> stats = KeyNumbersFileHandler.getKeyNumbersFromFile("Covid19Stats/Kommunalt_DB/01_noegletal.csv");
        Phase phase1 = new Phase("1" ,stats);
        phase1.printKeyNumbers();
    }
}
