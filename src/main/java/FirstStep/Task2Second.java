package FirstStep;

public class Task2Second {
    public static void main(String[] args) {
        int a =3;
        int b =3;
        double c = 200.01;
        double d = -200.1;
        String str1  ="H";
        String str2 = "123";

        boolean result1 = a==b;
        System.out.println(result1);

        boolean result2 = c==b;
        System.out.println(result2);

        // преобразуем тип int и double в String

        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);

        String c1 = String.valueOf(c);
        String d1 = String.valueOf(d);

        // сравним значения переменных 'а1' и 'с1' с 'str2'

        if(a1==str2)
            System.out.println("True");
        else System.out.println("False");

        if(c1==str2)
            System.out.println("True");
        else
            System.out.println("False");

        // преобразуем переменные str1 and str2 типа String в переменные типа int and double

        int str2ToInt = Integer.parseInt(str2);
        double str2ToDouble = Double.parseDouble(str2);

        int str1ToInt =Integer.parseInt(str1);
        double str1ToDouble = Double.parseDouble(str1);

        // сравним значения переменных 'а' и 'c'   с 'str2ToInt'
        if(str2ToInt==a)
            System.out.println("True");
        else
            System.out.println("False");

        boolean result3 = str2ToDouble==c;
        System.out.println(result3);

        // сравним переменные типа int and double. приведем тип 'int' to 'double'

        boolean result4 = (double)a ==d;
        System.out.println(result4);







    }




}
