import Data.Communally.*;
import Filehandler.Communally.ConfirmedCasesAgeGroupFileHandler;
import Filehandler.Communally.*;


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

        /*MapFileHandler mapFileHandler = new MapFileHandler();
        ArrayList<Map> test3 = MapFileHandler.getMapFromFile("Covid19Stats/Kommunalt_DB/10_kort_pr_kommune.csv");
        ListMap listMap = new ListMap(test3);
        ArrayList<Map> map = listMap.getMapList();
        System.out.println(map.get(2).getTests7Days());*/

        ConfirmedCasesFileHandler confirmedCasesFileHandler = new ConfirmedCasesFileHandler();
        ArrayList<ConfirmedCases> test4 = ConfirmedCasesFileHandler.getConfirmedCasesFromFile("resources/Covid19Stats/Kommunalt_DB/07_bekraeftede_tilfaelde_pr_dag_pr_kommune.csv");
        ListConfirmedCases listConfirmedCases = new ListConfirmedCases(test4);
        ArrayList<ConfirmedCases> confirmedCases = listConfirmedCases.getConfirmedCasesList();
        System.out.println(confirmedCases.get(7).getCommune());

        /*ConfirmedCasesAgeGroupFileHandler confirmedCasesAgeGroupFileHandler = new ConfirmedCasesAgeGroupFileHandler();
        ArrayList<ConfirmedCasesAgeGroup> test5 = ConfirmedCasesAgeGroupFileHandler.getConfirmedCasesAgeGroupFromFile("Covid19Stats/Kommunalt_DB/09_tilfaelde_aldersgrp_kommuner.csv");
        ListConfirmedCasesAgeGroup listConfirmedCasesAgeGroup = new ListConfirmedCasesAgeGroup(test5);
        ArrayList<ConfirmedCasesAgeGroup> confirmedCasesAgeGroups = listConfirmedCasesAgeGroup.getConfirmedCasesListAgeGroup();
        System.out.println(confirmedCasesAgeGroups.get(4).getCommune());*/

        /*CommuneCodeHashMap communeCodeHashMap = new CommuneCodeHashMap(CommuneCodeFileHandler.getCommuneCodesFromFile("resources/Commune_codes.csv"));
        System.out.println(communeCodeHashMap.get("101"));*/


    }
}
