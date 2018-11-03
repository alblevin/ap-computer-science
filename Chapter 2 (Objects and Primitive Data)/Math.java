// Demonstrates the use of math operations.

public class Math {

    // Examines various concepts relating to math and computing between integers and doubles.

    public static void main (String[] args) {
        try {
            int x = 50, y = 20, z = 0;
            System.out.println (x / y / z);
        }
        catch(ArithmeticException e) {
            System.err.println("Error - division by zero");
            e.printStackTrace();

        }
    }
}