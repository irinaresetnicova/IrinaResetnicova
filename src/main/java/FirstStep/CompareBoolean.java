
package FirstStep;

public class CompareBoolean {
    int i1;
    int i2;
    double d1;
    double d2;
    String str1;
    String str2;

    public boolean  compare(Object o1, Object o2) {

        if(o1.getClass() == o2.getClass()){
            if (o1 instanceof String) {
                if (((String)o1).equals((String)o2))
                return true;
            }
            if (o1 instanceof Integer) {
                if (((Integer)o1).equals((Integer)o2))
                    return true;
            }
            if (o1 instanceof Double) {
                if (((Double)o1).equals((Double)o2))
                    return true;
            }
        }
        return false;

    }
            public static void main(String[] args) {
        CompareBoolean C = new CompareBoolean();

                System.out.println(C.compare("Hello", "Hello"));
                System.out.println(C.compare(123, 123));
                int a = 123; int b = 123;
                System.out.println(C.compare(a, b));

                System.out.println(C.compare(123.00, 123.00));



            }
}










