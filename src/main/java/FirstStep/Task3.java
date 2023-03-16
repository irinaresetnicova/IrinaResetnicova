package FirstStep;

public class Task3 {
    public static void main(String[] args) {
        String type = "City";  // City or Village
        int numberOfCitizen = 200500;
        double taxPerCitizen;
        double overageIncome = 200800;
        boolean isCapitalCity = numberOfCitizen >200000 && type == "City";

        double income = overageIncome*numberOfCitizen;


        if((isCapitalCity) || (numberOfCitizen> 200000 && overageIncome>250000))
            System.out.println("The city " + type + "is the a Metropolis");
        else System.out.println("The city " + type + "is not a Metropolis");

        System.out.println(isCapitalCity);
        System.out.println(income);

    }





}
