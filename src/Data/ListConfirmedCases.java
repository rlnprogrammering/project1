package Data;

import java.util.ArrayList;

public class ListConfirmedCases {
    private ArrayList<ConfirmedCases> confirmedCaseslList = new ArrayList<>();

    public ListConfirmedCases(ArrayList<ConfirmedCases> confirmedCaseslList) {
        this.confirmedCaseslList = confirmedCaseslList;
    }

    public ArrayList<ConfirmedCases> getConfirmedCasesList() {
        return (ArrayList<ConfirmedCases>) confirmedCaseslList.clone();
    }
}
