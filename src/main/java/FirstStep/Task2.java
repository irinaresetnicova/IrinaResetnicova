package FirstStep;

public class Task2 {

    int a = -520;
    double b = 521.02;
    String s = "Hello";

    String str = "520";
    String str0 = "521.03";

    String str1 = String.valueOf(a); // перевела int  в String c помощью метода valueOf();
    String str2 = String.valueOf(b); // перевела double в String c помощью метода valueOf();

    int x = Integer.parseInt(str); // перевела  String в int c помощью метода parseInt();
    double y = Double.parseDouble(str0); // перевела  String в double c помощью метода parseDouble();

    public static void main(String[] args) {

        Task2 T1 = new Task2();

        if(T1.str1 == T1.s)                // сравниваем переменную str1 типа String с переменной S типа String
            System.out.println("True");
        else
                System.out.println("False");

        if(T1.str2==T1.s)                 // сравниваем переменную str2 типа String с переменной S типа String
            System.out.println("True");
        else
            System.out.println("False");

        if(T1.x == T1.a)
            System.out.println("True");
        else
            System.out.println("False");

        if(T1.y==T1.b)
            System.out.println("True");
        else
            System.out.println("False");

        if(T1.a==T1.b)
            System.out.println("True");
        else
            System.out.println("False");

    }
    }

// написать метод, который сравнивает 2 значения: int double String (- +)
