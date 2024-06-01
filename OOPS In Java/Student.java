class Children{
    int rn0 = 10;
    String name;
    float marks;
    Children(){
        System.out.println("Constructor called");
    }
    Children(int rn0, String name, float marks){
        this.rn0 = rn0;
        this.name = name;
        this.marks = marks;
    }
    // method to print student details
    void printDetails(){
        System.out.println("Roll Number: " + rn0);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

}
public class Student {
     public static void main(String[] args) {
        Children c1 = new Children();
        System.out.println(c1.rn0);
        // the default value of objects is null
        System.out.println(c1.name);
        c1.name = "Shubham";
        System.out.println(c1.name);
        // the default value of float is 0.0
        System.out.println(c1.marks);
        c1.marks = 98.5f;
        System.out.println(c1.marks);
        Children c2 = new Children(12, "Ankit Mishra", 99.5f);
        System.out.println(c2.rn0);
        c2.printDetails();
        c1.printDetails();
     }
}
