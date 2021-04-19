package project1;

import Filehandler.HospitalizedFileHandler;
import Filehandler.KeyNumbersFileHandler;
import java.util.ArrayList;

public class testDemo {
    public static void main(String[] args) {
        KeyNumbersFileHandler keyNumbersFileHandler = new KeyNumbersFileHandler();
        ArrayList<KeyNumbers> stats = KeyNumbersFileHandler.getKeyNumbersFromFile("Covid19Stats/Kommunalt_DB/01_noegletal.csv");
        Phase phase1 = new Phase("1" ,stats);
        phase1.printKeyNumbers();

        HospitalizedFileHandler hospitalizedFileHandler = new HospitalizedFileHandler();
        ArrayList<Hospitalized> test = HospitalizedFileHandler.getAgeGroupFromFile("Covid19Stats/Kommunalt_DB/03_indlæggelser_pr_aldersgrp.csv");
        ListHospitalized listHospitalized = new ListHospitalized(test);
        ArrayList<Hospitalized> hospitalized = listHospitalized.getAgeGroups();
        System.out.println(hospitalized.get(2).getHospitalized());

        //ArrayList<KeyNumbers> keyNumbers = phase1.getKeyNumbers();
        //System.out.println(keyNumbers.get(3).getDate());

    }
}
