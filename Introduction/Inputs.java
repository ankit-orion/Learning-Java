import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        int rollNo = input.nextInt();
        System.out.println("Your roll number is " + rollNo);
        
        float marks = input.nextFloat();
        System.out.println("Your marks are " + marks);
        char grade = input.next().charAt(0);
        System.out.println("Your grade is " + grade);
        String name = input.nextLine();
        System.out.println("Your name is " + name);
    }
}