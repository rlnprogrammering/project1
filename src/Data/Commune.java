package Data;

public class Commune {
    private String date; // almost all
    private String week; // 11

    private String hospitalizedTotal; // 02, 05
    private String hospitalized; // 03
    private String ageGroup; //03, 04
    private String confirmedCases; //04, 07
    private String deathByAge; // 04
    private String deathByDay; //06
    private String deathCount; //06
    private String casesBy7Days; //10
    private String testedBy7Days; //10
    private String positiveBy7Days; //10
    private String testAmount; //11
    private String testMethod; //11

    private String commune; // 07, 09

    public Commune(String date, String week, String hospitalizedTotal, String hospitalized, String ageGroup, String confirmedCases, String deathByAge, String deathByDay, String deathCount, String casesBy7Days, String testedBy7Days, String positiveBy7Days, String testAmount, String testMethod, String commune) {
        this.date = date;
        this.week = week;
        this.hospitalizedTotal = hospitalizedTotal;
        this.hospitalized = hospitalized;
        this.ageGroup = ageGroup;
        this.confirmedCases = confirmedCases;
        this.deathByAge = deathByAge;
        this.deathByDay = deathByDay;
        this.deathCount = deathCount;
        this.casesBy7Days = casesBy7Days;
        this.testedBy7Days = testedBy7Days;
        this.positiveBy7Days = positiveBy7Days;
        this.testAmount = testAmount;
        this.testMethod = testMethod;
        this.commune = commune;
    }

    public String getDate() {
        return date;
    }

    public String getWeek() {
        return week;
    }

    public String getHospitalizedTotal() {
        return hospitalizedTotal;
    }

    public String getHospitalized() {
        return hospitalized;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getConfirmedCases() {
        return confirmedCases;
    }

    public String getDeathByAge() {
        return deathByAge;
    }

    public String getDeathByDay() {
        return deathByDay;
    }

    public String getDeathCount() {
        return deathCount;
    }

    public String getCasesBy7Days() {
        return casesBy7Days;
    }

    public String getTestedBy7Days() {
        return testedBy7Days;
    }

    public String getPositiveBy7Days() {
        return positiveBy7Days;
    }

    public String getTestAmount() {
        return testAmount;
    }

    public String getTestMethod() {
        return testMethod;
    }

    public String getCommune() {
        return commune;
    }


}
