package FirstStep;

public class Palindrome3 {
    public Palindrome3() {

    }

    static boolean isPalindrome(String text){
            int length = text.length();

            for (int i =0; i<(length/2); i++){
                if(text.charAt(i) !=text.charAt(length -i - 1)){
                    return false;
                }
            }
            return true;
        }

    }
    class Test{
        public static void main(String[] args) {

            Palindrome3 p = new Palindrome3();
            System.out.println(p.isPalindrome("anna"));


        }
    }


