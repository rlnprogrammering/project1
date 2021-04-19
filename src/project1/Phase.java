package project1;

import java.util.ArrayList;

public class Phase {
    private String phaseNumber;
    private ArrayList<KeyNumbers> keyNumbers = new ArrayList<>();

    public Phase(String phaseNumber, ArrayList<KeyNumbers> keyNumbers) {
        this.phaseNumber = phaseNumber;
        this.keyNumbers = (ArrayList<KeyNumbers>) keyNumbers.clone();
    }

    public void printKeyNumbers() {
        for (KeyNumbers keyNumbers : keyNumbers) {
            System.out.println(keyNumbers);
        }
    }

    public ArrayList<KeyNumbers> getKeyNumbers() {
        return (ArrayList<KeyNumbers>) keyNumbers.clone();
    }
}
