public class Fahrenheit {

    public int fahrenheit = 212;
    static double degree = 100.00;

    public Fahrenheit() {
        this.fahrenheit = fahrenheit;
        this.degree = degree;
    }

    public  double convertFahrengateToCelsius(double fahrenheit) {
        double R = (fahrenheit - 32) * 5 / 9;
        return R;
    }

    public static void main(String[] args) {
        Fahrenheit F = new Fahrenheit();


        System.out.println("212.0 degree Fahrenheit is equil to "+ F.convertFahrengateToCelsius(212) + "  in Celsius");

        System.out.println((double)F.fahrenheit + "  degree Fahrenheit is equil to " + F.degree + "  in Celsius " );
        }

    }

