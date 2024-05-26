public class Temperature {
    public static void main(String[] args) {
        float fahrenheit = 100;
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in celsius is " + celsius);

        float c = 37;
        float f = (c * 9/5) + 32;
        System.out.println("The temperature in fahrenheit is " + f);
    }
}
