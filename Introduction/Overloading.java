public class Overloading {
    public static void main(String[] args) {
        // function overloading means we can have functions with same name but the parameters has to be different
        // the return type of the function can be same or different
        function(10);
        function(20, 30);
        function("Ankit");
    }
    static void function(int a){
        System.out.println(a);
    }
    static void function(int a, int b){
        System.out.println(a + " " + b);
    }
    static void function(String name){
        System.out.println(name);
    }
}
