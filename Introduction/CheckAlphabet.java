import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        // take a character as input from the user using scanner class
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        System.out.println(ch);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}
