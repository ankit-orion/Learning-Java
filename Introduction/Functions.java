public class Functions {
    public static void main(String[] args) {
        // synatx of a function
        // access_modifier return_type function_name(parameters){
        // code
        // }
        // function call
        // System.out.println("Hello World :)");
        // printName();

        // greeting();
        System.out.println(add(10, 29));;
    }
    // static void printName(){
    //     System.out.println("Ankit Mishra");
    // }

    //! function to print greeting
    static void greeting(){
        System.out.println("Hello World :)");
    }

    // return type function
    static int add(int a, int b){
        return a + b;
    }
}
