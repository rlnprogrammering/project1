package project1;

import Filehandler.DeathCountFileHandler;
import Filehandler.HospitalizedFileHandler;
import Filehandler.KeyNumbersFileHandler;
import Filehandler.MapFileHandler;

import java.util.ArrayList;

public class testDemo {
    public static void main(String[] args) {
        /*
        KeyNumbersFileHandler keyNumbersFileHandler = new KeyNumbersFileHandler();
        ArrayList<KeyNumbers> stats = KeyNumbersFileHandler.getKeyNumbersFromFile("Covid19Stats/Kommunalt_DB/01_noegletal.csv");
        Phase phase1 = new Phase("1" ,stats);
        phase1.printKeyNumbers();
*/
        /*
        HospitalizedFileHandler hospitalizedFileHandler = new HospitalizedFileHandler();
        ArrayList<Hospitalized> test = HospitalizedFileHandler.getAgeGroupFromFile("Covid19Stats/Kommunalt_DB/03_indlæggelser_pr_aldersgrp.csv");
        ListHospitalized listHospitalized = new ListHospitalized(test);
        ArrayList<Hospitalized> hospitalized = listHospitalized.getAgeGroups();
        System.out.println(hospitalized.get(2).getHospitalized());
*/
/*
        DeathCountFileHandler deathCountFileHandler = new DeathCountFileHandler();
        ArrayList<DeathCount> test2 = DeathCountFileHandler.getDeathCountFromFile("Covid19Stats/Kommunalt_DB/04_bekraeftede_tilfaelde_doed_pr_aldersgrp.csv");
        ListDeathCount listDeathCount = new ListDeathCount(test2);
        ArrayList<DeathCount> deathCount = listDeathCount.getDeathCountList();
        System.out.println(deathCount.get(2).getDeathCount());
        //ArrayList<KeyNumbers> keyNumbers = phase1.getKeyNumbers();
        //System.out.println(keyNumbers.get(3).getDate());

 */

        MapFileHandler mapFileHandler = new MapFileHandler();
        ArrayList<Map> test3 = MapFileHandler.getMapFromFile("Covid19Stats/Kommunalt_DB/10_kort_pr_kommune.csv");
        ListMap listMap = new ListMap(test3);
        ArrayList<Map> map = listMap.getMapList();
        System.out.println(map.get(2).getTests7Days());

    }
}
