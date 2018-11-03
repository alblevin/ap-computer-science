public class Autoboxing {
    public static void main (String[] args) {
        Integer obj1;
        int num1 = 69;
        obj1 = num1; // automatically creates an Integer object

        Integer obj2 = new Integer(69);
        int num2;
        num2 = obj2; // automatically extracts the int value
    }
}