public class LearningConstructors {
    public static void main(String[] args) {
        // creating first object of the student class 
        Student s1 = new Student();
        // printing the details in the main function only
        System.out.println("Printing roll number in the main function: " + s1.rno);

        // printing greeting using method
        s1.greeting();
        // printing the name using the object
        System.out.println("Printing name before changing the name using method: " + s1.name);
        s1.changeName("Rahul Sharma");
        System.out.println("Printing name after changing the name using method: " + s1.name);
        Student s2 = new Student(12, "Tushar Pachouri", 99.5f);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    // creating methods in the class we can extend this to getter and setters
    // getters are basically to get the values of the variables if the variables are private
    // similary setters are used to set the values of the variables if the variagles are set to private
    
    // method to print Hello World
    void greeting(){
        System.out.println("Hello World");
    }
    void changeName(String name){
        this.name = name;
    }
    // Creating Constructor
    Student(){
        System.out.println("Default constructor is being called ");
        // we need a way to add the values of the variables in the object
        // so we can use this keyword for that
        // this keyword is a reference to the current object
        this.rno = 10;
        this.name = "Ankit Mishra";
        this.marks = 99.5f;
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    // passing the values to the constructor
    // this is called parameterized constructor
    // it can be used to pass the values to the object
    // we need to call this manually while creating the object
    Student(int rno, String name, float marks){
        System.out.println("Parameterized constructor is being called ");
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        // can we use default constructor and parameterized constructor in the same class?
        // yes we can use both the constructors in the same class
        // but we need to call the constructor manually while creating the object
        // if we don't call the constructor manually then the default constructor will be called

    }
}
