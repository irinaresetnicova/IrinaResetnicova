package FirstStep;

public class Location {
    private String type;
    private   int numberOfCitizen;
    private double overageIncome;
    private double taxPerCitizen; // не нашла применения


    public Location(String type, int numberOfCitizen, double taxPerCitizen, double overageIncome) {
        this.type = type;
        this.numberOfCitizen = numberOfCitizen;
        this.taxPerCitizen = taxPerCitizen;
        this.overageIncome = overageIncome;
    }

     public boolean isCapitalCity(){
         boolean result = numberOfCitizen >200000 && type == "City";
         return result;
     }

    public boolean isMegapolis(){
        return  isCapitalCity() && numberOfCitizen >100000 || numberOfCitizen> 200000 && overageIncome>250000;
    }

    public static void main(String[] args) {

        Location l = new Location("City", 500000, 200, 40500);

        System.out.println(l.isCapitalCity());
        System.out.println(l.isMegapolis());
    }
}
