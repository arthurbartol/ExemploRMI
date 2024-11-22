import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            CalculatorInterface calc = (CalculatorInterface) Naming.lookup("rmi://localhost:1099/CalculatorService");
            System.out.println("Addition: " + calc.add(10, 5));
            System.out.println("Subtraction: " + calc.subtract(10, 5));
            System.out.println("Multiplication: " + calc.multiply(10, 5));
            System.out.println("Division: " + calc.divide(10, 5));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
